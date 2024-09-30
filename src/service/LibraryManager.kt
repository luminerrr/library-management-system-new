package service

import constant.Status
import data.Books
import data.Members
import entity.Book
import entity.Member

class LibraryManager {
    private var books = Books().datas;
    private val members = Members().datas

    public fun borrowBook(bookId: Int?, memberId: Int?) {
        try {
            val member = members.find { it.id == memberId }
            if (member == null) {
                println("Member not found!")
                return;
            }
            for (bookIndex: Int in books.indices) {
                if (books[bookIndex].id == bookId) {
                    if (books[bookIndex].status != Status.Available.toString()) {
                        println("Book $bookId isn't available for borrowing!")
                        return;
                    }

                    println(books[bookIndex].status)
                    books[bookIndex].status = Status.Borrowed.toString()
                    println("Book $bookId successfully borrowed!")
                    println(books[bookIndex].status)
                    return;
                }
            }
            println("Invalid book index")
        } catch (err: Error) {
            println("Error while borrowing book!")
        }
    }

    public fun returnBook(bookId: Int?, memberId: Int?) {
        try {
            val member = members.find { it.id == memberId }
            if (member == null) {
                println("Member not found!")
                return;
            }
            for (bookIndex: Int in books.indices) {
                if (books[bookIndex].id == bookId) {
                    if (books[bookIndex].status != Status.Borrowed.toString()) {
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
            println("Error while returning book")
        }
    }

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

    fun addMember(member: Member) {
        members.add(member)
        println("member added")
        println("  ${member.id}")
        println("  ${member.name}")
        println("  ${member.membershipType}")
    }

    fun removeMember(memberId: Int?) {
        val member = members.find { it.id == memberId }
        if (member != null) {
            members.remove(member)
            println("member ${member.name} removed")
        } else {
            println("id $memberId not found")
        }
    }

    fun getBooks(): List<Book> {
        return books
    }

}