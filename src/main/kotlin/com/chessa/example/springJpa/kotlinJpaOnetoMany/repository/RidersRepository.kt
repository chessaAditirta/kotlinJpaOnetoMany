package com.chessa.example.springJpa.kotlinJpaOnetoMany.repository

import com.chessa.example.springJpa.kotlinJpaOnetoMany.model.Riders
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RidersRepository : JpaRepository<Riders, Long> {
}