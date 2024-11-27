package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class PlatformStream {
    /**
     * Get id
     * @return id
     */
    /**
     * Set id
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("id")
    var id: String? = null
    /**
     * Get name
     * @return name
     */
    /**
     * Set name
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("name")
    var name: String? = null
    private var releases: MutableList<PlatformRelease>? = null
    private var metadata: MutableMap<String, Any>? = null

    fun id(id: String?): PlatformStream {
        this.id = id
        return this
    }

    fun name(name: String?): PlatformStream {
        this.name = name
        return this
    }

    /**
     * Get releases
     * @return releases
     */
    @JsonProperty("releases")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getReleases(): List<PlatformRelease>? {
        return releases
    }

    /**
     * Set releases
     */
    fun setReleases(releases: MutableList<PlatformRelease>?) {
        this.releases = releases
    }

    fun releases(releases: MutableList<PlatformRelease>?): PlatformStream {
        this.releases = releases
        return this
    }

    fun addReleasesItem(releasesItem: PlatformRelease): PlatformStream {
        if (this.releases == null) {
            releases = ArrayList()
        }
        releases!!.add(releasesItem)
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

    fun metadata(metadata: MutableMap<String, Any>?): PlatformStream {
        this.metadata = metadata
        return this
    }

    fun putMetadataItem(key: String, metadataItem: Any): PlatformStream {
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
        sb.append("class PlatformStream {\n")

        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
        sb.append("    releases: ").append(toIndentedString(releases)).append("\n")
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class PlatformStreamQueryParam {
        /**
         * Get id
         * @return id
         */
        /**
         * Set id
         */
        @get:JsonProperty("id")
        @QueryParam("id")
        var id: String? = null
        /**
         * Get name
         * @return name
         */
        /**
         * Set name
         */
        @get:JsonProperty("name")
        @QueryParam("name")
        var name: String? = null

        @QueryParam("releases")
        private var releases: MutableList<PlatformRelease>? = null

        @QueryParam("metadata")
        private var metadata: MutableMap<String, Any>? = null

        fun id(id: String?): PlatformStreamQueryParam {
            this.id = id
            return this
        }

        fun name(name: String?): PlatformStreamQueryParam {
            this.name = name
            return this
        }

        /**
         * Get releases
         * @return releases
         */
        @JsonProperty("releases")
        fun getReleases(): List<PlatformRelease>? {
            return releases
        }

        /**
         * Set releases
         */
        fun setReleases(releases: MutableList<PlatformRelease>?) {
            this.releases = releases
        }

        fun releases(releases: MutableList<PlatformRelease>?): PlatformStreamQueryParam {
            this.releases = releases
            return this
        }

        fun addReleasesItem(releasesItem: PlatformRelease): PlatformStreamQueryParam {
            releases!!.add(releasesItem)
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

        fun metadata(metadata: MutableMap<String, Any>?): PlatformStreamQueryParam {
            this.metadata = metadata
            return this
        }

        fun putMetadataItem(key: String, metadataItem: Any): PlatformStreamQueryParam {
            metadata!![key] = metadataItem
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class PlatformStreamQueryParam {\n")

            sb.append("    id: ").append(toIndentedString(id)).append("\n")
            sb.append("    name: ").append(toIndentedString(name)).append("\n")
            sb.append("    releases: ").append(toIndentedString(releases)).append("\n")
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