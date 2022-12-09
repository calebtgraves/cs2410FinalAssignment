package com.calebgraves.cs2410finalassignment.dataAccessObjects;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/dataAccessObjects/GoalsDao;", "", "allGoals", "", "Lcom/calebgraves/cs2410finalassignment/models/Goal;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createGoal", "", "goal", "(Lcom/calebgraves/cs2410finalassignment/models/Goal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGoal", "", "goalById", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goalsForDay", "day", "updateGoal", "app_debug"})
public abstract interface GoalsDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object createGoal(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM goals")
    public abstract java.lang.Object allGoals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.calebgraves.cs2410finalassignment.models.Goal>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM goals WHERE Id = :id")
    public abstract java.lang.Object goalById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.calebgraves.cs2410finalassignment.models.Goal> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM goals WHERE startDate <= :day AND endDate >= :day")
    public abstract java.lang.Object goalsForDay(long day, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.calebgraves.cs2410finalassignment.models.Goal>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateGoal(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteGoal(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}