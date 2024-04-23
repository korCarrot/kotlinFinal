package interfaceEX

class TV:RemoteControl{
    override var MAX_VOLUME:Int=50
    override var MIN_VOLUME:Int=0

    override fun turnOn() {
        println("TV 켜다")
    }

    override fun turnOff() {
        println("TV 끄다")
    }
}