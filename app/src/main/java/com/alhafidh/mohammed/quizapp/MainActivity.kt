package com.alhafidh.mohammed.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity() : AppCompatActivity(){
    private lateinit var btn_start: Button
    private lateinit var et_name:EditText



    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        //window.setDecorFitsSystemWindows(true)

        btn_start=findViewById(R.id.btn_start)
        et_name=findViewById(R.id.et_name)
        btn_start.setOnClickListener {
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
            }else{
                val intent=Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)
                finish()

            }
        }
    }

}