package data

import constant.MembershipType
import entity.Member

class Members {
    var datas = mutableListOf<Member>(
        Member(1, "Jona", MembershipType.Premium.toString()),
        Member(2, "Red", MembershipType.Standard.toString()),
        Member(3, "Kevpin", MembershipType.Standard.toString()),
    )
}