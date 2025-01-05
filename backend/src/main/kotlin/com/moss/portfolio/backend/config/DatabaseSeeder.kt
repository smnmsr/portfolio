package com.moss.portfolio.backend.config

import com.moss.portfolio.backend.dao.PortfolioCategoryRepository
import com.moss.portfolio.backend.dao.PortfolioEntryRepository
import com.moss.portfolio.backend.dao.TagCategoryRepository
import com.moss.portfolio.backend.dao.TagRepository
import com.moss.portfolio.backend.entity.PortfolioCategory
import com.moss.portfolio.backend.entity.PortfolioEntry
import com.moss.portfolio.backend.entity.Tag
import com.moss.portfolio.backend.entity.TagCategory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("local") // Ensures this only runs in the 'local' profile
class DatabaseSeeder(
    private val portfolioEntryRepository: PortfolioEntryRepository,
    private val portfolioCategoryRepository: PortfolioCategoryRepository,
    private val tagRepository: TagRepository,
    private val tagCategoryRepository: TagCategoryRepository
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        // Create sample categories
        val workCategory = portfolioCategoryRepository.save(PortfolioCategory(name = "Work"))
        val privateCategory = portfolioCategoryRepository.save(PortfolioCategory(name = "Private"))

        // Create sample tags and categories
        val programmingLanguages = tagCategoryRepository.save(TagCategory(name = "Programming Language"))
        val kotlinTag = tagRepository.save(Tag(name = "Kotlin", tagCategory = programmingLanguages))
        val javaTag = tagRepository.save(Tag(name = "Java", tagCategory = programmingLanguages))

        // Create sample portfolio entries
        val entry1 = PortfolioEntry(
            title = "First Project",
            description = "A simple project using Kotlin.",
            active = true,
            portfolioCategory = workCategory,
            tags = listOf(kotlinTag, javaTag)
        )

        val entry2 = PortfolioEntry(
            title = "Personal Blog",
            description = "A markdown-based blog system.",
            active = false,
            portfolioCategory = privateCategory,
            tags = listOf(kotlinTag)
        )

        portfolioEntryRepository.saveAll(listOf(entry1, entry2))

        println("Database seeded successfully!")
    }
}
