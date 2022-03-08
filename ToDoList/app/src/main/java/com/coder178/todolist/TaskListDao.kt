package com.coder178.todolist

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface TaskListDao {
    @Query("Select * FROM task WHERE status = :status ORDER BY priority DESC")
    fun getTasksByPriority(status: Int): LiveData<List<Task>>

    @Query("SELECT * FROM task WHERE status = :status ORDER BY title")
    fun getTaskByTitle(status: Int): LiveData<List<Task>>
}