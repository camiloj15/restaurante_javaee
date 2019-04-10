/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.sessionbeans;

import com.example.ejb.entitiy.Camarero;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author camilopc
 */
@Local
public interface CamareroFacadeLocal {

    void create(Camarero camarero);

    void edit(Camarero camarero);

    void remove(Camarero camarero);

    Camarero find(Object id);

    List<Camarero> findAll();

    List<Camarero> findRange(int[] range);

    int count();
    
}
