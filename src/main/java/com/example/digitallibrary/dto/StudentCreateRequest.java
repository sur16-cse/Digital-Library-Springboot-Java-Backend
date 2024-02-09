package com.example.digitallibrary.dto;

import com.example.digitallibrary.entities.Card;
import com.example.digitallibrary.entities.Student;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentCreateRequest {
    @NotBlank
    private String name;
    @Email
@Column(unique = true)
    private String email;

    @NotBlank(message = "roll number is required")
    @Column(unique = true)
    private String rollNo;

    @Min(18)
    private Integer age;

    @NotBlank( message = "Phone number is required")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Phone number should contain only 10 digits")
    private String mobile;

    public Student to() {

        return Student.builder().name(this.name).email(this.email).age(this.age).mobile(this.mobile).rollNo(this.rollNo).build();
    }

}
