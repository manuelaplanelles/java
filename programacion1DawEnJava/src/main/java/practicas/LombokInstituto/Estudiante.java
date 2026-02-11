package practicas.LombokInstituto;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
@Getter @Setter
@ToString
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
