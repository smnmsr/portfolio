package com.moss.portfolio.backend.dao

import com.moss.portfolio.backend.entity.PortfolioEntry
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface PortfolioEntryRepository : JpaRepository<PortfolioEntry, Long>