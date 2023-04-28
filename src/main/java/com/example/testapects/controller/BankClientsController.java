package com.example.testapects.controller;

import com.example.testapects.aspect.LogExecuteTimeAnnotation;
import com.example.testapects.dto.AddNewBankClientRequestDto;
import com.example.testapects.model.BankClient;
import com.example.testapects.repository.BankClientsRepository;
import com.example.testapects.service.BankClientsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/bank-clients")
@AllArgsConstructor
public class BankClientsController {
    private final BankClientsService bankClientsService;

    @GetMapping(value = "/get-by-id/{id}")
    @LogExecuteTimeAnnotation
    public BankClient getById(@PathVariable int id) throws Exception {
        return bankClientsService.getById(id);
    }

    @GetMapping(value = "/get-all")
    @LogExecuteTimeAnnotation
    public List<BankClient> getAll() throws Exception {
        return bankClientsService.getAll();
    }

    @PostMapping(value = "/add-new")
    @LogExecuteTimeAnnotation
    public void addNew(@Valid @RequestBody AddNewBankClientRequestDto addNewBankClientRequestDto){
        bankClientsService.addNew(addNewBankClientRequestDto);
    }
}
