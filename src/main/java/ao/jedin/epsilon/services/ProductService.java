package ao.jedin.epsilon.services;

import ao.jedin.epsilon.models.ProductModel;
import ao.jedin.epsilon.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ProductService {

    @Autowired
    private ProductRepo pr;

    public Iterable<ProductModel> list(){
        return pr.findAll();
    }


}
