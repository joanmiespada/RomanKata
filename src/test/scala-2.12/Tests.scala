/**
  * Created by joanmi on 2/4/17.
  */
package RomanKata

import org.scalatest._

class Tests extends UnitSpec {
  info("Starting")

  "test 1" should "first item: I" in {

    val Rk = new RomanKata()

    val res = Rk.roman("1")

    assert(res === "I")

    info("ok")
  }

  "test 2" should "first item: II" in {

    val Rk = new RomanKata()

    val res = Rk.roman("2")

    assert(res === "II")

    info("ok")
  }

  "test 3" should "first item: III" in {

    val Rk = new RomanKata()

    val res = Rk.roman("3")

    assert(res === "III")

    info("ok")
  }
  "test 4" should "fifth item: V" in {

    val Rk = new RomanKata()

    val res = Rk.roman("5")

    assert(res === "V")

    info("ok")
  }


  info("End")
}
