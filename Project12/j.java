import java.io.*;

class FileDirectory{
	public static void main(String [] agrs){
		double Totalsubject;
		if(agrs.length!=1){
			System.out.println("usage : java FileDirectory <file_name> or <directory_name>");
			System.exit(0);
		}
		File f = new File(agrs[0]);
		
		File r ;
		
		try{
			if(f.canExecute()){
					//System.out.println("Hello");
					if(f.isFile() == false){
						System.out.println("Please Enter a Valid File Name.");
						System.exit(0);
					}
					else{
						FileReader fr = new FileReader(f);
						BufferedReader br = new BufferedReader(fr);
						
						String Line;
						
						while ((Line = br.readLine()) != null){
								String[] data = Line.split("\t");
							
							if (data.length == 5){
								String rollNo = data[0];
								String name = data[1];
								for(int i = 2; i<data.length;i++){
									double subject = Double.parseDouble(data[i]);
									 Totalsubject = Totalsubject + subject;
									}
								double per = Totalsubject/3 ;
								System.out.println();
								System.out.println("Roll No: " + rollNo);
								System.out.println("Name: " + name);
								System.out.println("Percentage: " + per + "%");
								System.out.println();
								}
							else{
								System.out.println("Data are in invalid format : " + Line);
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
		catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
}