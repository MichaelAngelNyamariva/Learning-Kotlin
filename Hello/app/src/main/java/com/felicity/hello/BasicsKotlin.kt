package com.felicity.hello

fun main()
{
//TODO: In the main function..............
   // basics();
var x= avg(60.1,7.0);
    println("the average between two numbers $x");
   // nullExample();
 //   elvisOperator();
   var pers= Person("Tendai","Nyamariva","23");
    pers.myhobb();
    var kz=Person("Kudzi","Tendai");
    kz.hobby="cooking"
    kz.myhobb();
    kz.age=12;
    println("Kudzai age is ${kz.age}");
    var lateinit = LateInit();
    lateinit.nam="Alpha";
    lateinit.nam="test";
}
//class Person constructor(name:String,surname:String)
class LateInit()
{ //TODO Late Init
    lateinit var nam:String
    va
}
//Todo class definition
class Person(name:String,surname:String)
{
    init{
        println("Name is $name and  surname is $surname");
    }
    constructor(name:String,surname:String,age:String):this(name,surname)
    //Todo Member variables
    var age:Int ?=null
    var hobby:String="watching movies"
    //Todo Member Functions
    fun myhobb()
    {
        println("My Hobby is $hobby");
    }

}
//Todo Null example
private fun nullExample(){
    var name:String="Dennis";
   // name=null; compilation error
    var nullName:String?="Tendai";
    nullName= null;
    var len=name.length;
    var lens=nullName?.length
    println("the length of the nullable is $lens");
    if(lens !=null)
    {
      var tesname=  name.length;
        println(tesname);
    }
    else
    {
        println("name is null");
    }
   nullName?.let{println("its null");}
}
//Todo ElvisOperator
private fun elvisOperator() {
    var nullName:String?="Tendai";
    nullName= null;
    val namenull = nullName ?: "its A null"
   var namnulls= namenull!!.lowercase()
    println(namnulls);
}


//Todo Function example
public fun avg(a: Double, b:Double):Double
{
    return (a+b)/2;
}
//Todo Basics
private fun basics() {
    val myname = "Tendai" // immutable variable
    // println("Hello l am writing Kotlin code. My Name is $myname //Val Example");
    var mynames = "test";
    var firstChar = mynames[0].toString();
    //difference between the Val and var is when the val  variable has been assigned value it can be reassigned a value.
    println("Hello l am writing Kotlin code. My Name is $mynames //Var Example");
    println("The first character in mynames is: $firstChar");
    //we don't need to state the typeof a variable because it finds out the type from the context it is used
    // string Interpolation, the system needs the code to be into a template form.
    //TODO Data types
    // number data type float, numeric , int, long
    // string , char
    //TODO: Arithmetic Operators & Comparison
    // ==, !=, =>, <=,>,< Comparison
    // %,*, /,-,+
    //TODO: Loops- if statements , when statement
    var age = 17;
    if (age > 16) {
        println("You can take an identification card");
    } else if (age > 18) {
        println("You can drink alcohol")
    } else if (age > 35) {
        println("You can get married")
    }
    var seasons = 1
    when (seasons) {
        1 -> println("winter");
        2 -> println("summer");
        3 -> println("spring");
        4 -> println("autumn");
        else -> {
            println("Invalid season");
        }
    }
    when (seasons) {
        in 3..5 -> println("winter");
        in 6..9 -> println("Summer");
        in 9..12 -> print("Spring");
        in 1..2 -> println("autumn");
        else -> println("tarisa value yako")
    }
    var x: Any = 13.7f
    when (x) {
        is Int -> println("Its an integer");
        is Double -> println("Its a double");
        is Float -> println("Its a float");
    }
    var ab = 1.00;
    //TODO For loop
    for (ab in 1..6) {
        println("1 is greater than $ab")
    }
    var sum = addup(2, 3);
    println("The sum is $sum");
}


//Todo functions

fun addup(a:Int, b:Int):Int
{
    return a+b;
}
