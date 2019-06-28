package me.daemon.tool.log

/**
 * @author daemon
 * @since 2019-06-28 11:35
 */
interface ILogger {

    enum class Level {
        VERBOSE, DEBUG, INFO, WARN, ERROR, ASSET, NONE
    }

    fun v(tag: Any, vararg msg: Any?)

    fun v(tag: Any, tr: Throwable, vararg msg: Any?)

    fun d(tag: Any, vararg msg: Any?)

    fun d(tag: Any, tr: Throwable, vararg msg: Any?)

    fun i(tag: Any, vararg msg: Any?)

    fun i(tag: Any, tr: Throwable, vararg msg: Any?)

    fun w(tag: Any, vararg msg: Any?)

    fun w(tag: Any, tr: Throwable, vararg msg: Any?)

    fun e(tag: Any, vararg msg: Any?)

    fun e(tag: Any, tr: Throwable, vararg msg: Any?)

}