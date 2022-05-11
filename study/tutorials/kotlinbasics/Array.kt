package study.tutorials.kotlinbasics

data class Fruit( val name:String, val price :Double )
fun main()
{
    //array 선언및 초기화
    var numbers01 : IntArray = intArrayOf(1,2,3,4,5,6)
    var numbers02 = intArrayOf( 1,2,3,4,5,6 )
    var numbers03 = arrayOf( 1,2,3,4,5,6 )
    println(numbers01.contentToString()) //[1,2,3,4,5,6]
    for( element in numbers02 )
        print( element ); //123456

    var days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    println(days.contentToString()) //[Sun,Mon,Tues,Wed,Thurs,Fri,Sat]

    var fruits = arrayOf(Fruit("apple", 12.0), Fruit("Tomato", 5.0))
    println(fruits.contentToString()) //[Fruit(name=apple, price=12.0), Fruit(name=Tomato, price=5.0)]

    //apple price is 12.0
    //Tomato price is 5.0
    for( fruit in fruits )
        println("${fruit.name} price is ${fruit.price}")

    //apple price is 12.0
    //Tomato price is 5.0
    for( index in fruits.indices )
        println("${fruits[index].name} price is ${fruits[index].price}")


    //다양한 값을 가지는 배열
    var mixDatas = arrayOf( "Sun", "Mon", 1,2,Fruit("apple", 12.0))
    println(mixDatas.contentToString()) //[Sun, Mon, 1, 2, Fruit(name=apple, price=12.0)]
}