package com.java.serializedeserialize;

import java.io.Serializable;


	  class A {
		  
		  
		   public B getB()
		   {
			   
			 return new B();  
			   
		   }		   
	  
	  
	  }
	
    class B {
		
		public C getC(){
			
			 return new C();
			
		}
		
	}	
	
	class C{
		
		public void display()
		{
			
			System.out.println("its c");
		}
		
		
	}



class test {
	
	public static void main(String args[])
	{
		
		    A a = new A();
			B b = a.getB();
            C c = b.getC();			
		  
		       c.display();
	}
	
	
	
}