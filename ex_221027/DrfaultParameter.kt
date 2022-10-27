package ex_221027

//메인 메서드, 최상위 val 초기화 선언
fun main(){
    val name="홍길동"
    val email="hong@example.kr"

    // add 메서드를 통해 이름과 이메일을 출력해준다
    // defaultArgs 메서드를 통해 두 정수의 합을 구한다.
    add(name)
    add(name, email)
    add("둘리", "dooly@example.kr")
    defaultArgs()
    defaultArgs(200)
}

fun add(name:String, email:String="default"){
    val output="${name} 님의 이메일은 ${email} 입니다."
    println(output)
}

fun defaultArgs (x:Int=100, y:Int=200){
    println(x+y)
}
