package org.techtown.doitmission08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ClientManage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_manage)

        var menuButton : Button = findViewById(R.id.button5)
        var loginButton : Button = findViewById(R.id.button6)

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