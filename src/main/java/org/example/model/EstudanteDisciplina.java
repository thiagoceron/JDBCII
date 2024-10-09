package org.example.model;

public class EstudanteDisciplina {
    private Estudante estudante;
    private Disciplina disciplina;

    public EstudanteDisciplina(){}

    public EstudanteDisciplina(Estudante e, Disciplina d){
        this.estudante = e;
        this.disciplina = d;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return "EstudanteDisciplina{" +
                "disciplina=" + disciplina +
                ", estudante=" + estudante +
                '}';
    }
}