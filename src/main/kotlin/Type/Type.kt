package Type

//타입변환은 명시적으로 처리해야함
fun main() {
  val number1 = 3
  val number2:Long = number1.toLong()

  printAgeIfPerson(Person("황남욱", 1))
  printNameAndAgeIfPerson(Person("황남욱", 29))
  strIndexing()
}

fun printAgeIfPerson(obj: Any?) {
  val person = obj as? Person
  println(person?.age)
}

fun printNameAndAgeIfPerson(obj: Any?) {
  val person = obj as? Person
  println("이름 : ${person!!.name} , 나이: ${person.age}")
}

fun strIndexing() {
  val str = "ABC"
  println(str[0])
  println(str[2])
}