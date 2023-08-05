public class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;

  public Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void printData() {
    System.out.println("Nama: " + this.name);
    System.out.println("Warna: " + this.color);
    System.out.println("Jarak: " + this.distance + "km");
    System.out.println("Bahan Bakar: " + fuel + "L");
  }

  public void run(int distance) {
    System.out.println("Bergerak " + distance + "km ...");
    if (distance <= fuel) {
      this.distance += distance;
      fuel -= distance;
      System.out.println("Jarak: " + this.distance + "km");
      System.out.println("Bahan Bakar: " + fuel + "L");
    } else {
      System.out.println("Bahan bakar tidak cukup");
    }
    System.out.println("Jarak: " + this.distance + "km");
    System.out.println("Bahan Bakar: " + this.fuel + "L");
  }
}
