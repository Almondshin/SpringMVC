package com.admint.config2;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/*톰캣은 시작할 때 WebApplicationInitializer 구현 클래스를 찾아서 기본 설정을 한다.*/
public class SpringConfigClass implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}
