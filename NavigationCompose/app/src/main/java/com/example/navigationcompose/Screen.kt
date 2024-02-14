package com.example.navigationcompose

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"
sealed class Screen( //by default every constructor will be private (doesnt allow inherit)
    val route: String
) {
    object Home: Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen?id={id}&name={name}"){
//        fun passId(id: Int = 0) : String {
//            return "detail_screen?id=$id"
//        }
        fun passedNameAndId( //Multiple Optional Arguments
            id: Int = 0,
            name: String = "Guga"
        ) : String {
            return "detail_screen?id=$id&name=$name" //setting both id and name in this function that we put in the route
        }
    }
}

    /* $$$$$$$$$ SINGLE/MULTIPLE REQUIRED ARGUMENT $$$$$$$$$
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"){
//        fun passId(id: Int) : String { //passing Single Required Argument function to HomeScreen
//            return "detail_screen/$id" //simply returning the name of the rout and a simple id
//        }
        fun passNameAndId( //Multiple Required Arguments, cause have 2 parameters
            id: Int,
            name: String
        ) : String {
            return "detail_screen/$id/$name" //passing Multiple Required Arguments (id and name to HomeScreen)
        }
    }
}
*/

