enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome:String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val level: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val level: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }


}


fun main() {
    var python = ConteudoEducacional("python",100,Nivel.BASICO)
    var c = ConteudoEducacional("C",100,Nivel.INTERMEDIARIO)
    
    val lista = mutableListOf<ConteudoEducacional>()
        lista.add(python)
        lista.add(c)

    val bsi = Formacao("BSI",lista,Nivel.DIFICIL)
    println("${bsi.nome} -- ${bsi.level}")
}

// "Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos)
// Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.
// Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão
