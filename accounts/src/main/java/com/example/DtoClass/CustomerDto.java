package com.example.DtoClass;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Schema(

        name = "Customer",
        description = "Schema to hold Customer and Accounts info"
)
public class CustomerDto {

    @Size(min=5 , max=30, message = "The length of the customer name should be between 5 and 30")
    @Schema(

            description = "Name of the customer",example = "Modi"
    )
    @NotEmpty(message = "Name cannot be null or empty")

    private String name;

    @Schema( description = "Email address can not be null or empty",example = "modi@gmail.com")
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address should be valid value")
    private String email;


    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(description = "Mobile Number cannot be null or empty",example = "8410172908")

    private String mobileNumber;

    @Schema(description = "Accounts Details of the Customer")
    private AccountsDto accountsDto;
}
