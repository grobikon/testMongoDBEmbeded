package ru.grobikon.testmongodbembeded.controller

import org.springframework.web.bind.annotation.*
import ru.grobikon.testmongodbembeded.model.User
import ru.grobikon.testmongodbembeded.repository.OrderRepository

@RestController
@RequestMapping("/order-service")
class OrderController(
    val orderRepository: OrderRepository
){

    @PostMapping("/placesOrderNow")
    fun saveOrder(@RequestBody order: User): String{
        orderRepository.save(order)
        return "Order placed successfully..."
    }

    @GetMapping("/getUserByName/{name}")
    fun getUserByName(@PathVariable name: String): User {
        return orderRepository.findByName(name)
    }

    @GetMapping("/getUserByAddress/{city}")
    fun getUserByAddress(@PathVariable city: String): List<User> {
        return orderRepository.findByCity(city)
    }
}