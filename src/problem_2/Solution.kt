package problem_2

import java.math.BigInteger

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?) : ListNode? {
        var result: ListNode? = ListNode(0)

        var l1_nodeIter: ListNode? = l1
        var l2_nodeIter: ListNode? = l2

        var l1_string= StringBuilder()
        var l2_string = StringBuilder()

        while (l1_nodeIter != null) {
            l1_string.insert(0, l1_nodeIter.`val`)
            l1_nodeIter = l1_nodeIter.next
        }

        while (l2_nodeIter != null) {
            l2_string.insert(0, l2_nodeIter.`val`)
            l2_nodeIter = l2_nodeIter.next
        }

        println("${BigInteger(l1_string.toString())},   ${BigInteger(l2_string.toString())}")
        val num1 = BigInteger(l1_string.toString())
        val num2 = BigInteger(l2_string.toString())

        println(num1 + num2)
        val intResult = (num1 + num2).toString().reversed()

        println(intResult)
        var resultIter = result
        for (ch in intResult) {
            val node = ListNode(Character.getNumericValue(ch))
            result!!.next = node
            result = result.next
        }

        return resultIter?.next
    }
}