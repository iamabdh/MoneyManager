package com.example.moneymanager.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import android.widget.Toast

class SmsReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Telephony.Sms.Intents.SMS_RECEIVED_ACTION == intent?.action) {
            val smsMessages = Telephony.Sms.Intents.getMessagesFromIntent(intent)
            for (smsMessage in smsMessages) {
                val sender = smsMessage.displayOriginatingAddress
                val message = smsMessage.displayMessageBody
                Toast.makeText(context, "from services $sender ++ $message", Toast.LENGTH_LONG).show()
            }
        }
    }
}