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

    val x = input.zipWithIndex.flatMap {
      case (char, index) => char match {
        case x @ 'x' => List(s"${input.replace('x', 'y')}", s"${input.replace('x', 'z')}")
        case y @ 'y' => List(s"${input.replace('y', 'z')}", s"${input.replace('y', 'x')}")
        case z @ 'z' => List(s"${input.replace('z', 'x')}", s"${input.replace('z', 'y')}")
        case _ => List("?")

      }
    }
    x.toList
  }

  def filterError(processed: String): String = {
    if (processed.contains("?")) {
      "Incorrect String"
    } else {
      processed
    }
  }
}
