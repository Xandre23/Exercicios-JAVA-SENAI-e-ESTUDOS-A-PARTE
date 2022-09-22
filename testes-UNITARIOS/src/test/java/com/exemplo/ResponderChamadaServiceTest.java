package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.configuration.IMockitoConfiguration;

import java.time.LocalDate;
//extendendo de onde eu quero fazer os teste
public class ResponderChamadaServiceTest extends TestBase {
    //pegando a classe que quero usar
    @InjectMocks
    ResponderChamadaService responderChamadaService;

    @Mock
    ChamadaRepository chamadaRepository;
//fazendo um teste real, criando um aluno na aplicação direto
    @Test
    void salvarChamada(){

        var aluno = new Aluno();
        aluno.setNome("Xandre de Paula");

        var chamada = new Chamada();
        chamada.setAluno(aluno);
        chamada.setPresente(true);
        chamada.setData(LocalDate.now());

        //criando um novo objeto, pegando os valores anotado acimaa
        var outraChamada = new Chamada();
        outraChamada.setAluno(aluno);
        outraChamada.setPresente(true);
        outraChamada.setData(LocalDate.now());

        //retorno do objeto chamada
        Mockito.when(chamadaRepository.salvar(chamada)).thenReturn(outraChamada);
        //pegando o resultado
        var resultado = responderChamadaService.apply(chamada);

        //fazendo uma verificação se o resultado é igual a outrachamada
        Assertions.assertEquals(resultado.getData(), outraChamada.getData());
    }

}
