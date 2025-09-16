package com.familyinfo.manager.data.dao

import androidx.room.*
import com.familyinfo.manager.data.model.FamilyMember
import kotlinx.coroutines.flow.Flow

@Dao
interface FamilyMemberDao {
    @Query("SELECT * FROM family_members WHERE familyId = :familyId")
    fun getFamilyMembers(familyId: Long): Flow<List<FamilyMember>>

    @Insert
    suspend fun insertMember(member: FamilyMember)

    @Delete
    suspend fun deleteMember(member: FamilyMember)
}
