package app

import react.*
import react.dom.*
import logo.*
import ticker.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin, Hello from Eric"
            }
        }
        p("App-intro") {
            +"To get started, edit this "
            code { +"app/App.kt" }
            +" file and save to reload."
        }
        p("App-ticker") {
            ticker()
        }
        p("test-p") {
            +"Put test messsage"
        }
    }
}

fun RBuilder.app() = child(App::class) {}
