package study.tutorials.kotlinbasics

fun main(){
    //동적 배열
    val arrayList = ArrayList<String>() //빈 동적 배열 생성
    arrayList.add("One");
    arrayList.add("Two");


    //One
    //Two
    for( i in arrayList )
        println( i )

    val arrayList01 = ArrayList<String>(5) //배열 크기 제한한 arrayList
    var list:MutableList<String> = mutableListOf<String>()

    list.add("One");
    list.add("Two");

    arrayList01.addAll(list);

    //One
    //Two
    for( i in arrayList01 )
        println( i )

    //Two
    println(arrayList01.get(1))

    val itr = arrayList01.iterator()

    //One
    //Two
    //Size of arrayList02 = 2
    while(itr.hasNext()){
        println( itr.next() )
    }
    println( "Size of arrayList02 = " + arrayList01.size )

    //연습 문제 ( 5개의 숫자를 더한 프로그램 작성 후 평균 계산
    var arrayIntList = ArrayList<Double>()
    arrayIntList.add(1.0)
    arrayIntList.add(2.0)
    arrayIntList.add(3.0)
    arrayIntList.add(4.0)
    arrayIntList.add(5.0)

    var sum = 0.0
    var average = 0.0
    for( i in arrayIntList)
        sum += i
    average = (sum / arrayIntList.size)

    println( average.toString() )

}