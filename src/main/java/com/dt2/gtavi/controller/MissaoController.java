package com.dt2.gtaVI.controller;



import com.dt2.gtavi.entities.Missao;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Missões", description = "Gerenciamento de missões e objetivos")
@RestController
@RequestMapping("api/missoes")
public class MissaoController {

    private final com.dt2.gtavi.repository.MissaoRepository repository;

    public MissaoController(com.dt2.gtavi.repository.MissaoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String criarMissoe(@RequestBody Missao missoes){
        try {
            repository.save(missoes);
            return "Criado com sucesso";
        }catch (Exception ex){
            return "Erro ao criar missões";
        }
    }

    @GetMapping
    public List<Missao> mostrarMissoes(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public void buscarID(@PathVariable int id){
        repository.findById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Missao m){

        Missao missao = repository.getReferenceById(id);
        missao.setNome(m.getNome());
        missao.setLocal(m.getLocal());
        missao.setImagem(m.getImagem());
        missao.setDescricao(m.getDescricao());
    }
}