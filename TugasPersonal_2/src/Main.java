import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static boolean reRun = true;

    public static void main(String[] args) {

        while (reRun) {
            System.out.println("Belajar Deret Aritmatika, Deret Geometri dan Menghitung Faktorial");
            runningProgram(); // memanggil semua method deret
            reRunProgram(); // mengulang program
        }
    }

    public static void runningProgram(){

        System.out.print("\nMasukkan beda masing-masing angka [2..10] : ");
        int angka1 = input.nextInt();
        if(angka1 < 2 || angka1 > 10) //melakukan cek apakah panjang bilangan antara 2-10
            throw new RuntimeException("Angka yang harus dimasukkan antara 2 - 10!");

        System.out.print("\nMasukkan beda masing-masing angka [2..9] : ");
        int angka2 = input.nextInt();
        if(angka2 < 2 || angka2 > 9) //melakukan cek apakah beda antara 2-9
            throw new RuntimeException("Angka yang harus dimasukkan antara 2 - 9!");

        //call method deret
        deretAritmatika(angka1,angka2);
        deretGeometri(angka1,angka2);
        deretFaktorial(angka1);
    }

    // method untuk menampilkan Deret Aritmatika
    public static void deretAritmatika(int pjgBilangan, int bedaAngka){
        System.out.println("Deret Aritmatika : ");
        int total=1;
        for(int i = 1; i <= pjgBilangan; i++){
            System.out.print(total + " ");
            total = total + bedaAngka; //penjumlahan deret aritmatika
        }
    }

    // method untuk menampilkan Deret Geometri
    static void deretGeometri(int pjgBilangan, int bedaAngka){
        System.out.println("\nDeret Geometri : ");

        int total=1;
        for(int i = 1; i <= pjgBilangan; i++){
            System.out.print(total + " "); // perkalian deret geometri
            total = total * bedaAngka;
        }
    }
    public static void deretFaktorial(int pjgBilangan){
        System.out.println("\nFaktorial Dari "+ pjgBilangan+ ":");

        ArrayList<Integer> deretFaktorial = new ArrayList<>();
        int total = 1;
        int sum = 1;

        for(int i = pjgBilangan; i > 0; i--) {
            total = i;
            sum = sum * total; //perkalian faktorial
            deretFaktorial.add(total);
        }
        String hasilFaktorial = deretFaktorial.toString().substring(1, deretFaktorial.toString().length() - 1);
        String hasil = hasilFaktorial.replace(", "," * ");

        System.out.println(hasil+" = "+sum);
    }

    // method untuk mengulang deret
    static void reRunProgram(){
        System.out.print("\nAnda ingin mengulang [y/t] : ");
        String ulang = input.next();

        // Fungsi switch untuk mengeksekusi perhitungan ulang atau tidak.
        // Jika user memilih ‘Y’ atau ‘y’, maka program akan berulang.
        // Jika user memilih ‘T’ atau ‘t’,  maka program akan berakhir.
        switch (ulang.toUpperCase()) {
            case "Y" : reRun = true;
                break;
            case "T" : reRun = false;
                System.out.println("Sampai jumpa kembali...");
                System.out.println("Terima Kasih ^.^");
                break;
            default:
                System.out.println("\nInputan yang anda masukkan salah!");
                break;

        }
    }

}