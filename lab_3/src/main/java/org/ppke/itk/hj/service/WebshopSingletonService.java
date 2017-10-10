package org.ppke.itk.hj.service;

import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class WebshopSingletonService {

	
    public void logHelloWorld(){
        System.out.println("Hello World!");
    }
}
