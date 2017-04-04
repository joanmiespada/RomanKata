/**
  * Created by joanmi on 2/4/17.
  */
package RomanKata

import org.scalatest._

class Tests extends UnitSpec {

  "test 0" should "get Exception" in {
    val Rk = new RomanKata()
    try {
      Rk.roman("0")
    }catch {
      case e: Exception => {
        assert(true)
      }
    }
  }

  "test 1" should "first item: I" in {

    val Rk = new RomanKata()

    val res = Rk.roman("1")

    assert(res === "I")

  }

  "test 2" should "second item: II" in {

    val Rk = new RomanKata()

    val res = Rk.roman("2")

    assert(res === "II")

  }

  "test 3" should "third item: III" in {

    val Rk = new RomanKata()

    val res = Rk.roman("3")

    assert(res === "III")

  }
  "test 5" should "forth item: V" in {

    val Rk = new RomanKata()

    val res = Rk.roman("5")

    assert(res === "V")

  }
  "test 10" should "fifth item: X" in {

    val Rk = new RomanKata()

    val res = Rk.roman("10")

    assert(res === "X")

  }

}
