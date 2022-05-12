package study.tutorials.kotlinbasics



fun main(){
    val stringList : List<String> = listOf(
        "Denis", "Frank","YK", "Michael" )

    val mixedTypeList : List<Any> = listOf(
        "Denis", 31, 5, "BDay", 71.2, "Weight"  )

    //if..else 문
    for( value in mixedTypeList ){
        if( value is String ){
            println("String : $value of length ${value.length}")
        } else if( value is Int ){
            println("Integer : $value ")
        }else if( value is Double ){
            println("Dobuble  : $value with floor value ${Math.floor(value)}")
        }else{
            println("Unknown Type ")
        }

    }


    //when
    for( value in mixedTypeList ){
        when (value) {
            is String -> {
                println("String : $value of length ${value.length}")
            }
            is Int -> {
                println("Integer : $value ")
            }
            is Double -> {
                println("Dobuble  : $value with floor value ${Math.floor(value)}")
            }
            else -> println("Unknown Type ")
        }
    }

    //형변환
    //안전한 형변환
    val obj1:Any = "I have a dream"
    if( obj1 !is String)
        println("Not a String")
    else{
        println("obj1 is String , Length ${obj1.length}")
    }

    //안전 하지 않은 형변환 ( as 키워드  )
    //obj1이 문자열이 아닌 경우 문제가 생김 ( error 발생 )
    val strig1 : String = obj1 as String
    println(strig1.length)

    //안전 한 형변환 ( as? 키워드  )
    val obj2 :Any = 1337
    val strig2 : String? = obj2 as? String
    println(strig2) //문자열이 아니면 null


}