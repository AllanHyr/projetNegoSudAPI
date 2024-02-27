package com.negosud.api.service;

import com.negosud.api.model.ListClients;
import com.negosud.api.repository.ListClientsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ListClientsService {


    @Autowired
    private ListClientsRepository listClientsRepository;

    public List<ListClients> getListClients()   {
        return listClientsRepository.getAll();
    }

}
