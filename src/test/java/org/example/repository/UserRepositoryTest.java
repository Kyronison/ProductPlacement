package org.example.repository;

import org.example.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hibernate.criterion.Projections.id;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @DisplayName("должен добавлять пользователя")
    @Test
    void shouldInsertUser(){
        User expectedUser = User.builder()
                .id(4)
                .name("Ivan")
                .build();
        userRepository.save(expectedUser);
        User actualUser = userRepository.getById(4);
        assertThat(actualUser).isEqualTo(expectedUser);
    }
}