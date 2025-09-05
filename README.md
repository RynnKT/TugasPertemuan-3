# Praktikum PBO - Abstract Class, Interface, Overload & Override

## 1) Abstract Class
### Pengertian
Abstract class bisa dibilang sebagai “rancangan umum” untuk class lain. Abstract class sendiri tidak bisa langsung dipakai buat objek, tapi dipakai sebagai dasar supaya class turunannya punya aturan yang sama. 
Di dalam abstract class bisa ada:
- variabel/atribut
- method biasa (sudah ada isi)
- method abstract (belum ada isi)

Class turunan wajib ngisi (override) method abstract itu sesuai kebutuhannya.

### Contoh
Di praktikum ini ada abstract class `Kendaraan`, `Motor`, dan `Sportbike`. 
Lalu ada class `R15` yang jadi class konkret dan mengisi method dari abstract class tadi.

## 2) Interface Class
### Pengertian
Interface adalah kumpulan method tanpa isi (cuma deklarasi). Kalau sebuah class mengimplementasikan interface, maka class itu wajib ngisi semua method di dalamnya. 
Interface dipakai sebagai kontrak supaya beberapa class berbeda punya perilaku yang sama.

### Contoh
Di praktikum ini dibuat interface `Mengajar`, `Hobi`, dan `iburumahtangga`. 
Lalu ada satu class `Ibu` yang mengimplementasikan ketiga interface tersebut.

## 3) Overload & Override
### Pengertian
- **Override** adalah menimpa method dari class induk di class turunan dengan implementasi baru.
- **Overload** adalah membuat beberapa method dengan nama sama, tapi parameternya berbeda (jumlah atau tipe).

---

## Penutup
Praktikum ini menunjukkan bagaimana abstract class, interface, overload, dan override dipakai untuk bikin program yang lebih terstruktur, fleksibel, dan mudah dikembangkan.
