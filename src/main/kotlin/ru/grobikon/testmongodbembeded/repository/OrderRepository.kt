package ru.grobikon.testmongodbembeded.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import ru.grobikon.testmongodbembeded.model.User

interface OrderRepository: MongoRepository<User, Long> {
    fun findByName(name: String): User
    @Query("{'Address.city':?0}")
    fun findByCity(city: String): List<User>
}