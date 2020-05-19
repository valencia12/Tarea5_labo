package com.uca.capas.tareal5.dao;

import com.uca.capas.tareal5.domain.Estudiante;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface EstudianteDAO {

    public List<Estudiante> findAll() throws DataAccessException;
    public void insert(Estudiante estudiante) throws DataAccessException;
}
