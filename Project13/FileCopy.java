import java.io.*;

class FileCopy{
	public static void main (String [] args){
		try{
			File fin = new File (args[0]);		
			File fout = new File (args [1]);	
			
		
			if(fin.isFile() == false && fout.isFile() == false){
				System.out.println("usage : java FileDirectory <file_name> <file_name>");
				System.exit(0);
			}
			
			FileInputStream fis = new FileInputStream (fin);		
			FileOutputStream fos = new FileOutputStream (fout);		
			
			byte [] b = new byte [500];
			int cnt = 0;
			
			
			while ((cnt = fis.read(b)) != -1){
				fos.write(b, 0, cnt);
			}
			
			System.out.println("File Copy Successfully..!!");
			
			fis.close();		
			fos.close();					
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}

