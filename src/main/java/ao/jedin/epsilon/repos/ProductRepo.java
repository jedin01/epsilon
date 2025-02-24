package ao.jedin.epsilon.repos;

import ao.jedin.epsilon.models.ProductModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<ProductModel, Long> {

}
