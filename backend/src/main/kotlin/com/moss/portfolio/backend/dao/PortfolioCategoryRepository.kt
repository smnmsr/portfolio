package com.moss.portfolio.backend.dao

import com.moss.portfolio.backend.entity.PortfolioCategory
import org.springframework.data.jpa.repository.JpaRepository

interface PortfolioCategoryRepository : JpaRepository<PortfolioCategory, Long>