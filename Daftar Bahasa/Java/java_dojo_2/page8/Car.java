class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int run;
  private int fuel = 100;
  
  Car(String name, String color) {
    this.name = name;
    this.color = color;
    this.distance = distance;
    this.run = run;
    this.fuel = fuel;
  }
  
  public void printData() {
    System.out.println("Nama: " + this.name);
    System.out.println("Warna: " + this.color);
    System.out.println("Jarak: " + this.distance + "km");
    System.out.println("Bahan Bakar:" + fuel +"L");
  }
  public void run(int distance) {
    System.out.println("Bergerak " + distance + "km ...");
    this.distance += distance;
    System.out.println("Jarak: " + this.distance + "km");
  }
}