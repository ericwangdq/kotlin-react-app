package sidebar

import react.*
import react.dom.*
import react.router.dom.*

fun RBuilder.sidebar() {
    div("sidebar navigation"){
        routeLink("/"){
            +"Home"
        }
        span {
            +" | "
        }
        routeLink("/kotlin"){
            +"Kotlin List"
        }
        span {
            +" | "
        }
        routeLink("/test"){
            +"Test"
        }
    }
}