package com.example.app.routes;

import com.example.app.routes.request.RequestBodyPost;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Routes {

    private ArrayList<Integer> lista = new ArrayList<>();

    @GetMapping(value = "/number")
    public ArrayList<Integer> get() {
        return lista;
    }

    @PostMapping(value = "/number")
    public ResponseEntity<?> post(@RequestBody RequestBodyPost body) {
        int number = body.numero;

        if(lista.contains(number)) {
            return new ResponseEntity<>(
                    "O número " + number + " já existe",
                    HttpStatus.PRECONDITION_FAILED
            );
        }

        lista.add(number);

        return new ResponseEntity<>(number, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/number/{number}")
    public ResponseEntity<Integer> delete(@PathVariable Integer number) {
        if(!lista.contains(number)) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        lista.remove(number);

        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}


