package JavaHomework;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class JavaProgram {

  private List<String> names = new ArrayList<>();
  private List<String> ids = new ArrayList<>();

  public static void main(String[] args) {
    JavaProgram program = new JavaProgram();

    program.infoCollector();

    program.displayInfo();
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

  private void displayInfo() {
    if (names.size() != ids.size()) {
      System.out.println("Error, number of student names does not match number of student ids");
    }

    Map<String, String> studentInfo = new HashMap<>();

    for (int i = 0; i < names.size(); i++) {
      studentInfo.put(names.get(i), ids.get(i));
    }

    System.out.println("Student Names - Student ID");
    for(Map.Entry<String, String> entry: studentInfo.entrySet()) {
      System.out.println("Student Name:" + entry.getKey() + " - Student ID:" + entry.getValue());
    }
  }
}
