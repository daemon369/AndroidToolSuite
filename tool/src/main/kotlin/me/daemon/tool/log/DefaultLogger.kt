package me.daemon.tool.log

import android.util.Log

/**
 * @author daemon
 * @since 2019-06-28 11:38
 */
class DefaultLogger : ILogger {

    override fun v(tag: Any, vararg msg: Any?) {
        Log.v(tag.toString(), msg.joinToString(" "))
    }

    override fun v(tag: Any, tr: Throwable, vararg msg: Any?) {
        Log.v(tag.toString(), msg.joinToString(" "), tr)
    }

    override fun d(tag: Any, vararg msg: Any?) {
        Log.d(tag.toString(), msg.joinToString(" "))
    }

    override fun d(tag: Any, tr: Throwable, vararg msg: Any?) {
        Log.d(tag.toString(), msg.joinToString(" "), tr)
    }

    override fun i(tag: Any, vararg msg: Any?) {
        Log.i(tag.toString(), msg.joinToString(" "))
    }

    override fun i(tag: Any, tr: Throwable, vararg msg: Any?) {
        Log.i(tag.toString(), msg.joinToString(" "), tr)
    }

    override fun w(tag: Any, vararg msg: Any?) {
        Log.w(tag.toString(), msg.joinToString(" "))
    }

    override fun w(tag: Any, tr: Throwable, vararg msg: Any?) {
        Log.w(tag.toString(), msg.joinToString(" "), tr)
    }

    override fun e(tag: Any, vararg msg: Any?) {
        Log.e(tag.toString(), msg.joinToString(" "))
    }

    override fun e(tag: Any, tr: Throwable, vararg msg: Any?) {
        Log.e(tag.toString(), msg.joinToString(" "), tr)
    }

}