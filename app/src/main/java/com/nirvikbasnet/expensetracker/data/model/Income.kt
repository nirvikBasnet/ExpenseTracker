package com.nirvikbasnet.expensetracker.data.model

import androidx.room.Entity
import java.util.Date

@Entity
data class Income(val name: String, val amount: Double, val date: Date)
