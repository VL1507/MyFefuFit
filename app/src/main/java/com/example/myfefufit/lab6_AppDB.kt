package com.example.myfefufit

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [lab6_SportsEntity::class], version = 2)
@TypeConverters(lab6_Converters::class)
abstract class lab6_AppDB : RoomDatabase() {
    abstract fun activityDao(): lab6_ActivityDao

    companion object {
        @Volatile
        private var INSTANCE: lab6_AppDB? = null

        fun getDatabase(context: Context): lab6_AppDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    lab6_AppDB::class.java,
                    "fefu_fit_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}