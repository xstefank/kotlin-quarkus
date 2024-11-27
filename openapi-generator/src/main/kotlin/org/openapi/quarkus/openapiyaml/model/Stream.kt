package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class Stream {
    /**
     * Get key
     * @return key
     */
    /**
     * Set key
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("key")
    var key: String? = null
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
     * Get javaCompatibility
     * @return javaCompatibility
     */
    /**
     * Set javaCompatibility
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("javaCompatibility")
    var javaCompatibility: JavaCompatibility? = null
    /**
     * Get platformVersion
     * @return platformVersion
     */
    /**
     * Set platformVersion
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("platformVersion")
    var platformVersion: String? = null
    /**
     * Get recommended
     * @return recommended
     */
    /**
     * Set recommended
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("recommended")
    var recommended: Boolean? = null
    /**
     * Get status
     * @return status
     */
    /**
     * Set status
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("status")
    var status: String? = null
    /**
     * Get lts
     * @return lts
     */
    /**
     * Set lts
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("lts")
    var lts: Boolean? = null

    fun key(key: String?): Stream {
        this.key = key
        return this
    }

    fun quarkusCoreVersion(quarkusCoreVersion: String?): Stream {
        this.quarkusCoreVersion = quarkusCoreVersion
        return this
    }

    fun javaCompatibility(javaCompatibility: JavaCompatibility?): Stream {
        this.javaCompatibility = javaCompatibility
        return this
    }

    fun platformVersion(platformVersion: String?): Stream {
        this.platformVersion = platformVersion
        return this
    }

    fun recommended(recommended: Boolean?): Stream {
        this.recommended = recommended
        return this
    }

    fun status(status: String?): Stream {
        this.status = status
        return this
    }

    fun lts(lts: Boolean?): Stream {
        this.lts = lts
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class Stream {\n")

        sb.append("    key: ").append(toIndentedString(key)).append("\n")
        sb.append("    quarkusCoreVersion: ").append(toIndentedString(quarkusCoreVersion)).append("\n")
        sb.append("    javaCompatibility: ").append(toIndentedString(javaCompatibility)).append("\n")
        sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n")
        sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n")
        sb.append("    status: ").append(toIndentedString(status)).append("\n")
        sb.append("    lts: ").append(toIndentedString(lts)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class StreamQueryParam {
        /**
         * Get key
         * @return key
         */
        /**
         * Set key
         */
        @get:JsonProperty("key")
        @QueryParam("key")
        var key: String? = null
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
         * Get javaCompatibility
         * @return javaCompatibility
         */
        /**
         * Set javaCompatibility
         */
        @get:JsonProperty("javaCompatibility")
        @QueryParam("javaCompatibility")
        var javaCompatibility: JavaCompatibility? = null
        /**
         * Get platformVersion
         * @return platformVersion
         */
        /**
         * Set platformVersion
         */
        @get:JsonProperty("platformVersion")
        @QueryParam("platformVersion")
        var platformVersion: String? = null
        /**
         * Get recommended
         * @return recommended
         */
        /**
         * Set recommended
         */
        @get:JsonProperty("recommended")
        @QueryParam("recommended")
        var recommended: Boolean? = null
        /**
         * Get status
         * @return status
         */
        /**
         * Set status
         */
        @get:JsonProperty("status")
        @QueryParam("status")
        var status: String? = null
        /**
         * Get lts
         * @return lts
         */
        /**
         * Set lts
         */
        @get:JsonProperty("lts")
        @QueryParam("lts")
        var lts: Boolean? = null

        fun key(key: String?): StreamQueryParam {
            this.key = key
            return this
        }

        fun quarkusCoreVersion(quarkusCoreVersion: String?): StreamQueryParam {
            this.quarkusCoreVersion = quarkusCoreVersion
            return this
        }

        fun javaCompatibility(javaCompatibility: JavaCompatibility?): StreamQueryParam {
            this.javaCompatibility = javaCompatibility
            return this
        }

        fun platformVersion(platformVersion: String?): StreamQueryParam {
            this.platformVersion = platformVersion
            return this
        }

        fun recommended(recommended: Boolean?): StreamQueryParam {
            this.recommended = recommended
            return this
        }

        fun status(status: String?): StreamQueryParam {
            this.status = status
            return this
        }

        fun lts(lts: Boolean?): StreamQueryParam {
            this.lts = lts
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class StreamQueryParam {\n")

            sb.append("    key: ").append(toIndentedString(key)).append("\n")
            sb.append("    quarkusCoreVersion: ").append(toIndentedString(quarkusCoreVersion)).append("\n")
            sb.append("    javaCompatibility: ").append(toIndentedString(javaCompatibility)).append("\n")
            sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n")
            sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n")
            sb.append("    status: ").append(toIndentedString(status)).append("\n")
            sb.append("    lts: ").append(toIndentedString(lts)).append("\n")
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