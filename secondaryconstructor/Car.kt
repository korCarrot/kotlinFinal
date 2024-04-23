package secondaryconstructor


// secondary 생성자
class Car  {

    constructor(color:String){
        println(color)
    }

    constructor(color:String, speed:Int){
        println(color+speed)
    }

    constructor(color:String, speed:Int, model:String){
        println(color+speed+model)
    }

}