package com.caiquecsx.order.service.usecase

import com.caiquecsx.order.gateway.h2.OrderRepository
import com.caiquecsx.order.gateway.domain.OrderDatabase
import org.springframework.stereotype.Service

@Service
class CreateOrderUseCase(private val orderRepository: OrderRepository) {
    fun execute(orderDatabase: OrderDatabase): OrderDatabase{
        return orderRepository.save(orderDatabase)
    }
}