package polymorphism

class Mahasiswa : Orang() {
    var nim: String = ""
    var prodi: String = ""

    fun belajar() {
        println("Saya belajar di prodi $prodi")
    }

    override fun perkenalan() {
        println("Kenalin dong, aku $nama, dari $alamat")
    }
}