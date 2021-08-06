package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Tema;
import com.example.demo.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tema")
public class TemaController {

// Autowired injeta o TemaRepository dentro do controller. ----------------------------------- \\

    @Autowired
    public TemaRepository repository;


// Metodos CRUD da tabela(Tema) ----------------------------------------------------------- \\
    @GetMapping("/findAllTema")
    public ResponseEntity<List<Tema>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Tema> getById(@PathVariable long id) {
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/findByDescricaoPostagem/{nome}")
    public ResponseEntity<List<Tema>> getByName(@PathVariable String nome) {
        return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
    }

    @PostMapping("/postTema")
    public ResponseEntity<Tema> post(@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
    }

    @DeleteMapping("deleteTema/{id}")
    public void delete(@PathVariable long id ){
        repository.deleteById(id);
    }
}