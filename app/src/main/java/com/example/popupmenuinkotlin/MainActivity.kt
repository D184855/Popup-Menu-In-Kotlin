package com.example.popupmenuinkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<View>(R.id.clickBtn) as Button

        button!!.setOnClickListener {
            val popupMenu = PopupMenu(this@MainActivity, button)

            popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                Toast.makeText(
                    this@MainActivity,
                    "You Clicked " + menuItem.title,
                    Toast.LENGTH_SHORT
                ).show()
                true
            }
            popupMenu.show()
        }
    }
}
