package com.Tugas2;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        boolean status = false;
        do{
            System.out.print("\nMasukkan jumlah uang yang akan dipinjam: ");
            int req = inputUser.nextInt();
            status = donny.pinjam(req);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman()); 
        }while(status == false);

        do{
            System.out.print("\nMasukkan jumlah anguran: ");
            int setor = inputUser.nextInt();
            donny.angsur(setor);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        }while(donny.getJumlahPinjaman() != 0);
    }
}
