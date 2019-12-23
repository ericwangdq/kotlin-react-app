package sidebar

import react.*
import react.dom.*
import react.router.dom.*

fun RBuilder.sidebar() {
    div("sidebar"){
        routeLink("/"){
            +"Home"
        }
        routeLink("/redux"){
            +"Redux"
        }
        routeLink("/test"){
            +"Test"
        }
    }
}