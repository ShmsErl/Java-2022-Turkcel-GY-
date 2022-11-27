package Kodlama.io.Kodlama.io.devs.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "frameworks")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProgramingLanguageFramework {
	@Id
	@Column( name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "language_id", nullable = false)
	private ProgramingLanguage languages;
	
	
	

}
