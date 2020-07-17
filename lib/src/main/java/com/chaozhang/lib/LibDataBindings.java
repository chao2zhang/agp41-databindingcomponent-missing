package com.chaozhang.lib;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class LibDataBindings {

    @BindingAdapter("app:chars")
    public static void setChar(TextView textView, String text) {
        textView.setText(text);
    }
}