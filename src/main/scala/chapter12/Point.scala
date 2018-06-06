class Point(val x: Int, val y: Int)

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
  override def left = topLeft.x
  override def right = bottomRight.x
  override def width = right - left
  // and many more geometric methods...
}

abstract class Component extends Rectangular {
  def topLeft: Point
  def bottomRight: Point

  override def left = topLeft.x
  override def right = bottomRight.x
  override def width = right - left
  // and many more geometric methods...
}