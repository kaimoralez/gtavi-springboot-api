package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Arma;
import com.dt2.gtavi.repository.ArmaRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Armas", description = "Gerenciamento do arsenal e armamentos")
@RestController
@RequestMapping("api/armas")
public class ArmaController {

    private final ArmaRepository repository;

    public ArmaController(ArmaRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Arma> mostarArmas(){
        return repository.findAll();
    }

    @GetMapping ("/{id}")
    public void buscarId(@PathVariable int id){
        repository.findById(id);
    }

    @PostMapping
    public String criarArma(@RequestBody Arma a){
        try{
            repository.save(a);
            return "Arma salva com sucesso";
        }catch (Exception E){
            return "Dados incorretos";
        }
    }

    @DeleteMapping("/{id}")
    public void deletarArma(@PathVariable int id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar (@PathVariable int id, @RequestBody Arma a){
        Arma arma = repository.getReferenceById(id);

        arma.setNome(a.getNome());
        arma.setCategoria(a.getCategoria());
        arma.setDescricao(a.getDescricao());
        arma.setFabricante(a.getFabricante());
        arma.setImagem(a.getImagem());
    }



}
