package interfaceEX

class Audio:RemoteControl{
    override var MAX_VOLUME:Int=100
    override var MIN_VOLUME:Int=0

    override fun turnOn() {
        println("오디오 켜다")
    }

    override fun turnOff() {
        println("오디오 끄다")
    }
}