package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class Platform {
    /**
     * Get platformKey
     * @return platformKey
     */
    /**
     * Set platformKey
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("platformKey")
    var platformKey: String? = null
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
    private var streams: MutableList<PlatformStream>? = null
    private var metadata: MutableMap<String, Any>? = null

    fun platformKey(platformKey: String?): Platform {
        this.platformKey = platformKey
        return this
    }

    fun name(name: String?): Platform {
        this.name = name
        return this
    }

    /**
     * Get streams
     * @return streams
     */
    @JsonProperty("streams")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getStreams(): List<PlatformStream>? {
        return streams
    }

    /**
     * Set streams
     */
    fun setStreams(streams: MutableList<PlatformStream>?) {
        this.streams = streams
    }

    fun streams(streams: MutableList<PlatformStream>?): Platform {
        this.streams = streams
        return this
    }

    fun addStreamsItem(streamsItem: PlatformStream): Platform {
        if (this.streams == null) {
            streams = ArrayList()
        }
        streams!!.add(streamsItem)
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

    fun metadata(metadata: MutableMap<String, Any>?): Platform {
        this.metadata = metadata
        return this
    }

    fun putMetadataItem(key: String, metadataItem: Any): Platform {
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
        sb.append("class Platform {\n")

        sb.append("    platformKey: ").append(toIndentedString(platformKey)).append("\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
        sb.append("    streams: ").append(toIndentedString(streams)).append("\n")
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class PlatformQueryParam {
        /**
         * Get platformKey
         * @return platformKey
         */
        /**
         * Set platformKey
         */
        @get:JsonProperty("platformKey")
        @QueryParam("platformKey")
        var platformKey: String? = null
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

        @QueryParam("streams")
        private var streams: MutableList<PlatformStream>? = null

        @QueryParam("metadata")
        private var metadata: MutableMap<String, Any>? = null

        fun platformKey(platformKey: String?): PlatformQueryParam {
            this.platformKey = platformKey
            return this
        }

        fun name(name: String?): PlatformQueryParam {
            this.name = name
            return this
        }

        /**
         * Get streams
         * @return streams
         */
        @JsonProperty("streams")
        fun getStreams(): List<PlatformStream>? {
            return streams
        }

        /**
         * Set streams
         */
        fun setStreams(streams: MutableList<PlatformStream>?) {
            this.streams = streams
        }

        fun streams(streams: MutableList<PlatformStream>?): PlatformQueryParam {
            this.streams = streams
            return this
        }

        fun addStreamsItem(streamsItem: PlatformStream): PlatformQueryParam {
            streams!!.add(streamsItem)
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

        fun metadata(metadata: MutableMap<String, Any>?): PlatformQueryParam {
            this.metadata = metadata
            return this
        }

        fun putMetadataItem(key: String, metadataItem: Any): PlatformQueryParam {
            metadata!![key] = metadataItem
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class PlatformQueryParam {\n")

            sb.append("    platformKey: ").append(toIndentedString(platformKey)).append("\n")
            sb.append("    name: ").append(toIndentedString(name)).append("\n")
            sb.append("    streams: ").append(toIndentedString(streams)).append("\n")
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