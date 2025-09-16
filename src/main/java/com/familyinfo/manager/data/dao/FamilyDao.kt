package com.familyinfo.manager.data.dao

import androidx.room.*
import com.familyinfo.manager.data.model.Family
import kotlinx.coroutines.flow.Flow

@Dao
interface FamilyDao {
    @Query("SELECT * FROM families")
    fun getAllFamilies(): Flow<List<Family>>

    @Insert
    suspend fun insertFamily(family: Family): Long

    @Delete
    suspend fun deleteFamily(family: Family)
}
