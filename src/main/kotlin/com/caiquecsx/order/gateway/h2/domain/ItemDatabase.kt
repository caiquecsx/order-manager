package com.caiquecsx.order.gateway.h2.domain

import com.caiquecsx.order.domain.Item
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ItemDatabase(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Int = 0,
    var description: String = "",
    var value: String = ""
)

fun ItemDatabase.toDomain() = Item(
    id = id,
    description = description,
    value = value
)