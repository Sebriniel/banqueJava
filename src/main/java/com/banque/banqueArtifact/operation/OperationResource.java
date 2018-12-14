package com.banque.banqueArtifact.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperationResource {
    @Autowired
    private OperationRepository operationRepository;

    @GetMapping("/operations")
    public List<Operation> retrieveAllOperations() {
        return operationRepository.findAll();
    }
}
