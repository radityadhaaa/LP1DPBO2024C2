/*
Saya Raditya Adha Rahman mengerjakan LP1 dalam mata kuliah
DPBO untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// Mengimpor library yang diperlukan
#include <iostream>
#include <string>
#include <stdlib.h>

using namespace std;

// Deklarasi kelas Anggota
class Anggota
{
private:
    // Mendeklarasikan variabel-variabel private
    int dataId;
    string nama;
    string namaBidang;
    string namaPartai;

public:
    // Deklarasi fungsi masukanData
    void masukanData(Anggota *p, int n)
    {
        // Meminta pengguna untuk melakukan pemasukan data
        cout << "Masukkan ID: ";
        cin >> p[n].dataId;
        cout << "Masukkan Nama: ";
        cin >> p[n].nama;
        cout << "Masukkan Nama Bidang: ";
        cin >> p[n].namaBidang;
        cout << "Masukkan Nama Partai: ";
        cin >> p[n].namaPartai;
        cout << "DATA BERHASIL DIMASUKAN !!";
        n++;
    }

    // Deklarasi fungsi getId
    int getId()
    {
        // Mengembalikan nilai dataId
        return this->dataId;
    }

    // Deklarasi fungsi getNama
    string getNama()
    {
        // Mengembalikan nilai nama
        return this->nama;
    }

    // Deklarasi fungsi getNamaBidang
    string getNamaBidang()
    {
        // Mengembalikan nilai namaBidang
        return this->namaBidang;
    }

    // Deklarasi fungsi getNamaPartai
    string getNamaPartai()
    {
        // Mengembalikan nilai namaPartai
        return this->namaPartai;
    }

    // Deklarasi fungsi mengubahData
    void mengubahData(Anggota *p, int idAnggota, int n)
    {
        int ch1;
        int i;
        // Melakukan iterasi untuk mencari anggota dengan idAnggota
        for (i = 0; i < n; i++)
        {
            if (p[i].dataId == idAnggota)
            {
                // Meminta pengguna untuk memasukkan data baru
                cout << "Masukkan Nama yang di Ubah: ";
                cin >> p[i].nama;
                cout << "Masukkan Nama Bidang yang di Ubah: ";
                cin >> p[i].namaBidang;
                cout << "Masukkan Nama Partai yang di Ubah: ";
                cin >> p[i].namaPartai;
                cout << "Data Berhasil di Update\n";
            }
        }
    }

    // Deklarasi fungsi menghapusData
    void menghapusData(Anggota *p, int n, int idAnggota)
    {
        int j = 0;
        int k;
        int flag = 0;
        // Melakukan iterasi untuk mencari anggota dengan idAnggota
        for (j = 0; j < n; j++)
        {
            if (p[j].dataId == idAnggota)
            {
                flag = 1;
                // Menghapus data anggota
                p[j].dataId = 0;
                p[j].nama = "";
                p[j].namaBidang = "";
                p[j].namaPartai = "";
                break;
            }
        }
        // Menampilkan pesan berdasarkan hasil operasi
        if (flag == 1) // Kondisi jika flag adalah 1, maka akan menjalankan kondisi dibawah ini
        {
            cout << "\nData Berhasil di Hapus\n";
        }
        else // Kondisi jika flag bukan 1, maka akan menjalankan kondisi dibawah ini
        {
            cout << "\nData Tidak Ditemukan\n";
        }
    }
};
