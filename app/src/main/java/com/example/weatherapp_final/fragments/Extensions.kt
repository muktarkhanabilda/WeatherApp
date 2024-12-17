package com.example.weatherapp_final.fragments

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator

fun Fragment.isPermissionGranted(p: String): Boolean {
    return ContextCompat.checkSelfPermission(
        activity as AppCompatActivity, p) == PackageManager.PERMISSION_GRANTED
}