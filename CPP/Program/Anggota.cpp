/*
Saya Raditya Adha Rahman mengerjakan LP1 dalam mata kuliah
DPBO untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include <iostream>
#include <string>
#include <stdlib.h>

using namespace std;

class Anggota
{
private:
    int dataId;
    string nama;
    string namaBidang;
    string namaPartai;

public:
    void masukanData(Anggota *p, int n)
    {
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

    int getId()
    {
        return this->dataId;
    }

    string getNama()
    {
        return this->nama;
    }

    string getNamaBidang()
    {
        return this->namaBidang;
    }

    string getNamaPartai()
    {
        return this->namaPartai;
    }

    void mengubahData(Anggota *p, int idAnggota, int n)
    {
        int ch1;
        int i;
        for (i = 0; i < n; i++)
        {
            if (p[i].dataId == idAnggota)
            {
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

    void menghapusData(Anggota *p, int n, int idAnggota)
    {
        int j = 0;
        int k;
        int flag = 0;
        for (j = 0; j < n; j++)
        {
            if (p[j].dataId == idAnggota)
            {
                flag = 1;
                p[j].dataId = 0;
                p[j].nama = "";
                p[j].namaBidang = "";
                p[j].namaPartai = "";
                break;
            }
        }
        if (flag == 1)
        {
            cout << "\nData Berhasil di Hapus\n";
        }
        else
        {
            cout << "\nData Tidak Ditemukan\n";
        }
    }
};