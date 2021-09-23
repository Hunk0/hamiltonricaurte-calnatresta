package co.s4n.calnat

import scala.io.StdIn

object Main extends App {
    def leetInt(prompt: String): Int = {
        val s = StdIn.readLine(prompt)
        s.toInt
    }
    def esCero(nat: Nat) = nat match {
        case Cero() => true
        case Suc(nat) => false
    }
    def esMayorIgual(nat1: Nat, nat2: Nat): Boolean = nat1 match {
        case Cero() => nat2 match {
            case Cero() => true
            case _      => false
         }
        case Suc(pnat) => nat2 match {
            case Cero() => true
            case Suc(snat) => esMayorIgual(pnat, snat)
        }
    }
    def conIntANat(i : Int): Nat = {
        def iConv(sts: Nat, acum: Int): Nat = acum match {
            case 0 => sts
            case acum => iConv(Suc(sts), acum - 1)
        }

        iConv(Cero(), i)
    }
    def imprimirNat(nat: Nat): String = ???
    def restaNat(nat1: Nat, nat2: Nat): Nat = ???

    val entero1 = leetInt("Leer primer entero ")
    val entero2 = leetInt("Leer segundo entero ")
    val nat1 = conIntANat(entero1)
    val nat2 = conIntANat(entero2)

    //println(restaNat(entero1, entero2))
}