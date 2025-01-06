package com.moss.portfolio.backend.dao

import com.moss.portfolio.backend.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin
interface TagRepository : JpaRepository<Tag, Long>