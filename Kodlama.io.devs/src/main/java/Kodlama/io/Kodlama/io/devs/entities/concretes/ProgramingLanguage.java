package Kodlama.io.Kodlama.io.devs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "programinglanguage")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProgramingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	
    @OneToMany(mappedBy = "languages")
    
    private List<ProgramingLanguageFramework> frameworks;
	
}
