package overrideEx

open class Parent {

   open var name:String="hong"

    open fun hi(){
        println("hi-P")
    }

    fun hi2(){
        println("hi2-P")
    }
}