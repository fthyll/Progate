class Bicycle {
  private String name;
  private String color;
  private int distance = 0;
  private int run;
  
  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
    this.distance = distance;
    this.run = run;
  }
  
  public void printData() {
    System.out.println("Nama: " + this.name);
    System.out.println("Warna: " + this.color);
    System.out.println("Jarak: " + this.distance + "km");
  }
  public void run(int distance) {
    System.out.println("Bergerak " + distance + "km ...");
    this.distance += distance;
    System.out.println("Jarak: " + this.distance + "km");
  }
}
