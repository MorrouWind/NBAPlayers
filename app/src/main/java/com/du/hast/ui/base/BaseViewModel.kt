package com.du.hast.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.du.hast.db.entity.PlayerEntity
import com.du.hast.db.repository.NBARepos
import com.du.hast.db.start_data.StartData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

abstract class BaseViewModel(private val repos: NBARepos) : ViewModel() {

    open fun getPlayersData() {
        viewModelScope.launch(Dispatchers.IO) {
            if (repos.getPlayers().isEmpty()) {
                repos.updatePlayers(StartData().getDefaultData())
            }
        }
    }

    open fun getPlayers(liveData: MutableLiveData<List<PlayerEntity>>) {
        viewModelScope.launch(Dispatchers.IO) {
            liveData.postValue(repos.getPlayers())
        }
    }

    open fun getPlayer(id: Int, liveData: MutableLiveData<PlayerEntity>) {
        viewModelScope.launch(Dispatchers.IO) {
            liveData.postValue(repos.getPlayer(id))
        }
    }
}