package study.tutorials.kotlinbasics

//접근 제한자
//4가지
// public (기본) : 선언하지 않으면 기본으로 설정정
// private : 선언된 필드 안에서만 사용
// protected : 선언된 클래스와 서브 클래스사용 가능
// internal : 시행된 모듈안에서만 필드가 보이게 한다. 즉 같은 파일안에서는 보임
// open : 코틀린에만 있는 접근 제한자 , 기본적으로 코틀린은 class를 상속할 수 없다.
//        모든 클래슥 최종 클래스임, 그래서 상속을 사용하려면 "open" 제한자를 선언해야 함


//상속이 가능한 클래스 public
open class Base(){
    var a = 1 //public 변수
    private var b = 2 //private 변수 base 클래스에만 사용가능
    protected open var c = 3 //Base, Derived 클래스에서는 사용가능
    internal val d = 4 //같은 파일에서 보임
    protected  fun e() {} //Base, Derived 클래스에서는 사용가능
}

//Base를 상속한 public 클래스
class Derived :Base() {

    override var c = 9
}
fun main(){
    //base.a and base.d 보임
    val base = Base()
    //derived.a and derived.d 보임
    var derived = Derived()
    

}