package com.calebgraves.cs2410finalassignment.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/repository/JournalEntriesRepository;", "", "()V", "cacheInitialized", "", "db", "Lcom/calebgraves/cs2410finalassignment/AppDatabase;", "journalEntriesCache", "", "Lcom/calebgraves/cs2410finalassignment/models/JournalEntry;", "createJournalEntry", "", "journalEntry", "(Lcom/calebgraves/cs2410finalassignment/models/JournalEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteJournalEntry", "getAllJournalEntries", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public final class JournalEntriesRepository {
    @org.jetbrains.annotations.NotNull()
    public static final com.calebgraves.cs2410finalassignment.repository.JournalEntriesRepository INSTANCE = null;
    private static final com.calebgraves.cs2410finalassignment.AppDatabase db = null;
    private static boolean cacheInitialized = false;
    private static final java.util.List<com.calebgraves.cs2410finalassignment.models.JournalEntry> journalEntriesCache = null;
    
    private JournalEntriesRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createJournalEntry(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.JournalEntry journalEntry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllJournalEntries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.calebgraves.cs2410finalassignment.models.JournalEntry>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.JournalEntry journalEntry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteJournalEntry(@org.jetbrains.annotations.NotNull()
    com.calebgraves.cs2410finalassignment.models.JournalEntry journalEntry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}