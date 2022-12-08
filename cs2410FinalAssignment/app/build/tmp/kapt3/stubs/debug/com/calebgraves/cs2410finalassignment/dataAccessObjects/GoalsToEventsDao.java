package com.calebgraves.cs2410finalassignment.dataAccessObjects;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/dataAccessObjects/GoalsToEventsDao;", "", "allCouplers", "", "Lcom/calebgraves/cs2410finalassignment/models/GoalEventCoupler;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoupler", "", "coupler", "(Lcom/calebgraves/cs2410finalassignment/models/GoalEventCoupler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCoupler", "eventsForGoal", "", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "goalsForEvent", "app_debug"})
public abstract interface GoalsToEventsDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object createCoupler(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.GoalEventCoupler coupler, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM goaleventcoupler")
    public abstract java.lang.Object allCouplers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.calebgraves.cs2410finalassignment.models.GoalEventCoupler>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT goalId FROM GoalEventCoupler WHERE eventId = :id")
    public abstract java.lang.Object goalsForEvent(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT eventId FROM GoalEventCoupler WHERE goalId = :id")
    public abstract java.lang.Object eventsForGoal(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteCoupler(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.GoalEventCoupler coupler, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}