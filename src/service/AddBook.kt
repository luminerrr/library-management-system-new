package service

import entity.Book

class AddBook {
    private val books = mutableListOf<Book>()
    fun addBook(book: Book) {
        books.add(book)
        println("Book '${book.title}' added successfully.")
    }

    fun listBooks() {
        if (books.isEmpty()) {
            println("No books in the library.")
        } else {
            println("Books in the library:")
            for (book in books) {
                println("ID: ${book.id}, Title: ${book.title}, Author: ${book.author}, Genre: ${book.genre}, Status: ${book.status}")
            }
        }
    }
}