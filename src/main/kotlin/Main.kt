fun main()
{
    var number1= 0
    var number2= 0
    var operation : Char = '+'
    println(" enter the first number only by /9" )
    number1 = readLine()!!. toInt()
    println(" enter the second number only by div /")
    number2 = readLine()!!. toInt()
    println("enter operation only div /")
    operation = readLine()!!. single()
    when (operation){

        '/'-> div(number1, number2)


    }



}

fun div (number1 : Int, number2 : Int  ) {
    try {

        println("$number1/$number2 = ${number1 / number2}")}
    catch (exception : Exception){     /// we add Exception  to catch error
        println("can not div by zero")
    }


}
