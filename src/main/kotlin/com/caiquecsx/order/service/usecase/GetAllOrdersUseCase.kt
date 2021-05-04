package com.caiquecsx.order.service.usecase

import com.caiquecsx.order.gateway.FindAllOrderGateway
import com.caiquecsx.order.gateway.h2.domain.OrderDatabase
import com.caiquecsx.order.gateway.h2.mapper.OrderMapper
import org.springframework.stereotype.Component

@Component
class GetAllOrdersUseCase(var findAllOrderGateway: FindAllOrderGateway, val orderMapper: OrderMapper) {
    fun execute() : List<OrderDatabase>{
        findAllOrderGateway.findAll().forEach {
            orderMapper.databaseToDomain(it)
            //TODO refactor to use domain instead of database entity
        }
        return findAllOrderGateway.findAll()
    }
}