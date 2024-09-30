package entity

import constant.Status

class Book (id: Int, title: String, author: String, genre: String?, status: String = Status.Available.toString() ){

}