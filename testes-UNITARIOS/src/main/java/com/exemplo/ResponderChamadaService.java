package com.exemplo;

public class ResponderChamadaService {
    private ChamadaRepository chamadaRepository;

    public ResponderChamadaService(ChamadaRepository chamadaRepository){
        this.chamadaRepository = chamadaRepository;
    }
    public Chamada apply(Chamada chamada){
        var chamadaSalva = chamadaRepository.salvar(chamada);

        return chamadaSalva;
    }
}
