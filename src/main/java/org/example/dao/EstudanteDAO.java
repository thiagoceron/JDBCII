package org.example.dao;

import org.example.model.Estudante;

import java.sql.SQLException;
import java.util.List;

public interface EstudanteDAO {
    public void insere(Estudante estudante) throws SQLException;
    public void atualiza(Estudante estudante) throws SQLException;
    public void remove(Estudante estudante) throws  SQLException;
    public Estudante buscaPorCodigo(int EstudanteID) throws SQLException;
    public List<Estudante> listTodos() throws SQLException;
}