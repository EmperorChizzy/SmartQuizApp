package smartquizapp.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import smartquizapp.enums.Role;

import java.util.List;

@Entity
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 3, message = "*Enter atleast 3 characters")
    @Size(max = 15, message = "*At Max only 15 characters Allowed")
    private String firstName;
    @Size(min = 3, message = "*Enter atleast 3 characters")
    @Size(max = 15, message = "*At Max only 15 characters Allowed")
    private String lastName;
    @Email(message = "*Enter Proper Email")
    @NotEmpty(message = "*Enter Proper Email")
    @Column(unique = true)
    private String email;
    @NotNull(message = "*Enter Proper Phone Number")
    private String phoneNumber;
    @Pattern(regexp = "^.*(?=.{8,})(?=...*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "*Enter at least one uppercase,lowercase,digit and special character and minimum 8 characters")
    private String password;
    @NotEmpty(message = "*This Field Cannot be Empty")
    private Role role;
    @JsonIgnore
    private boolean isVerified;

}