import constant.Status
import controller.AddBook
import entity.Book
import service.LibraryManager

fun main() {
    val service = LibraryManager()
    val addBookController = AddBook(service)

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
            2 -> {}
            3 -> {}
            4 -> service.listBooks()
            5 -> {}
            6 -> {}
            7 -> {
                println("Exiting ...")
                return
            }
        }
    }
//
//    print("Enter Book ID: ")
//    val id = readLine()?.toIntOrNull() ?: run {
//        println("Invalid ID. Please enter a valid integer.")
//        return
//    }
//
//    // Input Book Title
//    print("Enter Title: ")
//    val title = readLine()?.takeIf { it.isNotBlank() } ?: run {
//        println("Title cannot be empty.")
//        return
//    }
//
//    // Input Book Author
//    print("Enter Author: ")
//    val author = readLine()?.takeIf { it.isNotBlank() } ?: run {
//        println("Author cannot be empty.")
//        return
//    }
//
//    // Input Book Genre
//    print("Enter Genre: ")
//    val genre = readLine() ?: run {
//        println("Genre cannot be empty.")
//        return
//    }
//
//    service.addBook(Book(id, title, author, genre))
//    service.listBooks()
}