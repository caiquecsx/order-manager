package com.caiquecsx.order.gateway.h2.domain

import com.caiquecsx.order.domain.Order
import org.springframework.data.annotation.CreatedDate
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "order_table")
data class OrderDatabase(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,
        @OneToMany(cascade = [CascadeType.PERSIST])
        var items: List<ItemDatabase> = emptyList(),
        var totalPrice: String = "",
        var clientId: Int = Int.MIN_VALUE,
        val createdDate: Date
)

fun OrderDatabase.toOrderDomain() = Order(
        id = id,
        items = items.map { it.toDomain() },
        totalPrice = totalPrice,
        clientId = clientId,
        createdDate = createdDate
)
