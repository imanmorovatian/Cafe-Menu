package com.iman.cafeowner.activity.cafeprofile

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iman.cafeowner.R
import com.iman.cafeowner.data.model.ProductCategory
import com.iman.cafeowner.utils.OnListItemSelected
import com.squareup.picasso.Picasso

class ProductCategoryAdapter(private val mCallBack: OnListItemSelected,
                             private val items: List<ProductCategory>) :
    RecyclerView.Adapter<ProductCategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = View.inflate(parent.context, R.layout.adapter_main_menu, null).apply {
            minimumHeight = parent.measuredHeight / 2
        }
        return ViewHolder(root)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[holder.adapterPosition]
        holder.mTitle.text = item.mTitle
        Picasso.get().load(item.mImage).into(holder.mIcon)
        holder.itemView.setOnClickListener {
            mCallBack.onClick(holder.adapterPosition)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mTitle: TextView = itemView.findViewById(R.id.text_view_category_title)
        val mIcon: ImageView = itemView.findViewById(R.id.image_view_category_image)
    }
}