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

public class Nilai {
    public int jumlahSiswa;
    public double rataRata;
    public double jumlahNilai;
    public double nilai;
    
    public void inputHitungNilai(int jumSiswa, double Nilai){
        int i = 1;
        Scanner baca = new Scanner(System.in);
        while (i <= jumSiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            Nilai = baca.nextDouble();
            jumlahNilai = jumlahNilai + Nilai;
            i = i + 1;
        }
        System.out.println("");
        
    }
    public double rataRataNilai(){
        
        return rataRata = jumlahNilai / jumlahSiswa;
    }
    
    
}
