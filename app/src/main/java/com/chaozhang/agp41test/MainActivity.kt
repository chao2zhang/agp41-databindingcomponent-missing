package com.chaozhang.agp41test

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.chaozhang.lib.LibActivity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, LibActivity::class.java))
        }
    }
}