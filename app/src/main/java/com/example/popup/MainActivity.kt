package com.example.popup

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPop = findViewById<Button>(R.id.button)
        val background = findViewById<LinearLayout>(R.id.back)

        btnPop.setOnClickListener {

            val popMenu = PopupMenu(this@MainActivity,btnPop)
            popMenu.menuInflater.inflate(R.menu.menu_popup,popMenu.menu)
            popMenu.setOnMenuItemClickListener(object :PopupMenu.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?):Boolean {

                     when(item!!.itemId){
                     R.id.redColor -> background.setBackgroundColor(Color.parseColor("#FF0000"))
                      R.id.greenColor -> background.setBackgroundColor(Color.parseColor("#00ff00"))
                      R.id.blueColor -> background.setBackgroundColor(Color.parseColor("#0000FF"))
                     }
                    return true
                }
            })
            popMenu.show()

        }
    }
}