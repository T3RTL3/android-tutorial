package com.example.kotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShowToast.setOnClickListener(){
            Log.i("MainActivity", "Button was clicked!")

            Toast.makeText(this,"Button was clicked", Toast.LENGTH_SHORT).show()


        }
        sendMessageToOtherActivity.setOnClickListener {
            Toast.makeText(this,"Second button was clicked", Toast.LENGTH_SHORT).show()

            val msgOfUserInput: String  = userMessege.text.toString()
            Toast.makeText(this, msgOfUserInput, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
