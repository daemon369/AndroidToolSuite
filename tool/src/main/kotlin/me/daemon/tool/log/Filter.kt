package me.daemon.tool.log

/**
 * @author daemon
 * @since 2019-06-28 15:46
 */
interface Filter {

    fun filter(logger: ILogger, level: Level): Boolean

}