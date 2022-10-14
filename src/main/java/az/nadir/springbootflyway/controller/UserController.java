package az.nadir.springbootflyway.controller;


import az.nadir.springbootflyway.entitiy.User;
import az.nadir.springbootflyway.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/get/users")
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
