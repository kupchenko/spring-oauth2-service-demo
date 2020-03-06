package me.kupchenko.auth.service.exception.handler;

import lombok.extern.slf4j.Slf4j;
import me.kupchenko.auth.service.exception.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler( {UserNotFoundException.class})
    public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException e) {
        log.warn("User [{}] not found", e.getMessage());
        return ResponseEntity.notFound().build();
    }
}
