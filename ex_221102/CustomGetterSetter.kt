package ex_221102

    //2. 매개변수를 저장
class User(_id:Int, _name:String, _age:Int){
    val id:Int=_id

    var name:String=_name
        set(value){
            println("The name was changed")
            field=value.uppercase()
        }

    var age:Int= _age
}

fun main(){
    // 1. 객체 생성
    val user1=User(1, "kildong", 35)
    
    user1.name="coco"
    println("user3.name=${user1.name}")
}