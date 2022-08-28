fun main() {
    val likes = 311
    val score = likes % 10
    var ex = 11
    for (i in 11..5_000_011 step 100)
        if (i == likes)
            ex = i


    if (ex == likes) {
        println("людям")
    } else if (score == 1) {
        println("человеку")
    } else {
        println("людям")
    }

}