package silva.hiago.backendnotas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import silva.hiago.backendnotas.entities.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
