import java.util.*

class Menu {
    companion object {
        const val STARTING_MENU =
            "\nСтартовое меню:\n1. Создать архив \n2. Список созданных архивов \n3. Выход из программы"
        const val ARCHIVE_MENU =
            "\nВы вошли в архив:\n1. Создать заметку \n2. Список созданных заметок \n3. Вернуться назад"
        const val NOTE_MENU =
            "\nВы вошли в заметку:\n1. Просмотреть текст заметки. \n2. Вернуться назад"
    }

    val scanner = Scanner(System.`in`)

    fun menuNavigation(entityProperties: EntityProperties, menuList: String) {
        while (true) {
            println(menuList)
            when (scanner.next()) {
                "1" -> entityProperties.createEntity()
                "2" -> {
                    entityProperties.showEntity()
                    when(entityProperties) {
                        is ArchiveProperties -> {
                            when (val inputArchive = scanner.nextInt()) {
                                -1 -> menuNavigation(entityProperties, STARTING_MENU)
                                else -> {
                                    entityProperties.archiveList[inputArchive]
                                    menuNavigation(entityProperties, ARCHIVE_MENU)
                                }
                            }
                        }
                        is NoteProperties -> {
                            when(val inputNote = scanner.nextInt()) {
                                -1 -> menuNavigation(entityProperties, ARCHIVE_MENU)
                                else -> {
                                    entityProperties._notesList[inputNote]
                                    menuNavigation(entityProperties, NOTE_MENU)
                                }
                            }
                        }
                    }
                }
                "3" -> {
                    when (menuList) {
                       STARTING_MENU -> {
                           println("Всего доброго!")
                           return
                       }
                       ARCHIVE_MENU -> menuNavigation(ArchiveProperties(), STARTING_MENU)
                       NOTE_MENU -> menuNavigation(NoteProperties(), ARCHIVE_MENU)
                    }
                }
            }
        }
    }

    /*fun menuNote() {

        while (true) {
            println(NOTE_MENU)
            when (scanner.nextInt()) {
                1 -> println("Текст заметки ${Note.name}:\n${notes.text}")
                2 -> menuNavigation(notes, ARCHIVE_MENU)
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }
    }*/
}