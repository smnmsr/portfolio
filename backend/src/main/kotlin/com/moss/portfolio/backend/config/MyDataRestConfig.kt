package com.moss.portfolio.backend.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.http.HttpMethod
import org.springframework.web.servlet.config.annotation.CorsRegistry

@Configuration
class MyDataRestConfig : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration, cors: CorsRegistry?) {
        // Define unsupported HTTP methods
        val theUnsupportedActions = arrayOf(HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE)

        // Disable HTTP methods globally for all repositories
        config.exposureConfiguration
            .withItemExposure { metadata, httpMethods -> httpMethods.disable(*theUnsupportedActions) }
            .withCollectionExposure { metadata, httpMethods -> httpMethods.disable(*theUnsupportedActions) }
    }
}