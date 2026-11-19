package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Personagem;
import com.dt2.gtavi.repository.PersonagemRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personagens")
@Tag(name = "Personagens", description = "Gerenciamento dos personagens da trama")
public class PersonagemController {

    private final PersonagemRepository repository;

    public PersonagemController(PersonagemRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public String criarPersonagem(@RequestBody Personagem personagem){
        try{
            repository.save(personagem);
            return "Salvo com sucesso";
        }
        catch(Exception E){
            return "Dados incorretos";
        }
    }

    @GetMapping
    public List<Personagem> mostrarPersonagens(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public void buscarId(@PathVariable int id){
        repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Personagem p){
        Personagem personagem = repository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setDescricao(p.getDescricao());
        personagem.setImagem(p.getImagem());
        repository.save(personagem);
    }




}
