package Play.Collections

class MyMap {
    // Map : Key/value pairs
    //init Map
    private val EZPassAccounts : MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100,3 to 100)

    fun addAccount(newId : Int) :Unit {
        println("Add new account : $newId")
        EZPassAccounts[newId] = 100
    }

    fun updatePointsCredit(accountId : Int) : Unit {
        if (EZPassAccounts.containsKey(accountId)) {
            println("Updating $accountId...")
            EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + 10
            println("ID : $accountId Credit : ${this.EZPassAccounts.getValue(accountId)}")
        } else {
            println("Error : Non existing account (id : $accountId)")
        }
    }

    // iteration
    fun accountReport() : Unit {
        println("EZ-Pass report :")
        EZPassAccounts.forEach{
            k, v ->
            println("ID : $k, Credit : $v")
        }
    }

    fun testMyMap() : Unit {
        accountReport()
        updatePointsCredit(1)
        addAccount(4)
        updatePointsCredit(4)
        updatePointsCredit(4)
        accountReport()
    }
}