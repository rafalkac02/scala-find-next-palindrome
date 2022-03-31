import org.scalatest._
import flatspec._
import matchers._
import NextPalindrome._

class NextPalindromeSpec extends AnyFlatSpec with should.Matchers {

  "A nextPalindrome()" should "take number and return next smallest palindrome" in {
    nextPalindrome(808) shouldBe 818
    nextPalindrome(999) shouldBe 1001
    nextPalindrome(2133) shouldBe 2222
  }
}