

    override suspend fun editSatuSiswa(id: Long, siswa: Siswa) {
        val docQuery = collection.whereEqualTo("id", id).get().await()
        val docId = docQuery.documents.firstOrNull()?.id ?: return
        collection.document(docId).set(
            mapOf(
                "id" to siswa.id,
                "nama" to siswa.nama,
                "alamat" to siswa.alamat,
                "telpon" to siswa.telpon
            )
        ).await()
    }

