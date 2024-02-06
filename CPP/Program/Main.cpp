/*
Saya Raditya Adha Rahman mengerjakan LP1 dalam mata kuliah
DPBO untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include <bits/stdc++.h>
#include "Anggota.cpp"

using namespace std;

int main()
{
    Anggota orang[10];
    int i = 0, ch, j, idAnggota;
    while (1)
    {
        cout << "\nSelamat Datang di Informasi Anggota DPR";
        cout << "\nSilahkan pilihlah opsi untuk melakukan aksi";
        cout << "\n";
        cout << "\n 1. Masukan Data Anggota DPR";
        cout << "\n 2. Menghapus Data Anggota DPR";
        cout << "\n 3. Melakukan Update Data Anggota DPR";
        cout << "\n 4. Menampilkan Anggota DPR";
        cout << "\n 5. Keluar";
        cout << "\n";
        cin >> ch;
        switch (ch)
        {
        case 1:
            orang[0].masukanData(orang, i);
            break;
        case 2:
            cout << "Masukan ID yang akan di Hapus :";
            cin >> idAnggota;
            orang[0].menghapusData(orang, 10, idAnggota);
            break;
        case 3:
            cout << "Masukan ID yang akan di Update :";
            cin >> idAnggota;
            orang[0].mengubahData(orang, idAnggota, i);
            break;
        case 4:
            cout << "Anggota DPR";
            for (i = 0; i < 10; i++)
            {
                if (orang[i].getNama() != "")
                {
                    cout << "\n" << orang[i].getNama() <<" " << orang[i].getNamaBidang() << " " << orang[i].getNamaPartai() << "\n";
                } 
            }
            break;
        default:
            cout << "Salah, Silahkan masukan inputan sesuai dengan opsi yang tertera";
            break;
        case 5:
            exit(0);
        }
    }
    return 0;
}