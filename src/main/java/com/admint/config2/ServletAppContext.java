package com.admint.config2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* Spring MVC 프로젝트에 관련된 설정을 하는 클래스
* @Configuration 은 설정파일을 만들기위한 어노테이션 또는 Bean을 등록하기 위한 어노테이션이다.
* 상기의 어노테이션을 사용하면 가시적으로 설정파일이다를 알 수 있다.
*
* 아래의 매개변수에 클래스를 설정해주는 것 만으로도 설정파일인 것을 알 수 있는데 왜 @Configuration을 사용할까?
* ApplicationContext ac = new AnnotationConfigApplicationContext(xxx.class);
*
* @Configuration은 단순히 Bean을 등록하기 위한 어노테이션이 아니다.
*  1. Bean을 등록할 때 싱글톤이 되도록 보장해준다 => 만들어진 객체는 다시 생성하지 않는다.
*     => (CGLIB라는 바이트코드 조작 라이브러리를 사용해서 설정파일을 상속받은 임의의 클래스를 만들고 그것을 Spring Bean으로 등록했기 때문에,
*        임의의 클래스를 통해서 싱글톤이 되는 것을 유지해준다)
*  2. 스프링 컨테이너에서 Bean을 관리할 수 있게 된다.
* */
@Configuration
@EnableWebMvc
@ComponentScan()
public class ServletAppContext implements WebMvcConfigurer {
}
