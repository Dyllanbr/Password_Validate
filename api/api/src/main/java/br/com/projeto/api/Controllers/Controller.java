package br.com.projeto.api.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("")
public String isValid(@RequestParam(required = false) String password) {
    if (password == null || password.isEmpty()) {
        return "A senha é nula ou vazia. Forneça uma senha válida.";
    }

    boolean isValid = PasswordValidator.isValid(password);
    return "Password: " + isValid;
}

}
    
    


