package com.microservice.mongo.entidade;

import com.microservice.mongo.enums.Posicao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jogador {

    private String nome;

    private Posicao posicao;

}
