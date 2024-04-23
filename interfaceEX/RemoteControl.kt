package interfaceEX

interface RemoteControl {

    //상
    val MAX_VOLUME: Int
    val MIN_VOLUME: Int

    //추
    abstract fun turnOn()
    abstract fun turnOff()



}