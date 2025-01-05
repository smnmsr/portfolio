package com.moss.portfolio.backend.entity

import jakarta.persistence.*

@Entity
@Table(name = "tag_categories")
data class TagCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(length = 255)
    val name: String,
    @OneToMany(mappedBy = "tagCategory", cascade = [CascadeType.PERSIST])
    val tags: List<Tag> = listOf(),
)
