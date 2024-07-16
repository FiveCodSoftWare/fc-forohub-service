package fc.ms.forohub.domain.respuesta;

import java.time.LocalDateTime;

public record ListarRespuestasDTO(Long id,
                                String solution,
                                Long usuario_Id,
                                Long topico_Id,
                                LocalDateTime creationDate) {
    public ListarRespuestasDTO(Respuesta respuesta){
        this(respuesta.getId(),
                respuesta.getSolution(),
                respuesta.getUsuario().getId(),
                respuesta.getTopico().getId(),
                respuesta.getCreationDate());
    }
}
