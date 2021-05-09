package com.caiquecsx.order.service.usecase

import com.caiquecsx.order.domain.Order
import com.caiquecsx.order.gateway.FindAllOrderGateway
import com.caiquecsx.order.gateway.FindOrderByClientIdGateway
import com.caiquecsx.order.gateway.h2.domain.toOrderDomain
import org.springframework.stereotype.Component

@Component
class GetOrderByClientIdUseCase(var findOrderByClientIdGateway: FindOrderByClientIdGateway) {
    fun execute(clientId: Int) : List<Order>{
        val orderList = ArrayList<Order>()
        findOrderByClientIdGateway.execute(clientId).forEach {
            orderList.add(it.toOrderDomain())
        }
        return orderList
    }
}