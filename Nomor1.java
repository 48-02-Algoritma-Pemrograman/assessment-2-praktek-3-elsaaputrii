import java.util.Scanner;

public class Nomor1 {
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void fizzBuzz (int N) {
        for (int i = 0; i <= N; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai alas: ");
        double alas = scanner.nextDouble();
        System.out.println("Masukkan nilai tinggi: ");
        double tinggi = scanner.nextDouble();
        
        double luas = hitungLuasSegitiga(alas, tinggi);
        System.out.println("Luas segitiga adalah: " + luas);
        
        System.out.println("Masukkan nilai N: ");
        int N = input.nextInt();
        fizzBuzz(N);

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
