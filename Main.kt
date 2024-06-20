fun main() {
//1
    val text = "12.3"
    val doubleNum = text.toDouble()
    println(doubleNum)
    val intNum = doubleNum.toInt()
    println(intNum)
    val binaryNum = toBinary(intNum)
    println(binaryNum)
    println("===========================================================")
//2
    val string = "Привет, мир!"
    val int = 55
    val double = 0.5
    val char = 'o'
    checkType(double)
    println("============================================================")
//3

    val num = 14
    val line = "Какой-то текст"
    val newArray = arrayOf(1, 2, 3, 4, 5)
    println(someFun(num))
    println(someFun(line))
    println(someFun(newArray))
    println("=============================================================")
//Второе задание из прошлой домашней работы
//Я так и не смог понять что требуется в этом задании
    println(divideIfWhole(10, 9) ?: 0)
}
fun toBinary(n: Int): String {
    return if (n != 0) toBinary(n / 2) + n % 2 else { "" }
}

fun <T> checkType (element: T){
    when(element){
        is String -> println("Это строка")
        is Int -> println("Это целое число")
        is Double -> println("Это число с плавающей точкой")
        is Char -> println("Это символ")
        else -> println("Не известный тип")
    }
}
fun <T> someFun(input: T) : Int{
    var res = 0
    if (input is String) res = input.length + 1
    else if (input is Int) res = input + 1
    return res
}

fun someFun(input: Array<Int>) : Int{
    var res = 0
    input.forEach { i -> res += i }
    return res
}

fun divideIfWhole(divisible: Int, divider: Int) : Int?{
    var div: Int = divisible
    var res: Int
    var num: Int? = 0
    while (true){
        res = div / divider
        if (res * divider == div){
            num = num!! + 1
            div = res
        }
        else {
            num = null
            break
        }
    }
    return num
}