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

val defaultFilter = object : Filter {

    override fun filter(logger: ILogger, level: Level, tag: Any, tr: Throwable?, vararg msg: Any?): Boolean {
        return logLevel <= level
    }

}

var filter: Filter = defaultFilter

fun v(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.VERBOSE, tag, null, msg)) return

    l.v(tag, *msg)
}

fun v(tag: Any, tr: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.VERBOSE, tag, tr, msg)) return

    l.v(tag, tr, *msg)
}

fun d(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.DEBUG, tag, null, msg)) return

    l.d(tag, *msg)
}

fun d(tag: Any, tr: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.DEBUG, tag, tr, msg)) return

    l.d(tag, tr, *msg)
}

fun i(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.INFO, tag, null, msg)) return

    l.i(tag, *msg)
}

fun i(tag: Any, tr: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.INFO, tag, tr, msg)) return

    l.i(tag, tr, *msg)
}

fun w(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.WARN, tag, null, msg)) return

    l.w(tag, *msg)
}

fun w(tag: Any, tr: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.WARN, tag, tr, msg)) return

    l.w(tag, tr, *msg)
}

fun e(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.ERROR, tag, null, msg)) return

    l.e(tag, *msg)
}

fun e(tag: Any, tr: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.ERROR, tag, tr, msg)) return

    l.e(tag, tr, *msg)
}