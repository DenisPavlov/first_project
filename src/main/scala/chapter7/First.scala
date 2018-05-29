package chapter7

class First {
  def meth(arg: Int):Int = {
    if (arg > 10) 10 else throw new IllegalArgumentException
  }
}
