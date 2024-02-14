class Anggota: # Mendeklarasikan kelas Anggota
    def __init__(self): # Konstruktor kelas Anggota
        self.id = "" # Mendeklarasikan variabel id dengan nilai awal string kosong
        self.nama = "" # Mendeklarasikan variabel nama dengan nilai awal string kosong
        self.nama_bidang = "" # Mendeklarasikan variabel nama_bidang dengan nilai awal string kosong
        self.nama_partai = "" # Mendeklarasikan variabel nama_partai dengan nilai awal string kosong

    def masukan_data(self, orang, idx): # Metode untuk memasukkan data anggota
        self.id = input("ID Anggota: ") # Meminta pengguna untuk memasukkan ID anggota
        self.nama = input("Nama: ") # Meminta pengguna untuk memasukkan nama anggota
        self.nama_bidang = input("Nama Bidang: ") # Meminta pengguna untuk memasukkan nama bidang anggota
        self.nama_partai = input("Nama Partai: ") # Meminta pengguna untuk memasukkan nama partai anggota

    def menghapus_data(self, orang, n, id_anggota): # Metode untuk menghapus data anggota
        for j in range(n): # Looping melalui setiap anggota
            if orang[j].id == id_anggota: # Jika ID anggota cocok dengan ID yang diberikan
                orang[j] = Anggota() # Mengganti anggota dengan objek Anggota baru
                break # Menghentikan eksekusi dan keluar dari loop

    def mengubah_data(self, orang, id_anggota, n): # Metode untuk mengubah data anggota
        for j in range(n): # Looping melalui setiap anggota
            if orang[j].id == id_anggota: # Jika ID anggota cocok dengan ID yang diberikan
                print("Masukan Data Baru:") # Meminta pengguna untuk memasukkan data baru
                orang[j].masukan_data(orang, j) # Memanggil metode masukan_data untuk memasukkan data baru
                break # Menghentikan eksekusi dan keluar dari loop

    def get_id(self): # Metode untuk mendapatkan ID anggota
        return self.id # Mengembalikan nilai dari variabel id

    def get_nama(self): # Metode untuk mendapatkan nama anggota
        return self.nama # Mengembalikan nilai dari variabel nama

    def get_nama_bidang(self): # Metode untuk mendapatkan nama bidang anggota
        return self.nama_bidang # Mengembalikan nilai dari variabel nama_bidang

    def get_nama_partai(self): # Metode untuk mendapatkan nama partai anggota
        return self.nama_partai # Mengembalikan nilai dari variabel nama_partai