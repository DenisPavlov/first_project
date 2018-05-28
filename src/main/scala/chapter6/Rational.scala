package chapter6

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number: Int = n/g
  val denom: Int = d/g

  /*
  Дополнительный конструктор
   */
  def this(n: Int) = this(n, 1)

  override def toString: String = number + "/" + denom

  def +(rational: Rational): Rational = {
    new Rational(number * rational.denom + rational.number * denom,
      denom*rational.denom)
  }

  /*
  Умножение двух чисел
   */
  def * (rational: Rational): Rational = {
    new Rational(number * rational.number,  denom * rational.denom)
  }

  /*
  Метод проверяет, не имеет ли Rational объект, в отношении которого вызван метод
  значение, меньше значения параметра
   */
  def lessThat(that: Rational) = this.number * that.denom < that.number * this.denom

  /*
  Метод возвращает наибольшее число
   */
  def max(that: Rational) = if (lessThat(that)) that else this

  /*
  Поиск наибольшего общего делителя
   */
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

}

object Main {
  def main(args: Array[String]): Unit = {
    val rat: Rational = new Rational(3,5)
    val rat1: Rational = new Rational(4,5)
    println(rat + rat1)
    println(rat * rat1)
  }
}
