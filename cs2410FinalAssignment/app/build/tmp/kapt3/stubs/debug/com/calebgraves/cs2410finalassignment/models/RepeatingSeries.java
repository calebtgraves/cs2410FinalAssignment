package com.calebgraves.cs2410finalassignment.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006*"}, d2 = {"Lcom/calebgraves/cs2410finalassignment/models/RepeatingSeries;", "", "id", "", "eventId", "period", "", "daysOfWeek", "", "endDate", "Ljava/util/Date;", "(JJLjava/lang/String;BLjava/util/Date;)V", "getDaysOfWeek", "()B", "setDaysOfWeek", "(B)V", "getEndDate", "()Ljava/util/Date;", "setEndDate", "(Ljava/util/Date;)V", "getEventId", "()J", "setEventId", "(J)V", "getId", "setId", "getPeriod", "()Ljava/lang/String;", "setPeriod", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class RepeatingSeries {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @androidx.room.ColumnInfo()
    private long eventId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private java.lang.String period;
    @androidx.room.ColumnInfo()
    private byte daysOfWeek;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo()
    private java.util.Date endDate;
    
    @org.jetbrains.annotations.NotNull()
    public final com.calebgraves.cs2410finalassignment.models.RepeatingSeries copy(long id, long eventId, @org.jetbrains.annotations.NotNull()
    java.lang.String period, byte daysOfWeek, @org.jetbrains.annotations.NotNull()
    java.util.Date endDate) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RepeatingSeries(long id, long eventId, @org.jetbrains.annotations.NotNull()
    java.lang.String period, byte daysOfWeek, @org.jetbrains.annotations.NotNull()
    java.util.Date endDate) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getEventId() {
        return 0L;
    }
    
    public final void setEventId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeriod() {
        return null;
    }
    
    public final void setPeriod(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final byte component4() {
        return 0;
    }
    
    public final byte getDaysOfWeek() {
        return 0;
    }
    
    public final void setDaysOfWeek(byte p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getEndDate() {
        return null;
    }
    
    public final void setEndDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
}