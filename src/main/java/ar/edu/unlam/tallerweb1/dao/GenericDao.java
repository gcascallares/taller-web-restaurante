package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

/**
 * Created by Sebastian on 27/05/2017.
 */
public interface GenericDao<E, K> {

    void add(E entity);

    void saveOrUpdate(E entity);

    void update(E entity);

    void remove(E entity);

    E find(K key);

    List<E> getAll();

    List<E> getAllOrderBy(String field);

    List<E> getAllOrderBy(String field, Boolean desc);
}