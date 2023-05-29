class MenuManagement(val archiveManagment: ArchiveManagment, val menu: MenuScreen) {

    fun startingMenu() {
        while (true) {
            println(MenuScreen.STARTING_MENU)
            when (readln().toIntOrNull()) {
                1 -> createArchive()
                2 -> showArhiveList()
                3 -> return println("Всего доброго!")
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }
    }

    private fun archiveMenu(archive: Archive) {
        while (true) {
            println(MenuScreen.ARCHIVE_MENU)
            when (readln().toIntOrNull()) {
                1 -> createNote(archive)
                2 -> showNoteList(archive)
                3 -> return
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }
    }

    private fun createArchive() {
        while (true) {
            print("\nВведите название архива: ")
            val name = readLine()?.trim()

            if (name != null && name.isNotBlank()) {
                val archive = Archive(name)
                archiveManagment.addArchive(archive)
                println("Архив $name успешно создан!")
                break
            } else println(Notification.ENTITY_ENTRY_ERROR)
        }
    }

    fun showArhiveList() {
        val archives = archiveManagment.getArhive()
        showList(archives, "архивов") { archive -> archiveMenu(archive as Archive) }
    }

    private fun createNote(archive: Archive) {
        while (true) {
            print("\nВведите название заметки: ")
            val nameNote = readLine()?.trim().toString()

            if (nameNote.isNotEmpty()) {
                print("\nВведите текст заметки: ")
                val textNote = readLine()?.trim().toString()

                val note = Note(nameNote, textNote)
                archive.addNote(note)

                println("Заметка $nameNote успешно создана!")
                break
            } else println(Notification.ENTITY_ENTRY_ERROR)
        }
    }

    private fun noteMenu(note: Note) {
        while (true) {
            println(MenuScreen.NOTE_MENU)
            when (readln()?.toIntOrNull()) {
                1 -> menu.showNote(note.name, note.text)
                2 -> return
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }
    }

    fun showNoteList(archive: Archive) {
        val notes = archive.getNote()
        showList(notes, "заметок") { note -> noteMenu(note as Note) }
    }

    fun showList(entities: List<EntityProperties>, entityName: String, entityMenu: (Any) -> Unit) {
        if (entities.isEmpty()) {
            println(Notification.EMPTY_LIST)
        } else {
            println("\nВведите -1, чтобы вернуться в стартовое меню.\n Список $entityName:")
            entities.forEachIndexed { index, any -> println("$index. ${any.name}") }

            val input = readLine()?.toIntOrNull()
            when (input) {
                -1 -> return
                in 0..entities.size -> {
                    val entity = entities[input!!]
                    entityMenu(entity)
                }
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }
    }
}

////