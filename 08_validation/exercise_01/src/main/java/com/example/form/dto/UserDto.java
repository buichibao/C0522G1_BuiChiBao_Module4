package com.example.form.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class UserDto implements Validator {

    private  int id;

    @NotBlank(message = "First name is blank, please enter")
    @Size(min = 5, max = 45,message = "First name must be between 5 - 45 characters")
    private String firstName;

    @NotBlank(message = "Last name is blank, please enter")
    @Size(min = 5, max = 45,message = "Last name must be between 5 - 45 characters")
    private String lastName;

    @NotBlank(message = "Number phone is blank, please enter")
    @Pattern(regexp = "^0\\d{9}$",message = "Number phone must have 10 numbers, and start with 0")
    private String phoneNumber;

    @NotBlank(message = "Age is blank, please enter")
    @Min(value = 18,message = "Age must greater than 18")
    private String age;

    @NotBlank(message = "Email is blank, please enter")
    @Email()
    private String email;

    public UserDto() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDTO = (UserDto) target;
    }
}
