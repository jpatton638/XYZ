import org.scalatest.{MustMatchers, WordSpec}

class StringParserSpec extends WordSpec with MustMatchers {

  val parser = new StringParser

  "StringParser" should {

    "convert 'x' to 'y'" in {

      parser.parse("x") mustEqual "y"
    }
  }
}
