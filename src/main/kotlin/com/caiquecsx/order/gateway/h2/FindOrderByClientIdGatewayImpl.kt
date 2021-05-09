package com.caiquecsx.order.gateway.h2

import com.caiquecsx.order.gateway.FindAllOrderGateway
import com.caiquecsx.order.gateway.FindOrderByClientIdGateway
import com.caiquecsx.order.gateway.h2.domain.OrderDatabase
import org.springframework.stereotype.Service

@Service
class FindOrderByClientIdGatewayImpl(private val orderRepository: OrderRepository): FindOrderByClientIdGateway {
    override fun execute(clientId: Int): List<OrderDatabase> {
        return orderRepository.findAllByClientId(clientId)
    }
}