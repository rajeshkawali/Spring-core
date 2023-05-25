package com.spring.a.beanFactory;

public class SpringBean implements SpringInterface {

	private String message;

	/*using setter method*/
   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
