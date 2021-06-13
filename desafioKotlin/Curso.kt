package desafioKotlin

class Curso(
    var nome: String,
    var codigoCurso: Int,
    val quantidadeMaximaDeAlunos: Int,

){
    val listAlunos: MutableList<Aluno> = mutableListOf()
    var professorTitular: ProfessorTitular?= null
    var professorAdjunto: ProfessorAdjunto?= null

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listAlunos.size <= quantidadeMaximaDeAlunos){
            println("Ainda Há Vagas no Curso")
            listAlunos.add(umAluno)
            return true
        } else{
            println("Nao há mais vagas disponíveis")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno){
        listAlunos.remove(umAluno)
        println("Aluno foi removido")
    }


    override fun equals(other: Any?): Boolean {
        val outroCurso = other as? Curso
        return when(other){
            is Curso -> this.codigoCurso == outroCurso?.codigoCurso
            else -> super.equals(other)
        }
    }

    override fun hashCode(): Int {
        return codigoCurso
    }

}