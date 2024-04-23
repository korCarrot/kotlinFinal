package overrideEx

class Child:Parent() {

    // 메서드 오버라이드 처럼 프로퍼티 역시 open으로 열려 있어야만 오버라이드 할 수 있다.
//    override var name:String="hong2"

    override fun hi(){
        println("hi-Child")
    }

    // 상속할 메소드 앞에 open키워드를 붙이면 오버라이드 할 수 있지만
    // open 키워드가 없는 메서드는 오버라이들 할 수 없다.
//    override fun hi2(){
//
//    }

}