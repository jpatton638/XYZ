class StringParser {
  def parse(input: String): String = {

    val processed = input.map {
                      case 'x' => "y"
                      case 'y' => "z"
                      case 'z' => "x"
                      case _ => "?"
                    }
      if (processed.contains("?")) {
        "Incorrect String"
      } else {
        processed.mkString("")
      }
  }
}
