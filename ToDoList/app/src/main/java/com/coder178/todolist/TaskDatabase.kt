package com.coder178.todolist

import android.content.Context
import androidx.room.Database



//class TaskDatabase {
    @Database(entities = [Task::class], version = 1)
    abstract class  TaskDatabase : RoomDatabase(){

        abstract  fun taskListDao(): TaskListDao
        abstract fun taskDetailDao(): TaskDetailDao

        companion object{
            @Volatile
            private var instance: TaskDatabase? = null

            fun getDatabase(context: Context) = instance
                ?: synchronized(this){
                    Room.databaseBuilder(
                       context.applicationContext,
                       TaskDatabase::class.java,
                        "task_database"
                    ).build().also{ instance = it }
                }
        }

    }

