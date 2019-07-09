@file:JvmName("Log")

package me.daemon.tool.log

/**
 * @author daemon
 * @since 2019-06-28 11:40
 */

typealias TagGenerator = (Any) -> String

var openLog = true

private var l: ILogger? = null

val defaultLogger: DefaultLogger by lazy { DefaultLogger() }

var logger: ILogger
    get() = l ?: defaultLogger
    set(value) {
        l = value
    }

var logLevel = Level.WARN

var tagPrefix: String = ""

val defaultTagGenerator: TagGenerator = { tag -> "$tagPrefix$tag" }

val stackTraceTagGenerator: TagGenerator = { _ ->
    val stackTraceElement: StackTraceElement = Thread.currentThread().stackTrace[5]

    var callerClazzName = stackTraceElement.className
    callerClazzName = callerClazzName.substring(callerClazzName.lastIndexOf(".") + 1)

    "$tagPrefix - $callerClazzName.${stackTraceElement.methodName}(L:${stackTraceElement.lineNumber})"
}

var tagGenerator: TagGenerator = defaultTagGenerator

val defaultFilter = object : Filter {

    override fun filter(logger: ILogger, level: Level, tag: Any, throwable: Throwable?, vararg msg: Any?): Boolean {
        return logLevel <= level
    }

}

var filter: Filter = defaultFilter

fun v(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.VERBOSE, tag, null, msg)) return

    l.v(tagGenerator(tag), *msg)
}

fun v(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.VERBOSE, tag, throwable, msg)) return

    l.v(tagGenerator(tag), throwable, *msg)
}

fun d(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.DEBUG, tag, null, msg)) return

    l.d(tagGenerator(tag), *msg)
}

fun d(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.DEBUG, tag, throwable, msg)) return

    l.d(tagGenerator(tag), throwable, *msg)
}

fun i(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.INFO, tag, null, msg)) return

    l.i(tagGenerator(tag), *msg)
}

fun i(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.INFO, tag, throwable, msg)) return

    l.i(tagGenerator(tag), throwable, *msg)
}

fun w(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.WARN, tag, null, msg)) return

    l.w(tagGenerator(tag), *msg)
}

fun w(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.WARN, tag, throwable, msg)) return

    l.w(tagGenerator(tag), throwable, *msg)
}

fun e(tag: Any, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.ERROR, tag, null, msg)) return

    l.e(tagGenerator(tag), *msg)
}

fun e(tag: Any, throwable: Throwable, vararg msg: Any?) {
    val l = logger
    if (!openLog || !filter.filter(l, Level.ERROR, tag, throwable, msg)) return

    l.e(tagGenerator(tag), throwable, *msg)
}