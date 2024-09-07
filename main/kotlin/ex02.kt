package org.example

// Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
// além de informar a quantidade de vezes em que ela ocorre.
// IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente
// definida no código;

fun main() {
  val stringInformada = "Uma String digitada aqui"
  var qntdeAs = 0
  if(!stringInformada.contains('a')) return println("A String informada não contem a letra A")

  for (letra in stringInformada) {
    if(letra.equals('a', true)) qntdeAs++
  }
  println("A string informada contém $qntdeAs letras A")

}