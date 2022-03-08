package com.coder178.expense_manager

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Relation
import com.example.expanse.data.Transaction

@Entity
data class MonthlyTransactions(
    @ColumnInfo(name = "monthYear")
    var monthYear: Long,

    @ColumnInfo(name = "month")
    var month: Int,

    @ColumnInfo(name = "year")
    var year: Int,

    @ColumnInfo(name = "sum")
    var sum: Float,

    @Relation(parentColumn = "monthYear", entityColumn = "monthYear", entity = Transaction::class)
    val children: List<Expense>
)
