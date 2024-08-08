package DIO

fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")
    println("${slugTitulo}_${slugAutor}")

}

fun String.generateSlug(): String {
    return this
        .lowercase() // Converte toda a string para minúsculas
        .replace(Regex("[^a-z0-9\\s]"), "") // Remove caracteres especiais
        .replace(Regex("\\s+"), "-") // Substitui espaços por traços
}