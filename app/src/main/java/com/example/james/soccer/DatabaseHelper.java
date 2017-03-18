package com.example.james.soccer;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Richard Frolia on 2/28/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "soccer.db";

    public static final String TABLE_NAME1 = "TEAM";
    public static final String COL_1A = "TEAMNAME";
    public static final String COL_2A = "TEAMID";

    public static final String TABLE_NAME2 = "PLAYER";
    public static final String COL_1B = "TEAMNAME";
    public static final String COL_2B = "FIRSTNAME";
    public static final String COL_3B = "LASTNAME";
    public static final String COL_4B = "POSITION";
    public static final String COL_5B = "HEIGHT";
    public static final String COL_6B = "OVERALL";
    public static final String COL_7B = "SPEED";
    public static final String COL_8B = "SHOOTING";
    public static final String COL_9B = "PASSING";
    public static final String COL_10B = "DRIBBLING";
    public static final String COL_11B = "DEFENDING";
    public static final String COL_12B = "STRENGTH";
    public static final String COL_13B = "AWARENESS";
    public static final String COL_14B = "GOALKEEPER";
    public static final String COL_15B = "TEAMID";


    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table " + TABLE_NAME1 + "(TEAMNAME TEXT PRIMARY KEY, TEAMID INTEGER )");
        db.execSQL("create table " + TABLE_NAME2 + "(TEAMNAME TEXT, FIRSTNAME TEXT, LASTNAME TEXT, POSITION TEXT," +
                " HEIGHT INTEGER, OVERALL INTEGER, SPEED INTEGER, SHOOTING INTEGER, PASSING INTEGER, DRIBBLING INTEGER, DEFENDING INTEGER," +
                " STRENGTH INTEGER, AWARENESS INTEGER, GOALKEEPER INTEGER, TEAMID INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);

    }

    public void insertData1(String teamName, int teamID){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1A, teamName);
        contentValues.put(COL_2A, teamID);
        db.insert(TABLE_NAME1,null, contentValues);
    }

    public void insertData2(String teamName, String firstName, String lastName, String position, int height,
                            int overall, int speed, int shooting, int passing, int dribbling, int defending,
                            int strength, int awareness, int goalkeeper, int teamID){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1B, teamName);
        contentValues.put(COL_2B, firstName);
        contentValues.put(COL_3B, lastName);
        contentValues.put(COL_4B, position);
        contentValues.put(COL_5B, height);
        contentValues.put(COL_6B, overall);
        contentValues.put(COL_7B, speed);
        contentValues.put(COL_8B, shooting);
        contentValues.put(COL_9B, passing);
        contentValues.put(COL_10B, dribbling);
        contentValues.put(COL_11B, defending);
        contentValues.put(COL_12B, strength);
        contentValues.put(COL_13B, awareness);
        contentValues.put(COL_14B, goalkeeper);
        contentValues.put(COL_15B, teamID);




        db.insert(TABLE_NAME1,null, contentValues);
    }

}

