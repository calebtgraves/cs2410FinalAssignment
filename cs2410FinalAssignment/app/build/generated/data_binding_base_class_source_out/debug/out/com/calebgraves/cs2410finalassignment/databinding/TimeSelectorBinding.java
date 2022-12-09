// Generated by view binder compiler. Do not edit!
package com.calebgraves.cs2410finalassignment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.calebgraves.cs2410finalassignment.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TimeSelectorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TimePicker timePicker;

  @NonNull
  public final Button timePickerSubmit;

  private TimeSelectorBinding(@NonNull ConstraintLayout rootView, @NonNull TimePicker timePicker,
      @NonNull Button timePickerSubmit) {
    this.rootView = rootView;
    this.timePicker = timePicker;
    this.timePickerSubmit = timePickerSubmit;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TimeSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TimeSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.time_selector, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TimeSelectorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.timePicker;
      TimePicker timePicker = ViewBindings.findChildViewById(rootView, id);
      if (timePicker == null) {
        break missingId;
      }

      id = R.id.timePickerSubmit;
      Button timePickerSubmit = ViewBindings.findChildViewById(rootView, id);
      if (timePickerSubmit == null) {
        break missingId;
      }

      return new TimeSelectorBinding((ConstraintLayout) rootView, timePicker, timePickerSubmit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
