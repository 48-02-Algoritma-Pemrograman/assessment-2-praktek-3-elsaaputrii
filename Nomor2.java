import java.util.Scanner;

public class Nomor2 {
        public static double hitungTotal(ArrayList<Integer> hampers, ArrayList<Integer> packing) {

        int[] hargaHampers = {150000, 175000, 200000};
        int[] hargaPacking = {50000, 75000, 125000};

        double total = 0;

        for (int i = 0; i < hampers.size(); i++) {
            total += hargaHampers[hampers.size(i) - 1] + hargaPacking[packing.size(i) - 1];
        }
        return total;
        }

    // Function to calculate total price including tax
    public static double hitungTotalDenganPajak(double total) {
        return total + (total * 0.10);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> hampers = new ArrayList<>();
        ArrayList<Integer> packing = new ArrayList<>();
        
        int hampers = input.nextInt();
        int packing = input.nextInt();
        String lanjut ;

        while (lanjut) {
            System.out.println("masukan pilihan hampers [1/2/3]:");
            System.out.println("1. 2 Kue kering dan 3 kue basah-150000");
            System.out.println("2. 3 Kue Kering dan 2 kue basah-175000");
            System.out.println("3. 3 Kue Kering dan 3 kue basah-200000");
            int pilihanHamper = scanner.nextInt();
            hampers.add(pilihanHamper);

            System.out.println("Masukan pilihan packing [1/2/3]:");
            System.out.println("1. Pita - 50000");
            System.out.println("2. Kartu - 75000");
            System.out.println("3. Pita + Kartu - 125000");
            int pilihanPacking = scanner.nextInt();
            packing.add(pilihanPacking);

            System.out.println("Input lagi (Y/N)?: ");
            String inputLagi = scanner.next();
            if (inputLagi.equalsIgnoreCase("N")) {
                return lanjut;
            }
        }

        double total = hitungTotal(hampers, packing);
        double totalDenganPajak = hitungTotalDenganPajak(total);

        System.out.println("Total hamper yang dipesan = " + hampers);
        System.out.println("Total yang harus dibayar = " + totalDenganPajak);


        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
