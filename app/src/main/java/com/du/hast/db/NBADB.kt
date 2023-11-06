package com.du.hast.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.du.hast.db.dao.PlayerDao
import com.du.hast.db.entity.PlayerEntity

@Database(entities = [PlayerEntity::class], version = 1, exportSchema = false)
abstract class NBADB : RoomDatabase() {

    abstract fun getPlayers() : PlayerDao
}