package org.techtown.doitmission_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            imageView.visibility = View.VISIBLE
            imageView2.visibility = View.INVISIBLE
        }

        button2.setOnClickListener {
            imageView.visibility = View.INVISIBLE
            imageView2.visibility = View.VISIBLE
        }
    }
}

