package classuse

class Car constructor(val color:String){   //primary 생성자
    // 클래스의 멤버변수는 Property
    var nation:String="대한민국"

    lateinit var model:String
    val person:Person by lazy {Person()}

    init {
        model="genesis"

    }

    //default 생성자




    //secondary 생성자




    fun m1():Unit{
        println("m1")
    }

}