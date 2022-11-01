//package ex_22_11_01
//
//open class Base{
//    open val x:Int=1
//    open fun f()= println("Child class f()")
//
//    class Child:Base(){
//        override val x:Int=super.x + 1
//        override fun f()=println("Child class f()")
//    }
//
//    inner class Inside{
//        fun f()=println("Inside class f()")
//        fun test() {
//            f()
//            Child().f()
//            super@Base.Child.f()
//            println("[Inside]super@Child.x:${super@Base.Child.x}")
//        }
//    }
//}
//fun main(){
//    val c1= Base.Child()
//
//    c1.Inside().test()
//}
//
