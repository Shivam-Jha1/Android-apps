package com.coder178.todolist

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDetailDao {

    @Query("SELECT  * FROM task WHERE 'id' = :id")
    fun getTask(id:Long):LiveData<Task>

    //if we try to enter value of same id it will be ignored
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTask(task: Task):Long

    @Update
    suspend fun UpdateTask (task: Task)

    @Delete
    suspend fun  deleteTask(task: Task)
}