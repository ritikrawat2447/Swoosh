package com.example.android.swoosh.Controller

import android.os.Bundle
import android.widget.TextView
import com.example.android.swoosh.EXTRA_PLAYER
import com.example.android.swoosh.Model.Player
import com.example.android.swoosh.R

class FinalActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!

        val txt : TextView = findViewById(R.id.searchLeagueTxt)
        txt.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}