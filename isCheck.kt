fun main(){
    val num = "asd"

    if(num is String){   // num이 INT 형일 때
        print(num)
    }else if(num !is String){  // num이 INT 형이 아닐 때
        print("Not a Int")
    }
}