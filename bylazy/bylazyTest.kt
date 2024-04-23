package bylazy

fun main() {

    val num:Int by lazy {
        println("초기화")
        7
    }

    println(num)
}