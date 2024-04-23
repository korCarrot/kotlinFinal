package nullex


fun f1(gift:String?){
    println(gift)
    if(gift != null){
        println( gift.length);
    }
}

fun main() {

    f1("과자")
    f1("탕후루")
    f1(null)
}