import constant.Status
import entity.Book
import service.LibraryManager

fun main() {
    val service = LibraryManager()
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

        println(selection)

    }





//    val addBook = AddBook()
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
//    addBook.addBook(Book(id, title, author, genre))
//    addBook.listBooks()
}