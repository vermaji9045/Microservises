package com.example.DtoClass;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor

@Schema(

        name = "ErrorResponse",
        description = "Error while we're getting an in API"
)
public class ErrorResponseDto {

    @Schema(

            description = "API path invoke by Client"
    )

    private String apiPath;
    @Schema(
            description = "Error Code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(

            description = "Error message representing the error happened"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing the error time"
    )
    private LocalDateTime errorTime;
}


