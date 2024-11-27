package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class Preset {
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
     * Get title
     * @return title
     */
    /**
     * Set title
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("title")
    var title: String? = null
    /**
     * Get icon
     * @return icon
     */
    /**
     * Set icon
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("icon")
    var icon: String? = null
    private var extensions: MutableList<String>? = null

    fun key(key: String?): Preset {
        this.key = key
        return this
    }

    fun title(title: String?): Preset {
        this.title = title
        return this
    }

    fun icon(icon: String?): Preset {
        this.icon = icon
        return this
    }

    /**
     * Get extensions
     * @return extensions
     */
    @JsonProperty("extensions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getExtensions(): List<String>? {
        return extensions
    }

    /**
     * Set extensions
     */
    fun setExtensions(extensions: MutableList<String>?) {
        this.extensions = extensions
    }

    fun extensions(extensions: MutableList<String>?): Preset {
        this.extensions = extensions
        return this
    }

    fun addExtensionsItem(extensionsItem: String): Preset {
        if (this.extensions == null) {
            extensions = ArrayList()
        }
        extensions!!.add(extensionsItem)
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class Preset {\n")

        sb.append("    key: ").append(toIndentedString(key)).append("\n")
        sb.append("    title: ").append(toIndentedString(title)).append("\n")
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n")
        sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class PresetQueryParam {
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
         * Get title
         * @return title
         */
        /**
         * Set title
         */
        @get:JsonProperty("title")
        @QueryParam("title")
        var title: String? = null
        /**
         * Get icon
         * @return icon
         */
        /**
         * Set icon
         */
        @get:JsonProperty("icon")
        @QueryParam("icon")
        var icon: String? = null

        @QueryParam("extensions")
        private var extensions: MutableList<String>? = null

        fun key(key: String?): PresetQueryParam {
            this.key = key
            return this
        }

        fun title(title: String?): PresetQueryParam {
            this.title = title
            return this
        }

        fun icon(icon: String?): PresetQueryParam {
            this.icon = icon
            return this
        }

        /**
         * Get extensions
         * @return extensions
         */
        @JsonProperty("extensions")
        fun getExtensions(): List<String>? {
            return extensions
        }

        /**
         * Set extensions
         */
        fun setExtensions(extensions: MutableList<String>?) {
            this.extensions = extensions
        }

        fun extensions(extensions: MutableList<String>?): PresetQueryParam {
            this.extensions = extensions
            return this
        }

        fun addExtensionsItem(extensionsItem: String): PresetQueryParam {
            extensions!!.add(extensionsItem)
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class PresetQueryParam {\n")

            sb.append("    key: ").append(toIndentedString(key)).append("\n")
            sb.append("    title: ").append(toIndentedString(title)).append("\n")
            sb.append("    icon: ").append(toIndentedString(icon)).append("\n")
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