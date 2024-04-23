package inheritanceEx5

class Child:Parent(name = "hong", age = 33) {

    fun info():Unit{
        println(name + age)
    }
}