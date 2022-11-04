//package ex_221104
//
//interface Pet{
//    var category :Stringval msgTags: String
//            get()= :"I'm your lovely pet"
//    fun feeding()
//    fun patting(){
//        println("Keep patting")
//    }
//}
//open class Animal(val name:String)
//
//class Dog(name:String, override var category:String) :Animal(name), Pet{
//    override fun fedding(){
//        println("Feed the dog a bone")
//    }
//}
//class Cat7(name:String, override var category:String) :Animal(name), Pet{
//    override fun feeding(){
//        println("Feed the cat a tuna can")
//    }
//
//}
//
//class Master{
//    fun playWithPet(dog:Dog){
//        println("Enjoy with my cat.")
//    }
//}
//fun main(){
//    val master=Master()
//    val dog=Dog("Toto", "Small")
//    val cat=Cat7("Coco", "BigFat")
//    master.playWithPet(dog)
//    master.playWithPet(cat)
//}