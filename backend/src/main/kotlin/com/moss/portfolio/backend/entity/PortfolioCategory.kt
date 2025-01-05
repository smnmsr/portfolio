package com.moss.portfolio.backend.entity

import jakarta.persistence.*

@Entity
@Table(name = "portfolio_categories")
data class PortfolioCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(length = 255)
    val name: String,
    @OneToMany(mappedBy = "portfolioCategory", cascade = [CascadeType.PERSIST], orphanRemoval = true)
    val portfolioEntries: List<PortfolioEntry> = listOf(),
)
