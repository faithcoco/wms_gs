// Generated by data binding compiler. Do not edit!
package com.lkrh.storescontrol.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.lkrh.storescontrol.R;
import com.lkrh.storescontrol.bean.ConfirmBean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityConfirmBinding extends ViewDataBinding {
  @NonNull
  public final Button bSubmit;

  @NonNull
  public final EditText etCdefine10;

  @NonNull
  public final EditText etCode;

  @NonNull
  public final EditText etDescribe;

  @NonNull
  public final EditText etIquantity;

  @NonNull
  public final EditText etTimes;

  @NonNull
  public final ImageView ivAdd;

  @NonNull
  public final ImageView ivCdefine10;

  @NonNull
  public final ImageView ivCode;

  @NonNull
  public final ImageView ivMinus;

  @NonNull
  public final ImageView ivUpdatecwhcode;

  @NonNull
  public final LinearLayout lDescribe;

  @NonNull
  public final RelativeLayout rlCdefine10;

  @NonNull
  public final RelativeLayout rlCwhcode;

  @NonNull
  public final RelativeLayout rlUpdate;

  @NonNull
  public final TextView tvCBatch;

  @NonNull
  public final TextView tvCComUnitName;

  @NonNull
  public final TextView tvCInvName;

  @NonNull
  public final TextView tvCVenName;

  @NonNull
  public final TextView tvCinvcode;

  @NonNull
  public final TextView tvCount;

  @NonNull
  public final TextView tvNumber;

  @NonNull
  public final TextView tvTitle1;

  @NonNull
  public final TextView tvTitle3;

  @NonNull
  public final TextView tvTitle4;

  @NonNull
  public final TextView tvTotal;

  @Bindable
  protected ConfirmBean.Formdata mBean;

  protected ActivityConfirmBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button bSubmit, EditText etCdefine10, EditText etCode, EditText etDescribe,
      EditText etIquantity, EditText etTimes, ImageView ivAdd, ImageView ivCdefine10,
      ImageView ivCode, ImageView ivMinus, ImageView ivUpdatecwhcode, LinearLayout lDescribe,
      RelativeLayout rlCdefine10, RelativeLayout rlCwhcode, RelativeLayout rlUpdate,
      TextView tvCBatch, TextView tvCComUnitName, TextView tvCInvName, TextView tvCVenName,
      TextView tvCinvcode, TextView tvCount, TextView tvNumber, TextView tvTitle1,
      TextView tvTitle3, TextView tvTitle4, TextView tvTotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bSubmit = bSubmit;
    this.etCdefine10 = etCdefine10;
    this.etCode = etCode;
    this.etDescribe = etDescribe;
    this.etIquantity = etIquantity;
    this.etTimes = etTimes;
    this.ivAdd = ivAdd;
    this.ivCdefine10 = ivCdefine10;
    this.ivCode = ivCode;
    this.ivMinus = ivMinus;
    this.ivUpdatecwhcode = ivUpdatecwhcode;
    this.lDescribe = lDescribe;
    this.rlCdefine10 = rlCdefine10;
    this.rlCwhcode = rlCwhcode;
    this.rlUpdate = rlUpdate;
    this.tvCBatch = tvCBatch;
    this.tvCComUnitName = tvCComUnitName;
    this.tvCInvName = tvCInvName;
    this.tvCVenName = tvCVenName;
    this.tvCinvcode = tvCinvcode;
    this.tvCount = tvCount;
    this.tvNumber = tvNumber;
    this.tvTitle1 = tvTitle1;
    this.tvTitle3 = tvTitle3;
    this.tvTitle4 = tvTitle4;
    this.tvTotal = tvTotal;
  }

  public abstract void setBean(@Nullable ConfirmBean.Formdata bean);

  @Nullable
  public ConfirmBean.Formdata getBean() {
    return mBean;
  }

  @NonNull
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_confirm, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityConfirmBinding>inflateInternal(inflater, R.layout.activity_confirm, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_confirm, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityConfirmBinding>inflateInternal(inflater, R.layout.activity_confirm, null, false, component);
  }

  public static ActivityConfirmBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityConfirmBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityConfirmBinding)bind(component, view, R.layout.activity_confirm);
  }
}