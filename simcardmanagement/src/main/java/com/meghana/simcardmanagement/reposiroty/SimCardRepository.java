package com.meghana.simcardmanagement.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meghana.simcardmanagement.entity.SimCard;

@Repository
public interface SimCardRepository extends JpaRepository<SimCard, Integer> {

}
