package com.example.polares

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var itemOne: View
    private lateinit var itemTwo: View
    private lateinit var itemThree: View
    private lateinit var btnOne: Button
    private lateinit var btnTwo: Button
    private lateinit var btnThree: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        this.itemOne = findViewById(R.id.fake_img_one)
        this.itemTwo = findViewById(R.id.fake_img_two)
        this.itemThree = findViewById(R.id.fake_img_three)
        this.btnOne = findViewById(R.id.btn_f)
        this.btnTwo = findViewById(R.id.btn_h)
        this.btnThree = findViewById(R.id.btn_e)

        this.btnOne.setOnClickListener {
            this.btnOneUpdateMenu()
        }

        this.btnTwo.setOnClickListener {
            this.btnTwoUpdateMenu()
        }

        this.btnThree.setOnClickListener {
            this.btnThreeUpdateMenu()
        }
    }

    private fun btnOneUpdateMenu() {
        this.itemOne.setBackgroundColor(ContextCompat.getColor(this, R.color.img_blue))
        this.itemTwo.setBackgroundColor(ContextCompat.getColor(this, R.color.img_blue))
        this.itemThree.setBackgroundColor(ContextCompat.getColor(this, R.color.img_blue))
    }
    private fun btnTwoUpdateMenu() {
        this.itemOne.setBackgroundColor(ContextCompat.getColor(this, R.color.img_pink))
        this.itemTwo.setBackgroundColor(ContextCompat.getColor(this, R.color.img_pink))
        this.itemThree.setBackgroundColor(ContextCompat.getColor(this, R.color.img_pink))
    }
    private fun btnThreeUpdateMenu() {
        this.itemOne.setBackgroundColor(ContextCompat.getColor(this, R.color.img_green))
        this.itemTwo.setBackgroundColor(ContextCompat.getColor(this, R.color.img_green))
        this.itemThree.setBackgroundColor(ContextCompat.getColor(this, R.color.img_green))
    }

}