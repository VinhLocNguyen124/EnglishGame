package com.locslender.englishgame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import static com.locslender.englishgame.DBContract.TOPIC;


public class CreateDB extends SQLiteOpenHelper {
    private static final String TAG = "CreateDB";
    
    private static final String DATABASE_NAME = "TiengAnh.db";
    private static int VERSION = 1;


    private String SQLQuery = "CREATE TABLE " +TOPIC.TABLE_NAME + " ( " +
            TOPIC.ID + " INTEGER PRIMARY KEY, " +
            TOPIC.TEN_CHU_DE + " TEXT, " +
            TOPIC.IMG_CHU_DE + " TEXT, " +
            TOPIC.MAX_DIEM_CHU_DE + " TEXT )";

//    private String SQLQuery1 = "CREATE TABLE " + TABLE_NAME + " ( " +
//            ID + " INTEGER PRIMARY KEY, " +
//            TEN_CHU_DE + " TEXT, " +
//            IMG_CHU_DE + " TEXT, " +
//            MAX_DIEM_CHU_DE + " TEXT )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TOPIC.TABLE_NAME;

    public CreateDB(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "onCreate: start execSQL string ");
        db.execSQL(SQLQuery);
        Log.d(TAG, "onCreate: Create database successful !!");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       onUpgrade(db, oldVersion, newVersion);
    }
}
