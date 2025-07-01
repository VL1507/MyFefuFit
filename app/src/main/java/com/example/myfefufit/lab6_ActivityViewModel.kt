package com.example.myfefufit

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class lab6_ActivityViewModel(private val repository: lab6_Repository) : ViewModel() {
    val allActivities: LiveData<List<lab6_SportsEntity>> = repository.getAllActivities()

    fun insert(activity: lab6_SportsEntity) = viewModelScope.launch {
        repository.insertActivity(activity)
    }

    suspend fun getActivityById(activityId: Int): lab6_SportsEntity? {
        return repository.getActivityById(activityId)
    }

    class Factory(private val repository: lab6_Repository) : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return lab6_ActivityViewModel(repository) as T
        }
    }
}