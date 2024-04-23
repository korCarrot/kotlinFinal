package nullex


fun f2(str:String?){
    //println(str)

    // str이 null이면 length를 체크하지 않고 null을 반환
//    var result = str?.length
    var result = str?.length
    println(result)
}

fun main() {
    // ?. 안전한 호출
    f2(null)


}