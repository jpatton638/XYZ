import org.scalatest.{MustMatchers, WordSpec}

class StringParserSpec extends WordSpec with MustMatchers {

  val parser = new StringParser

  "parse" should {

    "convert 'x' to 'y'" in {
      parser.parse("x") mustEqual "y"
    }

    "convert 'y' to 'z'" in {
      parser.parse("y") mustEqual "z"

    }

    "convert 'z' to 'x'" in {
      parser.parse("z") mustEqual "x"
    }

    "handle multiple characters" in {
      parser.parse("xyz") mustEqual "yzx"
    }

    "return error string if invalid character indicator is found" in {
      parser.parse("x9yxz7y") mustEqual "Incorrect String"
    }
  }

  "giveOptions" should {

    "give alternative chars for each char given" in {
      parser.giveOptions("x") mustEqual List("y", "z")
    }

    "handle multiple chars" in {
      parser.giveOptions("xyz") mustEqual List("yyz", "zyz", "xzz", "xxz", "xyx", "xyy")
    }
  }
}
