class Main {
  public static void main(String[] args) {
    // Tetapkan string ke variable name
    String name = "Fatih";
    
    // Tetapkan int ke variable age
    int age = 20;
    
    // Tetapkan double ke variable height (contoh: 1.6)
    double height = 160;
    
    // Tetapkan double ke variable weight (contoh: 50.0)
    double weight = 45;
    
    // Kalkulasikan BMI dan tetapkan hasilnya ke variable bmi
    double bmi = weight / height / height;
    
    // Cetak name, age, height, weight, dan bmi
    System.out.println("Nama saya adalah" + name);
    System.out.println("Saya berusia" + age + "tahun");
    System.out.println("Tinggi saya adalah" + height +  "meter");
    System.out.println("Berat saya adalah" + weight + "kilogram");
    System.out.println("BMI saya adalah" + bmi);
    
  }
}
