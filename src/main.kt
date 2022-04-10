/*Assignment 9: Lists
5. Write a function that takes in a list of Car objects each with a
registration and mileage attribute and returns the average mileage of
all the vehicles in the list.*/



fun main(){
listStrings(listOf("1","2","16","18","20","8","0","20","34","17"))
personHeight(listOf(1,2,3,4,5))
var mercy=Person("Mercy",23,56,55)
    var penina=Person("Penina",27,100,49)
    var hellen=Person("Hellen",29,120,57)

    var peopleList1= listOf(mercy,penina,hellen)
    var sortedList= peopleList1.sortedByDescending { person-> person.age }
    println(sortedList)

    var paul=Person("paul",22,61,75)
    var oty=Person("oty",30,150,60)
    var peopleList2= listOf(paul,oty)
    var mergeTwo=(peopleList1.plus(peopleList2))
    println(mergeTwo)

    var miles1= Cars("33333",10)
    var miles2= Cars("33333",20)
    var miles3= Cars("33333",30)
    var totalMiles= listOf(miles1,miles2,miles3)
  println(totalMiles)

    var average=averageMileage(listOf(miles1,miles2,miles3))
    println(average)



    }




fun listStrings(numbers:List<String>):List<String>{
numbers.forEachIndexed { index, i ->
    if (index%2==0){
        println(i)
    }
}
    return numbers
}
/*. Given a list of people’s heights in metres. Write a function that returns
the average height and the total height    (2 points)*/
fun personHeight(height:List<Int>):String{
        var calculate=height.average()
        var sumsum=height.sum()
      var c=("This will return average which is $calculate and sum which is $sumsum")
    println(c)
    return c

}
/* Given a list of Person objects, each with the attributes, name, age,
height and weight. Sort the list in order of descending age   (2 points)*/
data class Person(var name:String,var age:Int,var height: Int, var weight:Int)

/* Given a list similar to the one above, write a function in which you will
create 2 more people objects and add them to the list at one go.
(1 points)*/

/*Write a function that takes in a list of Car objects each with a
registration and mileage attribute and returns the average mileage of
all the vehicles in the list.*/
data class Cars(var reg:String, var mileage:Int)

fun averageMileage(miles:List<Cars>):Int{
var que=0
    miles.forEach { r ->
        que+=r.mileage

    }

    return que/miles.count()
}





