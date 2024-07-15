import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // System output
    System.out.println("Hello, World!");
    System.out.println("Please enter your name: ");
    String name = scanner.nextLine();

    // System string input  
    System.out.println("Hello, " + name + ". Pleasure to meet you!");
    
    // System int input
    System.out.println("How old are you, " + name + "?");
    int age = scanner.nextInt();
    System.out.printf("Wonderful! Your name is %s and you are %d years old\n", name, age);
    System.out.println("Would you like to know how old you are in days?");
    double ageInDays = (age * 365);
    System.out.printf("You are %.0f days old", ageInDays);

  
    scanner.close();
  }
}
