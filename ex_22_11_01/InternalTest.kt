package ex_22_11_01

internal class InternalClass{
    internal var i=1
    internal fun icFunc(){
        i+=1
    }
    fun access(){
        icFunc()
    }
}
class Other{
    internal val ic=InternalClass()
    fun test(){
        ic.i
        ic.icFunc()
    }
}
fun main(){
    val mic=InternalClass()
    println(mic.i)
    mic.icFunc()
}