package ex_221102

class Pond(_name:String, _members:MutableList<Duck>){
    // 매개 변수 저장
    val name:String=_name
    val members:MutableList<Duck> =_members

    // 생성자를 생성하는 예약어
    constructor(_name: String):this (_name, mutableListOf<Duck>())

}
class Duck(val name:String)
fun main(){
    // 1. Pond 클래스에 name 을 넣어 객체 생성, Duck 클래스도 마찬가지
    val pond=Pond("myFavorite")
    val duck1=Duck("Duck1")
    val duck2=Duck("Duck2")

    // 2. val pond에 add를 통해 값을 추가한다.
    pond.members.add(duck1)
    pond.members.add(duck2)


    for (duck in pond.members){
        println(duck.name)
    }
}