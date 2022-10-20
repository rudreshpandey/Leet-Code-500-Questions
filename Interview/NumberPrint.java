package Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.sun.accessibility.internal.resources.accessibility;
import com.sun.media.sound.ModelDirectedPlayer;
import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;
import com.sun.tools.sjavac.pubapi.PubApi;

import jdk.internal.org.jline.reader.impl.history.DefaultHistory;
import sun.awt.www.content.image.gif;
import sun.jvm.hotspot.runtime.StaticBaseConstructor;
import sun.security.provider.VerificationProvider;

public class NumberPrint {

	int hj;
	
	
	void st() {
		hj=9;
	}
	//hj=9;
	public static void main(String[] args) {
		int arr[]=new int[100];
		String str="0 ";
		arr[0]=0;
		String s1= new String("abc");
		//s1="abc";
		String s2= new String("abc");
		final  int gb;
		//s2="abc";
		if(s1.equals(s2))
		System.out.println("true");
		else System.out.println("false");
		//static int a=5;
		//a=4;
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=1;i<100;i++) {
			if(!map.containsKey(arr[i-1])) {
				arr[i]=0;
				str+="0 ";
				
			}else {
				arr[i]=(i-1)-map.get(arr[i-1]);
				str+=arr[i];
				str+=" ";
			}
			map.put(arr[i-1],i-1);
		}
//		for(int i=0;i<100;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("\n"+str);
		gb=0;
		//gb=1;
		Employee A= new Employee("ABC", 5);
		Employee B=new Employee("ABC",5);
		
		if(A.equals(B)) System.out.println("Ram "+A.hashCode()+" "+B.hashCode());
		else System.out.println("Ram2 "+A.hashCode()+" "+B.hashCode());
		
		if(A==B)
			System.out.println("true");
			else System.out.println(A.hashCode()+" false "+ B.hashCode());
		

	}
}

class Employee {
	String name;
	int roll;
	
	public Employee(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
//	public boolean equals(Object o) {
//		if(o==null || o.getClass()!=this.getClass() ) return false;
//		if(o==this) return true;
//		Employee employee = (Employee)o;
//		return (employee.roll==this.roll);
//	}
	public int hashCode() {
		return this.roll*31;
	}
}

class Faculty extends Employee{
	String dep;
	G g = new G();
	//g.c.comparator();
	public Faculty(String name,int roll,String dep) {
		super(name, roll);
		this.dep=dep;
	}
	
}

interface A extends JpaRepository{
	
	static void display() {
		return ;
	}
	
}
interface B{
	 static int a=0;

	
	
}

class G implements Comparator<G>{
	
	static A a = new A() {
		@Override
		public void display() {
			System.out.println("Hello");
			return ;
			
		}
	};
	
	Comparator<G> comparator = new Comparator<G>() {
		
		@Override
		public int compare(G o1, G o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	
	
}

interface C extends A,B{
	
	
	
}


//}
//class T{
//protected static void dispaly(){
//	System.out.println("parent");
//}
//
//class child extends T{
//	protected static void dispaly(){
//	System.out.println("child");
//}