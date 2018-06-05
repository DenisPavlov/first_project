class LineElement(s: String) extends Element {
  override def width = s.length
  override def height = 1

  val contents: Array[String] = Array(s)
}