package com.chessa.example.springJpa.kotlinJpaOnetoMany.repository


import com.chessa.example.springJpa.kotlinJpaOnetoMany.model.Mobil
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MobilRepository : JpaRepository<Mobil, Long>{
}