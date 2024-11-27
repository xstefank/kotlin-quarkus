package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class CreatedProject {
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

    fun path(path: String?): CreatedProject {
        this.path = path
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreatedProject {\n")

        sb.append("    path: ").append(toIndentedString(path)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class CreatedProjectQueryParam {
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

        fun path(path: String?): CreatedProjectQueryParam {
            this.path = path
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class CreatedProjectQueryParam {\n")

            sb.append("    path: ").append(toIndentedString(path)).append("\n")
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