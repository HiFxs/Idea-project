package com.spring.annotation.UserRepository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {


    @Override
    public void save() {
        System.out.println("UserRepository save.....");
    }
}
