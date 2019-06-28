package me.daemon.tool.log

import org.junit.Before
import org.junit.Test

/**
 * @author daemon
 * @since 2019-06-28 14:30
 */
class DefaultLoggerTest {

    lateinit var logger: ILogger

    @Before
    fun before() {
        logger = DefaultLogger()
    }

    @Test
    fun v() {
        logger.v(this, "2", null, 3, 4f, Throwable("test"))
    }

    @Test
    fun v1() {
        logger.v(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun d() {
        logger.d(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun d1() {
        logger.d(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun i() {
        logger.i(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun i1() {
        logger.i(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun w() {
        logger.w(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun w1() {
        logger.w(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun e() {
        logger.e(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun e1() {
        logger.e(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }
}