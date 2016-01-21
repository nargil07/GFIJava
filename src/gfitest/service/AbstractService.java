/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.service;

/**
 *
 * @author antony
 */
public abstract class AbstractService<T> {
    private final T entity;

    public AbstractService(T entity) {
        this.entity = entity;
    }

    public T getEntity() {
        return entity;
    }
    
}
