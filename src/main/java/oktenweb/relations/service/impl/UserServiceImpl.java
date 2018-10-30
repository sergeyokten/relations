package oktenweb.relations.service.impl;

import oktenweb.relations.dao.UserDAO;
import oktenweb.relations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import oktenweb.relations.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDAO.findByUsername(s);
    }
}
