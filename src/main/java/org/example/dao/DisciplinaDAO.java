package org.example.dao;

import org.example.model.Disciplina;
import org.example.model.Estudante;

import java.sql.SQLException;
import java.util.List;

public interface DisciplinaDAO {
    public void insere(Disciplina disciplina) throws SQLException;
    public void atualiza(Disciplina disciplina) throws SQLException;
    public void remove(Disciplina disciplina) throws  SQLException;
    public Disciplina buscaPorCodigo(int disciplinaID) throws SQLException;
    public List<Disciplina> listTodos() throws SQLException;
}