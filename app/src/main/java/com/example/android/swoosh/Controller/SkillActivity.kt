package com.example.android.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import com.example.android.swoosh.EXTRA_LEAGUE
import com.example.android.swoosh.EXTRA_SKILL
import com.example.android.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""
    var isSelected = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill2)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)

        val beginerBtn : ToggleButton = findViewById(R.id.beginnerSkillBtn)
        val ballerBtn : ToggleButton = findViewById(R.id.ballerSkillBtn)
        val onskillClicked : Button = findViewById(R.id.skillFinishBtn)

        beginerBtn.setOnClickListener{
            ballerBtn.isChecked = false
            isSelected = "Beginner"
        }
        ballerBtn.setOnClickListener{
            beginerBtn.isChecked = false
            isSelected = "Baller"
        }

        onskillClicked.setOnClickListener{
            if( isSelected != ""){
                val finishActivity = Intent(this, FinalActivity()::class.java)
                finishActivity.putExtra(EXTRA_LEAGUE,league)
                finishActivity.putExtra(EXTRA_SKILL,isSelected)
                startActivity(finishActivity)
            }else{
                Toast.makeText(this , "Please select a skill level" , Toast.LENGTH_SHORT).show()
            }
        }
    }

//    fun onSkillFinishClicked(){
//        if( isSelected != ""){
//            val finishActivity = Intent(this, FinalActivity()::class.java)
//            finishActivity.putExtra(EXTRA_LEAGUE,league)
//            finishActivity.putExtra(EXTRA_SKILL,isSelected)
//            startActivity(finishActivity)
//        }else{
//            Toast.makeText(this , "Please select a skill level" , Toast.LENGTH_SHORT).show()
//        }
//    }

}