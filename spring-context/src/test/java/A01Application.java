import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

public class A01Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//        context.getBeansOfType(BeanFactoryPostProcessor.class)
//                .values()
//                .forEach(System.out::println);
//        System.out.println("--------------------------------------------------------");
//
//        context.getBeansOfType(BeanPostProcessor.class)
//                .values()
//                .forEach(System.out::println);
//
//        System.out.println("--------------------------------------------------------");


		Object bean1 = context.getBean("bean1");


    }


    @Configuration
    static class Config {

//        @Bean
//        public TomcatServletWebServerFactory tomcatServletWebServerFactory() {
//            return new TomcatServletWebServerFactory();
//        }
//
//        @Bean
//        public DispatcherServlet dispatcherServlet() {
//            return new DispatcherServlet();
//        }
//
//        @Bean
//        public DispatcherServletRegistrationBean registrationBean(DispatcherServlet dispatcherServlet) {
//            return new DispatcherServletRegistrationBean(dispatcherServlet, "/");
//        }
//
//
//        @Bean("/hello")
//        public Controller controller() {
//            return (request, response) -> {
//                response.getWriter().println("hello");
//                return null;
//            };
//        }

        @Bean
        public BeanTest bean1() {
            return new BeanTest();
        }

        @Bean("testBeanFactoryPostProcessor")
        public BeanFactoryPostProcessor beanFactoryPostProcessor() {
            return new TestBeanFactoryPostProcessor();
        }


    }


}
