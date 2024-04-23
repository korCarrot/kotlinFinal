package companionUse

fun main() {
    var car1=Car()
    println(car1 is Car)
    println(car1.color)

    var myCar=Car()
    myCar.color="red"
    println(myCar.color)


    println(Car.nation)


    Car.nation="korea2"
    println(Car.nation)

    Car.hi2()
}
