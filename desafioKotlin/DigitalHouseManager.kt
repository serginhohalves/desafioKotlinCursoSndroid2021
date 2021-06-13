package desafioKotlin


class DigitalHouseManager{
    val listAlunos:MutableList<Aluno> = mutableListOf()
    val listProfessores:MutableList<Professor> = mutableListOf()
    val listCursos:MutableList<Curso> = mutableListOf()
    val listMatricula:MutableList<Matricula> = mutableListOf()


    //Registro do Curso
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        listCursos.add(Curso(nome,codigoCurso,quantidadeMaximaDeAlunos))
    }

    //Excluir o Curso

    fun excluirCurso(codigoCurso: Int){
        listCursos.forEach{curso ->
            if(curso.codigoCurso == codigoCurso){
                listCursos.remove(curso)
            }
        }
        
    }

    // Registro do professor adjunto
    fun registrarProfessorAdjunto(nome: String , sobrenome:String ,codigoProfessor: Int, horasMonitoria: Int){
        listProfessores.add(ProfessorAdjunto(nome,sobrenome,codigoProfessor,horasMonitoria))
    }


    // Registro do professor titular
    fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Int, especialidade: String){
        listProfessores.add(ProfessorTitular(nome,sobrenome,codigoProfessor,especialidade))
    }


    //Exclusao do professor
    fun excluirProfessor(codigoProfessor: Int){
        listProfessores.forEach { professor ->
            if(professor.codigoProfessor == codigoProfessor){
                listProfessores.remove(professor)
            }
        }
    }


    //Matricula do aluno
    fun  matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        listAlunos.add(Aluno(nome,sobrenome,codigoAluno))
    }

    //Matricular aluno em algum Curso
   fun matricularAluno(codigoAluno: Int, codigoCurso: Int){

       val curso = listCursos.find{it.equals(codigoCurso)}
        val aluno = listAlunos.find{it.equals(codigoAluno)}

        if(curso != null && aluno != null){
            if(curso.adicionarUmAluno(aluno)){
                listMatricula.add(Matricula(aluno,curso))
                println("Matricula realizada")
            }else{
                println("Nao foi possivel realizar a matricula")
            }

        }

   }

//Alocando os professores
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val cursoProcurado = listCursos.find{it.equals(codigoCurso)}
        val professorTitular = listProfessores.find { it.equals(codigoProfessorTitular) }
        val professorAdjunto = listProfessores.find { it.equals(codigoProfessorAdjunto) }

        if(cursoProcurado != null){
            if(professorAdjunto != null && professorTitular != null){
                listProfessores.add(professorAdjunto)
                listProfessores.add(professorTitular)
            }
        }

    }









}