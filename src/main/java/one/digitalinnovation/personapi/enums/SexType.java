package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SexType {
	HOMEM("Homem"),
	MULHER("Mulher"),
	NAOBINARIO("Não Binário");
	

	private final String description;
}
