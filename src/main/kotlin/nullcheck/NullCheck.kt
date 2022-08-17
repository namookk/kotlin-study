package nullcheck

fun main(args: Array<String>) {
  val str: String? = "ABC"
  println(startsWithA(str ?: "ABC"))
  println(startsWithA1(str))
  println(startsWithA2(str))
  println(startsWithA3(str))
}

fun startsWithA(str: String) : Boolean {
  return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
  return str?.startsWith("A") ?: throw IllegalArgumentException("null")
}

fun startsWithA2(str: String?): Boolean? {
  return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
  return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
  return str!!.startsWith("A")
}