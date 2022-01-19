package com.example.android.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.getStartedBtn)
        btn.setOnClickListener {
            val leagueIntent = Intent(this,LeagueActivity::class.java)
            startActivity(leagueIntent)

        }
    }

}