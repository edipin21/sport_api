package com.example.sport_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sport_api.models.sport.TeamDetail;

public interface TeamDetailRepository extends JpaRepository<TeamDetail, Integer> {

}
