package com.clamed.m2s07;
import com.clamed.m2s07.enums.TipoVeiculo;
import com.clamed.m2s07.model.Veiculo;
import com.clamed.m2s07.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepo;

    public void executar() {
        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL, "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS, "Enterprise", 1960, "prata");
        veiculoRepo.save(veiculo1);
        veiculoRepo.save(veiculo2);
    }
}

