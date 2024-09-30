import controller.BookController
import controller.BorrowController
import controller.MemberController
import service.LibraryManager

fun main() {
    val service = LibraryManager()
    val addBookController = BookController(service)
    val memberController = MemberController(service)
    val borrowController = BorrowController(service)

    while (true) {
        println("Please select one of this menu")
        println("1. Add Book")
        println("2. Borrow Book")
        println("3. Return Book")
        println("4. List all books")
        println("5. List available books")
        println("6. Add member")
        println("7. Remove member")
        println("8. EXIT")

        val selection = readLine()?.toIntOrNull()

        when(selection) {
            1 -> addBookController.handleBookInput()
            2 -> borrowController.borrowBook()
            3 -> borrowController.returnBook()
            4 -> service.listBooks()
            5 -> service.listAvailableBooks()
            6 -> memberController.addMember()
            7 -> memberController.removeMember()
            8 -> {
                println("Exiting ...")
                return
            }
        }
    }

}