package desafioKotlin

abstract class Professor(
    val nome:String,
    val sobrenome: String,
    val codigoProfessor: Int
    )
{

    val tempoCasa: Int = 0

    override fun equals(other: Any?): Boolean {
        val outroProfessor = other as? Professor
        return when(other){
            is Professor -> this.codigoProfessor== outroProfessor?.codigoProfessor
            else -> super.equals(other)
        }
    }

    override fun hashCode(): Int {
        return codigoProfessor
    }

}

