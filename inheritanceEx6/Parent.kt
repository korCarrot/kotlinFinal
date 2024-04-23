package inheritanceEx6

open class Parent {


    constructor(name:String){
        println(name)
    }

    constructor(name:String, age:Int){
        println(name+age)
    }
}