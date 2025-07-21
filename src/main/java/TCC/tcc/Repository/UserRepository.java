package TCC.tcc.Repository;

import TCC.tcc.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    // Altere o tipo de retorno de UserDetails para User
    User findByLogin(String Login);
}