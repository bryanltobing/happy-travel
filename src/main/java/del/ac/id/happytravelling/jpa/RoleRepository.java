package del.ac.id.happytravelling.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRoleid(int roleid);
    List<Role> findAll();
}
