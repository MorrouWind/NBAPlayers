package com.du.hast.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.du.hast.db.entity.PlayerEntity
@Dao
interface PlayerDao {
    @Query("SELECT * FROM PlayerEntity")
    fun getPlayers() : List<PlayerEntity>

    @Query("SELECT * FROM PlayerEntity WHERE id = :id")
    fun getPlayer(id: Int) : PlayerEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun updatePlayers(recipe: PlayerEntity)
}