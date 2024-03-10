package com.example.DtoClass;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(

        name="Response",
        description = "Schema hold successful response information"
)
public class ResponseDto {

    @Schema(

            description ="Status Code in the Response"
    )
    private String statusCode;

    @Schema(

            description ="Status Message in the Response"
    )
    private String statusMsg;
}
