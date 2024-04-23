package dataClassTestGetterSetter

fun main() {

    // 데이터 클래스(간단한 값의 저장 용도)
    var m1:Member=Member("hong3", "11114")

    println(m1.id + "," + m1.pw)

    println(m1.toString())

//    m1.id="hihi"

}

