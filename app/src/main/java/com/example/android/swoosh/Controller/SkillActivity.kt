package com.example.android.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.android.swoosh.EXTRA_PLAYER
import com.example.android.swoosh.Model.Player
import com.example.android.swoosh.R

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill2)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

        val beginerBtn : ToggleButton = findViewById(R.id.beginnerSkillBtn)
        val ballerBtn : ToggleButton = findViewById(R.id.ballerSkillBtn)
        val onskillClicked : Button = findViewById(R.id.skillFinishBtn)

        beginerBtn.setOnClickListener{
            ballerBtn.isChecked = false
            player.skill = "Beginner"
        }
        ballerBtn.setOnClickListener{
            beginerBtn.isChecked = false
            player.skill = "Baller"
        }

        onskillClicked.setOnClickListener{
            if( player.skill != ""){
                val finishActivity = Intent(this, FinalActivity()::class.java)
                finishActivity.putExtra(EXTRA_PLAYER,player)
                startActivity(finishActivity)
            }else{
                Toast.makeText(this , "Please select a skill level" , Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if( savedInstanceState != null ){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

}