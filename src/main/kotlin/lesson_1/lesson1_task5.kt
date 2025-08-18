package lesson_1

fun main() {
    val seconds = 6480 //seconds
    val oneHour = 3600 //seconds
    val remains = seconds - oneHour
    //println(remains)
    val minute = 60 //seconds
    val minutes = remains / minute
    //println(minutes)
    val time: String = "01:48:00"
    print(time)

}

