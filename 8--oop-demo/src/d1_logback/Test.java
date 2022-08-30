package d1_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
       日志技术具备的优势:
       1. 可以将系统执行的信息选择性的记录到指定的位置(控制台，文件中，数据库中)
       2. 可以随时以开关的形式控制是否记录日志，无需修改源代码

       Logback日志框架:
       1. 导入Logback日志技术到项目中，用于记录系统的日志信息
       第一步：在项目下新建文件夹lib，导入Logback的相关jar包到该文件夹下，并添加到项目依赖库中去
         - logback-classic-1.2.3.jar
         - logback-core-1.2.3.jar
         - slf4j-api-1.7.26.jar
       第二步：将Logback的核心配置文件logback.xml直接拷贝到src目录下(必须是src下)
       第三步：在代码中获取日志的对象
         - public static final Logger LOGGER = LoggerFactory.getLogger("类对象");
       第四步：使用日志对象LOGGER调用其方法输出不能的日志信息

       Logback日志系统的特性都是通过核心配置文件logback.xml控制的
       Logback日志输出位置，格式位置:
       1. 通过logback.xml中的<append>标签可以设置输出位置和日志信息的详细格式
       2. 通常可以设置两个日志输出位置：一个是控制台，一个是系统文件中

       输出到控制台的配置标志:
         - <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
       输出到系统文件的配置标志:
         - <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">

       日志级别:
       1. 级别程度依次是：TRACE<DEBUG<INFO<WARN<ERROR 默认级别是debug(忽略大小写)，对应其方法
       2. 作用：用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息
       3. ALL 和 OFF 分别是打开全部日志信息，及关闭全部日志信息

       具体在<root level="INFO">标签的level属性中设置日志级别
       <root level="INFO">
            <appender-ref ref="CONSOLE"/>
            <appender-ref ref="FILE"/>
       </root>
 */

public class Test {
    // 创建Logback的日志对象，代表了日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行了");
            LOGGER.info("我开始记录第二行日志，我要开始做除法");
            int a = 10;
            int b = 0;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);

            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能出现异常，" + e);
        }

    }
}
