package edu.miu.lab3.repo;

import edu.miu.lab3.entity.MyUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<MyUser, Integer> {
}
