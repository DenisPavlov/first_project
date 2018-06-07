class Animal

class Frog extends Animal with Philosophical {
  override def toString = "green"
  override def philosophize() = {
    println("It ain't easy being " + toString + "!")
  }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = { super.put(2 * x) }
}