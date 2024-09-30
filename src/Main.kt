import constant.MembershipType
import entity.Member
import service.MemberService

fun main() {
    val m = MemberService()
    val x = Member(1,
        "jona",
        MembershipType.Standard.toString())
    m.addMember(x)
    m.removeMember(1)
    m.removeMember(1)
}