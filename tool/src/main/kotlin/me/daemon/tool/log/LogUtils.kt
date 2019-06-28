@file:JvmName("LogUtils")

package me.daemon.tool.log

/**
 * @author daemon
 * @since 2019-06-28 11:40
 */

var openLog = true

private var l: ILogger? = null

val defaultLogger: DefaultLogger by lazy { DefaultLogger() }

var logger: ILogger
    get() = l ?: defaultLogger
    set(value) {
        l = value
    }

var logLevel = Level.WARN

fun v(tag: Any, vararg msg: Any?) {
    logger.v(tag, *msg)
}

fun v(tag: Any, tr: Throwable, vararg msg: Any?) {
    logger.v(tag, tr, *msg)
}

fun d(tag: Any, vararg msg: Any?) {
    logger.d(tag, *msg)
}

fun d(tag: Any, tr: Throwable, vararg msg: Any?) {
    logger.d(tag, tr, *msg)
}

fun i(tag: Any, vararg msg: Any?) {
    logger.i(tag, *msg)
}

fun i(tag: Any, tr: Throwable, vararg msg: Any?) {
    logger.i(tag, tr, *msg)
}

fun w(tag: Any, vararg msg: Any?) {
    logger.w(tag, *msg)
}

fun w(tag: Any, tr: Throwable, vararg msg: Any?) {
    logger.w(tag, tr, *msg)
}

fun e(tag: Any, vararg msg: Any?) {
    logger.e(tag, *msg)
}

fun e(tag: Any, tr: Throwable, vararg msg: Any?) {
    logger.e(tag, tr, *msg)
}