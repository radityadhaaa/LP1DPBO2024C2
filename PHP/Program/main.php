<?php

class Anggota { // Mendeklarasikan kelas Anggota
    private $dataId; // Mendeklarasikan variabel dataId dengan tipe data private
    private $nama; // Mendeklarasikan variabel nama dengan tipe data private
    private $namaBidang; // Mendeklarasikan variabel namaBidang dengan tipe data private
    private $namaPartai; // Mendeklarasikan variabel namaPartai dengan tipe data private
    private static $scanner; // Mendeklarasikan variabel scanner dengan tipe data private dan static
    private $foto; // Mendeklarasikan variabel foto dengan tipe data private

    public function __construct($dataId, $nama, $namaBidang, $namaPartai, $foto) { // Konstruktor kelas Anggota
        $this->dataId = $dataId; // Menginisialisasi variabel dataId
        $this->nama = $nama; // Menginisialisasi variabel nama
        $this->namaBidang = $namaBidang; // Menginisialisasi variabel namaBidang
        $this->namaPartai = $namaPartai; // Menginisialisasi variabel namaPartai
        $this->foto = $foto; // Menginisialisasi variabel foto
    }

    public function getId() { // Metode untuk mendapatkan ID anggota
        return $this->dataId; // Mengembalikan nilai dari variabel dataId
    }

    public function getNama() { // Metode untuk mendapatkan nama anggota
        return $this->nama; // Mengembalikan nilai dari variabel nama
    }

    public function getNamaBidang() { // Metode untuk mendapatkan nama bidang anggota
        return $this->namaBidang; // Mengembalikan nilai dari variabel namaBidang
    }

    public function getNamaPartai() { // Metode untuk mendapatkan nama partai anggota
        return $this->namaPartai; // Mengembalikan nilai dari variabel namaPartai
    }

    public function getFoto() { // Metode untuk mendapatkan foto anggota
        return $this->foto; // Mengembalikan nilai dari variabel foto
    }

    
    public function mengubahData($dataId, $nama, $namaBidang, $namaPartai, $foto) { // Metode untuk mengubah data anggota
        $this->dataId = $dataId; // Mengubah nilai dari variabel dataId
        $this->nama = $nama; // Mengubah nilai dari variabel nama
        $this->namaBidang = $namaBidang; // Mengubah nilai dari variabel namaBidang
        $this->namaPartai = $namaPartai; // Mengubah nilai dari variabel namaPartai
        $this->foto = $foto; // Mengubah nilai dari variabel foto
    }

    public function menghapusData() { // Metode untuk menghapus data anggota
        $this->dataId = 0; // Mengatur dataId menjadi 0
        $this->nama = ""; // Mengatur nama menjadi string kosong
        $this->namaBidang = ""; // Mengatur namaBidang menjadi string kosong
        $this->namaPartai = ""; // Mengatur namaPartai menjadi string kosong
        $this->foto = ""; // Mengatur foto menjadi string kosong
    }
}

$orang = array(); // Membuat array baru
$orang[] = new Anggota(1, "Yuyun", "Olahraga", "Golkar", "yuyungolkar.png"); // Menambahkan objek Anggota baru ke dalam array
$orang[] = new Anggota(2, "Bambang", "Humas", "Golkar", "yuyungolkar.png"); // Menambahkan objek Anggota baru ke dalam array
$orang[] = new Anggota(3, "Jejang", "Rohani", "Golkar", "yuyungolkar.png"); // Menambahkan objek Anggota baru ke dalam array

$orang[1]->mengubahData(3, "Jejang", "Rohani", "Golkar", "yuyungolkar.png"); // Mengubah data anggota kedua

$orang[1]->menghapusData(); // Menghapus data anggota kedua
unset($orang[1]); // Menghapus anggota kedua dari array
$orang = array_values($orang); // Mengatur ulang indeks array

echo "<table border='1'>"; // Membuat tabel dengan border 1
echo "<tr>"; // Membuat baris baru
echo "<th>ID</th>"; // Membuat kolom header dengan teks "ID"
echo "<th>Nama</th>"; // Membuat kolom header dengan teks "Nama"
echo "<th>Nama Bidang</th>"; // Membuat kolom header dengan teks "Nama Bidang"
echo "<th>Nama Partai</th>"; // Membuat kolom header dengan teks "Nama Partai"
echo "<th>Foto</th>"; // Membuat kolom header dengan teks "Foto"
echo "</tr>"; // Menutup baris

foreach ($orang as $o) { // Looping melalui setiap anggota dalam array
    echo "<tr>"; // Membuat baris baru
    echo "<td>" . $o->getId() . "</td>"; // Menampilkan ID anggota
    echo "<td>" . $o->getNama() . "</td>"; // Mencetak nama anggota
    echo "<td>" . $o->getNamaBidang() . "</td>"; // Mencetak nama bidang anggota
    echo "<td>" . $o->getNamaPartai() . "</td>"; // Mencetak nama partai anggota
    echo "<td><img src='" . $o->getFoto() . "' alt='Foto'></td>"; // Mencetak foto anggota
    echo "</tr>"; // Menutup baris
}

echo "</table>"; // Menutup tabel

?>

