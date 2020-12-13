package com.example.dukaanassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dukaanassignment.adapters.Adapter
import com.example.dukaanassignment.model.Order
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerview()
    }

    fun setUpRecyclerview(){

        var orderList= ArrayList<Order>()

        orderList.add(Order("Order #281134","2 item","₹179","Today, 11:11 PM","COD"))
        orderList.add(Order("Order #581155","8 item","₹889","Yesterday, 12:10 PM","PAID"))
        orderList.add(Order("Order #481112","12 item","₹1279","Yesterday, 09:12 PM","PAID"))

        rv_orders.adapter=Adapter(this,orderList)
        rv_orders.layoutManager=LinearLayoutManager(this)

    }
}