package com.example.ugd3.entitiy

class Home(var nama:String, var sisaWaktu:String, var jenis :String) {
    companion object{
    @JvmField
    var listOfHome = arrayOf(
        Home("Donasi bantuan gempa di ambon","Sisa 3 hari","Donasi Jenis Bencana Alam"),
        Home("Donasi bantuan tsunami di aceh","Sisa 4 hari","Donasi Jenis Bencana Alam"),
        Home("Donasi bantuan banjir di kalimantan","Sisa 10 hari","Donasi Jenis Bencana Alam"),
        Home("Donasi bantuan gempa di jawa","Sisa 2 hari","Donasi Jenis Bencana Alam"),
        Home("Donasi pelestarian alam","Sisa 3 hari","Donasi Pelestarian"),
        Home("Donasi Pengentasan Kemiskinan","Sisa 20 hari","Donasi Masyarakat"),
        Home("Donasi Go Green","Sisa 4 hari","Donasi Pelestarian"),
        Home("Donasi Fasilitas Pendidikan","Sisa 3 hari","Donasi Masyarakat"),
        Home("Donasi bantuan erupsi gunung semeru","Sisa 3 hari","Donasi Jenis Bencana Alam"),
        Home("Donasi bantuan gempa di sulawesi","Sisa 3 hari","Donasi Jenis Bencana Alam"),

        )
    }
}