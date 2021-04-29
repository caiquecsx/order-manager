package com.caiquecsx.order.service.usecase

import org.springframework.stereotype.Service

@Service
class CreateOrderUseCase {
    fun execute(): String{
        return "Order saved"
    }
}