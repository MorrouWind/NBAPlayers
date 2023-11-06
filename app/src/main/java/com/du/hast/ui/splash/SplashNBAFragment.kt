package com.du.hast.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.du.hast.databinding.FragmentSplashNBABinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashNBAFragment : Fragment() {
    private lateinit var binding: FragmentSplashNBABinding
    private val viewModel by viewModel<SplashNBAViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashNBABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPlayersData()
        lifecycleScope.launch{ toTopList() }
    }

    private suspend fun toTopList() {
        withContext(Dispatchers.IO) {
            Thread.sleep(3000)
        }
        findNavController().navigate(SplashNBAFragmentDirections.toNbaPlayers())
    }
}