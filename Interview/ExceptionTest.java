package Interview;

public class ExceptionTest {
	  public static void main(String[] args) {
	   System.out.println(exceptionTest());
	  }
	  @SuppressWarnings("finally")
	public static int exceptionTest()
	  {
	   int i=6;
	   try{
	    throw new NullPointerException();
	   }
	   catch(NullPointerException e)
	   {
	    i=10;
	    throw e; 
	   }
	   finally
	   {
	    i=20;
	    String s1="rudresh";
	    s1=s1.concat("123");
	    System.out.println("In finally block"+" "+s1);
	    
	    return i;
	   }
	}
	}
