package com.arash.altafi.autostartandroid

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BootCompletedReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_BOOT_COMPLETED -> {
                Toast.makeText(context , "Test BootUp" , Toast.LENGTH_SHORT).show()
                println("Test BootUp")
            }
        }
    }
}