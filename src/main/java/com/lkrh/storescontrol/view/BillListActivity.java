package com.lkrh.storescontrol.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.lkrh.storescontrol.R;
import com.lkrh.storescontrol.bean.ConfirmlistBean;
import com.lkrh.storescontrol.bean.LoginBean;
import com.lkrh.storescontrol.databinding.ActivityBillListBinding;
import com.lkrh.storescontrol.databinding.ItemCodelistBinding;
import com.lkrh.storescontrol.url.Request;
import com.lkrh.storescontrol.url.Untils;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BillListActivity extends BaseActivity {
    LoginBean.Menu menuBean;
    List<ConfirmlistBean> list;
    Confirm2Adapter adapter;
    RecyclerView recyclerView;
    ActivityBillListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_list);
        binding=DataBindingUtil.setContentView(BillListActivity.this,R.layout.activity_bill_list);
        Untils.initTitle(getIntent().getStringExtra("menuname"),this);
        recyclerView=findViewById(R.id.rv_list);
        menuBean=getIntent().getParcelableExtra("menubean");
        if(company.equals("林肯SKF") && getIntent().getStringExtra("menuname").equals("材料出库")) {
             binding.lCcode.setVisibility(View.VISIBLE);
        }
        binding.etCcode.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                getData();
                return false;
            }
        });
        binding.ivCcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScan();
            }
        });
    }
    private void openScan() {

        new IntentIntegrator(BillListActivity.this)
                .setCaptureActivity(ScanActivity.class)
                .setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES)// 扫码的类型,可选：一维码，二维码，一/二维码
                .setPrompt("请对准二维码")// 设置提示语
                .setCameraId(0)// 选择摄像头,可使用前置或者后置
                .setBeepEnabled(false)// 是否开启声音,扫完码之后会"哔"的一声
                .setBarcodeImageEnabled(true)// 扫完码之后生成二维码的图片
                .initiateScan();// 初始化扫码

    }
    @Override
    protected void onStart() {
        super.onStart();
        if(company.equals("林肯SKF") && getIntent().getStringExtra("menuname").equals("材料出库")) {

        }else {
            getData();
        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        //扫码
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() != null) {
                String code=result.getContents();
                binding.etCcode.setText(code);
                getData();

            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }


    }

    private void getData() {
        dialog.show();
        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("methodname","getMenuFieldAndValue");
            jsonObject.put("usercode",usercode);
            jsonObject.put("menucode",menuBean.getMenucode());
            jsonObject.put("layout","1");
            jsonObject.put("condition","");
            jsonObject.put("barcode","");
            jsonObject.put("formdata","");
            jsonObject.put("acccode",acccode);
            jsonObject.put("ccode",binding.etCcode.getText().toString());


        } catch (JSONException e) {
            e.printStackTrace();
        }
        String obj=jsonObject.toString();
        Log.i("json object",obj);

        Call<ResponseBody> data = Request.getRequestbody(obj);
        data.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(retrofit2.Call<ResponseBody> call, Response<ResponseBody> response) {
                dialog.dismiss();
                try {
                    if(response.code()==200) {
                        list=new ArrayList<>();
                        JsonArray arry = new JsonParser().parse(response.body().string()).getAsJsonArray();
                        for (JsonElement jsonElement : arry) {
                            list.add(new Gson().fromJson(jsonElement, ConfirmlistBean.class));
                        }
                        adapter = new Confirm2Adapter(list);
                        recyclerView.setLayoutManager(new LinearLayoutManager(BillListActivity.this));
                        recyclerView.addItemDecoration(new DividerItemDecoration(BillListActivity.this, DividerItemDecoration.VERTICAL));
                        recyclerView.setAdapter(adapter);



                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {
                dialog.dismiss();
            } });
    }
    public class Confirm2Adapter extends RecyclerView.Adapter<Confirm2Adapter.VH>  {
        ItemCodelistBinding binding;
        @NonNull
        @Override
        public Confirm2Adapter.VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
           binding= DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_codelist,viewGroup,false);
            return new Confirm2Adapter.VH(binding.getRoot());
        }
        private List<ConfirmlistBean> mDatas;

        public Confirm2Adapter(List<ConfirmlistBean> data) {
            this.mDatas = data;

        }



        @Override
        public void onBindViewHolder(@NonNull Confirm2Adapter.VH vh, final int i) {
            binding=DataBindingUtil.getBinding(vh.itemView);
            binding.tvTag.setText(i+1+"");
            final ConfirmlistBean data=mDatas.get(i);

            binding.setData(data);
            binding.executePendingBindings();
            binding.rlLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(BillListActivity.this, BillDetailActivity.class);
                    intent.putExtra("condition",data);
                    intent.putExtra("menubean",menuBean);
                    intent.putExtra("menuname", menuBean.getMenushowname());
                    startActivity(intent);
                }
            });




        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

        public class VH extends RecyclerView.ViewHolder {
            public VH(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}
