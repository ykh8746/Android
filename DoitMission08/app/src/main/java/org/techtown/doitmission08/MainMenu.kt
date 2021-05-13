package org.techtown.doitmission08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        var client : Button = findViewById(R.id.button2)
        var income : Button = findViewById(R.id.button3)
        var item : Button = findViewById(R.id.button4)

        client.setOnClickListener {
            var intent = Intent(this, ClientManage::class.java)

            startActivityForResult(intent, 101)
        }

        income.setOnClickListener {
            var intent = Intent(this, IncomeManage::class.java)

            startActivityForResult(intent, 102)
        }

        item.setOnClickListener {
            var intent = Intent(this, ItemManage::class.java)

            startActivityForResult(intent, 103)
        }


    }
}