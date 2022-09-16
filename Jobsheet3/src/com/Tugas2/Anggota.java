package com.Tugas2;

public class Anggota {
    private String idAnggota, nama;
    private int limit, kredit;

    Anggota(String idAngota, String nama, int limit){
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.limit = limit; 
    }
    public void setIdAnggota(String idAnggota){
        this.idAnggota = idAnggota;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setLimit(int limit){
        this.limit = limit;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limit;
    }
    public int getJumlahPinjaman(){
        return kredit;
    }
    public boolean pinjam(int req){
        if(limit < req){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            return false;
        }else{
            kredit = req;
            System.out.println("Pengajuan pinjaman berhasil");
            return true;
        }
    }
    public void angsur(int setor){
        if (setor >= kredit * 0.1){
            if(kredit - setor >= 0){
                kredit -= setor;
             }else if(kredit - setor <= 0){
                int sisa = setor - kredit;
                kredit = 0;
                System.out.println("Kembalian: " + sisa);
              }
        }else{
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
