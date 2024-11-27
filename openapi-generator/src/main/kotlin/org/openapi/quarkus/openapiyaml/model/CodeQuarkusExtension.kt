package org.openapi.quarkus.openapiyaml.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.ws.rs.QueryParam

@JsonIgnoreProperties(ignoreUnknown = true)
class CodeQuarkusExtension {
    /**
     * Get id
     * @return id
     */
    /**
     * Set id
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("id")
    var id: String? = null
    /**
     * Get shortId
     * @return shortId
     */
    /**
     * Set shortId
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("shortId")
    var shortId: String? = null
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
     * Get name
     * @return name
     */
    /**
     * Set name
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("name")
    var name: String? = null
    /**
     * Get description
     * @return description
     */
    /**
     * Set description
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("description")
    var description: String? = null
    /**
     * Get shortName
     * @return shortName
     */
    /**
     * Set shortName
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("shortName")
    var shortName: String? = null
    /**
     * Get category
     * @return category
     */
    /**
     * Set category
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("category")
    var category: String? = null
    private var transitiveExtensions: MutableList<String>? = null
    private var tags: MutableList<String>? = null
    private var keywords: MutableSet<String>? = null
    /**
     * Get providesExampleCode
     * @return providesExampleCode
     */
    /**
     * Set providesExampleCode
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("providesExampleCode")
    var providesExampleCode: Boolean? = null
    /**
     * Get providesCode
     * @return providesCode
     */
    /**
     * Set providesCode
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("providesCode")
    var providesCode: Boolean? = null
    /**
     * Get guide
     * @return guide
     */
    /**
     * Set guide
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("guide")
    var guide: String? = null
    /**
     * Get order
     * @return order
     */
    /**
     * Set order
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("order")
    var order: Int? = null
    /**
     * Get platform
     * @return platform
     */
    /**
     * Set platform
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("platform")
    var platform: Boolean? = null
    /**
     * Get bom
     * @return bom
     */
    /**
     * Set bom
     */
    @get:JsonInclude(JsonInclude.Include.NON_NULL)
    @get:JsonProperty("bom")
    var bom: String? = null

    fun id(id: String?): CodeQuarkusExtension {
        this.id = id
        return this
    }

    fun shortId(shortId: String?): CodeQuarkusExtension {
        this.shortId = shortId
        return this
    }

    fun version(version: String?): CodeQuarkusExtension {
        this.version = version
        return this
    }

    fun name(name: String?): CodeQuarkusExtension {
        this.name = name
        return this
    }

    fun description(description: String?): CodeQuarkusExtension {
        this.description = description
        return this
    }

    fun shortName(shortName: String?): CodeQuarkusExtension {
        this.shortName = shortName
        return this
    }

    fun category(category: String?): CodeQuarkusExtension {
        this.category = category
        return this
    }

    /**
     * Get transitiveExtensions
     * @return transitiveExtensions
     */
    @JsonProperty("transitiveExtensions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getTransitiveExtensions(): List<String>? {
        return transitiveExtensions
    }

    /**
     * Set transitiveExtensions
     */
    fun setTransitiveExtensions(transitiveExtensions: MutableList<String>?) {
        this.transitiveExtensions = transitiveExtensions
    }

    fun transitiveExtensions(transitiveExtensions: MutableList<String>?): CodeQuarkusExtension {
        this.transitiveExtensions = transitiveExtensions
        return this
    }

    fun addTransitiveExtensionsItem(transitiveExtensionsItem: String): CodeQuarkusExtension {
        if (this.transitiveExtensions == null) {
            transitiveExtensions = ArrayList()
        }
        transitiveExtensions!!.add(transitiveExtensionsItem)
        return this
    }

    /**
     * Get tags
     * @return tags
     */
    @JsonProperty("tags")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getTags(): List<String>? {
        return tags
    }

    /**
     * Set tags
     */
    fun setTags(tags: MutableList<String>?) {
        this.tags = tags
    }

    fun tags(tags: MutableList<String>?): CodeQuarkusExtension {
        this.tags = tags
        return this
    }

    fun addTagsItem(tagsItem: String): CodeQuarkusExtension {
        if (this.tags == null) {
            tags = ArrayList()
        }
        tags!!.add(tagsItem)
        return this
    }

    /**
     * Get keywords
     * @return keywords
     */
    @JsonProperty("keywords")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    fun getKeywords(): Set<String>? {
        return keywords
    }

    /**
     * Set keywords
     */
    fun setKeywords(keywords: MutableSet<String>?) {
        this.keywords = keywords
    }

    fun keywords(keywords: MutableSet<String>?): CodeQuarkusExtension {
        this.keywords = keywords
        return this
    }

