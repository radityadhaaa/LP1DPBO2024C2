import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

public class Main { // Mendeklarasikan kelas Main
    public static void main(String[] args) { // Metode utama yang akan dijalankan oleh JVM
        Anggota[] orang = new Anggota[10]; // Membuat array dari objek Anggota dengan ukuran 10
        int i = 0, ch, idAnggota; // Mendeklarasikan dan menginisialisasi variabel i, ch, dan idAnggota
        Scanner scanner = new Scanner(System.in); // Membuat objek scanner baru untuk membaca input dari pengguna

        while (true) { // Looping selamanya sampai program dihentikan
            System.out.println("\nSelamat Datang di Informasi Anggota DPR"); // Menampilkan pesan selamat datang
            System.out.println("Silahkan pilihlah opsi untuk melakukan aksi"); // Menampilkan instruksi untuk memilih
                                                                               // opsi
            System.out.println(); // Mencetak baris kosong
            System.out.println("1. Masukan Data Anggota DPR"); // Menampilkan opsi 1
            System.out.println("2. Menghapus Data Anggota DPR"); // Menampilkan opsi 2
            System.out.println("3. Melakukan Update Data Anggota DPR"); // Menampilkan opsi 3
            System.out.println("4. Menampilkan Anggota DPR"); // Menampilkan opsi 4
            System.out.println("5. Keluar"); // Menampilkan opsi 5
            System.out.println(); // Mencetak baris kosong

            ch = scanner.nextInt(); // Membaca pilihan pengguna
            scanner.nextLine(); // Mengkonsumsi baris baru yang tersisa

            switch (ch) { // Menggunakan switch untuk mengecek pilihan pengguna
                case 1: // Jika pengguna memilih opsi 1
                    orang[i] = new Anggota(); // Membuat objek Anggota baru
                    orang[i].masukanData(orang, i); // Memanggil metode masukanData untuk memasukkan data anggota
                    i++; // Menambahkan nilai i sebanyak 1
                    break; // Menghentikan eksekusi dan keluar dari switch
                case 2: // Jika pengguna memilih opsi 2
                    System.out.print("Masukan ID yang akan di Hapus: "); // Meminta pengguna untuk memasukkan ID yang
                                                                         // akan dihapus
                    idAnggota = scanner.nextInt(); // Menyimpan ID yang dimasukkan pengguna ke dalam variabel idAnggota
                    for (int j = 0; j < i; j++) { // Looping melalui setiap anggota
                        if (orang[j].getId() == idAnggota) { // Jika ID anggota cocok dengan ID yang diberikan
                            orang[j].menghapusData(orang, 10, idAnggota); // Memanggil metode menghapusData untuk
                                                                          // menghapus data anggota
                            break; // Menghentikan eksekusi dan keluar dari loop
                        }
                    }
                    break; // Menghentikan eksekusi dan keluar dari switch
                case 3: // Jika pengguna memilih opsi 3
                    System.out.print("Masukan ID yang akan di Update: "); // Meminta pengguna untuk memasukkan ID yang
                                                                          // akan diperbarui
                    idAnggota = scanner.nextInt(); // Menyimpan ID yang dimasukkan pengguna ke dalam variabel idAnggota
                    for (int j = 0; j < i; j++) { // Looping melalui setiap anggota
                        if (orang[j].getId() == idAnggota) { // Jika ID anggota cocok dengan ID yang diberikan
                            orang[j].mengubahData(orang, idAnggota, i); // Memanggil metode mengubahData untuk
                                                                        // memperbarui data anggota
                            break; // Menghentikan eksekusi dan keluar dari loop
                        }
                    }
                    break; // Menghentikan eksekusi dan keluar dari switch
                case 4: // Jika pengguna memilih opsi 4
                    System.out.println("Anggota DPR"); // Menampilkan judul tabel
                    System.out.print("+"); // Mencetak simbol +
                    for (int k = 0; k < 7 + 15 + 15 + 15 + 3; k++) { // Looping sebanyak jumlah total karakter dalam
                                                                     // satu baris tabel
                        System.out.print("="); // Mencetak simbol =
                    }
                    System.out.println("+"); // Mencetak simbol + dan baris baru
                    System.out.print("| ID    | "); // Mencetak judul kolom ID
                    System.out.print("NAMA"); // Mencetak judul kolom NAMA
                    for (int k = 0; k < 9; k++) { // Looping sebanyak 9 kali
                        System.out.print(" "); // Mencetak spasi
                    }
                    System.out.print(" | NAMA BIDANG   | "); // Mencetak judul kolom NAMA BIDANG
                    System.out.println("NAMA PARTAI   |"); // Mencetak judul kolom NAMA PARTAI dan baris baru

                    for (int j = 0; j < i; j++) { // Looping melalui setiap anggota
                        if (!orang[j].getNama().equals("")) { // Jika nama anggota tidak kosong
                            System.out.print("+"); // Mencetak simbol +
                            for (int k = 0; k < 7 + 15 + 15 + 15 + 3; k++) { // Looping sebanyak jumlah total karakter
                                                                             // dalam satu baris tabel
                                System.out.print("="); // Mencetak simbol =
                            }
                            System.out.println("+"); // Mencetak simbol + dan baris baru
                            System.out.print("| " + orang[j].getId()); // Mencetak ID anggota
                            String convert = Integer.toString(orang[j].getId()); // Mengubah ID anggota menjadi string
                            for (int k = 0; k < 5 - convert.length(); k++) { // Looping sebanyak selisih antara 5 dan
                                                                             // panjang string ID
                                System.out.print(" "); // Mencetak spasi
                            }
                            System.out.print(" | "); // Mencetak simbol | dan spasi
                            System.out.print(orang[j].getNama()); // Mencetak nama anggota

                            for (int k = 0; k < 13 - orang[j].getNama().length(); k++) { // Looping sebanyak selisih
                                                                                         // antara 13 dan panjang string
                                                                                         // nama
                                System.out.print(" "); // Mencetak spasi
                            }
                            System.out.print(" | "); // Mencetak simbol | dan spasi
                            System.out.print(orang[j].getNamaBidang()); // Mencetak nama bidang anggota
                            for (int k = 0; k < 13 - orang[j].getNamaBidang().length(); k++) { // Looping sebanyak
                                                                                               // selisih antara 13 dan
                                                                                               // panjang string nama
                                                                                               // bidang
                                System.out.print(" "); // Mencetak spasi
                            }
                            System.out.print(" | "); // Mencetak simbol | dan spasi
                            System.out.print(orang[j].getNamaPartai()); // Mencetak nama partai anggota
                            for (int k = 0; k < 13 - orang[j].getNamaPartai().length(); k++) { // Looping sebanyak
                                                                                               // selisih antara 13 dan
                                                                                               // panjang string nama
                                                                                               // partai
                                System.out.print(" "); // Mencetak spasi
                            }
                            System.out.println(" |"); // Mencetak simbol | dan baris baru
                        }
                    }

                    System.out.print("+"); // Mencetak simbol +
                    for (int k = 0; k < 7 + 15 + 15 + 15 + 3; k++) { // Looping sebanyak jumlah total karakter dalam
                                                                     // satu baris tabel
                        System.out.print("="); // Mencetak simbol =
                    }
                    System.out.println("+"); // Mencetak simbol + dan baris baru
                    break; // Menghentikan eksekusi dan keluar dari switch
                case 5: // Jika pengguna memilih opsi 5
                    System.exit(0); // Menghentikan eksekusi program
                default: // Jika pengguna memilih opsi lain selain 1-5
                    System.out.println("Salah, Silahkan masukan inputan sesuai dengan opsi yang tertera"); // Menampilkan
                                                                                                           // pesan
                                                                                                           // kesalahan
                    break; // Menghentikan eksekusi dan keluar dari switch
            }
        }
    }
}