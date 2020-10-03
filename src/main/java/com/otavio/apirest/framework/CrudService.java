package com.otavio.apirest.framework;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public abstract class CrudService<T, ID extends Serializable> implements ICrudService<T, ID>{

    protected abstract JpaRepository<T, ID> data();

    @Override
    public T save(T entity) {
        return data().save(entity);
    }

    @Override
    public T findById(ID id) {
        return data().findById(id).orElseThrow();
    }

    @Override
    public void deleteById(ID id) {
        data().deleteById(id);
    }

    @Override
    public List<T> findAll() {
        return data().findAll();
    }

}
