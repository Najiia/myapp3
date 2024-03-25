package com.cbi.Hsearch.dao;

import com.cbi.Hsearch.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface HsearchRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByStars(int stars);

//    List<Hotel> findByStarsAndCity(int stars, String ville);
//
//    List<Hotel> getHotelsByStarsAndCity(int stars, String ville);
}
