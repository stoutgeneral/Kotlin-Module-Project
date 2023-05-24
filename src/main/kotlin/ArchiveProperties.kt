class ArchiveProperties : EntityProperties {
    val archiveList: MutableList<Archive> = mutableListOf()

    override fun createEntity() {
        while (true) {
            println("\nВведите название архива:")
            val name = readLine()

            if (name?.isNotBlank() == true) {
                archiveList.add(Archive(archiveName = name))
                println("\nАрхив успешно создан!\n")
                break
            } else {
                println(Notification.ARCHIVE_NOTE_ENTRY_ERROR)
            }
        }
    }

    override fun showEntity() {
        if (archiveList.isNotEmpty()) {
            println("Список созданных архивов: ")
            archiveList.forEachIndexed { index, archive ->
                println("$index.  ${archive.archiveName}")
            }
        } else println(Notification.EMPTY_LIST)
    }
}