fun main() {
    val menu = MenuList()

    println("Здравствуйте! Для того, воспользоваться функциями приложения, вам нужно ввести цифру, которая находится рядом с интересующей вас операцией.")

    val archive: EntityProperties = ArchiveProperties()
    menu.menuStarting(archive)

    val note: EntityProperties = Archive("")
    menu.menuArchive(note)
}