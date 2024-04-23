package quiz3

fun main() {
    var nullable:String?=null
    //var size=nullable.length
//    var size=nullable?.length

    var size=nullable?.length?:0
    println(size)
}