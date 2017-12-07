
package Disciplinas;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface IDisciplinas {
  
    public void adicionarDisc(String nome, String professor, String curso, String semestre, String turma, String notificacao, List aula);

    public boolean excluirDisc();

    public void consultarDisc();

    public boolean editarDisc();
  
}
