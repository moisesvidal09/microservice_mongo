package com.microservice.mongo.entidade;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Time {

    private String nome;

    private String estadio;

    private List<Jogador> jogadores;

}
