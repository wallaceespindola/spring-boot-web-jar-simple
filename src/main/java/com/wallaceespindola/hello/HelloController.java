package com.wallaceespindola.hello;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Run via jar using the followind command line:
 * java -jar target/SpringBootWebSimpleJar-0.0.1.jar
 * @author Wallace Espindola
 */
@RestController
@SpringBootApplication
public class HelloController {
    
	static int cont = 0;
	
	@RequestMapping("/")
    String home() {
    	cont++;
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    	System.out.println("##### Running home controller " + cont + " - time/date: " + sdf.format(new Date()) );
        
    	return "Hello World! " + cont;
    }
	
	@RequestMapping("/teste")
    String teste() {
    	
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    	System.out.println("##### Running teste controller - time/date: " + sdf.format(new Date()) );
        
    	return "Teste de SpringBoot!";
    }
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}