package cn.chenzw.log4j2.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * debug级别输出
 */
public class DebugLevelOutput {

    private static final Logger logger = LoggerFactory.getLogger(DebugLevelOutput.class);

    public void print() {
        logger.trace("----------trace msg-------------");
        logger.debug("----------debug msg-------------");
        logger.info("----------info msg-------------");
        logger.warn("----------warn msg-------------");
        logger.error("----------error msg-------------");
    }


}
