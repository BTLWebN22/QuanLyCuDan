package Repository;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.*;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String name);
    public User findByEmail(String email);
}
