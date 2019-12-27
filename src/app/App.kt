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
     
        div("wrapper") {
             div("App-header") {
                logo()
                h2 {
                    +"Welcome to React with Kotlin, Greetings!"
                }
            }
           browserRouter { // "browserRouter" or "hashRouter"
                sidebar()
                switch {
                    route("/", exact = true)  {
                        p{
                            h1{
                                +"Home router"
                            }
                            +"Home Screen for closure function"
                        }
                    }
                    route("/list", List::class, exact = true)
                    route("/test") {
                        div("Listview") {
                            h1{
                                +"Test router"
                            }
                            list(height=240)
                        }
                    }
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
            // div("Listview") {
            //     list(height=240)
            // }
            p("test-p") {
                +"Put test messsage"
            }

        }


    }
}

fun RBuilder.app() = child(App::class) {}
