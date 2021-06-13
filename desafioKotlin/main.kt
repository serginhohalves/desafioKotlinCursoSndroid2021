package desafioKotlin


fun main() {

    val geraniums1 = DigitalHouseManager()
     //Professores Titulares
    geraniums1.registrarProfessorTitular("Sérgio", "Alves", 12, "Frotend")
    geraniums1.registrarProfessorTitular("Lucy", "Ribeiro", 13, "Backend")


     //Professores Adjuntos

    geraniums1.registrarProfessorAdjunto("Ricardo", "Silva", 14, 45)
    geraniums1.registrarProfessorAdjunto("Josias", "Ribeiro", 15, 60)


    //Registrando 2 cursos

    geraniums1.registrarCurso("Full Stack", 20001, 3)
    geraniums1.registrarCurso("Android", 20002, 2)


    //Alocando 1 professor para cada curso


    geraniums1.alocarProfessores(20001, 12, 14)
    geraniums1.alocarProfessores(20002, 13, 15)


    //Matriculando alunos no FullStack

    geraniums1.matricularAluno("Josenildo","Ribeiro",987)
    geraniums1.matricularAluno(987,20001)

    geraniums1.matricularAluno("Clara","Nunes", 675)
    geraniums1.matricularAluno(675,20001)

    //Matriculando Alunos no Android

    geraniums1.matricularAluno("Jose","Ribeiro", 132)
    geraniums1.matricularAluno(132,20002)

    geraniums1.matricularAluno("Lucivaldo","Gomes", 543)
    geraniums1.matricularAluno(543,20002)

    geraniums1.matricularAluno("Luiz","Carlos", 990)
    geraniums1.matricularAluno(990,20002)

}