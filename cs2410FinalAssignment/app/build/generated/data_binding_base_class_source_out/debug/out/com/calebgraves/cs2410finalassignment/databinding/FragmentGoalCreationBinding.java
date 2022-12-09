// Generated by view binder compiler. Do not edit!
package com.calebgraves.cs2410finalassignment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.calebgraves.cs2410finalassignment.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGoalCreationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button createGoal;

  @NonNull
  public final EditText goalCategoryField;

  @NonNull
  public final EditText goalDescriptionField;

  @NonNull
  public final TextView goalEndDateField;

  @NonNull
  public final TextView goalStartDateField;

  @NonNull
  public final EditText goalTitleField;

  @NonNull
  public final TextView textView30;

  @NonNull
  public final TextView textView31;

  @NonNull
  public final TextView textView32;

  @NonNull
  public final TextView textView33;

  @NonNull
  public final TextView textView5;

  private FragmentGoalCreationBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button createGoal, @NonNull EditText goalCategoryField,
      @NonNull EditText goalDescriptionField, @NonNull TextView goalEndDateField,
      @NonNull TextView goalStartDateField, @NonNull EditText goalTitleField,
      @NonNull TextView textView30, @NonNull TextView textView31, @NonNull TextView textView32,
      @NonNull TextView textView33, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.createGoal = createGoal;
    this.goalCategoryField = goalCategoryField;
    this.goalDescriptionField = goalDescriptionField;
    this.goalEndDateField = goalEndDateField;
    this.goalStartDateField = goalStartDateField;
    this.goalTitleField = goalTitleField;
    this.textView30 = textView30;
    this.textView31 = textView31;
    this.textView32 = textView32;
    this.textView33 = textView33;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGoalCreationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGoalCreationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_goal_creation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGoalCreationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.createGoal;
      Button createGoal = ViewBindings.findChildViewById(rootView, id);
      if (createGoal == null) {
        break missingId;
      }

      id = R.id.goalCategoryField;
      EditText goalCategoryField = ViewBindings.findChildViewById(rootView, id);
      if (goalCategoryField == null) {
        break missingId;
      }

      id = R.id.goalDescriptionField;
      EditText goalDescriptionField = ViewBindings.findChildViewById(rootView, id);
      if (goalDescriptionField == null) {
        break missingId;
      }

      id = R.id.goalEndDateField;
      TextView goalEndDateField = ViewBindings.findChildViewById(rootView, id);
      if (goalEndDateField == null) {
        break missingId;
      }

      id = R.id.goalStartDateField;
      TextView goalStartDateField = ViewBindings.findChildViewById(rootView, id);
      if (goalStartDateField == null) {
        break missingId;
      }

      id = R.id.goalTitleField;
      EditText goalTitleField = ViewBindings.findChildViewById(rootView, id);
      if (goalTitleField == null) {
        break missingId;
      }

      id = R.id.textView30;
      TextView textView30 = ViewBindings.findChildViewById(rootView, id);
      if (textView30 == null) {
        break missingId;
      }

      id = R.id.textView31;
      TextView textView31 = ViewBindings.findChildViewById(rootView, id);
      if (textView31 == null) {
        break missingId;
      }

      id = R.id.textView32;
      TextView textView32 = ViewBindings.findChildViewById(rootView, id);
      if (textView32 == null) {
        break missingId;
      }

      id = R.id.textView33;
      TextView textView33 = ViewBindings.findChildViewById(rootView, id);
      if (textView33 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new FragmentGoalCreationBinding((ConstraintLayout) rootView, createGoal,
          goalCategoryField, goalDescriptionField, goalEndDateField, goalStartDateField,
          goalTitleField, textView30, textView31, textView32, textView33, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
