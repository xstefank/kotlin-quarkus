package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class GitHubCreatedRepository {
    /**
     * Get ownerName
     * @return ownerName
     */
    /**
     * Set ownerName
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("ownerName")
    var ownerName: String? = null
    /**
     * Get url
     * @return url
     */
    /**
     * Set url
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("url")
    var url: String? = null
    /**
     * Get defaultBranch
     * @return defaultBranch
     */
    /**
     * Set defaultBranch
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("defaultBranch")
    var defaultBranch: String? = null

    fun ownerName(ownerName: String?): GitHubCreatedRepository {
        this.ownerName = ownerName
        return this
    }

    fun url(url: String?): GitHubCreatedRepository {
        this.url = url
        return this
    }

    fun defaultBranch(defaultBranch: String?): GitHubCreatedRepository {
        this.defaultBranch = defaultBranch
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class GitHubCreatedRepository {\n")

        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n")
        sb.append("    url: ").append(toIndentedString(url)).append("\n")
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class GitHubCreatedRepositoryQueryParam {
        /**
         * Get ownerName
         * @return ownerName
         */
        /**
         * Set ownerName
         */
        @get:JsonProperty("ownerName")
        @QueryParam("ownerName")
        var ownerName: String? = null
        /**
         * Get url
         * @return url
         */
        /**
         * Set url
         */
        @get:JsonProperty("url")
        @QueryParam("url")
        var url: String? = null
        /**
         * Get defaultBranch
         * @return defaultBranch
         */
        /**
         * Set defaultBranch
         */
        @get:JsonProperty("defaultBranch")
        @QueryParam("defaultBranch")
        var defaultBranch: String? = null

        fun ownerName(ownerName: String?): GitHubCreatedRepositoryQueryParam {
            this.ownerName = ownerName
            return this
        }

        fun url(url: String?): GitHubCreatedRepositoryQueryParam {
            this.url = url
            return this
        }

        fun defaultBranch(defaultBranch: String?): GitHubCreatedRepositoryQueryParam {
            this.defaultBranch = defaultBranch
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class GitHubCreatedRepositoryQueryParam {\n")

            sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n")
            sb.append("    url: ").append(toIndentedString(url)).append("\n")
            sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n")
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