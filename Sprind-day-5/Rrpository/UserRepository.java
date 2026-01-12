package Rrpository;

import Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends jpaRepository<User, Integer>{
}
