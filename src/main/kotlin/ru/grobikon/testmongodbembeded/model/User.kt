package ru.grobikon.testmongodbembeded.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "order_db")
data class User(
    @Id
    var id: Long,
    var name: String,
    var gender: String,
    var products: List<Product>,
    var address: Address
)
