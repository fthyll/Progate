import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Nama depan : ");
    String firstName = scanner.next();
    System.out.print("Nama Belakang : ");
    String lastName = scanner.next();
    System.out.print("Usia : ");
    int usia = scanner.nextInt();
    System.out.print("Tinggi Badan(m): ");
    double tinggi = scanner.nextDouble();
    System.out.print("Berat Badan(kg): ");
    double berat = scanner.nextDouble();

    System.out.println("Nama saya adalah " + firstName + " " + lastName + ".");
    System.out.println("Saya berusia " + usia + " tahun.");

    if (usia > 18) {
      System.out.println("Saya sudah dewasa.");
    } else {
      System.out.println("Saya belum dewasa.");
    }
    
    System.out.println("Tinggi Badan saya " + tinggi + "m.");
    System.out.println("Berat Badan saya " + berat + "kg.");
  }
}
