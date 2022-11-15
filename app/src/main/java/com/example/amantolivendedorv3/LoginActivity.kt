package com.example.amantolivendedorv3

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RemoteViews
import androidx.appcompat.widget.AppCompatButton
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlin.math.log

class LoginActivity : AppCompatActivity() {

    lateinit var loginBtn: AppCompatButton
    lateinit var notify_btn: ImageView
    private var CHANNEL_ID = "Your_Channel_ID"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn = findViewById(R.id.loginBtn)
        notify_btn = findViewById(R.id.notify_btn)

        loginBtn.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }//End loginBtn.setOnClickListener

        createNotificationChannel()

        val notificationLayout = RemoteViews(packageName, R.layout.notification_pending_order)
        var builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Soy Amantoli")
            .setSmallIcon(R.drawable.ic_unread_email)
            .setStyle(NotificationCompat.DecoratedCustomViewStyle())
            .setCustomContentView(notificationLayout)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        notify_btn.setOnClickListener{
            with(NotificationManagerCompat.from(this)){
                notify(0, builder.build())
            }//End with
        }//End notify_btn.setOnClickListener

    }//End onCreate

    private fun createNotificationChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val name = "Soy Amantoli"
            val descriptionText = "¡Tienes un nuevo pedido!"
            val importance: Int = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }//End val channel

            val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }//End if

    }//End fun createNotificationChannel

}//End class LoginActivity