package org.techtown.doitmission08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IncomeManage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_income_manage)

        var menuButton : Button = findViewById(R.id.button7)
        var loginButton : Button = findViewById(R.id.button8)

        menuButton.setOnClickListener {
            var intent = Intent(this, MainMenu::class.java)

            startActivityForResult(intent, 104)
        }

        loginButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)

            startActivityForResult(intent, 105)
        }
    }
}