package com.example.supermarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supermarket.model.Product;
import com.example.supermarket.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    
    ProductRepo pr;

    public Product create(Product pp)
    {
        return pr.save(pp);
    }

    public List <Product> getAlldetails()
    {
        return pr.findAll();
    }
    public Product getUserById(int id)
    {
        return pr.findById(id).orElse(null);
    }

    public boolean updateDetails(int id,Product p)
        {
            if(this.getUserById(id)==null)
            {
                return false;
            }
            try{
                pr.save(p);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }

        public boolean deleteUser(int id)
        {
            if(this.getUserById(id) == null)
            {
                return false;
            }
            pr.deleteById(id);
            return true;
        }

}
