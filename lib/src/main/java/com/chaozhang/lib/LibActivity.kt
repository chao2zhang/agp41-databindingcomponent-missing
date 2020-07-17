package com.chaozhang.lib

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.chaozhang.lib.databinding.LibBinding

class LibActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<LibBinding>(this, R.layout.lib)
    }
}