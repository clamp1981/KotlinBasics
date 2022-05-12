package study.tutorials.kotlinbasics

//일반 함수
fun addNumber( a :Int, b: Int ){
    var sum = a+b
    println(sum)
}
fun main(){

    //일반식
    addNumber( 10, 2 ) //print 12
    //람다식
    val sum:(Int, Int)->Int={ a:Int,b:Int -> a+b }
    println(sum(10,2)) //print 12
        //짧게
    var sum01 = { a:Int, b:Int->println(a+b)}
    sum01(10,2) //print 12
}