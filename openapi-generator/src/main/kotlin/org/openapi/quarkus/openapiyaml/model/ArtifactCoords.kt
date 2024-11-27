package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class ArtifactCoords {
    /**
     * Get groupId
     * @return groupId
     */
    /**
     * Set groupId
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("groupId")
    var groupId: String? = null
    /**
     * Get artifactId
     * @return artifactId
     */
    /**
     * Set artifactId
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("artifactId")
    var artifactId: String? = null
    /**
     * Get classifier
     * @return classifier
     */
    /**
     * Set classifier
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("classifier")
    var classifier: String? = null
    /**
     * Get type
     * @return type
     */
    /**
     * Set type
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("type")
    var type: String? = null
    /**
     * Get version
     * @return version
     */
    /**
     * Set version
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("version")
    var version: String? = null
    /**
     * Get key
     * @return key
     */
    /**
     * Set key
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("key")
    var key: ArtifactKey? = null
    /**
     * Get jar
     * @return jar
     */
    /**
     * Set jar
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("jar")
    var jar: Boolean? = null
    /**
     * Get snapshot
     * @return snapshot
     */
    /**
     * Set snapshot
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("snapshot")
    var snapshot: Boolean? = null

    fun groupId(groupId: String?): ArtifactCoords {
        this.groupId = groupId
        return this
    }

    fun artifactId(artifactId: String?): ArtifactCoords {
        this.artifactId = artifactId
        return this
    }

    fun classifier(classifier: String?): ArtifactCoords {
        this.classifier = classifier
        return this
    }

    fun type(type: String?): ArtifactCoords {
        this.type = type
        return this
    }

    fun version(version: String?): ArtifactCoords {
        this.version = version
        return this
    }

    fun key(key: ArtifactKey?): ArtifactCoords {
        this.key = key
        return this
    }

    fun jar(jar: Boolean?): ArtifactCoords {
        this.jar = jar
        return this
    }

    fun snapshot(snapshot: Boolean?): ArtifactCoords {
        this.snapshot = snapshot
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class ArtifactCoords {\n")

        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n")
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n")
        sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n")
        sb.append("    type: ").append(toIndentedString(type)).append("\n")
        sb.append("    version: ").append(toIndentedString(version)).append("\n")
        sb.append("    key: ").append(toIndentedString(key)).append("\n")
        sb.append("    jar: ").append(toIndentedString(jar)).append("\n")
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class ArtifactCoordsQueryParam {
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
         * Get classifier
         * @return classifier
         */
        /**
         * Set classifier
         */
        @get:JsonProperty("classifier")
        @QueryParam("classifier")
        var classifier: String? = null
        /**
         * Get type
         * @return type
         */
        /**
         * Set type
         */
        @get:JsonProperty("type")
        @QueryParam("type")
        var type: String? = null
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
         * Get key
         * @return key
         */
        /**
         * Set key
         */
        @get:JsonProperty("key")
        @QueryParam("key")
        var key: ArtifactKey? = null
        /**
         * Get jar
         * @return jar
         */
        /**
         * Set jar
         */
        @get:JsonProperty("jar")
        @QueryParam("jar")
        var jar: Boolean? = null
        /**
         * Get snapshot
         * @return snapshot
         */
        /**
         * Set snapshot
         */
        @get:JsonProperty("snapshot")
        @QueryParam("snapshot")
        var snapshot: Boolean? = null

        fun groupId(groupId: String?): ArtifactCoordsQueryParam {
            this.groupId = groupId
            return this
        }

        fun artifactId(artifactId: String?): ArtifactCoordsQueryParam {
            this.artifactId = artifactId
            return this
        }

        fun classifier(classifier: String?): ArtifactCoordsQueryParam {
            this.classifier = classifier
            return this
        }

        fun type(type: String?): ArtifactCoordsQueryParam {
            this.type = type
            return this
        }

        fun version(version: String?): ArtifactCoordsQueryParam {
            this.version = version
            return this
        }

        fun key(key: ArtifactKey?): ArtifactCoordsQueryParam {
            this.key = key
            return this
        }

        fun jar(jar: Boolean?): ArtifactCoordsQueryParam {
            this.jar = jar
            return this
        }

        fun snapshot(snapshot: Boolean?): ArtifactCoordsQueryParam {
            this.snapshot = snapshot
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class ArtifactCoordsQueryParam {\n")

            sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n")
            sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n")
            sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n")
            sb.append("    type: ").append(toIndentedString(type)).append("\n")
            sb.append("    version: ").append(toIndentedString(version)).append("\n")
            sb.append("    key: ").append(toIndentedString(key)).append("\n")
            sb.append("    jar: ").append(toIndentedString(jar)).append("\n")
            sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n")
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