package inheritance

open class Orang {
    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    fun perkenalan() {
        println("Halo, nama saya $nama, alamat saya di $alamat")
    }
}