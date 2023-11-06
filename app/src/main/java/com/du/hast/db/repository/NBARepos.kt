package com.du.hast.db.repository

import com.du.hast.db.NBADB
import com.du.hast.db.entity.PlayerEntity

class NBARepos(db: NBADB) {

    private val playerDao = db.getPlayers()

    fun getPlayers() = playerDao.getPlayers()

    fun updatePlayers(recipes: List<PlayerEntity>) {
        recipes.forEach { playerDao.updatePlayers(it) }
    }

    fun getPlayer(id: Int) = playerDao.getPlayer(id)


}