    fun addKeywordsItem(keywordsItem: String): CodeQuarkusExtension {
        if (this.keywords == null) {
            keywords = LinkedHashSet()
        }
        keywords!!.add(keywordsItem)
        return this
    }

    fun providesExampleCode(providesExampleCode: Boolean?): CodeQuarkusExtension {
        this.providesExampleCode = providesExampleCode
        return this
    }

    fun providesCode(providesCode: Boolean?): CodeQuarkusExtension {
        this.providesCode = providesCode
        return this
    }

    fun guide(guide: String?): CodeQuarkusExtension {
        this.guide = guide
        return this
    }

    fun order(order: Int?): CodeQuarkusExtension {
        this.order = order
        return this
    }

    fun platform(platform: Boolean?): CodeQuarkusExtension {
        this.platform = platform
        return this
    }

    fun bom(bom: String?): CodeQuarkusExtension {
        this.bom = bom
        return this
    }

    /**
     * Create a string representation of this pojo.
     */
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CodeQuarkusExtension {\n")

        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n")
        sb.append("    version: ").append(toIndentedString(version)).append("\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
        sb.append("    description: ").append(toIndentedString(description)).append("\n")
        sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n")
        sb.append("    category: ").append(toIndentedString(category)).append("\n")
        sb.append("    transitiveExtensions: ").append(toIndentedString(transitiveExtensions)).append("\n")
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n")
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n")
        sb.append("    providesExampleCode: ").append(toIndentedString(providesExampleCode)).append("\n")
        sb.append("    providesCode: ").append(toIndentedString(providesCode)).append("\n")
        sb.append("    guide: ").append(toIndentedString(guide)).append("\n")
        sb.append("    order: ").append(toIndentedString(order)).append("\n")
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n")
        sb.append("    bom: ").append(toIndentedString(bom)).append("\n")

        sb.append("}")
        return sb.toString()
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    class CodeQuarkusExtensionQueryParam {
        /**
         * Get id
         * @return id
         */
        /**
         * Set id
         */
        @get:JsonProperty("id")
        @QueryParam("id")
        var id: String? = null
        /**
         * Get shortId
         * @return shortId
         */
        /**
         * Set shortId
         */
        @get:JsonProperty("shortId")
        @QueryParam("shortId")
        var shortId: String? = null
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
         * Get name
         * @return name
         */
        /**
         * Set name
         */
        @get:JsonProperty("name")
        @QueryParam("name")
        var name: String? = null
        /**
         * Get description
         * @return description
         */
        /**
         * Set description
         */
        @get:JsonProperty("description")
        @QueryParam("description")
        var description: String? = null
        /**
         * Get shortName
         * @return shortName
         */
        /**
         * Set shortName
         */
        @get:JsonProperty("shortName")
        @QueryParam("shortName")
        var shortName: String? = null
        /**
         * Get category
         * @return category
         */
        /**
         * Set category
         */
        @get:JsonProperty("category")
        @QueryParam("category")
        var category: String? = null

        @QueryParam("transitiveExtensions")
        private var transitiveExtensions: MutableList<String>? = null

        @QueryParam("tags")
        private var tags: MutableList<String>? = null

        @QueryParam("keywords")
        private var keywords: MutableSet<String>? = null
        /**
         * Get providesExampleCode
         * @return providesExampleCode
         */
        /**
         * Set providesExampleCode
         */
        @get:JsonProperty("providesExampleCode")
        @QueryParam("providesExampleCode")
        var providesExampleCode: Boolean? = null
        /**
         * Get providesCode
         * @return providesCode
         */
        /**
         * Set providesCode
         */
        @get:JsonProperty("providesCode")
        @QueryParam("providesCode")
        var providesCode: Boolean? = null
        /**
         * Get guide
         * @return guide
         */
        /**
         * Set guide
         */
        @get:JsonProperty("guide")
        @QueryParam("guide")
        var guide: String? = null
        /**
         * Get order
         * @return order
         */
        /**
         * Set order
         */
        @get:JsonProperty("order")
        @QueryParam("order")
        var order: Int? = null
        /**
         * Get platform
         * @return platform
         */
        /**
         * Set platform
         */
        @get:JsonProperty("platform")
        @QueryParam("platform")
        var platform: Boolean? = null
        /**
         * Get bom
         * @return bom
         */
        /**
         * Set bom
         */
        @get:JsonProperty("bom")
        @QueryParam("bom")
        var bom: String? = null

        fun id(id: String?): CodeQuarkusExtensionQueryParam {
            this.id = id
            return this
        }

        fun shortId(shortId: String?): CodeQuarkusExtensionQueryParam {
            this.shortId = shortId
            return this
        }

        fun version(version: String?): CodeQuarkusExtensionQueryParam {
            this.version = version
            return this
        }

        fun name(name: String?): CodeQuarkusExtensionQueryParam {
            this.name = name
            return this
        }

        fun description(description: String?): CodeQuarkusExtensionQueryParam {
            this.description = description
            return this
        }

        fun shortName(shortName: String?): CodeQuarkusExtensionQueryParam {
            this.shortName = shortName
            return this
        }

        fun category(category: String?): CodeQuarkusExtensionQueryParam {
            this.category = category
            return this
        }

        /**
         * Get transitiveExtensions
         * @return transitiveExtensions
         */
        @JsonProperty("transitiveExtensions")
        fun getTransitiveExtensions(): List<String>? {
            return transitiveExtensions
        }

        /**
         * Set transitiveExtensions
         */
        fun setTransitiveExtensions(transitiveExtensions: MutableList<String>?) {
            this.transitiveExtensions = transitiveExtensions
        }

        fun transitiveExtensions(transitiveExtensions: MutableList<String>?): CodeQuarkusExtensionQueryParam {
            this.transitiveExtensions = transitiveExtensions
            return this
        }

        fun addTransitiveExtensionsItem(transitiveExtensionsItem: String): CodeQuarkusExtensionQueryParam {
            transitiveExtensions!!.add(transitiveExtensionsItem)
            return this
        }

        /**
         * Get tags
         * @return tags
         */
        @JsonProperty("tags")
        fun getTags(): List<String>? {
            return tags
        }

        /**
         * Set tags
         */
        fun setTags(tags: MutableList<String>?) {
            this.tags = tags
        }

        fun tags(tags: MutableList<String>?): CodeQuarkusExtensionQueryParam {
            this.tags = tags
            return this
        }

        fun addTagsItem(tagsItem: String): CodeQuarkusExtensionQueryParam {
            tags!!.add(tagsItem)
            return this
        }

        /**
         * Get keywords
         * @return keywords
         */
        @JsonProperty("keywords")
        fun getKeywords(): Set<String>? {
            return keywords
        }

        /**
         * Set keywords
         */
        fun setKeywords(keywords: MutableSet<String>?) {
            this.keywords = keywords
        }

        fun keywords(keywords: MutableSet<String>?): CodeQuarkusExtensionQueryParam {
            this.keywords = keywords
            return this
        }

        fun addKeywordsItem(keywordsItem: String): CodeQuarkusExtensionQueryParam {
            keywords!!.add(keywordsItem)
            return this
        }

        fun providesExampleCode(providesExampleCode: Boolean?): CodeQuarkusExtensionQueryParam {
            this.providesExampleCode = providesExampleCode
            return this
        }

        fun providesCode(providesCode: Boolean?): CodeQuarkusExtensionQueryParam {
            this.providesCode = providesCode
            return this
        }

        fun guide(guide: String?): CodeQuarkusExtensionQueryParam {
            this.guide = guide
            return this
        }

        fun order(order: Int?): CodeQuarkusExtensionQueryParam {
            this.order = order
            return this
        }

        fun platform(platform: Boolean?): CodeQuarkusExtensionQueryParam {
            this.platform = platform
            return this
        }

        fun bom(bom: String?): CodeQuarkusExtensionQueryParam {
            this.bom = bom
            return this
        }

        /**
         * Create a string representation of this pojo.
         */
        override fun toString(): String {
            val sb = StringBuilder()
            sb.append("class CodeQuarkusExtensionQueryParam {\n")

            sb.append("    id: ").append(toIndentedString(id)).append("\n")
            sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n")
            sb.append("    version: ").append(toIndentedString(version)).append("\n")
            sb.append("    name: ").append(toIndentedString(name)).append("\n")
            sb.append("    description: ").append(toIndentedString(description)).append("\n")
            sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n")
            sb.append("    category: ").append(toIndentedString(category)).append("\n")
            sb.append("    transitiveExtensions: ").append(toIndentedString(transitiveExtensions)).append("\n")
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n")
            sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n")
            sb.append("    providesExampleCode: ").append(toIndentedString(providesExampleCode)).append("\n")
            sb.append("    providesCode: ").append(toIndentedString(providesCode)).append("\n")
            sb.append("    guide: ").append(toIndentedString(guide)).append("\n")
            sb.append("    order: ").append(toIndentedString(order)).append("\n")
            sb.append("    platform: ").append(toIndentedString(platform)).append("\n")
            sb.append("    bom: ").append(toIndentedString(bom)).append("\n")
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