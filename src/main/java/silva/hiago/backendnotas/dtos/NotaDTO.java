package silva.hiago.backendnotas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import silva.hiago.backendnotas.entities.Nota;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotaDTO {

    public NotaDTO(Nota nota) {
        this.titulo = nota.getTitulo();
        this.descricao = nota.getDescricao();
    }

    private String titulo;

    private String descricao;
}
