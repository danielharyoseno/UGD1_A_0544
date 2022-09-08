package com.example.ugd3.entitiy

class Dummy(var nama:String, var sisaWaktu:String, var jenis :String) {
    companion object{
    @JvmField
    var listOfDummy = arrayOf(
        Dummy("Donasi bantuan gempa di ambon","Sisa 3 hari","Donasi Jenis Bencana Alam"),
        Dummy("Donasi bantuan tsunami di aceh","Sisa 4 hari","Donasi Jenis Bencana Alam"),
        Dummy("Donasi bantuan banjir di kalimantan","Sisa 10 hari","Donasi Jenis Bencana Alam"),
        Dummy("Donasi bantuan gempa di jawa","Sisa 2 hari","Donasi Jenis Bencana Alam"),
        Dummy("Donasi pelestarian alam","Sisa 3 hari","Donasi Pelestarian"),
        Dummy("Donasi Pengentasan Kemiskinan","Sisa 20 hari","Donasi Masyarakat"),
        Dummy("Donasi Go Green","Sisa 4 hari","Donasi Pelestarian"),
        Dummy("Donasi Fasilitas Pendidikan","Sisa 3 hari","Donasi Masyarakat"),
        Dummy("Donasi bantuan erupsi gunung semeru","Sisa 3 hari","Donasi Jenis Bencana Alam"),
        Dummy("Donasi bantuan gempa di sulawesi","Sisa 3 hari","Donasi Jenis Bencana Alam"),

        )
    }
}