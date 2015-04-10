package com.coolweather.app.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/*
	 * Province建表语句
	 * */
	public static final String PROVINCE_CREATE="create table Province("
			+"id integer primary key autoincrement"
			+"province_name text"
			+"province_code text)";
	/*
	 * City建表语句
	 * */
	public static final String CITY_CREATE="create table City("
			+"id integer primary key autoincrement"
			+"city_name text"
			+"city_code text"
			+"province_id integer)";
	/*
	 * County建表语句
	 * */
	public static final String COUNTY_CREATE="create table County("
			+"id integer primary key autoincrement"
			+"county_name text"
			+"county_code text"
			+"city_id integer)";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		//执行省市县的建表语句
		db.execSQL(PROVINCE_CREATE);
		db.execSQL(CITY_CREATE);
		db.execSQL(COUNTY_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
