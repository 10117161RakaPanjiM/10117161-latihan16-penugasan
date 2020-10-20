/**
 *
 * @author GPS-2
 * NAMA : RAKA PANJI MUHABIEQ
 * KELAS : PBO1
 * NIM : 10117161
 *
 */
package if1.pkg10117161.latihan4.kambing;

public class IF110117161Latihan4Kambing {
   public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        Kambing KambingJantan = new Kambing();
        KambingJantan.tambahKambing();
    }
    
}
