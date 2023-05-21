package com.example.moneymanager.utils

import android.app.Service
import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.IBinder
import android.provider.Telephony

class SmsService: Service() {
    private var smsReceiver: BroadcastReceiver? = null

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        smsReceiver = SmsReceiver()
        registerSmsReceiver()
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterSmsReceiver()
    }

    private fun registerSmsReceiver() {
        val intentFilter = IntentFilter()
        intentFilter.addAction(Telephony.Sms.Intents.SMS_RECEIVED_ACTION)
        registerReceiver(smsReceiver, intentFilter)
    }

    private fun unregisterSmsReceiver(){
        smsReceiver?.let {
            unregisterReceiver(it)
        }
    }
}