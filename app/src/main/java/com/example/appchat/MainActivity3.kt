package com.example.appchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var signin : Button
    lateinit var signup : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        email = findViewById(R.id.mail)
        password = findViewById(R.id.pass)
        signin = findViewById(R.id.button_signin)
        signup = findViewById(R.id.signup)

        val mail = email.text
        val pass = password.text

        signin.setOnClickListener {
            if((mail.toString().isEmpty()) || (pass.toString().isEmpty())){
                Toast.makeText(this,"Please Enter All Information", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent (this,MainActivity2::class.java)
                startActivity(intent)
                Toast.makeText(this,"Hello" ,Toast.LENGTH_SHORT).show()
            }

        signup.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Sign Un Now",Toast.LENGTH_SHORT).show()
        }

        }


    }
}