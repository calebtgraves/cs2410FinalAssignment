package com.calebgraves.cs2410finalassignment;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.EventsDao;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.EventsDao_Impl;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.GoalsDao;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.GoalsDao_Impl;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.GoalsToEventsDao;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.GoalsToEventsDao_Impl;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.JournalEntriesDao;
import com.calebgraves.cs2410finalassignment.dataAccessObjects.JournalEntriesDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile EventsDao _eventsDao;

  private volatile GoalsDao _goalsDao;

  private volatile GoalsToEventsDao _goalsToEventsDao;

  private volatile JournalEntriesDao _journalEntriesDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `category` TEXT NOT NULL, `description` TEXT NOT NULL, `startDate` INTEGER NOT NULL, `endDate` INTEGER NOT NULL, `repeatingSeries` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `goals` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `category` TEXT NOT NULL, `description` TEXT NOT NULL, `startDate` INTEGER NOT NULL, `endDate` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `GoalEventCoupler` (`goalId` INTEGER NOT NULL, `eventId` INTEGER NOT NULL, PRIMARY KEY(`goalId`, `eventId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `journalEntries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` INTEGER NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fc4f8d6c0dff2d80268b27304debe458')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `events`");
        _db.execSQL("DROP TABLE IF EXISTS `goals`");
        _db.execSQL("DROP TABLE IF EXISTS `GoalEventCoupler`");
        _db.execSQL("DROP TABLE IF EXISTS `journalEntries`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsEvents = new HashMap<String, TableInfo.Column>(7);
        _columnsEvents.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvents.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvents.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvents.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvents.put("startDate", new TableInfo.Column("startDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvents.put("endDate", new TableInfo.Column("endDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEvents.put("repeatingSeries", new TableInfo.Column("repeatingSeries", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEvents = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEvents = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEvents = new TableInfo("events", _columnsEvents, _foreignKeysEvents, _indicesEvents);
        final TableInfo _existingEvents = TableInfo.read(_db, "events");
        if (! _infoEvents.equals(_existingEvents)) {
          return new RoomOpenHelper.ValidationResult(false, "events(com.calebgraves.cs2410finalassignment.models.Event).\n"
                  + " Expected:\n" + _infoEvents + "\n"
                  + " Found:\n" + _existingEvents);
        }
        final HashMap<String, TableInfo.Column> _columnsGoals = new HashMap<String, TableInfo.Column>(6);
        _columnsGoals.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("startDate", new TableInfo.Column("startDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("endDate", new TableInfo.Column("endDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGoals = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGoals = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGoals = new TableInfo("goals", _columnsGoals, _foreignKeysGoals, _indicesGoals);
        final TableInfo _existingGoals = TableInfo.read(_db, "goals");
        if (! _infoGoals.equals(_existingGoals)) {
          return new RoomOpenHelper.ValidationResult(false, "goals(com.calebgraves.cs2410finalassignment.models.Goal).\n"
                  + " Expected:\n" + _infoGoals + "\n"
                  + " Found:\n" + _existingGoals);
        }
        final HashMap<String, TableInfo.Column> _columnsGoalEventCoupler = new HashMap<String, TableInfo.Column>(2);
        _columnsGoalEventCoupler.put("goalId", new TableInfo.Column("goalId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoalEventCoupler.put("eventId", new TableInfo.Column("eventId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGoalEventCoupler = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGoalEventCoupler = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGoalEventCoupler = new TableInfo("GoalEventCoupler", _columnsGoalEventCoupler, _foreignKeysGoalEventCoupler, _indicesGoalEventCoupler);
        final TableInfo _existingGoalEventCoupler = TableInfo.read(_db, "GoalEventCoupler");
        if (! _infoGoalEventCoupler.equals(_existingGoalEventCoupler)) {
          return new RoomOpenHelper.ValidationResult(false, "GoalEventCoupler(com.calebgraves.cs2410finalassignment.models.GoalEventCoupler).\n"
                  + " Expected:\n" + _infoGoalEventCoupler + "\n"
                  + " Found:\n" + _existingGoalEventCoupler);
        }
        final HashMap<String, TableInfo.Column> _columnsJournalEntries = new HashMap<String, TableInfo.Column>(4);
        _columnsJournalEntries.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJournalEntries.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJournalEntries.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsJournalEntries.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysJournalEntries = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesJournalEntries = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoJournalEntries = new TableInfo("journalEntries", _columnsJournalEntries, _foreignKeysJournalEntries, _indicesJournalEntries);
        final TableInfo _existingJournalEntries = TableInfo.read(_db, "journalEntries");
        if (! _infoJournalEntries.equals(_existingJournalEntries)) {
          return new RoomOpenHelper.ValidationResult(false, "journalEntries(com.calebgraves.cs2410finalassignment.models.JournalEntry).\n"
                  + " Expected:\n" + _infoJournalEntries + "\n"
                  + " Found:\n" + _existingJournalEntries);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "fc4f8d6c0dff2d80268b27304debe458", "6c04b03d323124de61c79368247968a0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "events","goals","GoalEventCoupler","journalEntries");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `events`");
      _db.execSQL("DELETE FROM `goals`");
      _db.execSQL("DELETE FROM `GoalEventCoupler`");
      _db.execSQL("DELETE FROM `journalEntries`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(EventsDao.class, EventsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GoalsDao.class, GoalsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GoalsToEventsDao.class, GoalsToEventsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(JournalEntriesDao.class, JournalEntriesDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public EventsDao getEventsDao() {
    if (_eventsDao != null) {
      return _eventsDao;
    } else {
      synchronized(this) {
        if(_eventsDao == null) {
          _eventsDao = new EventsDao_Impl(this);
        }
        return _eventsDao;
      }
    }
  }

  @Override
  public GoalsDao getGoalsDao() {
    if (_goalsDao != null) {
      return _goalsDao;
    } else {
      synchronized(this) {
        if(_goalsDao == null) {
          _goalsDao = new GoalsDao_Impl(this);
        }
        return _goalsDao;
      }
    }
  }

  @Override
  public GoalsToEventsDao getCouplersDao() {
    if (_goalsToEventsDao != null) {
      return _goalsToEventsDao;
    } else {
      synchronized(this) {
        if(_goalsToEventsDao == null) {
          _goalsToEventsDao = new GoalsToEventsDao_Impl(this);
        }
        return _goalsToEventsDao;
      }
    }
  }

  @Override
  public JournalEntriesDao getJournalEntriesDao() {
    if (_journalEntriesDao != null) {
      return _journalEntriesDao;
    } else {
      synchronized(this) {
        if(_journalEntriesDao == null) {
          _journalEntriesDao = new JournalEntriesDao_Impl(this);
        }
        return _journalEntriesDao;
      }
    }
  }
}
