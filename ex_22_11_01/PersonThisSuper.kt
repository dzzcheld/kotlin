package ex_22_11_01

open class Person{
    constructor(firstName:String){
        println("[Person] firstName: $firstName")
    }
    //3. age를 받기 위해 옴
    constructor(firstName:String, age:Int){
        println("[Person] firstName: $firstName, $age")
    }
}
// 보조 생성자, 인수를 확인해준다
//5. 반환해주기 위해 다시 돌아옴,  이 후 메인으로 다시간다.
class Developer:Person{
    constructor(firstName:String):this(firstName, 10){ //2. 매개변수에 인자값 저장, firstName 저장 
        println("[Developer] $firstName")
    }
    
    // 4. 받아온 age를 출력
    constructor(firstName: String, age: Int):super(firstName, age){
        println("[Developer] $firstName, $age")
    }
}

fun main(){
    val miso=Developer("Miso") //1.Developer 호출
}