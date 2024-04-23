package nullex



fun main() {
     // ?:   (Elvis Operator, str이 null일 경우 가장 뒤에 표시한 10을 반환)
    var str:String?=null

    var size=str?.length?:0
    print(size)

}