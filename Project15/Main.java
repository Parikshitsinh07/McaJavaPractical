import org.gvp.dcs.ds.Stack;
import org.gvp.dcs.ds.Queue;
import org.gvp.dcs.shapes.Cube;
import org.gvp.dcs.shapes.Sphere;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int option,size,value,op;
		double volume,SurfaceArea;
		try
		{
			do
			{
				System.out.println("1.Demonstrating Stack:");
				System.out.println("2.Demonstrating Queue:");
				System.out.println("3.Demonstrating Cube:");
				System.out.println("4.Demonstrating Sphere:");
				System.out.println("0.Exit");
				System.out.print("Select One Option:");
				op = sc.nextInt();
				if(op==1)
				{
					System.out.print("Enter Your Stack Size:");
					size = sc.nextInt();
					Stack stack = new Stack(size);
					do
					{
						// Demonstrate the Stack
						System.out.println("");
						System.out.println("Demonstrating Stack:");
						System.out.println("1.push");
						System.out.println("2.pop");
						System.out.println("3.peek");
						System.out.println("0.Exit");
						System.out.print("Select one Option:");
						option = sc.nextInt();
						switch(option)
						{
							case 1: System.out.println("");
									System.out.println("Enter Your Element");
									value = sc.nextInt();
									stack.push(value);
									break;
							case 2: System.out.println("");
									stack.peek();
									break;
							case 3: System.out.println("");
									stack.peek();
									break;
							case 4: System.out.println("Program Exit");
									break;
							default:
									System.out.println("Invalid Input");
						}
					}while(option != 0);
				}
				else if(op == 2)
				{
					
					System.out.print("Enter Your Queue Size:");
					size = sc.nextInt();
					Queue queue = new Queue(size);
					do
					{	
						System.out.println("");
						// Demonstrate the Queue
						System.out.println("\nDemonstrating Queue:");
						System.out.println("1.Insert");
						System.out.println("2.Delete");
						System.out.println("3.peek");
						System.out.println("0.Exit");
						System.out.print("Select one Option:");
						option = sc.nextInt();
						switch(option)
						{
							case 1: System.out.println("\n");
									System.out.println("Enter Your Element");
									value = sc.nextInt();
									queue.enqueue(value);
									break;
							case 2: System.out.println("");
									queue.dequeue();
									break;
							case 3: System.out.println("");
									queue.peek();
									break;
							case 4: System.out.println("");
									System.out.println("Program Exit");
									break;
							default:
									System.out.println("Invalid Input");
						}
					}while(option != 0);
				}
				else if(op == 3) 
				{
					System.out.print("Enter Your Cube side:");
					size = sc.nextInt();
					Cube c = new Cube(size);
					
					do
					{	
						System.out.println("");
						// Demonstrate the Queue
						System.out.println("\nDemonstrating Cube:");
						System.out.println("1.calculateVolume");
						System.out.println("2.calculateSurfaceArea");
						System.out.println("0.Exit");
						System.out.print("Select one Option:");
						option = sc.nextInt();
						switch(option)
						{
							case 1: System.out.println("");
									volume = c.calculateVolume();
									System.out.println("Sphere volume is : " + volume);
									break;
							case 2: System.out.println("");
									SurfaceArea = c.calculateSurfaceArea();
									System.out.println("Cube SurfaceArea is : " + SurfaceArea);
									break;
							case 3: System.out.println("");
									System.out.println("Program Exit");
									break;
							default:
									System.out.println("Invalid Input");
						}
					}while(option != 0);
					
				}
				else if(op == 4)
				{
					System.out.print("Enter Your Sphere radius:");
					size = sc.nextInt();
					Sphere sphere = new Sphere(size);
					
					do
					{	
						System.out.println("");
						// Demonstrate the Queue
						System.out.println("\nDemonstrating Sphere:");
						System.out.println("1.calculateVolume");
						System.out.println("2.calculateSurfaceArea");
						System.out.println("0.Exit");
						System.out.print("Select one Option:");
						option = sc.nextInt();
						switch(option)
						{
							case 1: System.out.println("");
									volume = sphere.calculateVolume();
									System.out.println("Sphere volume is : " + volume );
									break;
							case 2: System.out.println("");
									SurfaceArea = sphere.calculateSurfaceArea();
									System.out.println("Sphere SurfaceArea is : " + SurfaceArea);
									break;
							case 3: System.out.println("");
									System.out.println("Program Exit");
									break;
							default:
									System.out.println("Invalid Input");
						}
					}while(option != 0);
				}
				
			}while(op != 0 );
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
    }
}
