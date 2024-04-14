package com.felicity.hello

fun main()
{
    getSeason(3);
}

fun getSeason(season: Int)
{
    println(season);
    when(season)
    {
        1->println("Its Summer");
        2->println("Its Winter");
        3->{
            println("Its Autumn");
            println("Its Fall");
        }
        4->println("Its Spring")
        else->println("Invalid Season");
    }
    //Another way to write the when statement
     when(season)
     {
         in 1..1-> println("Its Summer new");
         in 2..2->println("Its Winter new")
         in 3..3 ->{
             println("Its Autumn new");
             println("Its Fall new");
            }
         in 4..4-> println("Its Spring new")
         else ->println("Invalid Season");
     }
    //check age app
    var checkAge=2
    when(checkAge)
    {
        in  1..18 -> println("You are young please go to school");
        in 19..20-> println("You can get  National ID");
        in 21..25->println("You can start a business");

    }
    var month= 3
     when(month)
     {
         in 3..5 -> println("Spring");
         in 6..8 -> println("Summer");
         in 9..11->println("Fall");
         12,1,2        ->println("Winter");
         else -> println("Invalid Season")
     }
    //Checking a variable
    var x: Any=13.37
    when(x)
    {
         is Int-> println("$x its an integer");
         !is Int-> println("$x its not an integer");
         is Double->println("$x this is a double");
         else->println("$x is none of the above");
    }
}

