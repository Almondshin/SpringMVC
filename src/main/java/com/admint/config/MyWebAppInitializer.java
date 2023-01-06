package com.admint.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/*
* DispatcherServelet 설정
*
* */

@Configuration
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**/
    @Override
    protected Class<?>[] getServletConfigClasses() { return new Class<?>[]{WebConfig.class}; }

    /*
    * DispathcerServlet에 매핑할 요청 주소를 세팅한다.
    * */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
