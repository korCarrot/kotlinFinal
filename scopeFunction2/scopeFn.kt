
package scopeFunction2

// 스코프(영역) 람다 함수(also, let)
//apply는 also와 기능이 같다.
//run은 let과 기능이 같다.
//하지만 also, let은 it키워드를 사용해 객체 변수를 참조한다는 것.

class Book constructor(var name:String, var price:Int){
    fun discount(){
        price -=  2000
    }
}

fun main() {
    var book1:Book=Book("개미", 20000)
    println(" 책 이름은 ${book1.name}이고, 가격은 ${book1.price}" )

    book1.also {    // apply 코프(영역) 람다 함수는 블록 안의 함수를 적용하라
        it.discount()
    }
    println(" 책 이름은 ${book1.name}이고, 가격은 ${book1.price}" )

    var res:String=book1.let {
        it.discount()
        "결과값"
    }
    println(" 책 이름은 ${book1.name}이고, 가격은 ${book1.price}" )
    println(res)
}