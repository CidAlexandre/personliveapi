package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SexType {
	HOMEM("Homem"),
	MULHER("Mulher"),
	NAOBINARIO("Não Binário");
	
	SexType(String description) {
		this.description = description;
	}

	private final String description;
}
