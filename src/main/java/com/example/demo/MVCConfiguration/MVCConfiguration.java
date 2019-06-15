package com.example.demo.MVCConfiguration;
 
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//初始化页面
@Configuration
public class MVCConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
 
        registry.addViewController("/").setViewName("forward:/html/index.html");
 
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
 
        super.addViewControllers(registry);
 
    }
}
