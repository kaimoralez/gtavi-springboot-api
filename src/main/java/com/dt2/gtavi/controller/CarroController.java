package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Carro;
import com.dt2.gtavi.repository.CarroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/veiculos")
public class CarroController {
    private final CarroRepository repository;

    public CarroController( CarroRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public String criarCarro (@RequestBody Carro c){
        try {
            repository.save(c);
            return "Carro salvo com sucesso";
        } catch (Exception E) {
            return "Dados incorretos";
        }
    }

    @GetMapping
    public List<Carro> mostrarCarros(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public void buscarID(@PathVariable int id){
        repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atulizar(@PathVariable int id, @RequestBody Carro c){
        Carro carro = repository.getReferenceById(id);
        carro.setNome(c.getNome());
        carro.setMarca(c.getMarca());
        carro.setCategoria(c.getCategoria());
        carro.setDescricao(c.getDescricao());
        carro.setImagem(c.getImagem());
        repository.save(carro);

    }

}
