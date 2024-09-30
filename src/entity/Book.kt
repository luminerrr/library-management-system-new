package entity

import constant.Status

class Book (var id: Int, var title: String, var author: String, var genre: String?, var status: String = Status.Available.toString() ){

}