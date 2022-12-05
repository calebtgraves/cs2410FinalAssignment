// Generated by view binder compiler. Do not edit!
package com.calebgraves.cs2410finalassignment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class JournalListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout31;

  @NonNull
  public final ConstraintLayout constraintLayout4;

  @NonNull
  public final ImageView editJournalEntry;

  @NonNull
  public final TextView entryContentPreview;

  @NonNull
  public final TextView entryDate;

  @NonNull
  public final TextView journalEntryTitle;

  private JournalListItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout31, @NonNull ConstraintLayout constraintLayout4,
      @NonNull ImageView editJournalEntry, @NonNull TextView entryContentPreview,
      @NonNull TextView entryDate, @NonNull TextView journalEntryTitle) {
    this.rootView = rootView;
    this.constraintLayout31 = constraintLayout31;
    this.constraintLayout4 = constraintLayout4;
    this.editJournalEntry = editJournalEntry;
    this.entryContentPreview = entryContentPreview;
    this.entryDate = entryDate;
    this.journalEntryTitle = journalEntryTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static JournalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static JournalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.journal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static JournalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout31;
      ConstraintLayout constraintLayout31 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout31 == null) {
        break missingId;
      }

      id = R.id.constraintLayout4;
      ConstraintLayout constraintLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout4 == null) {
        break missingId;
      }

      id = R.id.editJournalEntry;
      ImageView editJournalEntry = ViewBindings.findChildViewById(rootView, id);
      if (editJournalEntry == null) {
        break missingId;
      }

      id = R.id.entryContentPreview;
      TextView entryContentPreview = ViewBindings.findChildViewById(rootView, id);
      if (entryContentPreview == null) {
        break missingId;
      }

      id = R.id.entryDate;
      TextView entryDate = ViewBindings.findChildViewById(rootView, id);
      if (entryDate == null) {
        break missingId;
      }

      id = R.id.journalEntryTitle;
      TextView journalEntryTitle = ViewBindings.findChildViewById(rootView, id);
      if (journalEntryTitle == null) {
        break missingId;
      }

      return new JournalListItemBinding((ConstraintLayout) rootView, constraintLayout31,
          constraintLayout4, editJournalEntry, entryContentPreview, entryDate, journalEntryTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}