# Addres Resolution Protocol


## M. Rizqi R 20051204034 TIB

### Definisi
<p>Sebuah protokol dalam TCP/IP Protocol Suite yang bertanggung jawab 
dalam melakukan resolusi alamat IP ke dalam alamat Media Access Cotrol (MAC Addres)</p>

<p>Protokol ini bertugas untuk menemukan MAC Address suatu host dengan alamat IP tertentu</p>

### Cara Kerja ARP
<ul>
<li><p>Jika suatu host ingin berkomunikasi ke IP host tertentu, 
computer sumber akan melakukan pengecekan nomor MAC dari computer tujuan di Tabel ARP</p></li>
<li><p>Jika di tabel ARP tidak ditemukan, ARP akan melakukan pengiriman berupa pesan 
yang sifatnya broadcast. Isi dari pesan berupa permintaan MAC Address dari suatu
host dengan berdasarkan alamat IP yang dimiliki oleh setiap host.
Pesan tersebut dikirim secara menyeluruh ke semua host yang tersambung dalam
jaringan</p></li>
<li><p>Setelah pesan yang dikirimkan ARP sampai ke host tujuan, maka
host tersebut akan membalas pesan yang berisi alamat fisik atau
MAC Address yang sesuai dengan alamat IP yang diminta</p></li>
</ul> 
