
import com.sun.tools.javac.util.Pair;

import java.util.*;

public class Graph {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int matAdj[][]=new int[n+1][n+1];
		Map<Integer,List<Pair>> map =new HashMap<>();
		List<List<Pair>> list=new ArrayList<>();
		for(int i=0;i<m;i++) 
			list.add(new ArrayList<Pair>());
		for(int i=0;i<m;i++) {
			int u,v,w;
			u=sc.nextInt();
			v=sc.nextInt();
			w=sc.nextInt();
//			matAdj[u][v]=w;
//			matAdj[v][u]=w;
			//adjacencyList
			A a=new A();
			list.get(u-1).add(new Pair(v,w));
			list.get(v-1).add(new Pair(u,w));
//			a.adjacencyList(map, u, v, w);
//			a.adjacencyList(map, v, u, w);
			
		}
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			List<Pair> pair=(List<Pair>) it.next();
			Iterator itPair=pair.iterator();
			while(itPair.hasNext()) {
				System.out.print(itPair.next().toString()+" ");
			}
			
			System.out.println();
			
			
				
				
		}
		
//		for(int i:map.keySet()) 
//			for(Pair j:map.get(i)) 
//				System.out.println(i+"->"+j.a+" = "+j.b);
			
		sc.close();
		

	}
	}
	

class Pair{
	int a,b;
	public Pair(int x,int y) {
		a=x;
		b=y;
	}
	public Pair() {
	}
}

class A{void adjacencyList(Map map,int u,int v,int w) {
	Pair pair=new Pair(v,w);
	if(!map.containsKey(u)) {
		List<Pair> list=new ArrayList<>();
		list.add(pair);
		map.put(u,list);
		return;
	}
	
	((List<Pair>) map.get(u)).add(pair);
	return;
}

}