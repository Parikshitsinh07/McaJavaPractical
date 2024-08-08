import java.util.*;
interface Shape{
	int x=1;
	int y=1;
	public double area();
	public double Perimeter();
}	
class Rectangle implements Shape{
	private double l;
	private double w;
	
	public Rectangle (){
		l=1.0;
		w=2.0;
	}
	public Rectangle(double l,double w){
		this.l=l;
		this.w=w;
	}
	
	public double area(){
		return w*l;
	}
	public double Perimeter(){
		return 2*(l+w);
	}
	public double len(double Perimeter){
			return Perimeter/2-w;
			
	}
	public double width(double Perimeter){
			return Perimeter/2-l;
			
	}
	public double diagonal(){
			return 0.05*(w*w+l*l);
			 
	}	
}
class Triangle implements Shape{
		private double a;
		private double b;
		private double c;
		private double h;
		
		
		public Triangle(){
			a=1.0;
			b=1.0;
			c=1.0;
			h=1.0;
		}
		public Triangle(double a,double b,double c,double h){
			this.a=a;
			this.b=b;
			this.c=c;
			this.h=h;
		}
		public double area(){
			return h*b/2;
		}
		public double Perimeter(){
			if((a+b)>c || (a+c)>b || (b+c)>a){
				return 0.0;
				}
			else{
				return a+b+c;
				}
		}
		public double hight(double area){
			return 2*(area/b);
		}
		public double Side(double Perimeter,double s1,double s2){
			return Perimeter-s1-s2;

		}	
}
class Cricle implements Shape{
	 private double r;
	
	public Cricle() {
        r = 1.0;
    }
	
	// Constructor 2: Initialize with specified radius
	public Cricle(double radius){
		r = radius;
	}
	 public double area() {
        return Math.PI * r * r;
    }

    // Method to calculate and return the circumference (perimeter) of the circle
    public double Perimeter() {
        return 2 * Math.PI * r;
    }

    // Method to calculate and return the diameter of the circle
    public double diameter() {
        return 2 * r;
    }
	
}

class ShapeDemo1{
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		int op,choose;
		String ch;
		
