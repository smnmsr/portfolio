package com.moss.portfolio.backend.entity

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Table(name = "portfolio_entries")
data class PortfolioEntry(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(length = 255)
    val title: String,
    val description: String,
    val active: Boolean = false,
    @ManyToOne
    @JoinColumn(name = "portfolio_category_id")
    val portfolioCategory: PortfolioCategory,
    @ManyToMany
    @JoinTable(
        name = "portfolio_entries_tags",
        joinColumns = [JoinColumn(name = "portfolio_entry_id")],
        inverseJoinColumns = [JoinColumn(name = "tag_id")]
    )
    val tags: List<Tag> = listOf(),
    @CreationTimestamp
    var createTime: Date? = null,
    @UpdateTimestamp
    var updateTime: Date? = null,
)