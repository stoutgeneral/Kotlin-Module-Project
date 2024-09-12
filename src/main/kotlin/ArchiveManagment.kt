class ArchiveManagment {
    private val archives = mutableListOf<Archive>()

    fun addArchive (archive: Archive) {
        archives.add(archive)
    }

    fun getArhive (): List<Archive> {
        return archives.toList()
    }
}