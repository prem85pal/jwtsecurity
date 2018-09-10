package com.jwtsecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GetBCryptPasswordEncoder {

    public static void main(String[] args){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
        String result = encoder.encode("password");
        System.out.println(result);

    }
}
