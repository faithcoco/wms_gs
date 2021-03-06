// Generated by data binding compiler. Do not edit!
package com.lkrh.storescontrol.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.lkrh.storescontrol.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemDispatchdetailsBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox cbSelect;

  @NonNull
  public final RelativeLayout lInput;

  @NonNull
  public final TextView tvBWhPos;

  @NonNull
  public final TextView tvCBatch;

  @NonNull
  public final TextView tvCinvcode;

  @NonNull
  public final TextView tvCinvname;

  @NonNull
  public final TextView tvCinvstd;

  @NonNull
  public final TextView tvIquantity;

  @NonNull
  public final TextView tvIrowno;

  @NonNull
  public final TextView tvNumber;

  protected ItemDispatchdetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox cbSelect, RelativeLayout lInput, TextView tvBWhPos, TextView tvCBatch,
      TextView tvCinvcode, TextView tvCinvname, TextView tvCinvstd, TextView tvIquantity,
      TextView tvIrowno, TextView tvNumber) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cbSelect = cbSelect;
    this.lInput = lInput;
    this.tvBWhPos = tvBWhPos;
    this.tvCBatch = tvCBatch;
    this.tvCinvcode = tvCinvcode;
    this.tvCinvname = tvCinvname;
    this.tvCinvstd = tvCinvstd;
    this.tvIquantity = tvIquantity;
    this.tvIrowno = tvIrowno;
    this.tvNumber = tvNumber;
  }

  @NonNull
  public static ItemDispatchdetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_dispatchdetails, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemDispatchdetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemDispatchdetailsBinding>inflateInternal(inflater, R.layout.item_dispatchdetails, root, attachToRoot, component);
  }

  @NonNull
  public static ItemDispatchdetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_dispatchdetails, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemDispatchdetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemDispatchdetailsBinding>inflateInternal(inflater, R.layout.item_dispatchdetails, null, false, component);
  }

  public static ItemDispatchdetailsBinding bind(@NonNull View view) {
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
  public static ItemDispatchdetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemDispatchdetailsBinding)bind(component, view, R.layout.item_dispatchdetails);
  }
}
