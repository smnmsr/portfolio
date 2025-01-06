package com.moss.portfolio.backend.dao

import com.moss.portfolio.backend.entity.PortfolioCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface PortfolioCategoryRepository : JpaRepository<PortfolioCategory, Long>