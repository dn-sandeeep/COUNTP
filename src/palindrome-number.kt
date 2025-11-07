class Solution {
    fun isPalindrome(x: Int): Boolean {
        var changetosrting = x.toString()
        if (changetosrting == changetosrting.reversed()) return true

        return false

    }
}