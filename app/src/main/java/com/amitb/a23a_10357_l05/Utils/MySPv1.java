package com.amitb.a23a_10357_l05.Utils;

import android.content.Context;
import android.content.SharedPreferences;


public class MySPv1 {
    private static final String DB_FILE = "DB_FILE";

    public static void putString(Context context,String key,String value){
        SharedPreferences pref = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key,value);
        editor.commit();
    }

    public static String getString(Context context,String key,String defValue){
        SharedPreferences pref = context.getSharedPreferences(DB_FILE,Context.MODE_PRIVATE);
        return pref.getString(key,defValue);
    }

    public static void putInt(Context context,String key,int value){
        SharedPreferences pref = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key,value);
        editor.commit();
    }

    public static int getInt(Context context,String key,int defValue){
        SharedPreferences pref = context.getSharedPreferences(DB_FILE,Context.MODE_PRIVATE);
        return pref.getInt(key,defValue);
    }

}
