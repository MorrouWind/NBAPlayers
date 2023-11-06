package com.du.hast.ui.nba_players

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.du.hast.databinding.FragmentNbaPlayersBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class NbaPlayersFragment : Fragment() {

    private lateinit var binding: FragmentNbaPlayersBinding
    private val viewModel by viewModel<NBAPlayersViewModel>()
    private val adapter = NBAdaptor(arrayListOf()) { toSelectedPlayer(it) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNbaPlayersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPlayers(viewModel.players)
        lockBackPressed()
        updateRecycler()
    }

    private fun updateRecycler() {
        viewModel.players.observe(viewLifecycleOwner) {
            adapter.setPlayers(it)
        }
        binding.recycler.apply {
            adapter = this@NbaPlayersFragment.adapter
            layoutManager = GridLayoutManager(requireContext(), 1)
        }
    }

    private fun toSelectedPlayer(id: Int) {
        findNavController().navigate(
            NbaPlayersFragmentDirections.toSelectedPlayer(id)
        )
    }

    private fun lockBackPressed() {
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                return
            }
        }
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, callback)
    }

}