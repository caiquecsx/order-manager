package com.caiquecsx.order.gateway.h2.mapper

import com.caiquecsx.order.domain.Order
import com.caiquecsx.order.gateway.h2.domain.OrderDatabase
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.factory.Mappers

@Mapper
interface OrderMapper {

    companion object {
        val MAPPER = Mappers.getMapper(OrderMapper::class.java)
    }

    fun databaseToDomain(orderDatabase: OrderDatabase): Order
}