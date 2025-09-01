# Praktikum PBO - Modul 1 (Class & Method)

## Nama,NIM, Kelas
- Nama: Ammar Arifin
- NIM: 09040624081
- Kelas: H7A.3

---

## Tujuan
1. Memahami konsep **class** dalam PBO.
2. Menggunakan atribut dan method di dalam class.
3. Mengetahui perbedaan method `void` dan method `return`.
4. Memahami interaksi method dengan atribut class.
5. Menerapkan prinsip **SOLID** sederhana dalam program.
6. Melakukan analisa hasil compile dari method `void` dan `return`.

---

## Jawaban Tugas

### 1. Apa yang dimaksud dengan kelas dalam PBO?
Kelas adalah **cetak biru (blueprint)** untuk membuat objek.  
Kelas berisi **atribut (data)** dan **method (fungsi/perilaku)**.  
Objek adalah hasil nyata yang dibuat dari kelas tersebut.

---

### 2. Bagaimana cara kerja atribut dan method dalam kelas?
- **Atribut** menyimpan informasi dalam objek.  
- **Method** memberi perilaku pada objek, bisa membaca atau mengubah atribut.  
Contoh: mobil punya atribut `merk`, `kecepatan`, dan method `jalan()`.

---

### 3. Apa perbedaan antara method yang mengembalikan nilai dan yang tidak?
- **Method void**: tidak mengembalikan nilai, hanya mengeksekusi perintah.  
- **Method return**: mengembalikan hasil dengan `return`, sehingga bisa digunakan dalam perhitungan atau disimpan ke variabel.

---

### 4. Bagaimana method berinteraksi dengan atribut dalam kelas?
Method dapat **membaca** maupun **mengubah** nilai atribut.  
Jika atribut bersifat `private`, maka digunakan **getter** untuk membaca dan **setter** untuk mengubah.

---

### 5. Pada percobaan 1, definisikan bagian kode program sesuai prinsip SOLID.
Kode ada di file: [Soal5_SOLID.java](src/Soal5_SOLID.java)  

- **SRP (Single Responsibility):** Class `Anjing` hanya fokus pada perilaku anjing.  
- **OCP (Open-Closed):** Bisa menambah hewan baru tanpa mengubah class dasar.  
- **LSP (Liskov Substitution):** Subclass `Kucing` bisa menggantikan `Hewan`.  
- **ISP (Interface Segregation):** Interface `Hewan` hanya berisi method spesifik.  
- **DIP (Dependency Inversion):** Class `Pemilik` bergantung pada `Hewan` (abstraksi), bukan implementasi langsung.

---

### 6. Compile program pada percobaan 2 dan 3 dan lakukan analisa anda.
Kode ada di file: [Soal6_Analisa.java](src/Soal6_Analisa.java)  

- **Percobaan 2 (void method):** hanya menampilkan teks, hasil tidak bisa dipakai ulang.  
- **Percobaan 3 (return method):** menghasilkan nilai, sehingga bisa disimpan atau digunakan dalam operasi lain.  
