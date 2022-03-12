/*
Tugas Kelompok ke-1 Week 3 Oleh Kelompok 4
nim - ACHMAD FAUZI
2502033834 - AZWI HAIDAR
nim - LIVIA LISTYARINI LATIFAH
nim - ANJAS JOSHUA
nim - RUDI HARNO FAZLUR RAHMAN
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //deklarasi variable dan harga menu
        int jmlOrang;
        String namaPemesan;
        int jmlNasiGoreng, jmlAyamBakar, jmlSteakSirloin, jmlKwetiawSiram, jmlKamingGuling;
        double hargaNasiGoreng = 9999.92;
        double hargaAyamBakar = 12345.67;
        double hargaSteakSirloin = 21108.40;
        double hargaKwetiawSiram = 13579.13;
        double hargaKambingGuling = 9876.43;

        //input pemesan dan jumlah pesanan
        System.out.println("Selamat siang...");
        System.out.print("\nPesan untuk berapa orang: ");
        jmlOrang = input.nextInt();
        System.out.print("\nPesanan atas nama: ");
        namaPemesan = input.next();

        //print harga menu
        System.out.println("Menu Special Hari ini");
        System.out.println("======================");
        System.out.println("1. Nasi Goreng Spesial dengan harga         @ Rp. 9999,99");
        System.out.println("2. Ayam Bakar Spesial dengan harga          @ Rp. 12345,67");
        System.out.println("3. Steak Sirloin Spesial dengan harga       @ Rp. 21108,40");
        System.out.println("4. Kwetiaw Siram Spesial dengan harga       @ Rp. 13579,13");
        System.out.println("5. Kambing Guling Spesial dengan harga      @ Rp. 98765,43");

        //input pesanan makanan
        System.out.println("Pesanan Anda [batas pesanan 0-10 porsi]");
        System.out.print("\n1. Nasi Goreng Spesial      = ");
        jmlNasiGoreng = input.nextInt();
        System.out.print("\n2. Ayam Bakar Spesial       = ");
        jmlAyamBakar = input.nextInt();
        System.out.print("\n3. Steak Sirloin Spesial    = ");
        jmlSteakSirloin = input.nextInt();
        System.out.print("\n4. Kwetiaw Siram Spesial    = ");
        jmlKwetiawSiram = input.nextInt();
        System.out.print("\n5. Kambing Guling Spesial   = ");
        jmlKamingGuling = input.nextInt();

        //proses perhitungan harga pembelian
        double totNasiGoreng = jmlNasiGoreng*hargaNasiGoreng;
        double totAyamBakar = jmlAyamBakar*hargaAyamBakar;
        double totSteakSirloin = jmlSteakSirloin*hargaSteakSirloin;
        double totKwetiawSiram = jmlKwetiawSiram*hargaKwetiawSiram;
        double totKamingGuling = jmlKamingGuling*hargaKambingGuling;

        //proses perhitungan total pembelian sebelum diskon
        double totalPembelian = totNasiGoreng+totAyamBakar+totSteakSirloin+totKwetiawSiram+totKamingGuling;
        //proses perhitungan total diskon
        double discount = totalPembelian * 0.1;

        System.out.println("\nSelamat menikmati makanan Anda...");
        System.out.println("Pembelian :");

        //menampilkan rekap pesanan makanan
        System.out.println("1. Nasi Goreng Spesial      "+jmlNasiGoreng+ " porsi * "+ hargaNasiGoreng + "      = Rp.       "+ totNasiGoreng);
        System.out.println("2. Ayam Bakar Spesial       "+jmlAyamBakar+ " porsi * "+ hargaAyamBakar + "     = Rp.       "+ totAyamBakar);
        System.out.println("3. Steak Sirloin Spesial    "+jmlSteakSirloin+ " porsi * "+ hargaSteakSirloin + "      = Rp.       "+ totSteakSirloin);
        System.out.println("4. Kwetiaw Siram Spesial    "+jmlKwetiawSiram+ " porsi * "+ hargaKwetiawSiram + "     = Rp.       "+ totKwetiawSiram);
        System.out.println("5. Kambing Guling Spesial   "+jmlKamingGuling+ " porsi * "+ hargaKambingGuling + "      = Rp.       "+ totKamingGuling + "  +");
        System.out.println("===========================================================================");
        System.out.println("Total Pembelian                                    = Rp.       "+ String.format("%.2f",totalPembelian));
        System.out.println("Disc 10% <Masa Promosi>                            = Rp.       "+ String.format("%.2f",discount) +" +");
        System.out.println("===========================================================================");

        //menampilkan total pembelian setelah diskon
        System.out.println("Total Pembelian setelah disc 10%                   = Rp.       "+ String.format("%.2f",(totalPembelian-discount)));

        //menampilkan pemberlian perorang
        System.out.println("Pembelian per orang <untuk "+ jmlOrang + " orang>               = Rp.       "+ String.format("%.2f",((totalPembelian-discount)/jmlOrang)));
        System.out.println("                 Terima kasih atas kunjungan Anda...                       ");
        System.out.println("                  ...tekan ENTER untuk keluar...                           ");

    }
}
