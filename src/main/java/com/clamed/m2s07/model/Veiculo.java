package com.clamed.m2s07.model;

import com.clamed.m2s07.enums.TipoVeiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "VEICULOS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    @Id
    private String placa;
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
    private String nome;
    private Integer anoFabricacao;
    private String cor;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "veiculo")
    private List<Multa> multas;
}