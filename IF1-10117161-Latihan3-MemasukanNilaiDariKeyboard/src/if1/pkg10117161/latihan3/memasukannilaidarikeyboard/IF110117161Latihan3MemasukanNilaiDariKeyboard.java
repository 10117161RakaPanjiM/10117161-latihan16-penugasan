/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117161.latihan3.memasukannilaidarikeyboard;

/**
 *
 * @author GPS-2
 * NAMA : RAKA PANJI MUHABIEQ
 * KELAS : PBO1
 * NIM : 10117161
 * Deskripsi Program : Program ini berisi tentang Memasukan Nilai Dari Keyboard
 */
import java.util.Scanner;


public class IF110117161Latihan3MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.print("Nama anda adalah "+nama);
    }
    
}