		do{
			System.out.println("Select Your Shape");
			System.out.println("0.Exit");
			System.out.println("1.Rectangle");
			System.out.println("2.Triangle");
			System.out.println("3.Cricle");
			System.out.println("4.Rectangle default");
			System.out.println("5.Triangle default");
			System.out.println("6.Cricle default");
			op = sc.nextInt();
			switch(op){
				case 1: //System.out.println("Can You set lenght and Wight Of Rectangle:?");
						 //ch = sc.nextLine();
						if(true){
							System.out.println("Enter Your lenght :");
							double l = sc.nextDouble();
							System.out.println("Enter Your Width :");
							double w = sc.nextDouble();
							Rectangle r = new Rectangle(l,w);
							do{
								System.out.println("0.Exit");
								System.out.println("1.area");
								System.out.println("2.Perimeter");
								System.out.println("3.lenght");
								System.out.println("4.width");
								System.out.println("5.diagonal");
								choose = sc.nextInt();
								switch(choose){
									case 1:System.out.println("Area Of Rectangle is :"+r.area());
											break;
									case 2:System.out.println("Perimeter Of Rectangle is"+r.Perimeter());
											break;
									case 3:System.out.println("Enter Your Perimeter");
											double Pe=sc.nextDouble();
											System.out.println("lenght Of Rectangle is:"+r.len(Pe));
											break;
									case 4:System.out.println("Enter Your Perimeter");
											double P=sc.nextDouble();
											System.out.println("width Of Rectangle is "+r.width(P));
											break;
									case 5:System.out.println("Diagonal Of Ractangle is: "+r.diagonal());
											break;
									default:System.out.println("Invelid  option");
											break;
								}
							}while(choose!=0);
						}
							break;
							//Triangle
				case 2://System.out.println("Can You set Sides  and hight of Triangle:?");
						 //ch = sc.nextLine();
						if(true){
							System.out.println("Enter Your Side a :");
							double d = sc.nextDouble();
							System.out.println("Enter Your Side b :");
							double b = sc.nextDouble();
							System.out.println("Enter Your Side c :");
							double c = sc.nextDouble();
							System.out.println("Enter Your hight :");
							double h = sc.nextDouble();
							Triangle t = new Triangle(d,b,c,h);
							do{
								System.out.println("0.Exit");
								System.out.println("1.area");
								System.out.println("2.Perimeter");
								System.out.println("3.hight");
								System.out.println("4.width");
								System.out.println("5.diagonal");
								choose = sc.nextInt();
								switch(choose){
									case 1:System.out.println("Area Of Triangle is :"+t.area());
											break;
									case 2:if(t.Perimeter()==0.0){
											System.out.println("Perimeter Of Triangle is Note Possible");
											}
											else{
											System.out.println("Perimeter Of Triangle is"+t.Perimeter());
											}
											break;
									case 3:System.out.println("Enter Your area");
											double area=sc.nextDouble();
											System.out.println("heghit of Triangle  is "+t.hight(area));
											break;
									case 4:System.out.println("Enter Your Perimeter");
											double Perimeter=sc.nextDouble();
											System.out.println("Enter Your Side 1 :");
											double s1 = sc.nextDouble();
											System.out.println("Enter Your Side 2 :");
											double s2 = sc.nextDouble();
											System.out.println("Side of Triangle  is "+t.Side(Perimeter,s1,s2));
											break;
									default:System.out.println("Invelid  option");
											break;
								}
							}while(choose!=0);
						}
							break;
							//Cricle
				case 3://System.out.println("Can You set radius of Cricle:?");
						//ch = sc.nextLine();
						if(true){
							System.out.print("Enter Your radius: " );
							double radius = sc.nextDouble();
							Cricle c = new Cricle(radius);
							do{
								System.out.println("0.Exit");
								System.out.println("1.area");
								System.out.println("2.Perimeter");
								System.out.println("3.diameter");
								 choose = sc.nextInt();
								switch(choose){
								 case 1:System.out.println("Circle - Area: " + c.area());
										break;
								 case 2:System.out.println("Circle - Perimeter: " + c.Perimeter());
										break;
								case 3:System.out.println("Circle - diameter: " + c.diameter());
										break;
								default :System.out.println("Invelid  option");
											break;
								}
							}while(choose!=0);
						}
						break;
				case 0:System.out.println("Thank You");
						break;
				case 4:Rectangle r = new Rectangle();
						System.out.println("Area Of Rectangle is :"+r.area());
						System.out.println("Perimeter Of Rectangle is"+r.Perimeter());
						double Pi = r.Perimeter();
						System.out.println("lenght Of Rectangle is:"+r.len(Pi));
						System.out.println("width Of Rectangle is "+r.width(Pi));
						System.out.println("Diagonal Of Ractangle is: " +r.diagonal());
						break;
				case 5:	Triangle t = new Triangle();
						System.out.println("Area Of Triangle is :"+t.area());
						double area=t.area();
						double Perimeter=t.Perimeter();
						double s1=1.0;
						double s2=1.0;
						System.out.println("Perimeter Of Triangle is"+t.Perimeter());
						System.out.println("heghit of Triangle  is "+t.hight(area));
						System.out.println("Side of Triangle  is "+t.Side(Perimeter,s1,s2));
						break;
				case 6:	Cricle c = new Cricle();
						System.out.println("Circle - Area: " + c.area());
						System.out.println("Circle - Perimeter: " + c.Perimeter());
						System.out.println("Circle - diameter: " + c.diameter());
						break;
				default :System.out.println("Invelid  option");
						break;
			}
		}while(op!=0);
	}
}