import controller.BookController
import controller.BorrowController
import controller.MemberController
import service.LibraryManager

fun main() {
    val service = LibraryManager()
    val addBookController = BookController(service)
    val memberController = MemberController()
    val borrowController = BorrowController()

    while (true) {
        println("Please select one of this menu")
        println("1. Add Book")
        println("2. Borrow Book")
        println("3. Return Book")
        println("4. List all books")
        println("5. Add member")
        println("6. Remove member")
        println("7. EXIT")

        val selection = readLine()?.toIntOrNull()

        when(selection) {
            1 -> addBookController.handleBookInput()
            2 -> borrowController.borrowBook()
            3 -> borrowController.returnBook()
            4 -> service.listBooks()
            5 -> memberController.addMember()
            6 -> memberController.removeMember()
            7 -> {
                println("Exiting ...")
                return
            }
        }
    }

}