import java.awt.Color

fun main (){
   var car=Car("Toyota","Toyota Avalon","Blue",5)
    car.carrying(10)
    car.identity()
    var x = car.parkingfee(50)
    println(x)
    var bus = Bus("sururban","premier","white",9)
    var fare=bus.maxtripfare(90.88)
    println(fare)








}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-//calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20(1 point)

   open class Car(var make:String,var model:String,var color:String,var capacity:Int){
       fun carrying(people:Int){
          var x = people-capacity
           if (people <= capacity)
          println("carrying $people passengers")  else{
              println("overcapacity $x people")
           }

       }
     fun identity(){
       println("I am $color $make $model")
     }
       open fun parkingfee(hours:Int):Int{
           var fees=hours*20
           println("fees")
           return fees
       }
}

//2.//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
  class Bus( make:String, model:String, color:String,  capacity:Int):Car (make,model,color,capacity){

    fun maxtripfare(fare: Double): Double {
        var busfare = 50.5
        return busfare
    }
    override fun parkingfee(hours:Int):Int{
        var product=hours*20
        println("product")
        return product
    }


    }




