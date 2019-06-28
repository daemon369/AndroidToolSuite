@file:JvmName("Log")

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

    override fun filter(logger: ILogger, level: Level, tag: Any, throwable: Throwable?, vararg msg: Any?): Boolean {
        return logLevel <= level
    }

}

var filter: Filter = defaultFilter

fun v(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.VERBOSE, tag, null, msg)) return

    l.v(tag, *msg)
}

fun v(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.VERBOSE, tag, throwable, msg)) return

    l.v(tag, throwable, *msg)
}

fun d(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.DEBUG, tag, null, msg)) return

    l.d(tag, *msg)
}

fun d(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.DEBUG, tag, throwable, msg)) return

    l.d(tag, throwable, *msg)
}

fun i(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.INFO, tag, null, msg)) return

    l.i(tag, *msg)
}

fun i(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.INFO, tag, throwable, msg)) return

    l.i(tag, throwable, *msg)
}

fun w(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.WARN, tag, null, msg)) return

    l.w(tag, *msg)
}

fun w(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.WARN, tag, throwable, msg)) return

    l.w(tag, throwable, *msg)
}

fun e(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.ERROR, tag, null, msg)) return

    l.e(tag, *msg)
}

fun e(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.ERROR, tag, throwable, msg)) return

    l.e(tag, throwable, *msg)
}