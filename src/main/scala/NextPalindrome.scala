object NextPalindrome extends App {
  def isPalindrome(n: Int): Boolean = {
    val s = n.toString
    s == s.reverse
  }

  def nextPalindrome(n: Int): Int = {
    var number = n+1
    while (!isPalindrome(number)) {
      number += 1
    }
    number
  }
}