// Generated by data binding compiler. Do not edit!
package com.abhishek.musicapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.abhishek.musicapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MusicListItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView artistName;

  @NonNull
  public final TextView audioName;

  @NonNull
  public final ImageView audioThumbnail;

  protected MusicListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView artistName, TextView audioName, ImageView audioThumbnail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.artistName = artistName;
    this.audioName = audioName;
    this.audioThumbnail = audioThumbnail;
  }

  @NonNull
  public static MusicListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.music_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MusicListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MusicListItemBinding>inflateInternal(inflater, R.layout.music_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static MusicListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.music_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MusicListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MusicListItemBinding>inflateInternal(inflater, R.layout.music_list_item, null, false, component);
  }

  public static MusicListItemBinding bind(@NonNull View view) {
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
  public static MusicListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (MusicListItemBinding)bind(component, view, R.layout.music_list_item);
  }
}
