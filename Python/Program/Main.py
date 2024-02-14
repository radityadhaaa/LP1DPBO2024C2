# Mengimpor kelas Anggota
from Anggota import Anggota

# Membuat daftar 'orang' dengan 10 objek Anggota
orang = [Anggota() for _ in range(10)]
i = 0

# Mulai loop utama
while True:
    # Menampilkan menu utama
    print("\nSelamat Datang di Informasi Anggota DPR")
    print("Silahkan pilihlah opsi untuk melakukan aksi\n")
    print("1. Masukan Data Anggota DPR")
    print("2. Menghapus Data Anggota DPR")
    print("3. Melakukan Update Data Anggota DPR")
    print("4. Menampilkan Anggota DPR")
    print("5. Keluar\n")

    # Menerima input dari pengguna
    ch = int(input())

    # Jika pengguna memilih opsi 1
    if ch == 1:
        # Meminta pengguna untuk memasukkan data anggota DPR
        print("Masukan Data Anggota DPR:")
        orang[i].masukan_data(orang, i)
        i += 1
    # Jika pengguna memilih opsi 2
    elif ch == 2:
        # Meminta ID anggota yang akan dihapus
        id_anggota = input("Masukan ID yang akan di Hapus: ")
        # Mencari anggota dengan ID yang sesuai
        for j in range(i):
            if orang[j].get_id() == id_anggota:
                # Menghapus data anggota
                orang[j].menghapus_data(orang, 10, id_anggota)
                break
    # Jika pengguna memilih opsi 3
    elif ch == 3:
        # Meminta ID anggota yang akan diperbarui
        id_anggota = input("Masukan ID yang akan di Update: ")
        # Mencari anggota dengan ID yang sesuai
        for j in range(i):
            if orang[j].get_id() == id_anggota:
                # Memperbarui data anggota
                orang[j].mengubah_data(orang, id_anggota, i)
                break
    # Jika pengguna memilih opsi 4
    elif ch == 4:
        # Menampilkan semua anggota DPR
        print("Anggota DPR")
        print("+==========================================================+")
        print("| ID    | NAMA           | NAMA BIDANG     | NAMA PARTAI   |")
        # Iterasi melalui setiap anggota
        for j in range(i):
            # Jika nama anggota tidak kosong
            if orang[j].get_nama() != "":
                # Menampilkan detail anggota
                print("+==========================================================+")
                print(f"| {orang[j].get_id():<5} | {orang[j].get_nama():<14} | {orang[j].get_nama_bidang():<15} | {orang[j].get_nama_partai():<13} |")
        print("+==========================================================+")
    # Jika pengguna memilih opsi 5
    elif ch == 5:
        # Keluar dari loop
        break
    # Jika pengguna memilih opsi lain
    else:
        # Menampilkan pesan kesalahan
        print("Salah, Silahkan masukan inputan sesuai dengan opsi yang tertera")
