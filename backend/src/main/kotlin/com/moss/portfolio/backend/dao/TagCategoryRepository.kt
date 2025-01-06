package com.moss.portfolio.backend.dao

import com.moss.portfolio.backend.entity.TagCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface TagCategoryRepository : JpaRepository<TagCategory, Long>