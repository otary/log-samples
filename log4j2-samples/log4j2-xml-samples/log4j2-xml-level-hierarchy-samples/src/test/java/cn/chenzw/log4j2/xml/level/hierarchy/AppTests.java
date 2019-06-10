package cn.chenzw.log4j2.xml.level.hierarchy;

import org.apache.logging.log4j.ThreadContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(JUnit4.class)
public class AppTests {

    @Test
    public void test() {
        ThreadContext.put("ip", "192.168.1.1");

        Logger logger = LoggerFactory.getLogger(App.class);
        logger.trace("----------trace msg-------------");
        logger.debug("----------debug msg-------------");
        logger.info("----------info msg-------------");
        logger.warn("----------warn msg-------------");
        logger.error("----------error msg-------------");
    }
}
