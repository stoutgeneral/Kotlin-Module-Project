/*import java.util.Scanner

class Menu {

    private val scanner = Scanner(System.`in`)

    fun menuNavigation (archiveProperties: ArchiveProperties) {
            when(scanner.nextInt()) {
                1 -> archiveProperties.createArchive()
                2 -> {
                    if (archiveProperties.archiveList.isNotEmpty()) { // Проверка содержания архива и переход на экран архива
                        print("Если вы хотите войти в архив, введите его номер, где номер первого архива 0. Вернуться назад - введите -1. ")

                        archiveProperties.showArchiveNames()
                        when (val input = scanner.nextInt()) {
                            -1 -> {}
                            else -> {
                                val archive = archiveProperties.archiveList[input]
                                archivesMenu(archive)
                            }
                        }
                    } else println(Notification.EMPTY_LIST)
                }
                3 -> println("Всего доброго!")
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }


    private fun archivesMenu (archive: Archive) {
        while (scanner.toString() != "3") {
            println("Вы вошли в архив ${archive.archiveName}:\n1. Создать заметку \n2. Список созданных заметок \n3. Вернуться назад") //Экран архива и навигация по нему
            when(scanner.nextInt()) {
                1 -> {
                    archive.createNote()
                }

                2 -> {
                    if (archive.notesList.isNotEmpty()) { // Проверка ввода пользователя и просмотр заметок
                        print("Если вы хотите прочитать заметку, введите ее номер, где номер первой заметки 0. Вернуться назад - введите -1. ")
                        archive.showNoteNames()

                        when (val input = scanner.nextInt()) {
                            -1 -> {}
                            else -> {
                                val note = archive.notesList[input]
                                println("Текст заметки ${note.name}: ${note.noteText}")
                            }
                        }
                    } else {
                        println(Notification.EMPTY_LIST)
                    }
                }

                3 -> {
                    break
                }
                else -> Notification.MENU_ENTRY_ERROR
            }
        }
    }
}

*/
