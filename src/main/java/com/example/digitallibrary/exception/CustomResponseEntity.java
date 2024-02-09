package com.example.digitallibrary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomResponseEntity extends RuntimeException {
    public static ResponseEntity NO_CONTENT(){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new CustomMessage().NO_CONTENT());
    }


    public static ResponseEntity CREATED(){
        return ResponseEntity.status(HttpStatus.CREATED).body(new CustomMessage().CREATED());
    }

    public ResponseEntity PERMANENT_REDIRECT(){
        return ResponseEntity.status(HttpStatus.PERMANENT_REDIRECT).body(new CustomMessage().PERMANENT_REDIRECT());
    }

    public ResponseEntity TEMPORARY_REDIRECT( ){
        return ResponseEntity.status(HttpStatus.TEMPORARY_REDIRECT).body(new CustomMessage().TEMPORARY_REDIRECT());
    }

    public ResponseEntity NOT_MODIFIED(){
        return ResponseEntity.status(HttpStatus.NOT_MODIFIED).body(new CustomMessage().NOT_MODIFIED());
    }

    public ResponseEntity BAD_REQUEST(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new CustomMessage().BAD_REQUEST());
    }

    public ResponseEntity UNAUTHORIZED( ){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new CustomMessage().UNAUTHORIZED());
    }

    public ResponseEntity DUPLICATION(){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new CustomMessage().DUPLICATION());
    }
}
