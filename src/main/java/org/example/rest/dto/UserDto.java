package org.example.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String user_location;
    private int salary;
    private String user_photo_url;
    private String user_status;
    private String registration_date;

    public static UserDto toDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getPassword(),
                user.getUser_location(),
                user.getSalary(),
                user.getUser_photo_url(),
                user.getUser_status(),
                user.getRegistration_date()
        );
    }
    public static User toDomainObject(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getPhone(),
                userDto.getPassword(),
                userDto.getUser_location(),
                userDto.getSalary(),
                userDto.getUser_photo_url(),
                userDto.getUser_status(),
                userDto.getRegistration_date()
        );
    }

}
