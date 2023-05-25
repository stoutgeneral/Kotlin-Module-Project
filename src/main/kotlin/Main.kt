fun main() {
    val menu = Menu()
    val archive: EntityProperties = ArchiveProperties()
    var note: EntityProperties = NoteProperties()

    println("Здравствуйте! Для того, чтобы воспользоваться функциями приложения, вам нужно ввести цифру, которая находится рядом с интересующей вас операцией.")
    println(menu.menuNavigation(archive, Menu.STARTING_MENU))
    //println(menu.menuNavigation(note, Menu.ARCHIVE_MENU))

}