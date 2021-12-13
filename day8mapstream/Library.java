/* Write a code to implement (Banking application/library management/Employee managment) 
.Basic details should be stored in the file.
Code should be a menu driven program to view the existing details, add new details, 
update existing details.Read/Add/Update details should be performed in the file.
 */
import java.io.File;   // Import the FileWriter class
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class Library {
  public static void main(String[] args)throws IOException{
    File file=new File("Library management.txt");
    file.createNewFile();
    FileWriter writer=new FileWriter("Library management.txt");
    writer.write("Library management system");
    writer.close();
    FileReader reader=new FileReader("Library management.txt");
    System.out.println(reader.read());
    reader.close();

    String search = "Library/Library management.txt";
    String replace = "repla/Library management.txt";
  }
}
    
