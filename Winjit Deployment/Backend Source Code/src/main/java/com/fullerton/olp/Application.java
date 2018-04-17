package com.fullerton.olp;

import javax.persistence.EntityListeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import com.fullerton.olp.repository.GenericDaoImpl;

/**
 *
 https://github.com/royclarkson/spring-rest-service-oauth
 curl -X POST -vu clientapp:123456 http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=papidakos123&username=papidakos&grant_type=password&scope=read%20write&client_secret=123456&client_id=clientapp"
 curl http://localhost:8080/api/sample -H "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOlsicmVzdHNlcnZpY2UiXSwidXNlcl9uYW1lIjoicGFwaWRha29zIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTQ1Njc5NzQzNiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImp0aSI6IjNlYjA3MjIzLWY5ZTAtNGI0NS1hYTM3LTVjOGYzZDg1YTVkNCIsImNsaWVudF9pZCI6ImNsaWVudGFwcCJ9.oD3jbGe0o69mJmPlcoc9ALsLyME8hwOkn9_5TJxt3l0"
 * Standard application controller
 */
@SpringBootApplication
//@EnableSwagger2
@EnableTransactionManagement
@EnableCaching
@EnableScheduling
@EnableAsync
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider")
@EnableJpaRepositories(basePackages = {"com.fullerton.olp.repository"},
        repositoryBaseClass = GenericDaoImpl.class
)
@EnableJpaAuditing
@EntityListeners(AuditingEntityListener.class)
//@EnableJpaRepositories(basePackages = {"com.fullerton.olp.repository"},
//	repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class
//)
@EnableRetry
public class Application extends SpringBootServletInitializer {

    /**
     * Entry point for the application.
     *
     * @param args Command line arguments.
     * @throws Exception Thrown when an unexpected Exception is thrown from the
     *         application.
     */
    public static void main(String[] args) throws Exception {
    		System.setProperty("jsse.enableSNIExtension", "false");
        SpringApplication.run(Application.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(Application.class);
//    }

    /**
     * Create a CacheManager implementation class to be used by Spring where
     * <code>@Cacheable</code> annotations are applied.
     *
     * @return A CacheManager instance.
     */
    @Bean
    public CacheManager cacheManager() {

        GuavaCacheManager cacheManager = new GuavaCacheManager("fullerton-olp");

        return cacheManager;
    }
    /*
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
           .apiInfo(apiInfo())
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build()
          .pathMapping("/");                                           
    }
 
 private ApiInfo apiInfo() {
     return new ApiInfo(
       "My REST API", 
       "Some custom description of API.", 
       "API TOS", 
       "Terms of service", 
       new Contact("Nitish Patel", "www.eninisa.com", "nitish@eninisa.com"), 
       "License of API", "API license URL", Collections.emptyList());
 }
*/
    
    /**
     * Supports FileUploads.
     */
     /*@Bean
     public MultipartResolver multipartResolver() {
         CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
         multipartResolver.setMaxUploadSize(500000000);
         return multipartResolver;
     }*/

     @Bean
     public MultipartResolver multipartResolver() {
         return new StandardServletMultipartResolver();
     }
}


