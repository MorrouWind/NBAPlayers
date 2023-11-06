package com.du.hast.ui.player

import androidx.lifecycle.MutableLiveData
import com.du.hast.db.entity.PlayerEntity
import com.du.hast.db.repository.NBARepos
import com.du.hast.ui.base.BaseViewModel

class SelectedPlayerViewModel(repos: NBARepos) : BaseViewModel(repos)  {
    val player = MutableLiveData<PlayerEntity>()
}