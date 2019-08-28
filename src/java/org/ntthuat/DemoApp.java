package org.ntthuat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/28 4:37 PM
 * $Log: DemoApp.java
 */
@SpringBootApplication
public class DemoApp
{
  public static void main(String[] args)
  {
    SpringApplication.run(DemoApp.class, args);
    System.out.println("Access here: http://localhost:8080/home");
  }
}
