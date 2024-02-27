package com.negosud.api.service;


import com.negosud.api.model.ListFournisseurs;
import com.negosud.api.repository.ListFournisseursRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ListFournisseursService {

    @Autowired
    private ListFournisseursRepository listFournisseursRepository;

    public List<ListFournisseurs> getListFournisseurs() {
        return listFournisseursRepository.findAll();
    }
}
