package com.caiquecsx.order.service.controller

import com.caiquecsx.order.client.api.GetAllOrderApi
import com.caiquecsx.order.client.api.GetOrderByClientIdApi
import com.caiquecsx.order.domain.Order
import com.caiquecsx.order.service.usecase.GetAllOrdersUseCase
import com.caiquecsx.order.service.usecase.GetOrderByClientIdUseCase
import org.springframework.web.bind.annotation.RestController

@RestController
class GetOrderByClientIdController(private val getOrderByClientIdUseCase: GetOrderByClientIdUseCase) : GetOrderByClientIdApi {
    override fun execute(clientId: Int): List<Order> {
        return getOrderByClientIdUseCase.execute(clientId)
    }
}