

    override suspend fun hapusSatuSiswa(id: Long) {
        val docQuery = collection.whereEqualTo("id", id).get().await()
        val docId = docQuery.documents.firstOrNull()?.id ?: return
        collection.document(docId).delete().await()
    }
}

