package co.s4n.calnat

import scala.io.StdIn

object Main extends App {
    def leetInt(prompt: String): Int = {
        val s = StdIn.readLine(prompt)
        s.toInt
    }
    def esCero(nat: Nat) = nat match {
        case Cero => true
        case Suc(nat) => false
    }
    def esMayorIgual(nat1: Nat, nat2: Nat): Boolean = nat1 match {
        case Cero => nat2 match {
            case Cero => true
            case _      => false
         }
        case Suc(pnat) => nat2 match {
            case Cero => true
            case Suc(snat) => esMayorIgual(pnat, snat)
        }
    }
    def conIntANat(i : Int): Nat = ???
    def imprimirNat(nat: Nat): String = ???
    def restaNat(nat1: Nat, nat2: Nat): Nat = ???

    val entero1 = leetInt("Leer primer entero ")
    val entero2 = leetInt("Leer segundo entero ")
    //val nat1 = copyIntANat(entero1)

    //println(restaNat(entero1, entero2))
}