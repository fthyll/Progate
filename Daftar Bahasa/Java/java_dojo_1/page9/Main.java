import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Jumlah orang: ");
    int n = scanner.nextInt();
    
    for (int i = 0; i < n; i++) {
      System.out.println("Orang ke " + (i + 1));
      
      System.out.print("Nama depan: ");
      String firstName = scanner.next();
      
      System.out.print("Nama belakang: ");
      String lastName = scanner.next();
      
      System.out.print("Usia: ");
      int age = scanner.nextInt();
      
      System.out.print("Tinggi Badan(m): ");
      double height = scanner.nextDouble();
      
      System.out.print("Berat Badan(kg): ");
      double weight = scanner.nextDouble();
      
      Person.printData(firstName, lastName, age, height, weight);
    }
  }
}
class Person {
  public static void printData(String firstName, String lastName, int age, double height, double weight) {
    System.out.println("Nama saya adalah " + fullName(firstName, lastName) + ".");
    System.out.println("Saya berusia " + age + " tahun.");
    if (age >= 18) {
      System.out.println("Saya sudah dewasa.");
    } else {
      System.out.println("Saya belum dewasa.");
    }
    System.out.println("Tinggi Badan saya " + height + "m.");
    System.out.println("Berat Badan saya " + weight + "kg.");
    double bmi = bmi(height, weight);
    System.out.println("Nilai BMI saya " + Math.round(bmi) + ".");
    if (isHealthy(bmi)) {
      System.out.println("Saya sehat!");
    } else {
      System.out.println("Saya tidak sehat.");
    }
  }
  
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}
