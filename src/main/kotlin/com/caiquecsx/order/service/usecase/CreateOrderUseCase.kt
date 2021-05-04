package com.caiquecsx.order.service.usecase

import com.caiquecsx.order.gateway.h2.OrderRepository
import com.caiquecsx.order.gateway.h2.domain.Order
import org.springframework.stereotype.Service

@Service
class CreateOrderUseCase(private val orderRepository: OrderRepository) {
    fun execute(order: Order): Order{
        return orderRepository.save(order)
    }
}