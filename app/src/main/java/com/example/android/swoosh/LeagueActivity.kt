package com.example.android.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.android.swoosh.databinding.ActivityMainBinding


class LeagueActivity : BaseActivity() {


    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        val menBtn: ToggleButton = findViewById(R.id.MensLeagueButton)
        val womenBtn: ToggleButton = findViewById(R.id.WomensLeagueButton)
        val coedBtn: ToggleButton = findViewById(R.id.CoEdLeagueButton)

        menBtn.setOnClickListener {
            womenBtn.isChecked = false
            coedBtn.isChecked = false
            selectedLeague = "Mens"
        }
        womenBtn.setOnClickListener {
            menBtn.isChecked = false
            coedBtn.isChecked = false
            selectedLeague = "Womens"
        }
        coedBtn.setOnClickListener {
            womenBtn.isChecked = false
            menBtn.isChecked = false
            selectedLeague = "Co-ed"
        }
    }



    fun LeagueNxtClicked(view: View){
        if ( selectedLeague != "") {
            val skilledActivity = Intent(this, SkillActivity::class.java)
            skilledActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skilledActivity)
        }else {
            Toast.makeText(this , "Please select a league " , Toast.LENGTH_SHORT).show()
        }
    }
}