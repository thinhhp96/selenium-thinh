package helpers;

import org.apache.log4j.Logger;

public class LogHelper {
    public static Logger logger = Logger.getLogger(LogHelper.class);

    public static void startTestCase(String strTestCaseName) {
        logger.info("\n----------------- " + strTestCaseName + " -------------------\n");
    }

    public static void endTestCase() {
        logger.info("----------------- " + "-END TEST CASE-" + " -----------------");
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(String message) {
        logger.fatal(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void info(boolean message) {
        logger.info(message);
    }
}
