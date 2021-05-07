package org.techtown.doitmission_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sentButton.setOnClickListener {
            Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
        }

        closedButton.setOnClickListener {
            finish()
        }

        editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                var bytes = s.toString().toByteArray()
                var strCount = bytes.count()

                textView.setText("$strCount / 80바이트")
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

    }
}


