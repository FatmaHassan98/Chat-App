package com.example.appchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var sign_up : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        sign_up = findViewById(R.id.sign)

        val user = name.text
        val mail = email.text
        val pass = password.text

        sign_up.setOnClickListener{
            if((user.toString().isEmpty()) ||(mail.toString().isEmpty()) || (pass.toString().isEmpty())){
            Toast.makeText(this,"Please Enter All Information",Toast.LENGTH_SHORT).show()}

            else{
                val intent = Intent (this,MainActivity2::class.java)
                startActivity(intent)
                Toast.makeText(this,"Hello $user" ,Toast.LENGTH_SHORT).show()
            }
        }




    }
}