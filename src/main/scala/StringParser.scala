class StringParser {
  def parse(input: String): String = {

    val processed = input.map {
                      case 'x' => "y"
                      case 'y' => "z"
                      case 'z' => "x"
                      case _ => "?"
                    }.mkString("")
    filterError(processed)
  }

  def giveOptions(input: String): List[String] = {

    input.flatMap {
      case 'x' => List("y", "z")
      case 'y' => List("z", "x")
      case 'z' => List("x", "y")
      case _ => List("?")
    }.toList
  }

  def filterError(processed: String): String = {
    if (processed.contains("?")) {
      "Incorrect String"
    } else {
      processed
    }
  }
}
