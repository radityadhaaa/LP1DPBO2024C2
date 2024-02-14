/*
Saya Raditya Adha Rahman mengerjakan LP1 dalam mata kuliah
DPBO untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// Mengimpor library yang diperlukan
#include <bits/stdc++.h>
// Mengimpor file Anggota.cpp
#include "Anggota.cpp"

// Menggunakan namespace std untuk mempersingkat penulisan kode
using namespace std;

// Mendefinisikan fungsi main
int main()
{
    // Membuat array 'orang' dengan 10 objek Anggota
    Anggota orang[10];
    // Mendeklarasikan variabel-variabel yang diperlukan
    int i = 0, ch, j, idAnggota;
    // Mulai loop utama
    while (1)
    {
        // Menampilkan menu utama
        cout << "\nSelamat Datang di Informasi Anggota DPR";
        cout << "\nSilahkan pilihlah opsi untuk melakukan aksi";
        cout << "\n";
        cout << "\n 1. Masukan Data Anggota DPR";
        cout << "\n 2. Menghapus Data Anggota DPR";
        cout << "\n 3. Melakukan Update Data Anggota DPR";
        cout << "\n 4. Menampilkan Anggota DPR";
        cout << "\n 5. Keluar";
        cout << "\n";
        // Menerima input dari pengguna
        cin >> ch;
        // Melakukan aksi berdasarkan input pengguna
        switch (ch)
        {
        case 1:
            // Memasukkan data anggota
            orang[0].masukanData(orang, i);
            break;
        case 2:
            // Meminta ID anggota yang akan dihapus
            cout << "Masukan ID yang akan di Hapus :";
            cin >> idAnggota;
            // Menghapus data anggota
            orang[0].menghapusData(orang, 10, idAnggota);
            break;
        case 3:
            // Meminta ID anggota yang akan diperbarui
            cout << "Masukan ID yang akan di Update :";
            cin >> idAnggota;
            // Memperbarui data anggota
            orang[0].mengubahData(orang, idAnggota, i);
            break;
        case 4:
            // Menampilkan semua anggota DPR
            cout << "Anggota DPR";
            for (i = 0; i < 10; i++)
            {
                // Jika nama anggota tidak kosong
                if (orang[i].getNama() != "")
                {
                    // Menampilkan detail anggota
                    cout << "\n" << orang[i].getNama() <<" " << orang[i].getNamaBidang() << " " << orang[i].getNamaPartai() << "\n";
                } 
            }
            break;
        default:
            // Menampilkan pesan kesalahan jika input tidak valid
            cout << "Salah, Silahkan masukan inputan sesuai dengan opsi yang tertera";
            break;
        case 5:
            // Keluar dari program
            exit(0);
        }
    }
    // Mengembalikan 0 jika program berjalan dengan sukses
    return 0;
}
