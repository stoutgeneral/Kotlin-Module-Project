class Archive(override val name: String) : EntityProperties {
    private val notes = mutableListOf<Note>()

    fun addNote (note: Note) {
        notes.add(note)
    }

    fun getNote(): List<Note> {
        return notes.toList()
    }

}