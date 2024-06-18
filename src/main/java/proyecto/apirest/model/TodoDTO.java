package proyecto.apirest.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "todos")
public class TodoDTO {
    
    private String id;
    @NotNull(message =  "El campo todo no puede ser nulo")
    private String todo;
    @NotNull(message =  "El campo descripción no puede ser nulo")
    private String description;
    @NotNull(message =  "El campo completado no puede ser nulo")
    private boolean completed;
    private Date createdAt;
    private Date updatedAt;

    public boolean isCompleted() {
        return completed;
    }


}
