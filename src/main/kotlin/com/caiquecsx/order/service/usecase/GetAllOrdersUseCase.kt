package com.caiquecsx.order.service.usecase

import com.caiquecsx.order.domain.Order
import com.caiquecsx.order.gateway.FindAllOrderGateway
import com.caiquecsx.order.gateway.h2.domain.toOrderDomain
import org.springframework.stereotype.Component

@Component
class GetAllOrdersUseCase(var findAllOrderGateway: FindAllOrderGateway) {
    fun execute() : List<Order>{
        val orderList = ArrayList<Order>()
        findAllOrderGateway.findAll().forEach {
            orderList.add(it.toOrderDomain())
        }
        return orderList
    }
}