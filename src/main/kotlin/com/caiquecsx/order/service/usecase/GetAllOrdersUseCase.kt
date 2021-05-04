package com.caiquecsx.order.service.usecase

import com.caiquecsx.order.gateway.FindAllOrderGateway
import com.caiquecsx.order.gateway.h2.domain.Order
import org.springframework.stereotype.Component

@Component
class GetAllOrdersUseCase(var findAllOrderGateway: FindAllOrderGateway) {
    fun execute() : List<Order>{
        return findAllOrderGateway.findAll()
    }
}