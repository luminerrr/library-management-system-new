package service

import constant.Status
import data.Books
import entity.Book

class LibraryManager {
    private var books = Books().datas;


    public fun borrowBook(bookIdString: String) {
        val bookId = bookIdString.toInt()
        for (bookIndex: Int  in books.indices) {
            if(books[bookIndex].id == bookId) {
                if(books[bookIndex].status != Status.Available.toString()) {
                    println("Book $bookId isn't available for borrowing!")
                    return;
                }

                books[bookIndex].status = Status.Borrowed.toString()
                println("Book $bookId successfully borrowed!")
                return;
            }
        }
        println("Invalid book index")
    }

    public fun returnBook(bookIdString: String) {
        try {
            val bookId = bookIdString.toInt()
            for (bookIndex: Int  in books.indices) {
                if(books[bookIndex].id == bookId) {
                    if(books[bookIndex].status != Status.Borrowed.toString()) {
                        println("Book hasn't been borrowed")
                        return;
                    }

                    books[bookIndex].status = Status.Available.toString()
                    println("Book $bookId successfully returned!")
                    return;
                }
            }
            println("Invalid book index")
        } catch (err: Error) {
            println("Invalid input!")
        }
    }
}