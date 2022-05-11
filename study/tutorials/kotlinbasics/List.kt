package study.tutorials.kotlinbasics

fun main(){
    val months = listOf("January", "February", "March") //추가 할 수 없음
    val anyTypes = listOf("January", "February", "March", 1, 2, 1.2, 1.3,false )
    println( anyTypes.size ) //8
    println( months[1] ) //February

    println( months.lastIndex ) //2

    for( month in months )
        print("$month ") //January February March

    var addionalMonths = months.toMutableList()
    addionalMonths.add(1, "22 ")
    addionalMonths.add("33")

    for( month in addionalMonths )
        print("$month ") //January 22  February March 33

    var days = mutableListOf<String>("Sun","Mon","Tues")
    for( day in days )
        print("$day ") //Sun Mon Tues

    println();
    days.add("Wed")
    for( day in days )
        print("$day ") //Sun Mon Tues Wed

    println();
    days.removeAt(1)
    for( day in days )
        print("$day ") //Sun Tues Wed






}