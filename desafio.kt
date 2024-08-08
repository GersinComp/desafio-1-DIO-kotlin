// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, var nivel: Nivel, var alunos: List<Usuario>)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        for (conteudo in conteudos.indices)
            println(conteudo)
    }
}

fun main() {
    println("Informe os dados para a matricula! \nnome: ")
    var nome = readln()
    var usuario1 = Usuario(nome)
    var usuarios = mutableListOf<Usuario>()
    usuarios.add(usuario1)
    var conteudo1 = ConteudoEducacional(nome = "Back-end com Kotlin", nivel = Nivel.BASICO, alunos = usuarios)
    var listaConteudos = mutableListOf<ConteudoEducacional>()
    listaConteudos.add(conteudo1)
    var formacao = Formacao("Kotlin", listaConteudos)
    formacao.matricular(usuario1)
    println(formacao)
    var notas: List<Double>
}
