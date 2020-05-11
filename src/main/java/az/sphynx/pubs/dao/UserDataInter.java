package az.sphynx.pubs.dao;

import az.sphynx.pubs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataInter extends JpaRepository<User, Integer> {
    User findByEmailAndEnabled(String email, boolean enabled);

    User findByEmail(String email);
}
