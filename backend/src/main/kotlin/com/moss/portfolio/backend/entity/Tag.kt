package com.moss.portfolio.backend.entity

import jakarta.persistence.*

@Entity
@Table(name = "tags")
data class Tag(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(length = 255)
    val name: String,
    @ManyToOne
    @JoinColumn(name = "tag_category_id")
    val tagCategory: TagCategory,
    @ManyToMany(mappedBy = "tags", fetch = FetchType.LAZY)
    val portfolioEntries: List<PortfolioEntry> = listOf(),
)
