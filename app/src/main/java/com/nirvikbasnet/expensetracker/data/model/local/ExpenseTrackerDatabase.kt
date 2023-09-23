package com.nirvikbasnet.expensetracker.data.model.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nirvikbasnet.expensetracker.data.model.Income

/*
* The Room Database that contains Income Table
*
* Note that exportSchema must be true in production database
*/
@Database(entities = [Income::class], version = 1, exportSchema = false)
abstract class ExpenseTrackerDatabase : RoomDatabase() {
    abstract fun incomeDao() : IncomeDao
}