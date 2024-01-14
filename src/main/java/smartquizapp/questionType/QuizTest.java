package smartquizapp.questionType;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import smartquizapp.enums.Subject;

@Component
@Data
@Entity
public class QuizTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Subject subjectType;
    private String description;
    private LocalDateTime startTime;
    private Duration timeLimit;
   private Double totalMarks;
    private Boolean privacy;
    private Boolean status;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<MCQuestion> mcQuestions;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Draw> draw;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<OpenEndedQuestion> openEndedQuestions;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<DragAndDropQuestion> dragAndDropQuestions;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<FillBlankQuestion> fillBlankQuestions;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Poll> polls;

}