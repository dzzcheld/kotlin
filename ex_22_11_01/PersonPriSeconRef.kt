package ex_22_11_01
// 주 생성자부터 로직이 돌지만, 실행은 보조 생성자 먼저

    // 3. 주 생성자에서 저장.
class Person_a(firstName:String,
             out:Unit = println("[Primary Constructor] Parameter ") ){
      val fName=println("[Property]Person fname:$firstName")

        // 4. init을 거치고 메인으로 반환해준다.
      init{
          println("[init] Person init block")
      }
     
    // 2. 로직상 주 생성자 부터 돌지만 보조 생성자 호출
    // this를 들렸다가 주 생성자로 간다.
      constructor(firstName:String, age:Int,
            out:Unit=println("[Secondary Constructor] Parameter")):this(firstName){
                println("[Secondary Constructor] Body:$firstName, $age")
            }
}

fun main(){
    // 1. Person_a에 인자값을 넣어 호출
    val p1=Person_a("kildong", 30)
    println()
    val p2=Person_a("Dooly")
}