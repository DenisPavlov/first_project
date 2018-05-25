package chapter6

class Rational(n: Int, d: Int) {
  require(d != 0)
  val number: Int = n
  val denom: Int = d

  override def toString: String = number + "/" + denom

  def add(rational: Rational): Rational = {
    return new Rational(number * rational.denom + rational.number * denom,
      denom*rational.denom)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val rat: Rational = new Rational(3,5)
    val rat1: Rational = new Rational(4,5)
    println(rat.add(rat1))
  }
}
