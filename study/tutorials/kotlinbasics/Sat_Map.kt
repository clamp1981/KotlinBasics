package study.tutorials.kotlinbasics

fun main(){

    //Set은 중복되는 데이터를 삭제 하는 컬렉션
    var fruits = setOf("Orange", "Apple", "Grape", "Apple")
    print(fruits.size) //3 ( 중복이 제외됨 )
    print(fruits) //Orange, Apple, Grape
    print(fruits.toSortedSet()) //Apple, Grape, Orange

    print(fruits.elementAt(2)) //Grape

    //map은 키와 값을 같이 저장하는 컬렉션
    val daysOfTheWeek = mapOf( 1 to "MonDay", 2 to "TuesDay", 3 to "WednesDay")
    //1 is MonDay
    //2 is TuesDay
    //2 is WednesDay
    for( key in daysOfTheWeek.keys )
        println("${key} is ${daysOfTheWeek[key]}") //

    val animalsMap = mapOf( 1 to Animal("Cat", 4 ), 2 to Animal("Dog", 4 ))

    //1 is Animal(name=Cat, lag=4)
    //2 is Animal(name=Dog, lag=4)
    for( key in animalsMap.keys )
        println("${key} is ${animalsMap[key]}")

    val newAnimalsMap = animalsMap.toMutableMap()
    newAnimalsMap[3] = Animal("Human", 2 )

    //1 is Animal(name=Cat, lag=4)
    //2 is Animal(name=Dog, lag=4)
    //3 is Animal(name=Human, lag=2)
    for( key in newAnimalsMap.keys )
        println("${key} is ${newAnimalsMap[key]}") //1 is Animal(name=Cat, lag=4) ....

}

data class Animal( val name:String, val lag :Int )