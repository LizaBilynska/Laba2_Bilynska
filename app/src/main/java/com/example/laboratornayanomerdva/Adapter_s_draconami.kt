package com.example.laboratornayanomerdva

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.laboratornayanomerdva.databinding.ItemBlablablaBinding

class Adapter_s_draconami (val launchFragment: (Dracony)->Unit): RecyclerView.Adapter<Adapter_s_draconami.Dracon_ViewHolder>(){
    val DraconList = ArrayList<Dracony>()

    inner class Dracon_ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        private val binding = ItemBlablablaBinding.bind(itemView)
        fun bindFun(film: Dracony)
        {
            binding.card.setOnClickListener{
                launchFragment(DraconList[adapterPosition])
            }
            Glide.with(binding.ivItemDracon.context).load(film.image).into(binding.ivItemDracon)

            binding.tvDracon.text=film.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Dracon_ViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_blablabla,parent, false)
        return Dracon_ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Dracon_ViewHolder, position: Int)
    {
        holder.bindFun(DraconList[position])
    }

    override fun getItemCount(): Int
    {
        return DraconList.size
    }

    fun addDracon(filmSet: List<Dracony>)
    {
        DraconList.addAll(filmSet)
        notifyDataSetChanged()
    }
}