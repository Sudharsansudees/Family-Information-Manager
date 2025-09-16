package com.familyinfo.manager.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "families")
data class Family(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val familyName: String
)
