package com.calebgraves.cs2410finalassignment;

import java.lang.System;

@androidx.room.Database(entities = {com.calebgraves.cs2410finalassignment.models.Event.class, com.calebgraves.cs2410finalassignment.models.Goal.class, com.calebgraves.cs2410finalassignment.models.GoalEventCoupler.class, com.calebgraves.cs2410finalassignment.models.JournalEntry.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getCouplersDao", "Lcom/calebgraves/cs2410finalassignment/dataAccessObjects/GoalsToEventsDao;", "getEventsDao", "Lcom/calebgraves/cs2410finalassignment/dataAccessObjects/EventsDao;", "getGoalsDao", "Lcom/calebgraves/cs2410finalassignment/dataAccessObjects/GoalsDao;", "getJournalEntriesDao", "Lcom/calebgraves/cs2410finalassignment/dataAccessObjects/JournalEntriesDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.calebgraves.cs2410finalassignment.dataAccessObjects.EventsDao getEventsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.calebgraves.cs2410finalassignment.dataAccessObjects.GoalsDao getGoalsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.calebgraves.cs2410finalassignment.dataAccessObjects.GoalsToEventsDao getCouplersDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.calebgraves.cs2410finalassignment.dataAccessObjects.JournalEntriesDao getJournalEntriesDao();
}