package fc.ms.forohub.domain.respuesta;

import fc.ms.forohub.domain.topico.Topico;
import fc.ms.forohub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity(name="Respuesta")
@Table(name = "respuestas")
@Getter
@Setter
@NoArgsConstructor
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime creationDate;
    private String solution;
    @OneToOne
    @JoinColumn(name="usuario", referencedColumnName="id")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name="topico", referencedColumnName="id")
    private Topico topico;
    private boolean active;

    public Respuesta(Long id, String solution, Usuario usuario, Topico topico, LocalDateTime creationDate) {
        this.id=id;
        this.solution=solution;
        this.usuario =usuario;
        this.topico=topico;
        this.creationDate=LocalDateTime.now();
    }

    public void respuestaActualizada(RespuestaActualizadaDTO respuestaActualizadaDTO) {
        if (respuestaActualizadaDTO.solution() != null){
            this.solution=respuestaActualizadaDTO.solution();
        }
    }
    public void diactivateResponse(){

        this.active=false;
    }
}