package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ColorMyViews code
        setListeners()
    }

    // create setListeners function
    private fun setListeners() {
        val clickableViews: List<View> = listOf(box_one_text, box_two_text,
            box_three_text, box_four_text, box_five_text, constraint_layout,
            red_button, yellow_button, green_button)

        for(item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }
    }

    // create makeColored function
    fun makeColored(view: View) {
        when(view.id) {

            // color boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // alternatively, color boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red_color)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow_color)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green_color)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
