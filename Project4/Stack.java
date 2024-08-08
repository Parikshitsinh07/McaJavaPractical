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
		this.size = size;
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
		
		Scanner sc = new Scanner(System.in);
		Stack sk;
		int op,val;
		System.out.println("1.Work with Default Satck");
		System.out.println("2.Work with Custom Stack");
		System.out.print("Select One Option :");
		op = sc.nextInt();
		if(op==2)
		{ 	
			System.out.print("Enter Your Satck Size:");
			val = sc.nextInt();
			sk = new Stack(val);
		}
		else
		{
			sk = new Stack();
		}
		do{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("0.Exit");
			System.out.print("Select One Option :");
			op = sc.nextInt();
			switch(op){
				case 1: System.out.print("Enter Your Value:");
						val = sc.nextInt();
						sk.push(val);
						break;
				case 2: sk.Pop();
						break;
				case 3: sk.Display();
						break;
				case 0: System.out.println("Thank You");
						break;
				default:System.out.println("Invalid Option");
						break;
			}	
		}while(op!=0);
	}
}