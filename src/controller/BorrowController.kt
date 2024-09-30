package controller

import service.LibraryManager

class BorrowController {
    private val libraryService = LibraryManager();

    public fun borrowBook() {
        println("Please enter your member id")
        val memberId = readLine()?.toIntOrNull()
        println("Please enter your desired book to borrow")
        val bookId = readLine()?.toIntOrNull()
        libraryService.borrowBook(bookId, memberId)
    }

    public fun returnBook() {
        println("Please enter your member id")
        val memberId = readLine()?.toIntOrNull()
        println("Please enter your desired book to return")
        val bookId = readLine()?.toIntOrNull()
        libraryService.returnBook(bookId, memberId)
    }
}