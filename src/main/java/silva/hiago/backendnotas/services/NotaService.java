package silva.hiago.backendnotas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import silva.hiago.backendnotas.entities.Nota;
import silva.hiago.backendnotas.repositories.NotaRepository;

import java.util.List;

@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;

    public List<Nota> findAll(){
        return notaRepository.findAll();
    }
}
