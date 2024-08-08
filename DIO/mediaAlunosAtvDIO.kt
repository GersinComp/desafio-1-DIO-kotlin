package DIO

enum class Status { REP, REC, APR, ERRO }

data class Alunos(var media: Double) {
    var notaFinal: Double? = media
    var status: Status? = null


    fun definirStatus() {
        if (notaFinal!! >= 0.0 && notaFinal!! < 4.9)
            status = Status.REP
        else if (notaFinal!! >= 5.0 && notaFinal!! < 6.9)
            status = Status.REC
        else if (notaFinal!! > 7.0)
            status = Status.APR
        else
            status = Status.ERRO
    }

}

fun main() {

    val nota1 = readln()
    val aluno1: Alunos = Alunos(media = nota1.toDouble())
    aluno1.definirStatus()
    println("${aluno1.status}")

}
