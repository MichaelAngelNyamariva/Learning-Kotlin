package com.felicity.hello
fun main()
{
    println("-------------Learning Kotlin Operators---------------");
     //Our Arithmetic operators are / for division, * for multiplication
    // + for addition, - for subtraction  and % modulus
     var resultAdd= 5+3;//addition
    println("The sum of 5 and 3 is $resultAdd")
     var resultSub=5-3;//subtraction
    println("The subtraction of 5 and 3 is $resultSub")
    var resultMult=5*3;//multiplication
    println("The multiplication of 5 and 3 is $resultMult")
    var resultDivi:Double=(5.0/3.0);//division
    println("The division of 5  and 3 is ${resultDivi.toLong()}")
    var resultModu:Double=(5.0%3.0)
    println("The modulus of 5  and 3 is $resultModu")
}