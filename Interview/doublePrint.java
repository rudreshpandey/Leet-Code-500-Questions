package Interview;

import java.awt.print.Printable;

import jdk.internal.org.jline.reader.impl.history.DefaultHistory;

 class SuperClass{
	   protected  String name,name1 = "Sita";
	  void  print(){
		  System.out.println(name1); 
	   }
	   SuperClass(String str){
		   this.name=str;
	   }
	}
 protected class doublePrint extends SuperClass {
	 private static String name;
	   
	    doublePrint(String str){
	    	super(str);
	    	super.name1=str;
	    	//this(str);
		   
	   }
	    
	   public  void setName(String name) {
		   //this.name = name;
		   final int ty;
		   ty=0;
	   }
	   public void display() {
	      System.out.println("name: "+super.name);
	   }
	   static final public void  main(String args[]) {
		  // this.name="jkl";
	      new doublePrint("clw").print();
	      doublePrint d = new doublePrint("shree"); 
	      System.out.println(d.name1);
	      B bc = new B();
	      int b = bc.height;
	      
	      A ac = new B();
	      int a = ac.height;
	      System.out.println(a+" "+b);
	      
	   }
	}

 
 class A{
		
		int height = 30;
		
		public void display(){
			System.out.print("From Parent");
		}
	}


 class B extends A{

		

	}



	
