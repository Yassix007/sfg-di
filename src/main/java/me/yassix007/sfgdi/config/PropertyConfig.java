package me.yassix007.sfgdi.config;

import me.yassix007.sfgdi.beans.MyDaraSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${test.ip}")
    String ipAddress;

    @Value("${test.user}")
    String userName;

    @Value("${test.password}")
    String password;

    @Bean
    public MyDaraSource myDaraSource() {
        return new MyDaraSource(ipAddress, userName, password);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
