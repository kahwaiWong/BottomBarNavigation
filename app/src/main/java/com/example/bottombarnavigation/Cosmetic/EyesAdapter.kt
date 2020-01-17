package com.example.bottombarnavigation.Cosmetic

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bottombarnavigation.R
import java.util.ArrayList

class EyesAdapter(private val context: Activity, val imageList: ArrayList<Eyes>)
    : ArrayAdapter<String>(context, R.layout.custom_list){

    class OutfitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit: Outfit) {
            itemView.imageViewCasual.setImageResource(outfit.image)
        }
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list,null,true)

        return rowView
    }

}
