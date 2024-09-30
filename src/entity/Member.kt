package entity

import constant.MembershipType

class Member (
    var id: Int,
    var name: String,
    var membershipType: String = MembershipType.Standard.toString()){
}