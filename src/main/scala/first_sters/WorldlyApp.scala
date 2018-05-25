// singleton-объект с методом main, поволяющим
// этому singleton-объекту запускаться как приложение
object WorldlyApp
{
  def main(args: Array[String])
  {
    val wg = new WorldlyGreeter("Hello")
    wg.greet()
  }
}