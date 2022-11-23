enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome:String, val id: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int, val level: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val level: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun show_user(us: List<Usuario>){
        for(user in us){
            println("User ${user.id}: ${user.nome}")
        }
    }

    fun show_content(){
        for(content in conteudos){
            println("Name: ${content.nome} | Time: ${content.duracao} | Level: ${content.level}")
        }
    }
}


fun main() {
    val python = ConteudoEducacional("python",100,Nivel.BASICO)
    val c = ConteudoEducacional("C",100,Nivel.INTERMEDIARIO)
    val us1 = Usuario("Vinicius",1)
    val us2 = Usuario("Tallys",2)

    val list_content = mutableListOf<ConteudoEducacional>()
        list_content.add(python)
        list_content.add(c)

    val list_user = mutableListOf<Usuario>()
        list_user.add(us1)
        list_user.add(us2)

    val bsi = Formacao("BSI",list_content,Nivel.DIFICIL)
    println("${bsi.nome} -- ${bsi.level}")

    bsi.matricular(us1)
    bsi.matricular(us2)

    bsi.show_user(list_user)
    bsi.show_content()
}

// "Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos)
// Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.
// Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão
