package operators

fun main() {
  val money1 = Money(2_000L)
  val money2 = Money(1_000L)

  // compareTo를 자동으로 호출
  if(money1 > money2) {
    println( "Money1이 Money2보다 금액이 큽니다.")
  }

  //동일성(주소비교) === , 동등성(값비교 equals)  ==

  val money3 = Money(1_000L)
  val money4 = Money(1_000L)
  val money5 = money3

  println(money3 === money5)
  println(money3 === money4)
  println(money3 == money4)

}