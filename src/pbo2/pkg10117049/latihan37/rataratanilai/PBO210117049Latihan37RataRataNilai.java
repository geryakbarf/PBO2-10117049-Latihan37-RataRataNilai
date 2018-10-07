/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung rata - rata
 * nilai Mahasiswa
 */
public class PBO210117049Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);

        Nilai nilai1 = new Nilai();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nilai1.jumlahSiswa = baca.nextInt();
        nilai1.inputHitungNilai(nilai1.jumlahSiswa, nilai1.nilai);
        System.out.println("Maka Rata - Ratanya : " + nilai1.rataRataNilai());

    }

}
