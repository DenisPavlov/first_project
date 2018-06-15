def simplifyTop(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", e))  => e   // Double negation
  case BinOp("+", e, Number(0)) => e   // Adding zero
  case BinOp("*", e, Number(1)) => e   // Multiplying by one
  case _ => expr
}

expr match {
  case BinOp(op, left, right) =>
    println(expr + " is a binary operation")
  case _ =>
}

expr match {
  case 0 => "zero"
  case somethingElse => "not zero: " + somethingElse
}

expr match {
  case UnOp("abs", e @ UnOp("abs", _)) => e
  case _ =>
}

def simplifyAdd(e: Expr) = e match {
   case BinOp("+", x, y) if x == y =>
     BinOp("*", x, Number(2))
   case _ => e
}

def simplifyAll(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", e)) =>
    simplifyAll(e)   // `-' is its own inverse
  case BinOp("+", e, Number(0)) =>
    simplifyAll(e)   // `0' is a neutral element for `+'
  case BinOp("*", e, Number(1)) =>
    simplifyAll(e)   // `1' is a neutral element for `*'
  case UnOp(op, e) =>
    UnOp(op, simplifyAll(e))
  case BinOp(op, l, r) =>
    BinOp(op, simplifyAll(l), simplifyAll(r))
  case _ => expr
}

sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr
