package com.castfox.applibrary.util

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by JeongJaeHwan on 2022/02/25
 **/
class SharedUtil(private val context: Context) {
  private var mShared: SharedPreferences
  private var mEditor: SharedPreferences.Editor

  private val preferenceName = "GuruSharedPreference"

  init {
    mShared = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE)
    mEditor = mShared.edit()
  }

  fun getSharedString(key: String): String = mShared.getString(key, "") ?: ""
  fun getSharedString(key: String, def: String): String = mShared.getString(key, def) ?: ""
  fun getSharedBoolean(key: String): Boolean = mShared.getBoolean(key, false)
  fun getSharedBoolean(key: String, defaultValue: Boolean): Boolean = mShared.getBoolean(key, defaultValue)
  fun getSharedInt(key: String): Int = mShared.getInt(key, 0)
  fun getSharedInt(key: String, def: Int): Int = mShared.getInt(key, def)
  fun getSharedLong(key: String): Long = mShared.getLong(key, 0)
  fun getSharedFloat(key: String): Float = mShared.getFloat(key, 0.0f)
  private fun getSharedStringSet(key: String): Set<String>? = mShared.getStringSet(key, setOf())


  fun setSharedPreference(key: String, value: String) {
    mEditor.putString(key, value).apply()
  }

  fun setSharedPreference(key: String, value: Boolean) {
    mEditor.putBoolean(key, value).apply()
  }

  fun setSharedPreference(key: String, value: Int) {
    mEditor.putInt(key, value).apply()
  }

  fun setSharedPreference(key: String, value: Long) {
    mEditor.putLong(key, value).apply()
  }

  fun setSharedPreference(key: String, value: Float) {
    mEditor.putFloat(key, value).apply()
  }

  private fun setStringSetSharedPreference(key: String, value: MutableSet<String>) {
    mEditor.putStringSet(key, value).apply()
  }
}