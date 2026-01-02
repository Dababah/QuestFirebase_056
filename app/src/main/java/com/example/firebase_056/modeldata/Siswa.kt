

data class DetailSiswa(
    val id: Long = 0,
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = ""
)

fun DetailSiswa.toDataSiswa(): Siswa = Siswa(id, nama, alamat, telpon)
fun Siswa.toDetailSiswa(): DetailSiswa = DetailSiswa(id, nama, alamat, telpon)

