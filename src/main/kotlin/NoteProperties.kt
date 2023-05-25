import java.util.*

class NoteProperties() : EntityProperties {
    val _notesList: MutableList<Note> = mutableListOf()
    val scanner = Scanner(System.`in`)

    override fun createEntity() {

        print("Введите название заметки - ")
        val name = readln()

        if (name.isNotBlank()) {
            print("Введите текст заметки - ")
            _notesList.add(Note(name = name, text = readln()))
            println("Заметка \"$name\" успешно создана\n")
        } else {
            println(Notification.ARCHIVE_NOTE_ENTRY_ERROR)
        }
        return
    }

    override fun showEntity() {

        if (_notesList.isNotEmpty()) {
            println("\nЧтобы вернуться назад нажмите -1. \nСписок созданных заметок:")
            _notesList.forEachIndexed { index, note ->
                println("$index. ${note.name}")
            }
            when (val input = scanner.nextInt()) {
                -1 -> {}
                else -> {
                    while (true) {
                        val note = _notesList[input]
                        println(Menu.NOTE_MENU)
                        when (scanner.nextInt()) {
                            1 -> println("Текст заметки ${note.name}: ${note.text}")
                            2 -> {
                                break
                            }
                        }
                    }

                }
            }
        }


    }
}