import java.util.Scanner

class ArchiveProperties : EntityProperties {
    val archiveList: MutableList<String> = mutableListOf()
    val scanner = Scanner(System.`in`)

    override fun createEntity() {
        //while (true) {
            println("\nВведите название архива:")
            val name = readLine()

            if (name?.isNotBlank() == true) {
                archiveList.add(name)
                println("\nАрхив \"$name\" успешно создан!")
                //break
            } else {
                println(Notification.ARCHIVE_NOTE_ENTRY_ERROR)
            }
        //}
        return
    }

    override fun showEntity() {
        if (archiveList.isNotEmpty()) {
            println("\nЧтобы вернуться назад нажмите -1. \nСписок созданных архивов: ")
            archiveList.forEachIndexed { index, archive ->
                println("${index}. $archive")
            }
        } else println(Notification.EMPTY_LIST)

    }
}