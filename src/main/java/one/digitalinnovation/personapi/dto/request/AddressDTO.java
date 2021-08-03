package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private long id;

    @NotEmpty
    @Size(min = 5, max = 100)
    private String street;

    @NotEmpty
    @Size(min = 1, max = 30)
    private String number;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String neighbor;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String complement;

    @NotEmpty
    @Size(min = 8, max = 9)
    private String postalCode;
}
