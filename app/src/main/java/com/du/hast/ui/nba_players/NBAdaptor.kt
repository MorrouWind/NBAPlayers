package com.du.hast.ui.nba_players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.du.hast.databinding.RecyclerItemBinding
import com.du.hast.db.entity.PlayerEntity

class NBAdaptor(
    private val players: ArrayList<PlayerEntity>,
    val id : (Int) -> Unit
) : RecyclerView.Adapter<NBAdaptor.PlayerViewHolder>() {

    inner class PlayerViewHolder(val binding: RecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerItemBinding.inflate(inflater, parent, false)
        return PlayerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return players.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(players[position].image)
        holder.binding.name.text = players[position].name
        holder.binding.imageView.setOnClickListener { players[position].id?.let { it1 -> id (it1) } }
    }

    fun setPlayers(newList: List<PlayerEntity>) {
        players.clear()
        players.addAll(newList)
        notifyItemInserted(players.size)
    }
}