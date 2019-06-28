package me.daemon.tool.log

import org.junit.Before
import org.junit.Test

/**
 * @author daemon
 * @since 2019-06-28 16:50
 */
class LogUtilsTestKotlin {

    @Before
    fun before() {
        openLog = true
        logLevel = Level.INFO
    }

    @Test
    fun v() {
        v(this, "2", null, 3, 4f, Throwable("test"))
    }

    @Test
    fun v1() {
        v(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun d() {
        d(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun d1() {
        d(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun i() {
        i(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun i1() {
        i(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun w() {
        w(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun w1() {
        w(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun e() {
        e(this, "2", null, 3, 4f, Throwable("test throwable"))
    }

    @Test
    fun e1() {
        e(this, Throwable("throwable"), "2", null, 3, 4f, Throwable("test throwable"))
    }

}