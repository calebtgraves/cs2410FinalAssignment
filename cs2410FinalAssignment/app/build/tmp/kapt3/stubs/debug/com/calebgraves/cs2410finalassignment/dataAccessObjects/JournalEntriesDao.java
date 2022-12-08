package com.calebgraves.cs2410finalassignment.dataAccessObjects;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/dataAccessObjects/JournalEntriesDao;", "", "allJournalEntries", "", "Lcom/calebgraves/cs2410finalassignment/models/JournalEntry;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createJournalEntry", "", "entry", "(Lcom/calebgraves/cs2410finalassignment/models/JournalEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteJournalEntry", "", "updateJournalEntry", "app_debug"})
public abstract interface JournalEntriesDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object createJournalEntry(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.JournalEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM journalEntries")
    public abstract java.lang.Object allJournalEntries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.calebgraves.cs2410finalassignment.models.JournalEntry>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateJournalEntry(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.JournalEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteJournalEntry(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.JournalEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}