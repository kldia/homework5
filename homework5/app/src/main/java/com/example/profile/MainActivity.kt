package com.example.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login_activity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)


        Login.setOnClickListener(){

            if (email.text.isEmpty() || pass.text.isEmpty()){


                Toast.makeText(this,"please fill out all the fields",Toast.LENGTH_SHORT).show();


            }else{

                val intent = Intent(this, profile::class.java)
           startActivity(intent)

            }


        }
    }


}