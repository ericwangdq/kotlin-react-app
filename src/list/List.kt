package list

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

@JsModule("src/logo/kotlin.svg")
external val kotlinLogo: dynamic

fun RBuilder.list(height: Int = 100) {
    p("listview-contrainer") {
        attrs.jsStyle.height = height
        span(classes = "listview-msg"){
            +"List view component "
            code { +"list/List.kt" }
            +" file and save to reload."
        }
        span(classes = "listview-img") {
           img(alt = "Kotlin image message", src = kotlinLogo, classes = "img-kotlin") {}
        }
    }
}
