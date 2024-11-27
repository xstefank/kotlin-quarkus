package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.*
import jakarta.ws.rs.QueryParam
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
class ProjectDefinition {
    enum class StreamKeyEnum(var value: String) {
        _8("io.quarkus.platform:3.8".toString()), _15("io.quarkus.platform:3.15".toString()), _16("io.quarkus.platform:3.16".toString()), _17("io.quarkus.platform:3.17".toString()), _2("io.quarkus.platform:3.2".toString());

        @JsonValue
        fun value(): String {
            return value
        }

        override fun toString(): String {
            return value.toString()
        }

        companion object {
            // caching enum access
            private val values: EnumSet<StreamKeyEnum> = EnumSet.allOf(StreamKeyEnum::class.java)

            @JsonCreator
            fun fromString(v: String): StreamKeyEnum {
                for (b in values) {
                    if (b.value.toString().equals(v, ignoreCase = true)) {
                        return b
                    }
                }
                throw IllegalArgumentException("Unexpected value '$v'")
            }
        }
    }
    /**
     * Get streamKey
     * @return streamKey
     */
    /**
     * Set streamKey
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("streamKey")
    var streamKey: StreamKeyEnum? = null
    /**
     * Get groupId
     * @return groupId
     */
    /**
     * Set groupId
     */
    @get:JsonProperty("groupId")
    var groupId: String? = null
    /**
     * Get artifactId
     * @return artifactId
     */
    /**
     * Set artifactId
     */
    @get:JsonProperty("artifactId")
    var artifactId: String? = null
    /**
     * Get version
     * @return version
     */
    /**
     * Set version
     */
    @get:JsonProperty("version")
    var version: String? = null
    /**
     * Get className
     * @return className
     */
    /**
     * Set className
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("className")
    var className: String? = null
    /**
     * Get path
     * @return path
     */
    /**
     * Set path
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("path")
    var path: String? = null
    /**
     * Get buildTool
     * @return buildTool
     */
    /**
     * Set buildTool
     */
    @get:JsonProperty("buildTool")
    var buildTool: String? = null
    /**
     * Get javaVersion
     * @return javaVersion
     */
    /**
     * Set javaVersion
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("javaVersion")
    var javaVersion: Int? = null
    /**
     * Get noCode
     * @return noCode
     */
    /**
     * Set noCode
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("noCode")
    var noCode: Boolean? = null
    /**
     * Get noExamples
     * @return noExamples
     */
    /**
     * Set noExamples
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("noExamples")
    var noExamples: Boolean? = null
    private var extensions: MutableSet<String>? = null

    fun streamKey(streamKey: StreamKeyEnum?): ProjectDefinition {
        this.streamKey = streamKey
        return this
    }

    fun groupId(groupId: String?): ProjectDefinition {
        this.groupId = groupId
        return this
    }

    fun artifactId(artifactId: String?): ProjectDefinition {
        this.artifactId = artifactId
        return this
    }

    fun version(version: String?): ProjectDefinition {
        this.version = version
        return this
    }

    fun className(className: String?): ProjectDefinition {
        this.className = className
        return this
    }

    fun path(path: String?): ProjectDefinition {
        this.path = path
        return this
    }

    fun buildTool(buildTool: String?): ProjectDefinition {
        this.buildTool = buildTool
        return this
    }

    fun javaVersion(javaVersion: Int?): ProjectDefinition {
        this.javaVersion = javaVersion
        return this
    }

    fun noCode(noCode: Boolean?): ProjectDefinition {
        this.noCode = noCode
        return this
    }

    fun noExamples(noExamples: Boolean?): ProjectDefinition {
        this.noExamples = noExamples
        return this
    }

    /**
     * Get extensions
     * @return extensions
     */
    @JsonProperty("extensions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getExtensions(): Set<String>? {
        return extensions
    }

    /**
     * Set extensions
     */
    fun setExtensions(extensions: MutableSet<String>?) {
        this.extensions = extensions
    }

    fun extensions(extensions: MutableSet<String>?): ProjectDefinition {
        this.extensions = extensions
        return this
    }

