package com.calebgraves.cs2410finalassignment.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/Adapters/JournalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/calebgraves/cs2410finalassignment/Adapters/JournalAdapter$ViewHolder;", "entries", "Landroidx/databinding/ObservableArrayList;", "Lcom/calebgraves/cs2410finalassignment/models/JournalEntry;", "(Landroidx/databinding/ObservableArrayList;)V", "getEntries", "()Landroidx/databinding/ObservableArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class JournalAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.calebgraves.cs2410finalassignment.Adapters.JournalAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableArrayList<com.calebgraves.cs2410finalassignment.models.JournalEntry> entries = null;
    
    public JournalAdapter(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableArrayList<com.calebgraves.cs2410finalassignment.models.JournalEntry> entries) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableArrayList<com.calebgraves.cs2410finalassignment.models.JournalEntry> getEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.calebgraves.cs2410finalassignment.Adapters.JournalAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.Adapters.JournalAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/Adapters/JournalAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/calebgraves/cs2410finalassignment/databinding/JournalListItemBinding;", "(Lcom/calebgraves/cs2410finalassignment/databinding/JournalListItemBinding;)V", "getBinding", "()Lcom/calebgraves/cs2410finalassignment/databinding/JournalListItemBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.calebgraves.cs2410finalassignment.databinding.JournalListItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.calebgraves.cs2410finalassignment.databinding.JournalListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.calebgraves.cs2410finalassignment.databinding.JournalListItemBinding getBinding() {
            return null;
        }
    }
}