package mobileappws.demo.ui;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserContoller {

    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable("userId") String userId) {
        return "get user was called"+userId;
    }

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value ="limit", defaultValue = "50") int limit,
                           @RequestParam(value ="sort", defaultValue = "50", required = false) String sort){
        Optional<Integer> integer = Optional.of(1);
        Integer integer1 = integer.map(i -> i + 1).orElseThrow();
    System.out.println(integer1);
        return "get user was called"+page + " "+limit;
    }

    @PostMapping
    public String createUser() {
        return "post was called";
    }
    @PutMapping
    public String updateUser() {
        return "put was called";
    }
    @DeleteMapping
    public String deteleUser() {
        return "delete was called";
    }
}
