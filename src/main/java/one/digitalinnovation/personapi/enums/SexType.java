package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SexType {
	MAN ("MAN"),
	WOMAN ("WOMAN"),
	NONBINARY ("NONBINARY");

	private final String description;
}
