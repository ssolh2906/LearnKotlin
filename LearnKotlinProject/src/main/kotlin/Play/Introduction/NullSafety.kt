package Play.Introduction

class NullSafety {
    fun example(): Unit{
        var neverNull: String = "This can't be null"
        // Default : Non-nullable

        //neverNull = null
        // This line causes error
        // "Null can not be a value of a non-null type String"

        var nullable : String? = "You can keep null here"
        nullable = null

        println("var neverNull : String")
        println(isItNull(neverNull))
        println("var nullable : String?")
        println(isItNull(nullable))
    }


    // working with Nulls
    // Null tracking using condition
    fun isItNull(maybeString:String?) : String {
        if (maybeString != null)
        {
            return "\t\"$maybeString\"\nIt is not Null"
        } else {
            return "It is Null"
        }
    }

}