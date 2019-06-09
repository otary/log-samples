package cn.chenzw.log4j2.coding;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

public class Log4j2Config {

    private static final String CONSOLE_APPENDER_NAMNE = "Console";


    public static void init(){
        ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();
        builder.setStatusLevel(Level.INFO);
        builder.setConfigurationName("myLog4j2Config");

        // 添加过滤器
        /*builder.add(builder.newFilter("ThresholdFilter", Filter.Result.ACCEPT,
                Filter.Result.NEUTRAL).addAttribute("level", Level.DEBUG));*/

        // 添加<Appender>对象
        AppenderComponentBuilder appenderBuilder = builder.newAppender(CONSOLE_APPENDER_NAMNE, "CONSOLE").addAttribute("target",
                ConsoleAppender.Target.SYSTEM_OUT);
        appenderBuilder.add(builder.newLayout("PatternLayout").addAttribute("pattern", "%d [%t] %-5level:%msg%n%throwable"));
        appenderBuilder.add(builder.newFilter("MarkerFilter", Filter.Result.DENY, Filter.Result.NEUTRAL).addAttribute("marker", "FLOW"));
        builder.add(appenderBuilder);

        //添加<Logger>对象
        //builder.add(builder.newLogger("Log4j2Config", Level.DEBUG).add(builder.newAppenderRef(CONSOLE_APPENDER_NAMNE)).addAttribute("additivity", false));

        // 添加<Root>对象
        builder.add(builder.newRootLogger(Level.ERROR).add(
                builder.newAppenderRef(CONSOLE_APPENDER_NAMNE)));

        Configurator.initialize(builder.build());
    }
}
