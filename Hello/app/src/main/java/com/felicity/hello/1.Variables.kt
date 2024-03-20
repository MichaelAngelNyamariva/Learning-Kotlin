package com.felicity.hello

fun main ()
{
    //Immutable variable
    //TODO variables
    val name="His Name is Michael" //The val variable can be only set a value once that means it can
    // not be reassigned a value once its given a value .
    println("His name is:$name");
    var names ="Her name is" // The var variable can be reassigned a value at one point in code of the
    // same type. When create a var you should assign a variable to it that is pass a value to the
    // variable .

    println(names);
    //type String
    val hisName=" his name is Michael";
    //type int and requires 32 bits of memory
    val age=2;
    val myByte:Byte=13;
    val myShort:Short=124;
    val myint:Int=22223;

    //Floating pointing numbers types: Float(32 bit capacity) and Double (64 bit capacity) its meant
    // For long numbers
    var myfloat: Float=14.4F
    val mydouble:Double=3.134567854567876;
    //Long is data type used to assign values which are huge for example 123456789876545
    var myLong=234_3456789_3456789 // Please not the underscore is being used to make the number
    // readable in a given code
    println("My long variables are $myLong");
    //Boolean values it has two possible values which are true/false
     val isMyBoolean: Boolean= true;
     println("The boolean value is $isMyBoolean")

    // Characters is a type of variable which stores tiny type of data and you should assign  data usind
    // single qoutes ''
    val test= 'W'
    println("My character is $test");

    //String are  combination of chars
    val myname="Zohan"
    println("The string is $myname"); //Kotlin avoids use the + for joining two strings by using
    // the $ the above statement could be rewritten as shown below
    println("The string myname is :"+myname);
    //Accessing data on a different positions of a string
    var firstChar=myname[0]
    println("The first character of the name is $firstChar");
    // Accessing data at last position of a string.
    var lastChar= myname[myname.length-1]
    println("The last character of the name is $lastChar")
    //Variables are mutable if we use Val and Immutable if we use Var
    // We don't have to specify the value type if we assign a value to a  a variable
    // during declaration of a variable
    //This is an example of a string interpolation
    print("First character is $firstChar and the length of my string is ${myname.length}");
}