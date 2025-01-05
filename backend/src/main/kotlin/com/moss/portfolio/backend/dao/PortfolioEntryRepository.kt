package com.moss.portfolio.backend.dao

import com.moss.portfolio.backend.entity.PortfolioEntry
import org.springframework.data.jpa.repository.JpaRepository

interface PortfolioEntryRepository : JpaRepository<PortfolioEntry, Long>