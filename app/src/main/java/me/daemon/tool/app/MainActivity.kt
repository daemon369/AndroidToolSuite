package me.daemon.tool.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.daemon.tool.log.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logLevel = Level.VERBOSE
        v(this, "onCreate: $savedInstanceState")
        v(this, Throwable("onCreate: $savedInstanceState"))
        d(this, "onCreate: $savedInstanceState")
        d(this, Throwable("onCreate: $savedInstanceState"))
        i(this, "onCreate: $savedInstanceState")
        i(this, Throwable("onCreate: $savedInstanceState"))
        w(this, "onCreate: $savedInstanceState")
        w(this, Throwable("onCreate: $savedInstanceState"))
        e(this, "onCreate: $savedInstanceState")
        e(this, Throwable("onCreate: $savedInstanceState"))
    }
}
