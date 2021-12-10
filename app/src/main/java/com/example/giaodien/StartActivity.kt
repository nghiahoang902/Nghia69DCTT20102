package com.example.giaodien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val button_login = findViewById(R.id.button_login) as Button
        val edittext_username = findViewById(R.id.edittext_username) as EditText
        val edittext_pass = findViewById(R.id.edittext_pass) as EditText
        val imageview_login = findViewById(R.id.imageview_login) as ImageView
        val textview_forgotpass = findViewById(R.id.textview_forgotpass) as TextView
        val textview_account = findViewById(R.id.textview_newaccount) as TextView

        button_login.setOnClickListener {
            if (edittext_username.text.equals("")||edittext_pass.text.equals("")){
                Toast.makeText(this,"fail", Toast.LENGTH_SHORT).show()
            }else{
                val intent : Intent = Intent(this@StartActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}