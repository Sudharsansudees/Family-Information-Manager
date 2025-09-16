package com.familyinfo.manager.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "family_members",
    foreignKeys = [
        ForeignKey(
            entity = Family::class,
            parentColumns = ["id"],
            childColumns = ["familyId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class FamilyMember(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val familyId: Long,
    val name: String,
    val age: Int,
    val fatherName: String,
    val motherName: String,
    val spouseName: String?, // husband or wife name
    val address: String
)
