package com.example.digitallibrary.dto;

import com.example.digitallibrary.entities.Student;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentCreateRequest {
    @NotBlank
    private String name;

    private String email;

    @NotBlank(message = "roll number is required")
    private String rollNo;

    @Min(18)
    private Integer age;

    private String mobile;

    public Student to() {
        return Student.builder().name(this.name).email(this.email).age(this.age).mobile(this.mobile).rollNo(this.rollNo).build();
    }

}
