package function

fun main() {
    val max = max4(1, 2)
    println(max)

    repeat1("Hello World" , 3, false)
    repeat1("Hello World", useNewLine = false)

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array) // spread 연산자 필요
}
fun max1(a: Int, b: Int) : Int {
    if(a > b) {
        return a
    }
    return b
}

fun max2(a: Int, b: Int) : Int {
    return if(a > b) {
        a
    }else {
        b
    }
}

fun max3(a: Int, b: Int) : Int =
        if(a > b) {
            a
        }else{
            b
        }

fun max4(a: Int, b: Int) = if (a > b) a else b

//default 파라미터
fun repeat1(str: String,
            num: Int = 3,
            useNewLine: Boolean = true) {
    for(i in 1..num) {
        if(useNewLine) {
            println(str)
        }else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}