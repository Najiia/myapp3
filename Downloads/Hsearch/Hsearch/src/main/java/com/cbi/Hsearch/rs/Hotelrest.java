package com.cbi.Hsearch.rs;


import com.cbi.Hsearch.dao.HsearchRepository;
import com.cbi.Hsearch.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
public class Hotelrest  {
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
    @Autowired
    HsearchRepository repository;

    @GetMapping("hotels")
    public List<Hotel> listeEtudiants() {
        return repository.findAll();
    }

    @GetMapping("hotels/{idHotel}")
    public Optional<Hotel> getEtudiantById(@PathVariable("idHotel") long id) {
        return repository.findById(id);
    }

    // Simuler une liste de données en mémoire pour cet exemple
    private List<Hotel> hotelList = new ArrayList<>();

    // Implémentation de la méthode findByStars
//    @Override
//    public List<Hotel> findByStars(int stars) {
//        List<Hotel> result = new ArrayList<>();
//        for (Hotel hotel : hotelList) {
//            if (hotel.getStars() == stars) {
//                result.add(hotel);
//            }
//        }
//        return result;
//    }
    @GetMapping("/h/{stars}")
    List<Hotel> findByStars1(@RequestParam int stars){
        return repository.findByStars(stars);
    }

//	@GetMapping("/hotels/{stars}/{ville}")
//	public List<Hotel> getHotelsByStarsAndCity(@RequestParam int stars, @RequestParam String ville) {
//	    return repository.getHotelsByStarsAndCity(stars, ville);
//	}

}
