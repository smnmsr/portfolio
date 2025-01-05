package com.moss.portfolio.backend.dao

import com.moss.portfolio.backend.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository : JpaRepository<Tag, Long>