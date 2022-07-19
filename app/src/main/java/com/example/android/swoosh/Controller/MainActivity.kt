package com.example.android.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.android.swoosh.R

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.getStartedBtn)
        btn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }

}