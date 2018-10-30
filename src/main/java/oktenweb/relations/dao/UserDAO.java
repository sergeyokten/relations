package oktenweb.relations.dao;

import oktenweb.relations.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {


    User findByUsername(String username);
}


