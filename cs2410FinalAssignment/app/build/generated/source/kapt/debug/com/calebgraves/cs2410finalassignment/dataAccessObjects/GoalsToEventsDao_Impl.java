package com.calebgraves.cs2410finalassignment.dataAccessObjects;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.calebgraves.cs2410finalassignment.models.GoalEventCoupler;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GoalsToEventsDao_Impl implements GoalsToEventsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GoalEventCoupler> __insertionAdapterOfGoalEventCoupler;

  private final EntityDeletionOrUpdateAdapter<GoalEventCoupler> __deletionAdapterOfGoalEventCoupler;

  public GoalsToEventsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGoalEventCoupler = new EntityInsertionAdapter<GoalEventCoupler>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `GoalEventCoupler` (`goalId`,`eventId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GoalEventCoupler value) {
        stmt.bindLong(1, value.getGoalId());
        stmt.bindLong(2, value.getEventId());
      }
    };
    this.__deletionAdapterOfGoalEventCoupler = new EntityDeletionOrUpdateAdapter<GoalEventCoupler>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `GoalEventCoupler` WHERE `goalId` = ? AND `eventId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GoalEventCoupler value) {
        stmt.bindLong(1, value.getGoalId());
        stmt.bindLong(2, value.getEventId());
      }
    };
  }

  @Override
  public Object createCoupler(final GoalEventCoupler coupler,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGoalEventCoupler.insert(coupler);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteCoupler(final GoalEventCoupler coupler,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGoalEventCoupler.handle(coupler);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object allCouplers(final Continuation<? super List<GoalEventCoupler>> continuation) {
    final String _sql = "SELECT * FROM goaleventcoupler";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<GoalEventCoupler>>() {
      @Override
      public List<GoalEventCoupler> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfGoalId = CursorUtil.getColumnIndexOrThrow(_cursor, "goalId");
          final int _cursorIndexOfEventId = CursorUtil.getColumnIndexOrThrow(_cursor, "eventId");
          final List<GoalEventCoupler> _result = new ArrayList<GoalEventCoupler>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GoalEventCoupler _item;
            final long _tmpGoalId;
            _tmpGoalId = _cursor.getLong(_cursorIndexOfGoalId);
            final long _tmpEventId;
            _tmpEventId = _cursor.getLong(_cursorIndexOfEventId);
            _item = new GoalEventCoupler(_tmpGoalId,_tmpEventId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object goalsForEvent(final long id, final Continuation<? super List<Long>> continuation) {
    final String _sql = "SELECT goalId FROM GoalEventCoupler WHERE eventId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<Long> _result = new ArrayList<Long>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Long _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getLong(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object eventsForGoal(final long id, final Continuation<? super List<Long>> continuation) {
    final String _sql = "SELECT eventId FROM GoalEventCoupler WHERE goalId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<Long> _result = new ArrayList<Long>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Long _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getLong(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
