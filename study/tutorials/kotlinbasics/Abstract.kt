package study.tutorials.kotlinbasics

//상속을 통해서 서브 클래스에서 완성하도록 유도 ( 미완성 설계도 ),
//상속을 위한 클래스이므로 객체를 생성할 수 없다. 단일 상속만 가능
//생성자가 있음
abstract class Mamal( private val name:String, private val origin:String,
                        private val weight : Double ) {
    //추상 속성 ( 상속하는 서브 클래스에서 반드시 오버라이드 되어야 함 )
    abstract var maxSpeed : Double

    //추상 메서드 ( 상속하는 서브 클래서는 반드시 구현해야함. )
    abstract fun run()
    abstract fun breath()

    fun displayDetails(){
        println("Name : $name, Origin : $origin, Weight : $weight, Max Speed : $maxSpeed ")
    }

}

class Human( name: String, origin: String, weight: Double, override var maxSpeed :Double )
    : Mamal(name, origin, weight){

    override fun run(){
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }


}

class Elephant( name: String, origin: String, weight: Double, override var maxSpeed :Double )
    : Mamal(name, origin, weight) {

    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through trunk")
    }
}


fun main(){

    val human = Human("YK", "Korea", 50.0, 10.0 )
    val elephant = Elephant("Rosy", "India", 540.0, 20.0 )

    human.run() //print "Runs on two legs"
    elephant.run() //print "Runs on four legs"

    human.breath() //print "Breath through mouth or nose"
    elephant.breath() //print "Breath through trunk"

}