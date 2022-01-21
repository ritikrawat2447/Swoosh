package com.example.android.swoosh.Controller

import android.os.Bundle
import android.widget.TextView
import com.example.android.swoosh.EXTRA_LEAGUE
import com.example.android.swoosh.EXTRA_SKILL
import com.example.android.swoosh.R
import org.w3c.dom.Text

class FinalActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        val txt : TextView = findViewById(R.id.searchLeagueTxt)
        txt.text = "Looking for $league $skill league near you..."
    }
}