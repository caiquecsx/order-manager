package com.caiquecsx.order.gateway.h2

import com.caiquecsx.order.gateway.h2.domain.Order
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: CrudRepository<Order, Int> {
}