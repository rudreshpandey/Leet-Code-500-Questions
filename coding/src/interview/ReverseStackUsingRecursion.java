import java.util.Stack;

public class ReverseStackUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		int a=0;
		a+=1;st.push(a);
		a+=2;st.push(a);
		a-=1;st.push(a);
		a+=4;st.push(a);
		a-=1;st.push(a);
		System.out.println(st.toString());
		reverse (st);
		if(st.isEmpty()) System.out.print("Yes");
		System.out.print(st.toString());
		
	}
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) return;
		int a = st.pop();
		reverse (st);
		insertInStack(st,a);
		
		
	}
	public static void insertInStack(Stack<Integer> st,int a) {
		if(st.isEmpty()) {
			st.push(a);
			return;
		}
		int b=st.pop();
		insertInStack(st,a);
		st.push(b);
//		Sort
//		int b=st.pop();
//		int small=Math.min(a, b);
//		int large=Math.max(a, b);
//		insertInStack(st,small);
//		st.push(large);
	}

}
