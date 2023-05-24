class Archive(open val archiveName: String) : EntityProperties {

    private val _notesList: MutableList<Note> = mutableListOf()

    override fun createEntity() {
        while (true) {
            print("Введите название - ")
            val name = readln()

            if (name.isNotBlank()) { // Проверка на валидный ввод
                print("Введите текст заметки - ")
                _notesList.add(Note(name = name, noteText = readln()))
                println("Заметка успешно создана\n")
                break
            } else {
                println(Notification.ARCHIVE_NOTE_ENTRY_ERROR)
            }
        }
    }

    override fun showEntity() {
        println("Список созданных заметок: \n ")
        _notesList.forEachIndexed { index, note ->
            println("$index. ${note.name}")
        }
    }

}