import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

public class Anggota { // Mendeklarasikan kelas Anggota
    private int dataId; // Mendeklarasikan variabel dataId dengan tipe data integer
    private String nama; // Mendeklarasikan variabel nama dengan tipe data String
    private String namaBidang; // Mendeklarasikan variabel namaBidang dengan tipe data String
    private String namaPartai; // Mendeklarasikan variabel namaPartai dengan tipe data String
    private static Scanner scanner = new Scanner(System.in); // Membuat objek scanner baru untuk membaca input dari pengguna

    public void masukanData(Anggota[] p, int n) { // Metode untuk memasukkan data anggota
        System.out.print("Masukkan ID: "); // Meminta pengguna untuk memasukkan ID
        p[n].dataId = scanner.nextInt(); // Menyimpan ID yang dimasukkan pengguna ke dalam variabel dataId
        scanner.nextLine(); // Mengkonsumsi baris baru yang tersisa
        System.out.print("Masukkan Nama: "); // Meminta pengguna untuk memasukkan nama
        p[n].nama = scanner.nextLine(); // Menyimpan nama yang dimasukkan pengguna ke dalam variabel nama
        System.out.print("Masukkan Nama Bidang: "); // Meminta pengguna untuk memasukkan nama bidang
        p[n].namaBidang = scanner.nextLine(); // Menyimpan nama bidang yang dimasukkan pengguna ke dalam variabel namaBidang
        System.out.print("Masukkan Nama Partai: "); // Meminta pengguna untuk memasukkan nama partai
        p[n].namaPartai = scanner.nextLine(); // Menyimpan nama partai yang dimasukkan pengguna ke dalam variabel namaPartai
        System.out.println("DATA BERHASIL DIMASUKAN !!"); // Menampilkan pesan bahwa data berhasil dimasukkan
    }

    public int getId() { // Metode untuk mendapatkan ID anggota
        return this.dataId; // Mengembalikan nilai dari variabel dataId
    }

    public String getNama() { // Metode untuk mendapatkan nama anggota
        return this.nama; // Mengembalikan nilai dari variabel nama
    }

    public String getNamaBidang() { // Metode untuk mendapatkan nama bidang anggota
        return this.namaBidang; // Mengembalikan nilai dari variabel namaBidang
    }

    public String getNamaPartai() { // Metode untuk mendapatkan nama partai anggota
        return this.namaPartai; // Mengembalikan nilai dari variabel namaPartai
    }

    public void mengubahData(Anggota[] p, int idAnggota, int n) { // Metode untuk mengubah data anggota
        for (int i = 0; i < n; i++) { // Looping melalui setiap anggota
            if (p[i].dataId == idAnggota) { // Jika ID anggota cocok dengan ID yang diberikan
                System.out.print("Masukkan Nama yang di Ubah: "); // Meminta pengguna untuk memasukkan nama baru
                p[i].nama = scanner.nextLine(); // Menyimpan nama baru yang dimasukkan pengguna ke dalam variabel nama
                System.out.print("Masukkan Nama Bidang yang di Ubah: "); // Meminta pengguna untuk memasukkan nama bidang baru
                p[i].namaBidang = scanner.nextLine(); // Menyimpan nama bidang baru yang dimasukkan pengguna ke dalam variabel namaBidang
                System.out.print("Masukkan Nama Partai yang di Ubah: "); // Meminta pengguna untuk memasukkan nama partai baru
                p[i].namaPartai = scanner.nextLine(); // Menyimpan nama partai baru yang dimasukkan pengguna ke dalam variabel namaPartai
                System.out.println("Data Berhasil di Update"); // Menampilkan pesan bahwa data berhasil diperbarui
            }
        }
    }

    public void menghapusData(Anggota[] p, int n, int idAnggota) { // Metode untuk menghapus data anggota
        int flag = 0; // Mendeklarasikan dan menginisialisasi variabel flag
        for (int j = 0; j < n; j++) { // Looping melalui setiap anggota
            if (p[j].dataId == idAnggota) { // Jika ID anggota cocok dengan ID yang diberikan
                flag = 1; // Mengatur flag menjadi 1
                p[j].dataId = 0; // Mengatur dataId menjadi 0
                p[j].nama = ""; // Mengatur nama menjadi string kosong
                p[j].namaBidang = ""; // Mengatur namaBidang menjadi string kosong
                p[j].namaPartai = ""; // Mengatur namaPartai menjadi string kosong
                break; // Keluar dari loop
            }
        }
        if (flag == 1) { // Jika flag adalah 1
            System.out.println("\nData Berhasil di Hapus"); // Menampilkan pesan bahwa data berhasil dihapus
        } else { // Jika flag bukan 1
            System.out.println("\nData Tidak Ditemukan"); // Menampilkan pesan bahwa data tidak ditemukan
        }
    }
}
