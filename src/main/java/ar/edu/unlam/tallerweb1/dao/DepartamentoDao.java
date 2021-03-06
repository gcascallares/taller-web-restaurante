package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Departamento;

import java.util.List;

/**
 * Created by Sebastian on 28/05/2017.
 */
public interface DepartamentoDao extends GenericDao<Departamento,Long> {
    List<Departamento> getAllByProvincia(Long provinciaId);
}
