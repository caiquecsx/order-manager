package com.caiquecsx.order.service.controller

import com.caiquecsx.order.client.api.RegisterNewOrderApi
import com.caiquecsx.order.gateway.h2.domain.Order
import com.caiquecsx.order.service.usecase.CreateOrderUseCase
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterNewOrder(val createOrderUseCase: CreateOrderUseCase) : RegisterNewOrderApi {

    override fun registry(order: Order): Order {
        return createOrderUseCase.execute(order)
    }
}