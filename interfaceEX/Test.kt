package interfaceEX

fun main() {

    var audio:RemoteControl=Audio()
    println(audio.MAX_VOLUME)
    println(audio.MIN_VOLUME)
    audio.turnOn()
    audio.turnOff()

    var tv:RemoteControl=TV()
    println(tv.MAX_VOLUME)
    println(tv.MIN_VOLUME)
    tv.turnOn()
    tv.turnOff()
}