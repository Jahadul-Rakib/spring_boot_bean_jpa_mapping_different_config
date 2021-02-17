package com.bean_scope_and_mapping.configuration;

import com.bean_scope_and_mapping.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class ScopeBeanConfig {

    //    @Resource allows you to specify a name of the injected bean
    //    @Autowired allows you to mark it as non-mandatory.

    //    Bean Call system using Qualifier
    //    @Autowired
    //    @Qualifier("SingletonScopePerson")
    //    private Person person;

    //    @Resource("SingletonScopePerson")
    //    Person person;
    /*----------------------------------------------------------------*/



    //  singleton is default bean scope in spring container.
    //  It tells the container to create and manage only one instance of bean class, per container
    @Bean(name = "SingletonScopePerson")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Primary //specify when bean called without qualifier or resource annotation
    public Person singletonScopePerson() {
        return new Person();
    }

    //prototype scope results in the creation of a new bean instance every time a request for the bean is made by application code.
    @Bean(name = "PrototypeScopePerson")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person prototypeScopePerson() {
        return new Person();
    }

    // container creates a new instance for each and every HTTP request.
    // So, if server is currently handling 50 requests, then container can have at most 50 individual instances of bean class
    // Returns a single instance for every HTTP request call.
    @Bean(name = "RequestScopePerson")
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Person requestScopePerson() {
        return new Person();
    }

    // container creates a new instance for each and every HTTP session
    // So, if server has 20 active sessions, then container can have at most 20 individual instances of bean class
    // Returns a single instance for every HTTP session.
    @Bean(name = "SessionScopePerson")
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Person sessionScopePerson() {
        return new Person();
    }


    // In application scope, container creates one instance per web application runtime.
    // It is almost similar to singleton scope, with only two differences----
    // application scoped bean is singleton per ServletContext,
    // whereas singleton scoped bean is singleton per ApplicationContext.
    @Bean("ApplicationScopePerson")
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Person applicationScopePerson() {
        return new Person();
    }

    //websocket scoped beans are typically singletons and live longer than any individual WebSocket session
    @Bean(name = "WebSocketScopePerson")
    @Scope("websocket")
    public Person webSocketScopePerson() {
        return new Person();
    }

    //Its live on a single thread
    @Bean(name = "CustomThreadScopePerson")
    @Scope("thread")
    public Person customThreadScopePerson() {
        return new Person();
    }

}