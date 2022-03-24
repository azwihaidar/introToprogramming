/*
Tugas Kelompok ke-1 Week 3 Oleh Kelompok 4
2301962162 - ACHMAD FAUZI
2502033834 - AZWI HAIDAR
2502039996 - LIVIA LISTYARINI LATIFAH
2502018884 - ANJAS JOSHUA
2502036930 - RUDI HARNO FAZLUR RAHMAN
*/
package com.company;
import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    //deklarasi global variable
    static String nama,nim;
    static boolean reRun = true;
    static int totalDeret;
    //static int nim;
    //static int lengthOfNIM =  String.valueOf(nim).length();

    public static void main(String[] args) {
        //kondisi ketika fungsi menjalankan program true (reRun=True)
        while (reRun) {

            // menjalankan method untuk validasi nama dan NIM
            inputNama();
            inputNim();

            // menampilkan nama dan nim jika berhasil registrasi
            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Registrasi Sukses,,");
            System.out.println("Selamat datang " + nama + "[NIM : " + nim + " ].. ^^V");
            System.out.println("\nMari belajar macam-macam deret bilangan");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            // menjalankan method validasi angka atau jumlah deret yang diinginkan
            inputAngka();
            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            System.out.println("\nDeret Bilangan");
            System.out.println("################");

            // menjalankan method deret genap. ganjil dan fibonacci
            deretGenap();
            deretGanjil();
            deretFibonacci();

            // menjalankan method untuk mengulang program atau tidak
            reRunProgram();
        }
    }
        // method untuk validasi Nama, nama yang diinput minimal 1 dan maksimal 25
        static void inputNama(){
                System.out.print("\nMasukkan nama Anda [1..25] : ");
                nama = input.next();

                if (nama.isEmpty() || nama.length() > 25) {
                    System.out.println("Masukkan kembali nama Anda, panjang karakter 1 - 25");
                    inputNama();
                }
        }

        // method untuk validasi nim, banyak karakter dari Nim yang diinput harus 10 karakter.
        static void inputNim(){
            System.out.print("\nMasukkan NIM Anda [1..10] : ");
            nim = input.next();

            if (nim.length() != 10) {
                System.out.println("Masukkan kembali NIM Anda,  nim harus 10 digit");
                inputNim();
            }
        }

        // method untuk validasi jumlah deret, Jumlah Angka yang diinput minimal 5 dan maksimal 20.
        static void inputAngka(){
            System.out.print("\nMasukkan sembarang angka [5..20] : ");
            totalDeret = input.nextInt();

            if (totalDeret < 5 |  totalDeret > 20) {
                System.out.println("Angka yang harus dimasukkan antara 5 - 20!");
                inputAngka();
            }
         }

        // method untuk menampilkan bilangan genap
         static void deretGenap(){
             System.out.println("\n"+ totalDeret + " Bilangan Genap : ");

             int total = 0;

             for(int i = 1; i <= totalDeret*2; i++)
                 if (i % 2 == 0){
                     System.out.print(i + " ");
                     total = total + i;
                 }
             System.out.println("\nHasil Penjumlahan : "+total);

         }

         // method untuk menampilkan bilangan ganjil
        static void deretGanjil(){
            System.out.println("\n"+ totalDeret + " Bilangan Ganjil : ");

            int total=0;

            for(int i = 1; i <= totalDeret*2; i++)
                if (i % 2 != 0){
                    System.out.print(i + " ");
                    total = total + i;
                }
            System.out.println("\nHasil Penjumlahan : "+total);

        }

        /// method untuk menampilkan bilangan fibonacci
        static void deretFibonacci(){
            System.out.println("\n"+ totalDeret + " Bilangan Fibonacci : ");
            int v_angka1=1;
            int v_angka2=1;
            int v_angka3;
            int total=0;

            for(int i = 1; i <= totalDeret; i++) {

                System.out.print(v_angka1 + " ");

                    v_angka3 = v_angka1 + v_angka2;
                    total = total + v_angka1;

                    v_angka1 = v_angka2;
                    v_angka2 = v_angka3;

                }
            System.out.println("\nHasil Penjumlahan : "+total);

        }

        // method untuk mengulang perhitungan
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
