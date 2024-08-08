enum class Status { REP, REC, APR, ERRO }

data class Aluno(val nome: String, var notas: List<Double>) {
    var notaFinal: Double? = null
    var status: Status? = null
    var notaTotal = 0.0

    fun calcularMedia() {
        for(nota in notas) {
            notaTotal += nota
        }
        notaFinal = notaTotal/notas.size
    }

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

    println("Insira as infomações do aluno, nome, e suas notas (0.1, 7.3, ...)")

    println("Nome: ")
    val nome1 = readln()

    println("Nota1: ")
    val nota1 = readln()

    println("Nota2: ")
    val nota2 = readln()

    println("Nota3: ")
    val nota3 = readln()

    var notasAluno1 = listOf(nota1.toDouble(), nota2.toDouble(), nota3.toDouble())
    println(notasAluno1)

    val aluno1: Aluno = Aluno(nome = nome1, notas = notasAluno1)
    aluno1.calcularMedia()
    aluno1.definirStatus()
    println("O aluno ${aluno1.nome}, teve seu status final: ${aluno1.status}. \nCom uma nota final igual a ${aluno1.notaFinal}")

}
