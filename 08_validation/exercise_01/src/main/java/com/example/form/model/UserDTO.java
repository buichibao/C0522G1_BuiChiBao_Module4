package com.example.form.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDTO implements Validator {

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
    @Pattern(regexp = "^1[89]|[2-7]\\d|80$", message = "Age must be between 18-80")
    private int age;

    @NotBlank(message = "Email is blank, please enter")
    @Pattern(regexp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]{2,}(\\.[A-Za-z0-9]{2,}){1,2}$",
             message = "Email must be in the correct format")
    private String email;

    public UserDTO() {
    }

    public UserDTO(int id, @NotBlank(message = "First name is blank, please enter") @Size(min = 5, max = 45, message = "First name must be between 5 - 45 characters") String firstName, @NotBlank(message = "Last name is blank, please enter") @Size(min = 5, max = 45, message = "Last name must be between 5 - 45 characters") String lastName, @NotBlank(message = "Number phone is blank, please enter") @Pattern(regexp = "^0\\d{9}$", message = "Number phone must have 10 numbers, and start with 0") String phoneNumber, @NotBlank(message = "Age is blank, please enter") @Pattern(regexp = "^1[89]|[2-7]\\d|80$", message = "Age must be between 18-80") int age, @NotBlank(message = "Email is blank, please enter") @Pattern(regexp = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]{2,}(\\.[A-Za-z0-9]{2,}){1,2}$",
            message = "Email must be in the correct format") String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
        UserDTO userDTO = (UserDTO) target;
    }
}
