package me.daemon.tool.log;

import org.junit.Before;
import org.junit.Test;

/**
 * @author daemon
 * @since 2019-06-28 16:56
 */
public class LogUtilsTestJava {

    @Before
    private void before() {
        LogUtils.setOpenLog(true);
        LogUtils.setLogLevel(Level.WARN);
    }

    @Test
    void v() {
        LogUtils.v(this, "2", null, 3, 4f, new Throwable("test"));
    }

    @Test
    void v1() {
        LogUtils.v(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void d() {
        LogUtils.d(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void d1() {
        LogUtils.d(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void i() {
        LogUtils.i(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void i1() {
        LogUtils.i(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void w() {
        LogUtils.w(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void w1() {
        LogUtils.w(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void e() {
        LogUtils.e(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    void e1() {
        LogUtils.e(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

}
