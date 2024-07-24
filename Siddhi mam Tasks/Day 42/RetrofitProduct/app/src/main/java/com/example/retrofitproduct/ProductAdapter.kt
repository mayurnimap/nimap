package com.example.retrofitproduct

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(private var productList: List<Model>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    // ViewHolder class
    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productTitle: TextView = itemView.findViewById(R.id.product_title)
        private val productDesc: TextView = itemView.findViewById(R.id.product_desc)
        private val productPrice: TextView = itemView.findViewById(R.id.product_prize)
        private val productImage: ImageView = itemView.findViewById(R.id.product_tmb)

        fun bind(product: Model) {
            productTitle.text = product.title
            productDesc.text = product.description
            productPrice.text = "$${product.price}"

            Glide.with(itemView.context)
                .load(product.image)
                .placeholder(R.drawable.ic_launcher_background) // Optional placeholder image
                .into(productImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    fun updateProducts(newProducts: List<Model>) {
        productList = newProducts
        notifyDataSetChanged()
    }
}