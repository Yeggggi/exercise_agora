package com.agora_example.try_agora

import io.flutter.embedding.android.FlutterActivity

import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import android.Manifest
import java.lang.Exception

class MainActivity: FlutterActivity() {
}

// Kotlin
private val PERMISSION_REQ_ID_RECORD_AUDIO = 22
private val PERMISSION_REQ_ID_CAMERA = PERMISSION_REQ_ID_RECORD_AUDIO + 1

private fun checkSelfPermission(permission: String, requestCode: Int): Boolean {
    if (ContextCompat.checkSelfPermission(this, permission) !=
            PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this,
                arrayOf(permission),
                requestCode)
        return false
    }
    return true
}
