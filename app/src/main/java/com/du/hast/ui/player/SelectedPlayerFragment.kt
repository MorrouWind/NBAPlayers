package com.du.hast.ui.player

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.du.hast.databinding.FragmentSelectedPlayerBinding
import com.du.hast.db.entity.PlayerEntity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SelectedPlayerFragment : Fragment() {

    private lateinit var binding: FragmentSelectedPlayerBinding
    private val viewModel by viewModel<SelectedPlayerViewModel>()
    private val args by navArgs<SelectedPlayerFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectedPlayerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPlayer(args.id, viewModel.player)
        viewModel.player.observe(viewLifecycleOwner) {
            updateUI(it)
        }
    }

    private fun updateUI(boxer: PlayerEntity) {
        binding.name.text = boxer.name
        binding.description.text = boxer.descr
        binding.root.setBackgroundResource(boxer.image)
    }
}