/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.CleaningProductController;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceCleaningProductController;

@Repository
public class CleaningProductControllerRepositorio {
    @Autowired
    private InterfaceCleaningProductController repository;

    public List<CleaningProductController> getAll() {
        return repository.findAll();
    }

    public Optional<CleaningProductController> getClothe(String reference) {
        return repository.findById(reference);
    }
    public CleaningProductController create(CleaningProductController clothe) {
        return repository.save(clothe);
    }

    public void update(CleaningProductController clothe) {
        repository.save(clothe);
    }
    
    public void delete(CleaningProductController clothe) {
        repository.delete(clothe);
    }
}
