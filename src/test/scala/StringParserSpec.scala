import org.scalatest.{MustMatchers, WordSpec}

class StringParserSpec extends WordSpec with MustMatchers {

  val parser = new StringParser

  "StringParser" should {

    "return error string if invalid argument is given" in {
      parser.parse("r") mustEqual "Incorrect String"
      parser.parse("r51ud9%") mustEqual "Incorrect String"
    }

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

  }
}
