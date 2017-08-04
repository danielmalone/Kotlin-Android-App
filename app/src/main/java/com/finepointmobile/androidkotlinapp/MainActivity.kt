package com.finepointmobile.androidkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab)
        var message = findViewById(R.id.message) as TextView

        val user = User("Daniel", "Malone")
        val daniel = user.firstName.plus(" ").plus(user.lastName)

        message.text = daniel

        val mel = User("Mel", "Malone")

        fab.setOnClickListener {
            var melMessage = mel.firstName
                    .plus("asdf here ok?")
            message.text = melMessage
        }
    }
}
