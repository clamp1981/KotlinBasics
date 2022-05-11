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

}