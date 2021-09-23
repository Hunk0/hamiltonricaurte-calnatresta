package co.s4n.calnat

sealed trait Nat {
    def ++ : Nat = Suc(this)
    def +(x: Nat): Nat
    def *(x: Nat): Nat
}
case object Cero extends Nat {
    def +(x: Nat): Nat = x
    def *(x: Nat): Nat = Cero
}
case class Suc(nat: Nat) extends Nat {
    def +(x: Nat): Nat = Suc(nat.+(x))
    def *(x: Nat): Nat = nat.*(x).+(x)
}