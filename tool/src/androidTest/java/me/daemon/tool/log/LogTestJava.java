package me.daemon.tool.log;

import org.junit.Before;
import org.junit.Test;

/**
 * @author daemon
 * @since 2019-06-28 16:56
 */
public class LogTestJava {

    @Before
    public void before() {
        Log.setOpenLog(true);
        Log.setLogLevel(Level.WARN);
    }

    @Test
    public void v() {
        Log.v(this, "2", null, 3, 4f, new Throwable("test"));
    }

    @Test
    public void v1() {
        Log.v(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void d() {
        Log.d(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void d1() {
        Log.d(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void i() {
        Log.i(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void i1() {
        Log.i(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void w() {
        Log.w(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void w1() {
        Log.w(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void e() {
        Log.e(this, "2", null, 3, 4f, new Throwable("test throwable"));
    }

    @Test
    public void e1() {
        Log.e(this, new Throwable("throwable"), "2", null, 3, 4f, new Throwable("test throwable"));
    }

}
