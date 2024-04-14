package com.felicity.hello

fun main()
{
    println("While executes a block of code repeatedly as long the given condition is true");
   // runWhileState(3);
    printDescending(100);
}
fun runWhileState(x:Int)
{   var x1=x
    while(x1<10)
    {
        println("The value of x is $x1");
        x1++;
    }

}
fun printDescending(x:Int)
{
    var desc=x;
    while(desc>= 0)
    {
        println("The value $desc is descending with the value 2");
        desc-=2;

    }
}
fun prinDoWhileLoops()
{  var x:Int=0
    do
    {
        print("This is Zygon");
    }
    while()
    {

    }
}