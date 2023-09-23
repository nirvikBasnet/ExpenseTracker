package com.nirvikbasnet.expensetracker.data.model.local

import androidx.room.Dao
import androidx.room.Query
import com.nirvikbasnet.expensetracker.data.model.Income

/*
Data access object for the Income table
*/
@Dao
interface IncomeDao {
    /*
    * Observes list of Income
    *
    * @returns all Income
    */
    @Query("Select * from Income")
    fun observeAll(): List<Income>
}