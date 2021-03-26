package com.huawei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author yqx
 * @Company https://www.huawei.com
 * @date 2021/3/26 16:59
 * @desc
 */

/**
 * 用于指定当前类时一个spring配置类，当创建容器时会从该类上加载注解。
 * @author yqx
 */
@Configuration
/**
 * 用于指定spring在初始化时容器要扫描的包
 */
@ComponentScan("com.huawei")
/**
 * 用于导入其他配置类
 */
@Import({JdbcConfig.class})
/**
 * 用于加载.properties中的配置
 */
@PropertySource("classpath:jdbc.properties")
public class SpringConfiguration {

}
