object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  /*
  Поис файла по окончанию названия
   */
  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  /*
  поиск файла по содержащейся в нем строке
   */
  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  /*
  Поиск файла по регулярному выражению
   */
  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file
}