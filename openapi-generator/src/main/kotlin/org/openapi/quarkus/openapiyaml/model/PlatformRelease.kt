package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class PlatformRelease {
    /**
     * Get version
     * @return version
     */
    /**
     * Set version
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("version")
    var version: Any? = null
    private var memberBoms: MutableList<ArtifactCoords>? = null
    /**
     * Get quarkusCoreVersion
     * @return quarkusCoreVersion
     */
    /**
     * Set quarkusCoreVersion
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("quarkusCoreVersion")
    var quarkusCoreVersion: String? = null
    /**
     * Get upstreamQuarkusCoreVersion
     * @return upstreamQuarkusCoreVersion
     */
    /**
     * Set upstreamQuarkusCoreVersion
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("upstreamQuarkusCoreVersion")
    var upstreamQuarkusCoreVersion: String? = null
    private var metadata: MutableMap<String, Any>? = null

    fun version(version: Any?): PlatformRelease {
        this.version = version
        return this
    }

    /**
     * Get memberBoms
     * @return memberBoms
     */
    @JsonProperty("memberBoms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getMemberBoms(): List<ArtifactCoords>? {
        return memberBoms
    }

    /**
     * Set memberBoms
     */
    fun setMemberBoms(memberBoms: MutableList<ArtifactCoords>?) {
        this.memberBoms = memberBoms
    }

    fun memberBoms(memberBoms: MutableList<ArtifactCoords>?): PlatformRelease {
        this.memberBoms = memberBoms
        return this
    }

    fun addMemberBomsItem(memberBomsItem: ArtifactCoords): PlatformRelease {
        if (this.memberBoms == null) {
            memberBoms = ArrayList()
        }
        memberBoms!!.add(memberBomsItem)
        return this
    }

    fun quarkusCoreVersion(quarkusCoreVersion: String?): PlatformRelease {
        this.quarkusCoreVersion = quarkusCoreVersion
        return this
    }

    fun upstreamQuarkusCoreVersion(upstreamQuarkusCoreVersion: String?): PlatformRelease {
        this.upstreamQuarkusCoreVersion = upstreamQuarkusCoreVersion
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

    fun metadata(metadata: MutableMap<String, Any>?): PlatformRelease {
        this.metadata = metadata
        return this
    }

    fun putMetadataItem(key: String, metadataItem: Any): PlatformRelease {
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
        sb.append("class PlatformRelease {\n")

        sb.append("    version: ").append(toIndentedString(version)).append("\n")
        sb.append("    memberBoms: ").append(toIndentedString(memberBoms)).append("\n")
        sb.append("    quarkusCoreVersion: ").append(toIndentedString(quarkusCoreVersion)).append("\n")
        sb.append("    upstreamQuarkusCoreVersion: ").append(toIndentedString(upstreamQuarkusCoreVersion)).append("\n")
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class PlatformReleaseQueryParam {
        /**
         * Get version
         * @return version
         */
        /**
         * Set version
         */
        @get:JsonProperty("version")
        @QueryParam("version")
        var version: Any? = null

        @QueryParam("memberBoms")
        private var memberBoms: MutableList<ArtifactCoords>? = null
        /**
         * Get quarkusCoreVersion
         * @return quarkusCoreVersion
         */
        /**
         * Set quarkusCoreVersion
         */
        @get:JsonProperty("quarkusCoreVersion")
        @QueryParam("quarkusCoreVersion")
        var quarkusCoreVersion: String? = null
        /**
         * Get upstreamQuarkusCoreVersion
         * @return upstreamQuarkusCoreVersion
         */
        /**
         * Set upstreamQuarkusCoreVersion
         */
        @get:JsonProperty("upstreamQuarkusCoreVersion")
        @QueryParam("upstreamQuarkusCoreVersion")
        var upstreamQuarkusCoreVersion: String? = null

        @QueryParam("metadata")
        private var metadata: MutableMap<String, Any>? = null

        fun version(version: Any?): PlatformReleaseQueryParam {
            this.version = version
            return this
        }

        /**
         * Get memberBoms
         * @return memberBoms
         */
        @JsonProperty("memberBoms")
        fun getMemberBoms(): List<ArtifactCoords>? {
            return memberBoms
        }

        /**
         * Set memberBoms
         */
        fun setMemberBoms(memberBoms: MutableList<ArtifactCoords>?) {
            this.memberBoms = memberBoms
        }

        fun memberBoms(memberBoms: MutableList<ArtifactCoords>?): PlatformReleaseQueryParam {
            this.memberBoms = memberBoms
            return this
        }

        fun addMemberBomsItem(memberBomsItem: ArtifactCoords): PlatformReleaseQueryParam {
            memberBoms!!.add(memberBomsItem)
            return this
        }

        fun quarkusCoreVersion(quarkusCoreVersion: String?): PlatformReleaseQueryParam {
            this.quarkusCoreVersion = quarkusCoreVersion
            return this
        }

        fun upstreamQuarkusCoreVersion(upstreamQuarkusCoreVersion: String?): PlatformReleaseQueryParam {
            this.upstreamQuarkusCoreVersion = upstreamQuarkusCoreVersion
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

        fun metadata(metadata: MutableMap<String, Any>?): PlatformReleaseQueryParam {
            this.metadata = metadata
            return this
        }

        fun putMetadataItem(key: String, metadataItem: Any): PlatformReleaseQueryParam {
            metadata!![key] = metadataItem
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class PlatformReleaseQueryParam {\n")

            sb.append("    version: ").append(toIndentedString(version)).append("\n")
            sb.append("    memberBoms: ").append(toIndentedString(memberBoms)).append("\n")
            sb.append("    quarkusCoreVersion: ").append(toIndentedString(quarkusCoreVersion)).append("\n")
            sb.append("    upstreamQuarkusCoreVersion: ").append(toIndentedString(upstreamQuarkusCoreVersion)).append("\n")
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