package me.daemon.tool.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import me.daemon.tool.log.*

class MainActivity : AppCompatActivity() {

    var flag = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click.setOnClickListener {
            if (flag) {
                logLevel = Level.VERBOSE
                v(this, "kotlin")
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
            } else {
                Demo.onCreate(this, Throwable("onCreate: "), savedInstanceState)
            }

            flag = !flag
        }


    }
}
