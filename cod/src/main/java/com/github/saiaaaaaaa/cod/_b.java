package com.github.saiaaaaaaa.cod;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class _b {
    public static void _b0(AppCompatActivity _b1){
        _b1.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_IMMERSIVE | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        try {
            Objects.requireNonNull(_b1.getSupportActionBar()).hide();
        } catch (Exception ignored){
        }
    }
    public static void _b2(AppCompatActivity _b3){
        _b3.getWindow().getDecorView().setSystemUiVisibility(View.VISIBLE);
        try {
            Objects.requireNonNull(_b3.getSupportActionBar()).show();
        } catch (Exception ignored){
        }
    }
}