fun main() {
    val archive = ArchiveManagment()
    val menu = MenuScreen()
    val menuManager = MenuManagement(archive,menu)

    println("Добро пожаловать в стартовое меню. Для навигации по меню вводите цифры.")

    menuManager.start()

}
