package desafioKotlin


class Aluno(var nome:String,var sobrenome:String, var codigoAluno:Int
){

    //Diferenciação de cada aluno pelo RG
    override fun equals(other: Any?): Boolean {
        val outroAluno = other as? Aluno
        return when(other){
            is Aluno -> this.codigoAluno == outroAluno?.codigoAluno
            else -> super.equals(other)
        }
    }

    override fun hashCode(): Int {
        return codigoAluno
    }
}
