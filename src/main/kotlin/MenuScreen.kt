class MenuScreen {

    companion object {
        const val STARTING_MENU =
            "\nСтартовое меню:\n1. Создать архив \n2. Список созданных архивов \n3. Выход из программы"
        const val ARCHIVE_MENU =
            "\nВы вошли в архив:\n1. Создать заметку \n2. Список созданных заметок \n3. Вернуться назад"
        const val NOTE_MENU =
            "\nВы вошли в заметку:\n1. Просмотреть заметку. \n2. Вернуться назад"
    }

    fun showNote (noteName: String, noteText: String) {
        println("Название заметки: $noteName")
        println("Текст заметки: $noteText")
    }
}