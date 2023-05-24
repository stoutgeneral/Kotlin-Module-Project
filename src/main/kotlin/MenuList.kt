import java.util.Scanner

class MenuList {
    companion object {
        const val STARTING_MENU =
            "\nСтартовое меню:\n1. Создать архив \n2. Список созданных архивов \n3. Выход из программы"
        const val ARCHIVE_MENU =
            "\nВы вошли в архив:\n1. Создать заметку \n2. Список созданных заметок \n3. Вернуться назад"
        const val NOTE_MENU =
            "\nВы вошли в заметку:\n1. Просмотреть текст заметки. \n2. Вернуться назад"
    }

    private val scanner = Scanner(System.`in`)

    fun menuStarting(entityProperties: EntityProperties) {
        while (true) {
            println(STARTING_MENU)
            when (scanner.next()) {
                "1" -> entityProperties.createEntity()
                "2" -> entityProperties.showEntity()
                "3" -> {
                    println("Всего доброго!")
                    break
                }
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }
    }

    fun menuArchive(entityProperties: EntityProperties) {
        while (true) {
            println(ARCHIVE_MENU)
            when (scanner.next()) {
                "1" -> entityProperties.createEntity()
                "2" -> entityProperties.showEntity()
                "3" -> {
                    menuStarting(entityProperties)
                    break
                }
                else -> println(Notification.MENU_ENTRY_ERROR)
            }
        }
    }
}