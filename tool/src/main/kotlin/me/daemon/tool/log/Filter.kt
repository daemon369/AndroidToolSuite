package me.daemon.tool.log

/**
 * @author daemon
 * @since 2019-06-28 15:46
 */
interface Filter {

    fun filter(logger: ILogger, level: Level, tag: Any, throwable: Throwable?, vararg msg: Any?): Boolean

}