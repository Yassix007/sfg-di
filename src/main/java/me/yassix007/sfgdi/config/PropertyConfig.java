package me.yassix007.sfgdi.config;

import me.yassix007.sfgdi.beans.MyDaraSource;
import me.yassix007.sfgdi.beans.MyTestDaraSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:testdatasource.properties"})
// Also can use it like:
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:testdatasource.properties")
})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${prod.ip}")
    String ipAddress;

    @Value("${prod.user}")
    String userName;

    @Value("${prod.password}")
    String password;

    @Value("${test.ip}")
    String testIpAddress;

    @Value("${test.user}")
    String testUserName;

    @Value("${test.password}")
    String testPassword;

    @Bean
    public MyDaraSource myDaraSource() {
        return new MyDaraSource(ipAddress, userName, password, environment.getProperty("MAVEN_HOME"));
    }

    @Bean
    public MyTestDaraSource myTestDaraSource() {
        return new MyTestDaraSource(testIpAddress, testUserName, testPassword);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
