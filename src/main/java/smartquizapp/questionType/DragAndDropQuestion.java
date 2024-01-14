package smartquizapp.questionType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.Duration;

@Data
@Entity
public class DragAndDropQuestion {
    @Id
    private Long id;
    private String dragItems;
    private String question;
    private Long points;
    private byte[] image;
    private String dragTarget;
    private String correctMapping;
    private Duration timeLimit;
}
