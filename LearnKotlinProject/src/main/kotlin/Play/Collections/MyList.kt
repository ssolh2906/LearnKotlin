package Play.Collections

class MyList {
    // init list : listOf(), mutableListOf()
    private var systemUsers : MutableList<Int> = mutableListOf(1,2,3)
    private val sudoers : List<Int> = this.systemUsers

    fun addSystemUser(newUser: Int) {
        systemUsers.add(newUser)
    }

    fun getSysSudoers() : List<Int> {
        return sudoers
    }

    fun printAllSysUser() : Unit {
        println("Number of sudoers : ${getSysSudoers().size}")
        getSysSudoers().forEach{
            i ->
            println("User : $i")
        }
    }

    fun testMyList():Unit {
        println("add User 4")
        addSystemUser(4)
        printAllSysUser()
    }
}