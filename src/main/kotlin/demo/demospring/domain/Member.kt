package demo.demospring.domain

class Member {
    private var id: Long? = null
    private var name: String? = null
    fun getId(): Long? {
        return id
    }

    fun setId(id: Long?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }
}