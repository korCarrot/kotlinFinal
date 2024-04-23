package companionUse


//object 자바의 static
class Car {

    //companion object은 static
    companion object{
        var nation:String="korea"

        fun hi2():Unit{
            println("hi2")
        }
    }


    var color:String="white"

    fun hi():Unit{
        println("hi")
    }

}