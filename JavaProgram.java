package JavaHomework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaProgram {

  private List<String> names = new ArrayList<>();
  private List<String> ids = new ArrayList<>();

  public static void main(String[] args) {
    JavaProgram program = new JavaProgram();

  
    program.infoCollector();

  }

  private void infoCollector() {
    Scanner scanner = new Scanner(System.in);
    String name;
    String id;
    String nextInput;

    do {
      System.out.print("Enter student name: ");
      name = scanner.nextLine();
      names.add(name);

      System.out.print("Enter student ID: ");
      id = scanner.nextLine();
      ids.add(id);

      System.out.print("Enter another students information? (Y/N) ");
      nextInput = scanner.nextLine();

    } while(nextInput.equalsIgnoreCase("y"));
    scanner.close();
  }

  
}
