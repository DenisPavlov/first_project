abstract class Element {
  def contents: Array[String]

  //возвращает количество рядов в содержимом
  def height: Int = contents.length

  //возвращает длинну первого ряда или, если нет рядов то нуль
  def width: Int = if (height == 0) 0 else contents(0).length
}