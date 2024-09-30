package controller

import entity.Book
import service.LibraryManager

class AddBook(private val service: LibraryManager) {
    fun handleBookInput() {
        val newId = (service.getBooks().lastOrNull()?.id ?: 0) + 1

        val title = promptForString("Enter Title:") ?: return
        val author = promptForString("Enter Author:") ?: return
        val genre = promptForString("Enter Genre:") ?: return

        // Add the book to the library
        service.addBook(Book(newId, title, author, genre))
    }

    private fun promptForString(prompt: String): String? {
        print(prompt)
        return readLine()?.takeIf { it.isNotBlank() } ?: run {
            println("This field cannot be empty.")
            null
        }
    }
}