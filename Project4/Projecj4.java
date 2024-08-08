import java.util.*;

 class Stack{
	private int[] s;
	private int top;
	private int size;
	public Stack(){
		System.out.println("Default call");
		size=5;
		s = new int [size];
		top = -1;
	}
	public Stack(int size){
		System.out.println("arg call");
		s = new int [size];
		top = -1;
	}
	public void push(int val){
		if (top>=size-1){
			System.out.println("\t stack is full");
		}
		else{
			s[++top]=val;
			System.out.println( s[top] + "is Pushed ");
		}
	}
	public void Display(){
		int i;
		if(top<=-1){
			System.out.println("\t Stack is Emty ");
		}
		else{
			System.out.println("\t index \t values");
			for(i=top;i>-1;i--){
				System.out.println("\t "+i+" \t"+s[i]);
			}
		}
	}
	public void Pop(){
		if(top<=-1){
			System.out.println("\t Stack is emty \n");
		}
		else{
		System.out.println("\t"+s[top]+" is Pop ");
		--top;
		}
	}

}
class StackDemo{
	public static void main(String [] a){
		Stack sk = new Stack();
		Scanner sc = new Scanner(System.in);
		
		int op;
		do{
			System.out.println("1.Set Size Of Stack");
			System.out.println("2.Push");
			System.out.println("3.Pop");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.print("Select One Option :");
			op = sc.nextInt();
			switch(op){
				case 2: System.out.print("Enter Your Value:");
						int val = sc.nextInt();
						sk.push(val);
						break;
				case 3: sk.Pop();
						break;
				case 4: sk.Display();
						break;
				case 5: System.out.println("Thank You");
						break;
				default:System.out.println("Invalid Option");
						break;
			}	
		}while(op!=5);
	}
}