package com.admint.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;
import java.util.Properties;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.admint.controller"})
public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
//        registry.viewResolver(resolver);
//    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
/*

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
*/
    /*
    @Bean
    HandlerExceptionResolver errorHandler () {
        SimpleMappingExceptionResolver s =
                new SimpleMappingExceptionResolver();

        //exception to view name mapping
        Properties p = new Properties();
        p.setProperty(NullPointerException.class.getName(), "npeView");
        p.setProperty(OrderIdNotValidException.class.getName(),
                "OrderIdNotValidView");
        s.setExceptionMappings(p);

        //mapping status code with view response.
        s.addStatusCode("npeView", 404);

        //setting default error view
        s.setDefaultErrorView("defaultErrorView");
        //setting default status code
        s.setDefaultStatusCode(400);

        return s;
    }*/
}