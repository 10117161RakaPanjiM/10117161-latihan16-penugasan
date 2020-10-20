/**
 *
 * @author GPS-2
 * NAMA : RAKA PANJI MUHABIEQ
 * KELAS : PBO1
 * NIM : 10117161
 *
 */
package if1.pkg10117161.latihan5.kambingglobal;


public class IF110117161Latihan5KambingGlobal {
// variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    //method untuk menampilkan jumlah kambing
public void getJumlahKambing()  {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing: " + jumlahKambing); 
}
    public static void main(String[] args) {
      KambingGlobal kambingSusu = new KambingGlobal();
      // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
      kambingSusu.getJumlahKambing();
      
      // Menambah satu Kambing
      kambingSusu.tambahKambing();
      
      //Menampilkan jumlah kambing yang ada
      kambingSusu.getJumlahKambing();
    }
}
    
    

