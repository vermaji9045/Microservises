package com.example.DtoClass;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(

        name = "Accounts",
        description = "Schema to hold Accounts info"
)
public class AccountsDto {

    @Schema(

            description = "Account number of the customer"
    )
    @NotEmpty(message = "Account number can not be a null or empty")
    private Long accountNumber;
    @Schema(

            description = "Account type of the Accounts",example = "savings"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(

            description = "Branch Code of the Bank"
    )
    @NotEmpty(message = "Branch address cannot be a null or empty")
    private String branchAddress;
}
