
package scopeFunction

// 스코프(영역) 람다 함수(apply, run, with )는 코드를 축약해서 표현할 수 있도록 도와주는 함수, 함수형 언어를 좀 더 편리하게 사용할 수 있도록 하는 기본 함수
//사용법은 함수처럼 사용하지 않는다. 장점 : 코드가 깔끔해짐
// apply, run(apply랑 똑같은 기능이지만 마지막 구문에 있는 값을 반환해주는 차이가 있음)
//with (run이랑 똑같지만 사용법만 다름 , book1.run 로 하는 것 대신에  with(book1) 방식으로 하면 됨  )

class Book constructor(var name:String, var price:Int){
    fun discount(){
        price -=  2000
    }
}

fun main() {
    var book1:Book=Book("개미", 20000)
    println(" 책 이름은 ${book1.name}이고, 가격은 ${book1.price}" )

//    book1.apply {    // apply 코프(영역) 람다 함수는 블록 안의 함수를 적용하라
//        discount()
//    }
//    println(" 책 이름은 ${book1.name}이고, 가격은 ${book1.price}" )


    var res:String=book1.run {
        discount()
        "결과값"
    }
    println(" 책 이름은 ${book1.name}이고, 가격은 ${book1.price}" )
    println(res)



    var res2=with(book1){
        discount()
        "결과값2"
    }
    println(" 책 이름은 ${book1.name}이고, 가격은 ${book1.price}" )
    println(res2)


}