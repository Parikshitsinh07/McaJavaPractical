import java.io.*;

class StudentMarks{
    public static void main(String[] args){

        if (args.length != 1){
            System.out.println("usage: java StudentDataProcessor <file_name>");
            System.exit(0);
        }

        File f = new File(args[0]);
		
        if (f.isFile() == false){
            System.out.println("usage : java FileDirectory <file_name> <file_name>");
            System.exit(0);
        }

        try{

			FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
			 
            String line;

			
            while ((line = br.readLine()) != null){
				
                String[] data = line.split("\t");
				
                if (data.length == 5){
                    String rollNo = data[0];
                    String name = data[1];
                    double subject1 = Double.parseDouble(data[2]);
                    double subject2 = Double.parseDouble(data[3]);
                    double subject3 = Double.parseDouble(data[4]);

                    double per = Percentage(subject1, subject2, subject3);		

					System.out.println();
                    System.out.println("Roll No: " + rollNo);
                    System.out.println("Name: " + name);
                    System.out.println("Percentage: " + per + "%");
                    System.out.println();
					
                } else{
                    System.out.println("Data are in invalid format : " + line);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static double Percentage(double subject1, double subject2, double subject3){
        return (subject1 + subject2 + subject3) / 3;
    }
}
