package com.du.hast.ui.nba_players

import androidx.lifecycle.MutableLiveData
import com.du.hast.db.entity.PlayerEntity
import com.du.hast.db.repository.NBARepos
import com.du.hast.ui.base.BaseViewModel

class NBAPlayersViewModel(repos: NBARepos) : BaseViewModel(repos) {
    val players = MutableLiveData<List<PlayerEntity>>()
}