fun main(){
    var str1:String?="hello kotlin" //  str1 null이 가능하게 한다
    //var str1:String="hello kotlin" null이 없기에 오류가 발생한다
    str1=null // str1에 null값을 저장한다

    val len=if(str1!=null) str1.length else -1
    // str1이 null이 아니면
    
    println("str1: $str1 length: ${len}")
}