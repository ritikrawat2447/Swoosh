package com.example.android.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.swoosh.databinding.ActivityMainBinding

class SkillActivity : BaseActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill2)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }

}