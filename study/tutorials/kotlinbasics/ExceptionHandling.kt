package study.tutorials.kotlinbasics

import java.lang.ArithmeticException

fun getNumber( str:String):Int{
    var a = 0
    try{
        Integer.parseInt(str) //파싱 못하면 catch 에러로 넘어감
    }catch( e: ArithmeticException ){
        a = -1
    }catch ( e:ArrayIndexOutOfBoundsException) {
        a = -1
    }finally {
        println("getNumber");
    }

    return a
}
fun main(){
    val str = getNumber("10")

    //print 10
    //print getNumber
    println(str)



}