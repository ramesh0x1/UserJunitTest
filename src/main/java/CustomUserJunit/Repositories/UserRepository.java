package CustomUserJunit.Repositories;


import CustomUserJunit.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
      User findByEmail(String email);

    }