package Kodlama.io.Kodlama.io.devs.business.Response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetLanguageResponse {
	private int id;
	private String name;
	private List<GetFrameworkResponse> frameworks;
	

	
	

}
