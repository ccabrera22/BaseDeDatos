package com.ccabrera.basededatos;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class AdminSQLiteOpenHelpe extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelpe(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }

    public void onCreate(SQLiteDatabase BaseDeDatos){
        BaseDeDatos.execSQL("create table articulos(codigo int primary key, descripcion text, precio real)");

    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }
}
