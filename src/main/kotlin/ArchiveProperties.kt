class ArchiveProperties {
     val archiveList: MutableList<Archive> = mutableListOf()

    fun createArchive () {
        while (true) {
            println("Введите название:")
            val name = readln()

            if (!name.isNullOrBlank()) {
                archiveList.add(Archive(archiveName = name))
                println("Архив успешно создан\n")
                break
            } else {
                println(Notification.ARCHIVE_NOTE_ENTRY_ERROR)
            }
        }
    }

    fun showArchiveNames () {
        println("Список созданных архивов: ")
        for (archive in archiveList) {
            println("${archive.archiveName}")
        }

    }
}