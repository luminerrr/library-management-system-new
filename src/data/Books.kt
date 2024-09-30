package data

import constant.Status
import entity.Book

class Books() {
    var datas = mutableListOf<Book>(
        Book(1, "First Book", "Adventure", "First Author", Status.Available.toString()),
        Book(2, "Second Book", "Adventure", "Second Author", Status.Available.toString()),
        Book(3, "Third Book", "Adventure", "Third Author", Status.Available.toString()),
        Book(4, "Fourth Book", "Adventure", "Fourth Author", Status.Available.toString()),
        Book(5, "Fifth Book", "Adventure", "Fifth Author", Status.Available.toString()),
    )
}
