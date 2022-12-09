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
import com.calebgraves.cs2410finalassignment.models.JournalEntry;
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
public final class JournalEntriesDao_Impl implements JournalEntriesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<JournalEntry> __insertionAdapterOfJournalEntry;

  private final EntityDeletionOrUpdateAdapter<JournalEntry> __deletionAdapterOfJournalEntry;

  private final EntityDeletionOrUpdateAdapter<JournalEntry> __updateAdapterOfJournalEntry;

  public JournalEntriesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfJournalEntry = new EntityInsertionAdapter<JournalEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `journalEntries` (`id`,`date`,`title`,`content`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, JournalEntry value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getDate());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
      }
    };
    this.__deletionAdapterOfJournalEntry = new EntityDeletionOrUpdateAdapter<JournalEntry>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `journalEntries` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, JournalEntry value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfJournalEntry = new EntityDeletionOrUpdateAdapter<JournalEntry>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `journalEntries` SET `id` = ?,`date` = ?,`title` = ?,`content` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, JournalEntry value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getDate());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getContent());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object createJournalEntry(final JournalEntry entry,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfJournalEntry.insertAndReturnId(entry);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteJournalEntry(final JournalEntry entry,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfJournalEntry.handle(entry);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateJournalEntry(final JournalEntry entry,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfJournalEntry.handle(entry);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object allJournalEntries(final Continuation<? super List<JournalEntry>> continuation) {
    final String _sql = "SELECT * FROM journalEntries";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<JournalEntry>>() {
      @Override
      public List<JournalEntry> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final List<JournalEntry> _result = new ArrayList<JournalEntry>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final JournalEntry _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            _item = new JournalEntry(_tmpId,_tmpDate,_tmpTitle,_tmpContent);
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
