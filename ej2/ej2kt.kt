
/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/ 
// var li = ListNode(5)
// var v = li.value
class ListNode(var value: Int) {
    var next: ListNode? = null
}
 
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val res = ListNode(0)
        var p = l1
        var q = l2
        var actual = res
        var carry = 0

        while (p != null || q != null) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = carry + x + y

            carry = sum / 10
            actual.next = ListNode(sum % 10)
            actual = actual.next!!

            if (p != null) p = p.next
            if (q != null) q = q.next
        }

        if (carry > 0) {
            actual.next = ListNode(carry)
        }

        return res.next 
    }
}