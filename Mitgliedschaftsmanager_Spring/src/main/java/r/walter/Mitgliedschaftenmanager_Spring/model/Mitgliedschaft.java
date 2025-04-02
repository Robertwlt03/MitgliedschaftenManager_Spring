package r.walter.Mitgliedschaftenmanager_Spring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mitgliedschaft {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vorname;
	private String nachname;
	private String email;
	private String telefonnummer;
	private LocalDate eintrittsdatum;
	private LocalDate austrittsdatum;
	private String status;
}