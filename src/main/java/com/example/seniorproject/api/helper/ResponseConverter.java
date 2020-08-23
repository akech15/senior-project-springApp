package com.example.seniorproject.api.helper;

import com.example.seniorproject.api.model.Response;
import com.example.seniorproject.service.model.ResponseEntity;

public class ResponseConverter {
    public static Response fromDTO(ResponseEntity from){
        return Response.builder()
                .userAdded(from.isUserAdded())
                .build();
    }
}
