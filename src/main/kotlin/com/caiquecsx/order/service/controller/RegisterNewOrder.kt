package com.caiquecsx.order.service.controller

import com.caiquecsx.order.client.api.RegisterNewOrderApi
import com.caiquecsx.order.domain.Order
import com.caiquecsx.order.service.usecase.CreateOrderUseCase
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterNewOrder(val createOrderUseCase: CreateOrderUseCase) : RegisterNewOrderApi {

    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun registry(order: Order): String {
        return createOrderUseCase.execute()
    }
}