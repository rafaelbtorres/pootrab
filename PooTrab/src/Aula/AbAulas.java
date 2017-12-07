package Aula;

import Disciplinas.Disciplina;
import java.util.List;

/**
 *
 * @author Rafael
 */
public abstract class AbAulas {

    public abstract boolean adicionar(String nome, String professor, String curso, String semestre, String turma, String notificacao, List aula);

    public abstract List consulta(String dia);

    public abstract boolean edicao(Disciplina disc);

    public abstract boolean exclusao(Disciplina disc);

    public abstract Disciplina exibir(String nome);

}
