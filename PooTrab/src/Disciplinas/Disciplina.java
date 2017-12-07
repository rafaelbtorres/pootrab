package Disciplinas;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class Disciplina implements IDisciplinas {

    private String nome;
    private String professor;
    private String curso;
    private String semestre;
    private String turma;
    private String notificacao;
    private List aulas;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the professor
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * @return the notificacao
     */
    public String getNotificacao() {
        return notificacao;
    }

    /**
     * @param notificacao the notificacao to set
     */
    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    /**
     * @return the aulas
     */
    public List getAulas() {
        return aulas;
    }

    /**
     * @param aulas the aulas to set
     */
    public void setAulas(List aulas) {
        this.aulas = aulas;
    }

    //METODOS
    @Override
    public void adicionarDisc(String nome, String professor, String curso, String semestre, String turma, String notificacao, List aula) {
        this.nome = nome;
        this.professor = professor;
        this.curso = curso;
        this.semestre = semestre;
        this.turma = turma;
        this.notificacao = notificacao;
        this.aulas = aula;
    }

    @Override
    public boolean excluirDisc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultarDisc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarDisc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
