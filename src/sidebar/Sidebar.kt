package sidebar

import react.*
import react.dom.*
import react.router.dom.*

fun RBuilder.sidebar() {
    div("sidebar"){
        routeLink("/"){
            +"Home"
        }
        span {
            +" | "
        }
        routeLink("/list"){
            +"List"
        }
        span {
            +" | "
        }
        routeLink("/test"){
            +"Test"
        }
    }
}