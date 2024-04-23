package quiz3

class Market {
    lateinit var candy:Candy
    init {
        candy=Candy()
        print("사탕명은 ${candy.name}")
    }
}