    fun addExtensionsItem(extensionsItem: String): ProjectDefinition {
        if (this.extensions == null) {
            extensions = LinkedHashSet()
        }
        extensions!!.add(extensionsItem)
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class ProjectDefinition {\n")

        sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n")
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n")
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n")
        sb.append("    version: ").append(toIndentedString(version)).append("\n")
        sb.append("    className: ").append(toIndentedString(className)).append("\n")
        sb.append("    path: ").append(toIndentedString(path)).append("\n")
        sb.append("    buildTool: ").append(toIndentedString(buildTool)).append("\n")
        sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n")
        sb.append("    noCode: ").append(toIndentedString(noCode)).append("\n")
        sb.append("    noExamples: ").append(toIndentedString(noExamples)).append("\n")
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class ProjectDefinitionQueryParam {
        enum class StreamKeyEnum(var value: String) {
            _8("io.quarkus.platform:3.8".toString()), _15("io.quarkus.platform:3.15".toString()), _16("io.quarkus.platform:3.16".toString()), _17("io.quarkus.platform:3.17".toString()), _2("io.quarkus.platform:3.2".toString());

            @JsonValue
            fun value(): String {
                return value
            }

            override fun toString(): String {
                return value.toString()
            }

            companion object {
                // caching enum access
                private val values: EnumSet<StreamKeyEnum> = EnumSet.allOf(
                    StreamKeyEnum::class.java
                )

                @JsonCreator
                fun fromString(v: String): StreamKeyEnum {
                    for (b in values) {
                        if (b.value.toString().equals(v, ignoreCase = true)) {
                            return b
                        }
                    }
                    throw IllegalArgumentException("Unexpected value '$v'")
                }
            }
        }
        /**
         * Get streamKey
         * @return streamKey
         */
        /**
         * Set streamKey
         */
        @get:JsonProperty("streamKey")
        var streamKey: StreamKeyEnum? = null
        /**
         * Get groupId
         * @return groupId
         */
        /**
         * Set groupId
         */
        @get:JsonProperty("groupId")
        @QueryParam("groupId")
        var groupId: String? = null
        /**
         * Get artifactId
         * @return artifactId
         */
        /**
         * Set artifactId
         */
        @get:JsonProperty("artifactId")
        @QueryParam("artifactId")
        var artifactId: String? = null
        /**
         * Get version
         * @return version
         */
        /**
         * Set version
         */
        @get:JsonProperty("version")
        @QueryParam("version")
        var version: String? = null
        /**
         * Get className
         * @return className
         */
        /**
         * Set className
         */
        @get:JsonProperty("className")
        @QueryParam("className")
        var className: String? = null
        /**
         * Get path
         * @return path
         */
        /**
         * Set path
         */
        @get:JsonProperty("path")
        @QueryParam("path")
        var path: String? = null
        /**
         * Get buildTool
         * @return buildTool
         */
        /**
         * Set buildTool
         */
        @get:JsonProperty("buildTool")
        @QueryParam("buildTool")
        var buildTool: String? = null
        /**
         * Get javaVersion
         * @return javaVersion
         */
        /**
         * Set javaVersion
         */
        @get:JsonProperty("javaVersion")
        @QueryParam("javaVersion")
        var javaVersion: Int? = null
        /**
         * Get noCode
         * @return noCode
         */
        /**
         * Set noCode
         */
        @get:JsonProperty("noCode")
        @QueryParam("noCode")
        var noCode: Boolean? = null
        /**
         * Get noExamples
         * @return noExamples
         */
        /**
         * Set noExamples
         */
        @get:JsonProperty("noExamples")
        @QueryParam("noExamples")
        var noExamples: Boolean? = null

        @QueryParam("extensions")
        private var extensions: MutableSet<String>? = null

        fun streamKey(streamKey: StreamKeyEnum?): ProjectDefinitionQueryParam {
            this.streamKey = streamKey
            return this
        }

        fun groupId(groupId: String?): ProjectDefinitionQueryParam {
            this.groupId = groupId
            return this
        }

        fun artifactId(artifactId: String?): ProjectDefinitionQueryParam {
            this.artifactId = artifactId
            return this
        }

        fun version(version: String?): ProjectDefinitionQueryParam {
            this.version = version
            return this
        }

        fun className(className: String?): ProjectDefinitionQueryParam {
            this.className = className
            return this
        }

        fun path(path: String?): ProjectDefinitionQueryParam {
            this.path = path
            return this
        }

        fun buildTool(buildTool: String?): ProjectDefinitionQueryParam {
            this.buildTool = buildTool
            return this
        }

        fun javaVersion(javaVersion: Int?): ProjectDefinitionQueryParam {
            this.javaVersion = javaVersion
            return this
        }

        fun noCode(noCode: Boolean?): ProjectDefinitionQueryParam {
            this.noCode = noCode
            return this
        }

        fun noExamples(noExamples: Boolean?): ProjectDefinitionQueryParam {
            this.noExamples = noExamples
            return this
        }

        /**
         * Get extensions
         * @return extensions
         */
        @JsonProperty("extensions")
        fun getExtensions(): Set<String>? {
            return extensions
        }

        /**
         * Set extensions
         */
        fun setExtensions(extensions: MutableSet<String>?) {
            this.extensions = extensions
        }

        fun extensions(extensions: MutableSet<String>?): ProjectDefinitionQueryParam {
            this.extensions = extensions
            return this
        }

        fun addExtensionsItem(extensionsItem: String): ProjectDefinitionQueryParam {
            extensions!!.add(extensionsItem)
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class ProjectDefinitionQueryParam {\n")

            sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n")
            sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n")
            sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n")
            sb.append("    version: ").append(toIndentedString(version)).append("\n")
            sb.append("    className: ").append(toIndentedString(className)).append("\n")
            sb.append("    path: ").append(toIndentedString(path)).append("\n")
            sb.append("    buildTool: ").append(toIndentedString(buildTool)).append("\n")
            sb.append("    javaVersion: ").append(toIndentedString(javaVersion)).append("\n")
            sb.append("    noCode: ").append(toIndentedString(noCode)).append("\n")
            sb.append("    noExamples: ").append(toIndentedString(noExamples)).append("\n")
            sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n")
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