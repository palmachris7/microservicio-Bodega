package com.idat.microserviciobod.service;

import com.idat.microserviciobod.model.Bodega;
import com.idat.microserviciobod.repository.BodegaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BodegaServiceImpl implements BodegaService {
    @Autowired
    private BodegaRepository repository;
    @Override
    public List<Bodega> listar(){
        return repository.findAll();
    }

}
