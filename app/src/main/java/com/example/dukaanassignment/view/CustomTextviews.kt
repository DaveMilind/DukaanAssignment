package com.example.dukaanassignment.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.example.dukaanassignment.R

class CustomTextviews(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    init {
        inflate(context, R.layout.layout_custom_textview, this)

        val tvTitle: TextView = findViewById(R.id.tv_title)
        val tvSubTitle: TextView = findViewById(R.id.tv_sub_title)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomTextviews)
        tvTitle.text = attributes.getString(R.styleable.CustomTextviews_title_text)
        tvSubTitle.text = attributes.getString(R.styleable.CustomTextviews_value_text)

        attributes.recycle()

    }
}