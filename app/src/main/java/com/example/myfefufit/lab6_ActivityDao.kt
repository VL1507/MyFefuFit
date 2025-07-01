package com.example.myfefufit

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface lab6_ActivityDao {

    @Insert
    suspend fun insert(activity: lab6_SportsEntity)

    @Query("SELECT * FROM activity ORDER BY startTime DESC")
    fun getAllActivities(): LiveData<List<lab6_SportsEntity>>

    @Query("SELECT * FROM activity WHERE id = :activityId")
    suspend fun getActivityById(activityId: Int): lab6_SportsEntity?
}