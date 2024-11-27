package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class JavaCompatibility {
    private var versions: MutableSet<Int>? = null
    /**
     * Get recommended
     * @return recommended
     */
    /**
     * Set recommended
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("recommended")
    var recommended: Int? = null

    /**
     * Get versions
     * @return versions
     */
    @JsonProperty("versions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getVersions(): Set<Int>? {
        return versions
    }

    /**
     * Set versions
     */
    fun setVersions(versions: MutableSet<Int>?) {
        this.versions = versions
    }

    fun versions(versions: MutableSet<Int>?): JavaCompatibility {
        this.versions = versions
        return this
    }

    fun addVersionsItem(versionsItem: Int): JavaCompatibility {
        if (this.versions == null) {
            versions = LinkedHashSet()
        }
        versions!!.add(versionsItem)
        return this
    }

    fun recommended(recommended: Int?): JavaCompatibility {
        this.recommended = recommended
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class JavaCompatibility {\n")

        sb.append("    versions: ").append(toIndentedString(versions)).append("\n")
        sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class JavaCompatibilityQueryParam {
        @QueryParam("versions")
        private var versions: MutableSet<Int>? = null
        /**
         * Get recommended
         * @return recommended
         */
        /**
         * Set recommended
         */
        @get:JsonProperty("recommended")
        @QueryParam("recommended")
        var recommended: Int? = null

        /**
         * Get versions
         * @return versions
         */
        @JsonProperty("versions")
        fun getVersions(): Set<Int>? {
            return versions
        }

        /**
         * Set versions
         */
        fun setVersions(versions: MutableSet<Int>?) {
            this.versions = versions
        }

        fun versions(versions: MutableSet<Int>?): JavaCompatibilityQueryParam {
            this.versions = versions
            return this
        }

        fun addVersionsItem(versionsItem: Int): JavaCompatibilityQueryParam {
            versions!!.add(versionsItem)
            return this
        }

        fun recommended(recommended: Int?): JavaCompatibilityQueryParam {
            this.recommended = recommended
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class JavaCompatibilityQueryParam {\n")

            sb.append("    versions: ").append(toIndentedString(versions)).append("\n")
            sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n")
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