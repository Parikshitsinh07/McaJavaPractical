import java.lang.*;
import java.util.*;
class MyException extends Exception{
	public MyException(String str)
	{
		System.out.println(str);
	}
}

class NegativeArray{
    public static void main(String[] a) {
		try
		{
		for (int i=0;i<a.length;i++){
			int ab= Integer.parseInt(a[i]);
			System.out.println("");
			if(ab<0){
				throw new MyException("Number is negative"); 
			}
			System.out.println(a[i]);
		}
		}
		catch(Exception er)
		{
			er.printStackTrace();
		}
		
       // System.out.println("Continuing execution...");
    }
}