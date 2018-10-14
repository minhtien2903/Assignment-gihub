import java.util.Scanner;

public class hello {
  public static void main(String[] args) 
  {
    System.out.println("Hello World This is TDTU");
    try {
    File f = new File("data.txt");
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String line;
    while ((line = br.readLine()) != null){
      System.out.println(line);
    }
    fr.close();
     br.close(); 
    } catch (Exception ex) {
        System.out.println("Loi doc file: "+ex);
    }
    

  }
}