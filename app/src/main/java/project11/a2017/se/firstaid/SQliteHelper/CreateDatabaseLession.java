package project11.a2017.se.firstaid.SQliteHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MinhChuong on 14/05/2017.
 */

public class CreateDatabaseLession extends SQLiteOpenHelper {

    public static final String DB_LESSION = "Lession";
    public static final int DB_VERSION = 1;

    public CreateDatabaseLession(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_LESSION, null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
