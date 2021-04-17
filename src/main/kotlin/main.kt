import java.util.*

fun main(args: Array<String>) {
    var first_No: Double
    var second_No: Double
    var operation: Int


    var call_method = Calculator()

    val scan = Scanner(System.`in`)
    call_method.print_statement(call_method.header)
    call_method.print_statement(call_method.statement)


    operation = scan.nextInt()
    if (operation > 9) {
        call_method.print_statement("Invalid Input, Please try again")

    } else {
        call_method.print_statement(call_method.first_Value_note)
        first_No = scan.nextDouble()

        call_method.print_statement(call_method.second_Value_note)
        second_No = scan.nextDouble()

        call_method.Operation(operation, first_No, second_No)


        call_method.print_statement(call_method.footer)

    }

}


class Calculator {
    val header: String = "\n=============================== \n        Calculator \n===============================\n"
    val footer: String = "\n=============================== \n          Thank You \n===============================\n"

    val statement: String = "Which operation you want on it \n 1." +
            "Addition \n 2. Subtraction\n 3. Multiplication \n 4. Division\n 5. Reminder \n 6." +
            " Factorial \n 7. " + "To the Power \n 8. " + " Square Root \n 9. " + " Cube Root \n " + "Please enter the corresponding digit to the operation"


    val first_Value_note: String = "Please enter the first value"

    val second_Value_note: String = "Please enter the second value"


    val continue_exit: String = "Press 1 to continue or 0 to exit...."


    fun Operation(opt: Int, firstNo: Double, secondNo: Double) {
        var result: Double = 1.0


        when (opt) {

            1 -> {
                result = firstNo + secondNo
                print_statement("Addition of $firstNo and $secondNo is : $result")

            }

            2 -> {

                if (firstNo > secondNo) {
                    result = firstNo - secondNo
                } else {

                    result = secondNo - firstNo
                }
                print_statement("Subtraction of $firstNo and $secondNo is : $result")
            }

            3 -> {
                result = firstNo * secondNo
                print_statement("Multiplication of $firstNo and $secondNo is : $result")

            }
            4 -> {

                if (secondNo == 0.0) {
                    print_statement("Cannot divide by 0")

                } else {

                    result = firstNo / secondNo
                    print_statement("Result is : $result")
                }

            }
            5 -> {
                if (secondNo == 0.0) {
                    print_statement("Second value (Divisor) cannot be 0")

                } else {

                    result = firstNo % secondNo
                    print_statement("Result is : $result")
                }
            }

            6 -> {


                var fact: Long = 1
                var fact2: Long = 1

                for (i in 1..firstNo.toLong()) {
                    fact *= i

                }

                print_statement("Result of $firstNo : $fact")


                for (i2 in 1..secondNo.toLong()) {
                    fact2 *= i2

                }
                print_statement("Result of $secondNo : $fact2")

            }


            7 -> {

                var base: Double = firstNo
                var power: Double = secondNo
                var result: Double = 1.0

                result = Math.pow(base.toDouble(), power.toDouble())


                print_statement("Result is : $result")


            }


            8 -> {

                var result1: Double = 1.0
                var result2: Double = 1.0

                result1 = Math.sqrt(firstNo.toDouble())
                result2 = Math.sqrt(secondNo.toDouble())

                print_statement("Square root of $firstNo is : $result1")
                print_statement("Square root of $secondNo is : $result2")


            }


            9 -> {

                var result1: Double = 1.0
                var result2
                        : Double = 1.0

                result1 = Math.cbrt(firstNo.toDouble())
                result2 = Math.cbrt(secondNo.toDouble())

                print_statement("Cube root of $firstNo is : $result1")
                print_statement("Cube root of $secondNo is : $result2")
            }


            else -> {
                print_statement("Wrong input, Please choose correct code")

            }


        }
    }


    fun print_statement(st: String) {
        println(st)

    }


}