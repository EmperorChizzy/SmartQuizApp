package smartquizapp.questionType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

import java.time.Duration;

@Data
@Entity
//Poll Choice Questions
public class Poll {

        @Id
        private Long id;
        private String question;
        private Long points;
        private Duration timeLimit;
        private String explanation;
        private String optionA;
        private String optionB;
        private String optionC;
        private String optionD;
        private String subject;

}
