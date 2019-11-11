package labsproject.api.repository;

import org.springframework.data.repository.CrudRepository;
import labsproject.api.entity.User;

public interface IUserRepository extends CrudRepository<User, Long>{

}
