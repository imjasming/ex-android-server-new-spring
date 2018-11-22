package xiaoming.model;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Xiaoming.
 * Created with IntelliJ IDEA on 2018/11/22 11:30.
 * Description :This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
 * CRUD refers Create, Read, Update, Delete
 */
public interface MyUserRepository extends CrudRepository<MyUser, Integer> {
}
