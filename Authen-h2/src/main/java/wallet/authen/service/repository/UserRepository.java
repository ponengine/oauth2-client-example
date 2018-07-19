package wallet.authen.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import wallet.authen.service.entity.Users;


@Repository
public interface UserRepository extends CrudRepository<Users, Long>{

}
