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
import com.lkrh.storescontrol.R;
import com.lkrh.storescontrol.bean.MeterialBean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCompletion2Binding extends ViewDataBinding {
  @Bindable
  protected MeterialBean mData;

  protected ItemCompletion2Binding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setData(@Nullable MeterialBean data);

  @Nullable
  public MeterialBean getData() {
    return mData;
  }

  @NonNull
  public static ItemCompletion2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_completion2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCompletion2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCompletion2Binding>inflateInternal(inflater, R.layout.item_completion2, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCompletion2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_completion2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCompletion2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCompletion2Binding>inflateInternal(inflater, R.layout.item_completion2, null, false, component);
  }

  public static ItemCompletion2Binding bind(@NonNull View view) {
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
  public static ItemCompletion2Binding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCompletion2Binding)bind(component, view, R.layout.item_completion2);
  }
}
