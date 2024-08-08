import java.io.*;
import java.util.Scanner;
class FilePractical
{
	public static void main(String [] args)
	{
		if(args.length<1)
		{
			System.out.println("Usage :java FileDirectory <file_name> or <directory_name>");
			System.exit(0);
		}
		Scanner sc = new Scanner(System.in);
		File f = new File(args[0]);
		try{
			System.out.println("Select Oparection on file");
			System.out.println("1.Find the File Length ");
			System.out.println("2.FileDirectory list");
			System.out.println("3.Read File ");
			System.out.println("4.Write File");
			int op = sc.nextInt();
			switch(op)
			{
				case 1:FileLength();
						break;
				case 2:FileList();
						break;
				case 3:RreadFile();
						break;
				case 4:WriteFile();
						break:
				default:
						System.out.println("Program Exit");
						System.exit(0);
			}
		public void FileLength()
		{
			if(f.isFile())
			{
				System.out.println("File Length is : "+f.length()+" bytes\`nFile Name is : "f.getAbsoluteFile());
			}
			else
			{
				System.out.println("That is not file ");
			}
		}
		public void FileList()
		{
			if(f.canExecute())
			{
				if(f.isFile())
				{
					System.out.println("That is file so cant not list");
				}
				else
				{
					String [] list = f.list();
					for(i=0; i < list.length ; i++)
					{
						System.out.println(list[i]);
					}
				}
			}
		}
			
		public void RreadFile()
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			while((line = br.readLine()))
		}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}