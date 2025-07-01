package com.example.myfefufit

import androidx.lifecycle.LiveData

class lab6_Repository(private val activityDao: lab6_ActivityDao) {

    suspend fun insertActivity(activity: lab6_SportsEntity) {
        activityDao.insert(activity)
    }

    fun getAllActivities(): LiveData<List<lab6_SportsEntity>> {
        return activityDao.getAllActivities()
    }

    suspend fun getActivityById(activityId: Int): lab6_SportsEntity? {
        return activityDao.getActivityById(activityId)
    }
}