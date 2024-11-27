package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class ArtifactKey {
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

    fun groupId(groupId: String?): ArtifactKey {
        this.groupId = groupId
        return this
    }

    fun artifactId(artifactId: String?): ArtifactKey {
        this.artifactId = artifactId
        return this
    }

    fun classifier(classifier: String?): ArtifactKey {
        this.classifier = classifier
        return this
    }

    fun type(type: String?): ArtifactKey {
        this.type = type
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class ArtifactKey {\n")

        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n")
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n")
        sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n")
        sb.append("    type: ").append(toIndentedString(type)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class ArtifactKeyQueryParam {
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

        fun groupId(groupId: String?): ArtifactKeyQueryParam {
            this.groupId = groupId
            return this
        }

        fun artifactId(artifactId: String?): ArtifactKeyQueryParam {
            this.artifactId = artifactId
            return this
        }

        fun classifier(classifier: String?): ArtifactKeyQueryParam {
            this.classifier = classifier
            return this
        }

        fun type(type: String?): ArtifactKeyQueryParam {
            this.type = type
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class ArtifactKeyQueryParam {\n")

            sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n")
            sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n")
            sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n")
            sb.append("    type: ").append(toIndentedString(type)).append("\n")
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