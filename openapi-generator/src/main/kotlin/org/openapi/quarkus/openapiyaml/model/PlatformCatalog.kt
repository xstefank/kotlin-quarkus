package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class PlatformCatalog {
    private var platforms: MutableList<Platform>? = null
    private var metadata: MutableMap<String, Any>? = null

    /**
     * Get platforms
     * @return platforms
     */
    @JsonProperty("platforms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getPlatforms(): List<Platform>? {
        return platforms
    }

    /**
     * Set platforms
     */
    fun setPlatforms(platforms: MutableList<Platform>?) {
        this.platforms = platforms
    }

    fun platforms(platforms: MutableList<Platform>?): PlatformCatalog {
        this.platforms = platforms
        return this
    }

    fun addPlatformsItem(platformsItem: Platform): PlatformCatalog {
        if (this.platforms == null) {
            platforms = ArrayList()
        }
        platforms!!.add(platformsItem)
        return this
    }

    /**
     * Get metadata
     * @return metadata
     */
    @JsonProperty("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getMetadata(): Map<String, Any>? {
        return metadata
    }

    /**
     * Set metadata
     */
    fun setMetadata(metadata: MutableMap<String, Any>?) {
        this.metadata = metadata
    }

    fun metadata(metadata: MutableMap<String, Any>?): PlatformCatalog {
        this.metadata = metadata
        return this
    }

    fun putMetadataItem(key: String, metadataItem: Any): PlatformCatalog {
        if (this.metadata == null) {
            metadata = HashMap()
        }
        metadata!![key] = metadataItem
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class PlatformCatalog {\n")

        sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n")
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class PlatformCatalogQueryParam {
        @QueryParam("platforms")
        private var platforms: MutableList<Platform>? = null

        @QueryParam("metadata")
        private var metadata: MutableMap<String, Any>? = null

        /**
         * Get platforms
         * @return platforms
         */
        @JsonProperty("platforms")
        fun getPlatforms(): List<Platform>? {
            return platforms
        }

        /**
         * Set platforms
         */
        fun setPlatforms(platforms: MutableList<Platform>?) {
            this.platforms = platforms
        }

        fun platforms(platforms: MutableList<Platform>?): PlatformCatalogQueryParam {
            this.platforms = platforms
            return this
        }

        fun addPlatformsItem(platformsItem: Platform): PlatformCatalogQueryParam {
            platforms!!.add(platformsItem)
            return this
        }

        /**
         * Get metadata
         * @return metadata
         */
        @JsonProperty("metadata")
        fun getMetadata(): Map<String, Any>? {
            return metadata
        }

        /**
         * Set metadata
         */
        fun setMetadata(metadata: MutableMap<String, Any>?) {
            this.metadata = metadata
        }

        fun metadata(metadata: MutableMap<String, Any>?): PlatformCatalogQueryParam {
            this.metadata = metadata
            return this
        }

        fun putMetadataItem(key: String, metadataItem: Any): PlatformCatalogQueryParam {
            metadata!![key] = metadataItem
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class PlatformCatalogQueryParam {\n")

            sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n")
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n")
            sb.append("}")
            return sb.toString()
        }

        companion object {
            /**
             * Convert the given object to string with each line indented by 4 spaces
             * (except the first line).
             */
            private fun toIndentedString(o: Any?): String {
                if (o == null) {
                    return "null"
                }
                return o.toString().replace("\n", "\n    ")
            }
        }
    }

    companion object {
        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private fun toIndentedString(o: Any?): String {
            if (o == null) {
                return "null"
            }
            return o.toString().replace("\n", "\n    ")
        }
    }
}