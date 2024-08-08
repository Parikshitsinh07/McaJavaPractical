import java.io.*;

class FileDirectory{
	public static void main(String [] agrs){
		if(agrs.length!=1){
			System.out.println("usage : java FileDirectory <file_name> or <directory_name>");
			System.exit(0);
		}
		File f = new File(agrs[0]);
		
		File r ;
		
		try{
			if(f.canExecute()){
					//System.out.println("Hello");
					if(f.isFile()){
						System.out.println("File Length is : "+f.length()+" bytes\`nFile Name is : "+f.getAbsoluteFile());
					}
					else{
						String [] list =  f.list();
						
						for(int i =0 ; i< list.length; i++){
							r = new File(agrs[0]+"\\"+list[i]);
							if(r.isFile()){
								System.out.println(list[i]+"	"+r.length()+" bytes ");
							}
							else{
								System.out.println("\nDirectory Name is : " + list[i]);
							}
							
						}
					}
			}
			else{
				System.out.println("Not Exit");
			}
		}
		catch(SecurityException se){
			se.printStackTrace();
		}
		
		
	}
}