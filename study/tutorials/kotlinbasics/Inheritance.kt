package study.tutorials.kotlinbasics

//기본 설계도, 다중 상속 가능
//인터페이스를 상속받은 클래스들은 공통으로 필요한 기능들을 모두 오버라이딩(재정의) 해야함.
//생성자가 없음
interface Drivable{
    val maxSpeed : Double
    fun drive() :  String
    fun brake(){
        println("The drivable is braking")
    }
}
//super or parent or base class
open class Car( override val maxSpeed:Double ,val name : String, val brand :String ) : Drivable {
    open var range :Double = 0.0

    fun extendRange( amount : Double ){
        if( amount > 0 )
            range += amount;
    }

    override fun drive(): String = "driving the interface drive"

    open fun drive( distance :Double ){
        println("Drove for $distance KM!")
    }


}

//sub class of Car
class ElectricCar( maxSpeed: Double, name: String, brand: String, batteryLife :Double )
    : Car( maxSpeed, name, brand ) {
    override  var range :Double = batteryLife * 6

    override  fun drive(distance :Double ){
        println("Drove for $distance KM on electricity")
    }

    override fun drive() : String {
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }

}
fun main(){
    var myMainCar = Car(200.0,"A3", "Audi")
    var myElectricCar = ElectricCar( 220.0,"S-Model", "Tesla", 85.0 )

    myMainCar.drive(200.0) //print "Drove for 200.0 KM!"
    myElectricCar.drive(250.0) //print "Drove for 250.0 KM on electricity"
    var driveString : String = myElectricCar.drive()
    println( driveString ) //print "Drove for 510.0 KM on electricity"

    myMainCar.brake() //print "The drivable is braking"
    //print "The drivable is braking" and "brake inside of electric car"
    myElectricCar.brake()

}