package com.example.android.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.android.swoosh.EXTRA_PLAYER
import com.example.android.swoosh.Model.Player
import com.example.android.swoosh.R


class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        val menBtn: ToggleButton = findViewById(R.id.MensLeagueButton)
        val womenBtn: ToggleButton = findViewById(R.id.WomensLeagueButton)
        val coedBtn: ToggleButton = findViewById(R.id.CoEdLeagueButton)

        menBtn.setOnClickListener {
            womenBtn.isChecked = false
            coedBtn.isChecked = false
            player.league = "Mens"
        }
        womenBtn.setOnClickListener {
            menBtn.isChecked = false
            coedBtn.isChecked = false
            player.league = "Womens"
        }
        coedBtn.setOnClickListener {
            womenBtn.isChecked = false
            menBtn.isChecked = false
            player.league = "Co-ed"
        }
    }



    fun LeagueNxtClicked(view: View){
        if ( player.league != "") {
            val skilledActivity = Intent(this, SkillActivity::class.java)
            skilledActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skilledActivity)
        }else {
            Toast.makeText(this , "Please select a league " , Toast.LENGTH_SHORT).show()
        }
    }
}