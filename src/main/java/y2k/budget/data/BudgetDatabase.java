package y2k.budget.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import y2k.budget.BudgetApplication;

public class BudgetDatabase extends SQLiteOpenHelper {
  private static final String DB_NAME = "budgetDatabase";
  private static final int DB_VERSION = 1;
  
  public static final String TABLE_ITEMS = "items";
  public static final String ID = "id";
  public static final String COL_CATEGORY = "category";
  public static final String COL_VALUE = "value";
  public static final String COL_DATE = "date";
  
  private static final String CREATE_TABLE_ITEMS = "create table " + TABLE_ITEMS + " (" 
    + ID + " integer primary key autoincrement, "
    + COL_CATEGORY + " integer not null, "
    + COL_VALUE + " float not null, "
    + COL_DATE + " integer not null);";
  
  public BudgetDatabase(String dbName) {
    super(BudgetApplication.getContext(), dbName, null, DB_VERSION);
  }
  
  @Override
  public void onCreate(SQLiteDatabase db) {
    System.out.println("NEW DB: " + CREATE_TABLE_ITEMS);
    db.execSQL(CREATE_TABLE_ITEMS);
  }
  
  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // FIXME
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_ITEMS);
    onCreate(db);
  }

  public void insertOrUpdate(Item item) {
    // TODO: Implement it
  }
}
