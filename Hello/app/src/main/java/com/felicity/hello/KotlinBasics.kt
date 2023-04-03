package com.felicity.hello
data class AibnbUser(val loginUserId:Int,val userName:String)
fun main() {
   // printStatements();
    //TODO: a new class
    //getAdd();
    //getSeasons()
    //getComparison();
    //ifStatements();
    //whileFun();
    //doWhile()
    //forFun();
    //addFun();
    //averageFun();
    //var car= Cars("BMW", "Silver Blue",80.0);
    //Cars();
   // car.stateHobby();
   // println("The hobby is ${car.hobby}") ;
   // println("The BMW M series travel at ${car.sped}")
    //getAirBnb();
    var airbData = AibnbUser(1,"Alex")
    var userAirbn= airbData.userName
    println("The system user is ${userAirbn}")
}

private fun getAirBnb() {
    var air = AirBnB();
    air.airbnbOwner;
    println("My type of airbnb is: ${air.airbnbTypes}");
    air.airbnbTypes = "Super Host";
    println("My type of airbnb is: ${air.airbnbTypes}")
    /// air.numberOfRooms=-2;
    println("the exterior doors are:  ${air.outDoors}")
}

class AirBnB {
    lateinit var airbnbOwner : String
    var airbnbTypes: String ="A unique story house"
    get(){
        return field.uppercase()
    }
    set(value){
        field = value
    }
    var numberOfRooms:Int=30
    get() {
        return field
    }
    set(value){
        field = if(value>0){
            value
        }else {
            throw IllegalArgumentException("The value should be greater than zero")
        }
    }
    var outDoors :Int?=0
    private set
init {
    this.airbnbOwner="tendai";
    this.outDoors=5;
}
    var rating: Int = 5
        get() {
            if (field < 5) {
                print("Warning: this is a terrible book")
            }
            return field
        }
        set(value) {
            field = when {
                value > 10 -> 10
                value < 0 -> 0
                else -> value
            }
        }
}
class Cars (carName:String="Lambogini",carColor:String="Yellow"){
    init{
        println("The car name is $carName and car color $carColor");
    }
    var  sped:Double?=null
    constructor(carNam:String,carColr:String, speed:Double)
            : this(carNam,carColr){
                this.sped=speed;
            }

    var hobby:String="writing code"
    fun stateHobby(){
        println("My hobby: $hobby and maximum speed $sped");
    }
}
private fun averageFun(){
    var a=1.00;
    var b=2
    var c= (a+b)/2;
    println("The average of the two values $c");
}
private fun addFun() {
    var a = addUp(14, 12);
    println(a);
}

fun addUp(a:Int,b:Int):Int {
    var c= a +b;
return c;
}
private fun forFun() {
    for (i in 0 until 10) {
        println("Alexa")
    }
    for (i in 0 downTo 10) {
        println("Down val $i")
    }
    for (i in 10 downTo 1 step 3) {
        println("Down val $i")
    }
}

private fun doWhile() {
    var x = 5
    do {
        println("test $x");
        x -= 1
    } while (x >= 0)
}

private fun whileFun() {
    var i = 100;
    while (i > 0) {
        i -= 2
        println("the value of $i");
    }
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
    whenFun()

}

private fun whenFun() {
    var x: Any = 1;
    when (x) {
        is Int -> println("$x is an int");
        is Double -> println("$x is a double");
        !is Double -> println("$x is a double");
        is String -> println("$x is a string");
        else -> println("$x is none of the above")
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