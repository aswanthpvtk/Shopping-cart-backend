package com.nest.shopping_cart_backend.controller;

import com.nest.shopping_cart_backend.doa.ShoppingDao;
import com.nest.shopping_cart_backend.model.Shopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/ureg",consumes = "application/json",produces = "application/json")
    public Map<String, String> ProductAdd(@RequestBody Shopping s)
    {
        System.out.println(s.getName().toString());
        dao.save(s);
        HashMap<String,String> map =new HashMap<>();
        map.put("status","success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/vuser")
    public List<Shopping> View()
    {
        return (List<Shopping>) dao.findAll();
    }
}
