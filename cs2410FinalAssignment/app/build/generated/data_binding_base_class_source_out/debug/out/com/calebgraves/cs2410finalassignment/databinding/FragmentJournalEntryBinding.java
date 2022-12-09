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

public final class FragmentJournalEntryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText journalEntryCreationContent;

  @NonNull
  public final EditText journalEntryCreationTitle;

  @NonNull
  public final TextView journalEntryDate;

  @NonNull
  public final ConstraintLayout journalEntryMainLayout;

  @NonNull
  public final Button saveJournalEntry;

  @NonNull
  public final TextView textView36;

  @NonNull
  public final TextView textView37;

  private FragmentJournalEntryBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText journalEntryCreationContent, @NonNull EditText journalEntryCreationTitle,
      @NonNull TextView journalEntryDate, @NonNull ConstraintLayout journalEntryMainLayout,
      @NonNull Button saveJournalEntry, @NonNull TextView textView36,
      @NonNull TextView textView37) {
    this.rootView = rootView;
    this.journalEntryCreationContent = journalEntryCreationContent;
    this.journalEntryCreationTitle = journalEntryCreationTitle;
    this.journalEntryDate = journalEntryDate;
    this.journalEntryMainLayout = journalEntryMainLayout;
    this.saveJournalEntry = saveJournalEntry;
    this.textView36 = textView36;
    this.textView37 = textView37;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentJournalEntryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentJournalEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_journal_entry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentJournalEntryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.journalEntryCreationContent;
      EditText journalEntryCreationContent = ViewBindings.findChildViewById(rootView, id);
      if (journalEntryCreationContent == null) {
        break missingId;
      }

      id = R.id.journalEntryCreationTitle;
      EditText journalEntryCreationTitle = ViewBindings.findChildViewById(rootView, id);
      if (journalEntryCreationTitle == null) {
        break missingId;
      }

      id = R.id.journalEntryDate;
      TextView journalEntryDate = ViewBindings.findChildViewById(rootView, id);
      if (journalEntryDate == null) {
        break missingId;
      }

      ConstraintLayout journalEntryMainLayout = (ConstraintLayout) rootView;

      id = R.id.saveJournalEntry;
      Button saveJournalEntry = ViewBindings.findChildViewById(rootView, id);
      if (saveJournalEntry == null) {
        break missingId;
      }

      id = R.id.textView36;
      TextView textView36 = ViewBindings.findChildViewById(rootView, id);
      if (textView36 == null) {
        break missingId;
      }

      id = R.id.textView37;
      TextView textView37 = ViewBindings.findChildViewById(rootView, id);
      if (textView37 == null) {
        break missingId;
      }

      return new FragmentJournalEntryBinding((ConstraintLayout) rootView,
          journalEntryCreationContent, journalEntryCreationTitle, journalEntryDate,
          journalEntryMainLayout, saveJournalEntry, textView36, textView37);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
