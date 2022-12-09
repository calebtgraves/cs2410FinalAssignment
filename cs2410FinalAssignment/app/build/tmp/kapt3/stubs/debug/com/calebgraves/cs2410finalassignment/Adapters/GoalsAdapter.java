package com.calebgraves.cs2410finalassignment.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/Adapters/GoalsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/calebgraves/cs2410finalassignment/Adapters/GoalsAdapter$ViewHolder;", "goals", "Landroidx/databinding/ObservableArrayList;", "Lcom/calebgraves/cs2410finalassignment/models/Goal;", "navController", "Landroidx/navigation/NavController;", "(Landroidx/databinding/ObservableArrayList;Landroidx/navigation/NavController;)V", "getGoals", "()Landroidx/databinding/ObservableArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class GoalsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.calebgraves.cs2410finalassignment.Adapters.GoalsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableArrayList<com.calebgraves.cs2410finalassignment.models.Goal> goals = null;
    private final androidx.navigation.NavController navController = null;
    
    public GoalsAdapter(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableArrayList<com.calebgraves.cs2410finalassignment.models.Goal> goals, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableArrayList<com.calebgraves.cs2410finalassignment.models.Goal> getGoals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.calebgraves.cs2410finalassignment.Adapters.GoalsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.Adapters.GoalsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/Adapters/GoalsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/calebgraves/cs2410finalassignment/databinding/GoalListItemBinding;", "(Lcom/calebgraves/cs2410finalassignment/databinding/GoalListItemBinding;)V", "getBinding", "()Lcom/calebgraves/cs2410finalassignment/databinding/GoalListItemBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.calebgraves.cs2410finalassignment.databinding.GoalListItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.calebgraves.cs2410finalassignment.databinding.GoalListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.calebgraves.cs2410finalassignment.databinding.GoalListItemBinding getBinding() {
            return null;
        }
    }
}