package service

import entity.Member

class MemberService {
    val members = mutableListOf<Member>()

    fun addMember(member: Member) {
        members.add(member)
        println(member.name)
        println("member added")
    }

    fun removeMember(memberId: Int) {
        val member = members.find { it.id == memberId }
        if(member !=null){
            members.remove(member)
            println("member ${member.name} removed")
        }
        else{
            println("id $memberId not found")
        }
    }

}
