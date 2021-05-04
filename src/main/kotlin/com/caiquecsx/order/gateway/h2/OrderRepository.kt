package com.caiquecsx.order.gateway.h2

import com.caiquecsx.order.gateway.h2.domain.Order
import org.springframework.data.repository.CrudRepository

interface OrderRepository: CrudRepository<Order, Int> {
}