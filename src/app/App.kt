package app

import react.*
import react.dom.*
import react.router.dom.*
import logo.*
import ticker.*
import list.*
import sidebar.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        // sidebar()

        div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin, Greetings from Eric!"
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
        div("Listview") {
            list(height=240)
        }
        p("test-p") {
            +"Put test messsage"
        }

        browserRouter { // "browserRouter" or "hashRouter"
            switch {
                route("/", exact = true)  {
                    p{
                        +"Home Screen for closure function"
                    }
                }
                route("/redux", List::class, exact = true)
                route("/test") {
                    p{
                        +"Test Screen for closure function"
                    }
                }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
