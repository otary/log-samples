package cn.chenzw.log4j2.coding;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(JUnit4.class)
public class Log4j2ConfigTests {


    @Test
    public void testCodingConfig() {

        // 编码方式初始化
        Log4j2Config.init();

        // 只会输出error信息（root根节点指定输出error级别）
        Logger logger = LoggerFactory.getLogger(Log4j2Config.class);
        logger.trace("----------trace msg-------------");
        logger.debug("----------debug msg-------------");
        logger.info("----------info msg-------------");
        logger.warn("----------warn msg-------------");
        logger.error("----------error msg-------------");
    }

    @Test
    public void testCodingChangeConfig() {

        LoggerContext context = (LoggerContext) LogManager.getContext();
        Configuration configuration = context.getConfiguration();


        Logger logger = LoggerFactory.getLogger(Log4j2Config.class);
        logger.trace("----------trace msg-------------");
        logger.debug("----------debug msg-------------");
        logger.info("----------info msg-------------");
        logger.warn("----------warn msg-------------");
        logger.error("----------error msg-------------");
    }

}
