package oktenweb.relations.service;

import oktenweb.relations.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void save(User user);

}
