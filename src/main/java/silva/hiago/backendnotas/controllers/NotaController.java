package silva.hiago.backendnotas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import silva.hiago.backendnotas.dtos.NotaDTO;
import silva.hiago.backendnotas.services.NotaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/notas")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<NotaDTO>> findAll(){

        List<NotaDTO> allNotasResponse = notaService.findAll().stream().map(NotaDTO::new).collect(Collectors.toList());

        return ResponseEntity.ok(allNotasResponse);
    }
}
