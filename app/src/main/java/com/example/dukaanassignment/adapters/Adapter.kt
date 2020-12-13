package com.example.dukaanassignment.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.dukaanassignment.R
import com.example.dukaanassignment.databinding.RowOrdersBinding
import com.example.dukaanassignment.model.Order
import kotlinx.android.synthetic.main.row_orders.view.*

class Adapter(var context: Context,private val items: List<Order>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: RowOrdersBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.row_orders, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])


    inner class ViewHolder(itemView: RowOrdersBinding) : RecyclerView.ViewHolder(itemView.root) {
        fun bind(order: Order) {
            with(itemView) {

                tv_order_num.text=order.orderNum
                tv_item.text=order.items
                tv_price.text=order.price
                tv_status.text=order.status
                tv_time.text=order.time

                if(order.status.toLowerCase()=="paid"){

                    tv_status.setBackgroundResource(R.drawable.bg_curve_red)
                    tv_status.setTextColor(resources.getColor(R.color.red))

                }
            }
        }

    }
}