package com.du.hast.di

import androidx.room.Room
import com.du.hast.App
import com.du.hast.NBA_DB_NAME
import com.du.hast.db.NBADB
import com.du.hast.db.repository.NBARepos
import com.du.hast.ui.nba_players.NBAPlayersViewModel
import com.du.hast.ui.player.SelectedPlayerViewModel
import com.du.hast.ui.splash.SplashNBAViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val applicationModule = module {

    single { androidContext() as App }

    single {
        Room.databaseBuilder(
            androidContext(),
            NBADB::class.java,
            NBA_DB_NAME
        ).build()
    }

    single { NBARepos(get()) }

    viewModel { SplashNBAViewModel(get()) }
    viewModel { NBAPlayersViewModel(get()) }
    viewModel { SelectedPlayerViewModel(get()) }
}