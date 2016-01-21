/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.facade;

import java.util.List;

/**
 *
 * @author antony
 * @param <T>
 */
public abstract class AbstractFacade<T> {
    public abstract List<T> findAll();
    public abstract List<T> findById();
}
