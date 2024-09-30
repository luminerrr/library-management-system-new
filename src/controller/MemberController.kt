package controller

import data.Members
import entity.Member
import service.LibraryManager

class MemberController (private val LibraryService: LibraryManager) {
//    private val LibraryService = LibraryManager();
//    private val members = Members().datas

    public fun addMember(){
        var memberText : String
        val newId = LibraryService.getMember().last().id + 1
        println("Please enter your name")
        val memberName = readLine().toString()
        println("Please enter your membership type 1/2 :")
        println(" 1. Standard")
        println(" 2. Premium")
        val memberType = readLine()?.toIntOrNull()
        if (memberType == 2){
            memberText = "Premium"
        }
        else{
            memberText="Standard"
        }

        val newMember = Member(newId,memberName,memberText)
        LibraryService.addMember(newMember)
    }

    public fun removeMember(){
        println("Please enter your member id :")
        val memberId = readLine()?.toInt()
        LibraryService.removeMember(memberId)
    }

}