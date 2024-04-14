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
    println("The division of 5  and 3 is ${resultDivi.toLong()}")//Conversion of a value
    // to a another data types
    var resultModu:Double=(5.0%3.0)
    println("The modulus of 5  and 3 is $resultModu")

    //comparison operators == != >= =< > <
    var compVarEqual= 5==5;
    println("the value is equal comparing: $compVarEqual");
    var compVarNotEqual=5!=5;
    println("the value  is not equal comparing: $compVarNotEqual");
    var compVarGreaterthanEqual=5>=5
    println("the value  is greater than or  equal to comparing: $compVarGreaterthanEqual");
    var compVarlessthanEqual=5<=5
    println("the value  is less than or equal  to comparing: $compVarlessthanEqual");

    var compGreaterthan=5>5;
    println("the value  is greater than comparing: $compGreaterthan");
    var compLessthan=5<5
    println("the value  is less than  comparing: $compLessthan");

    //assignment operators +=, -=,*=, /=, %=

    var myNum=3
    myNum+=2;
    println("The addition of 2  to each number is $myNum");
     myNum-=2;
    println("The subtraction of 2  to each number is $myNum");
    myNum*=3
    println("The multiplication of 2  to each number is $myNum");
    myNum/=myNum
    println("The division of 2  to each number is $myNum");
    myNum%=myNum
    //Comparison operators (==,!=,>,<,<=,>=)
    val isEqual= 5==5;
    println("The value of 5 == 5 is $isEqual");
    val isNotEqual= 5!=5;
    println("The value of 5 != 5 is $isNotEqual");
    val isGreater= 5>5;
    println("The value of 5 > 5 is $isGreater");
    val isLessThan= 5<5;
    println("The value of 5 < 5 is $isLessThan");
    val isGreaterEqual= 5>=5;
    println("The value of 5 >= 5 is $isGreaterEqual");
    val isLessThanEqual= 5<=5;
    println("The value of 5 <= 5 is $isLessThanEqual");

   // Increment Operators ++/--
    var increVar =2;
         increVar++;
     println("The incremented value is $increVar");
         increVar--;
    println("The decremented value is $increVar");
}