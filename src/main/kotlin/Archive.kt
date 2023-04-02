class Archive(val archiveName: String) {

    val notesList: MutableList<Note> = mutableListOf()

    fun createNote () {
        while (true) {
            print("Введите название - ")
            val name = readln()

            if (!name.isNullOrBlank()) { // Проверка на валидный ввод
                print("Введите текст заметки - ")
                notesList.add(Note(name = name, noteText = readln()))
                println("Заметка успешно создана\n")
                break
            } else {
                println(Notification.ARCHIVE_NOTE_ENTRY_ERROR)
            }
        }
    }

    fun showNoteNames () {
        println("Список созданных заметок: \n ")
        for (note in notesList) println("${note.name}")
    }

}