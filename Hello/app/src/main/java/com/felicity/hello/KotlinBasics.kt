package com.felicity.hello

fun main() {
   // printStatements();
    //TODO: a new class
    //getAdd();
    getSeasons()
    //getComparison();
    //ifStatements();
}

private fun getSeasons() {
    var season = 3;
    when (season) {
        1-> println("one");
        3-> println("two");
        3-> println("Three");
        else -> println("no seasons")
    }
    var month =1;
    when(month) {
        in 3..5-> println("spring");
        in 6..8-> println("winter");
        in 9..11-> println("fall");
        12,1,2->println("summer");
        else -> println("no seasons")
    }
}

private fun ifStatements() {
    //if statements
    var name = "Mike"
    if (name == "Mike") {
        println("yes Michael");
    } else {
        println("thats not Mike")
    }
}

private fun printStatements() {
    println("hello");
    var name = "Michael";
    println("Hello! " + name);
    //Immutable variable
    val names = "Michael";
    println("Hello! val " + names);
}

private fun getAdd() {
    var result = 5 + 3
    println(result);
}

private fun getComparison() {
    //Comparison == != >= <=
    var a = (6 == 6);
    println(a);
    var  b = (6 != 6);
    println(b);
    var  c= (6 >6);
    println(c);
}