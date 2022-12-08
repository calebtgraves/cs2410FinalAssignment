package com.calebgraves.cs2410finalassignment.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/repository/GoalsRepository;", "", "()V", "cacheInitialized", "", "db", "Lcom/calebgraves/cs2410finalassignment/AppDatabase;", "goalsCache", "", "Lcom/calebgraves/cs2410finalassignment/models/Goal;", "createGoal", "", "goal", "(Lcom/calebgraves/cs2410finalassignment/models/Goal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGoal", "getAllGoals", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goalById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goalsForDay", "date", "update", "app_debug"})
public final class GoalsRepository {
    @org.jetbrains.annotations.NotNull()
    public static final com.calebgraves.cs2410finalassignment.repository.GoalsRepository INSTANCE = null;
    private static final com.calebgraves.cs2410finalassignment.AppDatabase db = null;
    private static boolean cacheInitialized = false;
    private static final java.util.List<com.calebgraves.cs2410finalassignment.models.Goal> goalsCache = null;
    
    private GoalsRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createGoal(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllGoals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.calebgraves.cs2410finalassignment.models.Goal>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object goalById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.calebgraves.cs2410finalassignment.models.Goal> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object goalsForDay(long date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.calebgraves.cs2410finalassignment.models.Goal>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteGoal(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}