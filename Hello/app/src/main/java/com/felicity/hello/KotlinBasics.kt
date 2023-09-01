package com.felicity.hello
data class AibnbUser(val loginUserId:Int,val userName:String)
//Super class
open class AeroInheritence{

}
//Sub Class of AeroInheritence
open class Jet(val name:String, val brand:String):AeroInheritence() {
var  nam=name;
var bran=brand;
open var jetspeed:Double=0.0;
    fun  getJetSpeed(speed: Double): Double{
        jetspeed=+speed;
        return jetspeed;
    }
}
class Firejet(name: String,brand: String, speed: Double):Jet("Turbo Jet","xenomygot"){
 var aka=name;
//print(nam);
 override  var jetspeed=speed*250;

}
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
   // getDataClass();
    // getInheritance();
     //getArray();
     //getList()
    //getSets()
   //getMaps();
      val arrList = ArrayList<String>();
       arrList.add("tendai");
       arrList.add("kudzai");
       println(arrList);
    for(i in arrList){
        println(i);
    }
    val arrLst:ArrayList<String> = ArrayList<String>(5);
    val lst: MutableList<String> = mutableListOf<String>()
        lst.add("Tendai")
        lst.add("Kudzai")
        arrLst.addAll(lst);
    val itr = arrLst.iterator()
    while(itr.hasNext()){
    println(itr.next())
    }
    println("The size of arraylist "+ arrLst.size);
    println("The position two in a array: "+arrLst.get(1))
}

private fun getMaps() {
    var mapdata = mapOf(1 to 3, 2 to "t", 7 to "method")
    println(mapdata[7]);
    for (keyt in mapdata.keys) {
        println("the values in the maps  key :$keyt  values: ${mapdata[keyt]}")
    }
    var mapsdat = mapOf("favor" to Colors("yellow", 2.34), "color" to Colors("yellow", 2.34))
    for (keyt in mapsdat.keys) {
        println("the values in the mapss key :$keyt  values: ${mapsdat[keyt]}")
    }
    var mapDataMutable= mapdata.toMutableMap();
    mapDataMutable[3]="alkali"
    println(mapDataMutable.toSortedMap());
}

private fun getSets() {
    var setsOfFruits = setOf("Orange", "Apple", "Pineapple")
    setsOfFruits.toSortedSet()
    println(setsOfFruits.toSortedSet())
    val newFruits= setsOfFruits.toMutableList();
    newFruits.add("Watermelon");
    println(setsOfFruits.elementAt(2));
    newFruits.add("Pear");
    println(newFruits);
}

private fun getList() {
    var months = listOf("January", "February", "March", "April");
    var anytypes = listOf(1, 2, "ddef", 7.5)
    println(anytypes.size)
    for (month in months) {
        println("the months are: $month")
    }
    //Lists do not allow new members hence there is need for the use of mutable list
    var additionalMonth = months.toMutableList();
    var newMonth = listOf("May")
    additionalMonth.addAll(newMonth)
    for (month in additionalMonth) {
        println("the months are: $month")
    }
    additionalMonth.removeAt(3)
    for (month in additionalMonth) {
        println("the months are: $month")
    }
}

private fun getArray() {
    val intAry = intArrayOf(1, 2, 3, 2, 4);
    for (element in intAry) {
        println("the int value is : ${element + 2}");
        println("the int value before adding a 2  is : $element")
    }
    println("Before change ${intAry.contentToString()}");
    intAry[3] = 43;
    println("After change ${intAry.contentToString()}");
    var dataArray = arrayOf(Colors("Yellow", 5.6), Colors("Blue", 5.3))
    println("the data array:${dataArray.contentToString()}");
    for (elem in dataArray.indices) {
        println("The colors are ${dataArray[elem].colorname}  and color code is ${dataArray[elem].colorcode}")
    }
}

data class  Colors(var colorname:String,var colorcode:Double)
private fun getInheritance() {
    var superMidJet = Firejet("method", "rete", 0.00)
    println(superMidJet.nam);
    println("the speed of the jet is ${superMidJet.getJetSpeed(4747.0)}")
    println("the override speed of the jet is ${superMidJet.jetspeed}")
}

private fun getDataClass() {
    var airbDataUser1 = AibnbUser(1, "Alex");
    var airbDataUser2 = AibnbUser(2, "Tendai");
    var userAirbn1 = airbDataUser1.userName;
    var userAirbn2 = airbDataUser2.userName;
    println("The system user is ${userAirbn1}");
    println(
        "the user1 with username: ${userAirbn1} is it the same as the user2 with username: ${userAirbn2} " + " username check:  ${
            userAirbn1.equals(
                userAirbn2
            )
        }"
    );
    println("User details are: ${airbDataUser2}");
    var airbDataUser3 = airbDataUser1.copy(loginUserId = 3);
    println("The copied data is ${airbDataUser3}");
    println(airbDataUser3.component1());
    println(airbDataUser3.component2());
    var (id, name) = airbDataUser3
    println("The id is ${id}")
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