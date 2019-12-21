package list

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

@JsModule("src/logo/kotlin.svg")
external val kotlinLogo: dynamic

interface ListProps : RProps {
    var initalListCount: Int
}

interface ListState : RState {
    var modifiedListCount: Int
}

class List(props: ListProps) : RComponent<ListProps, ListState>(props) {
    override fun ListState.init(props: ListProps) {
        modifiedListCount = props.initalListCount
    }

    // var count: Int? = null

    override fun componentDidMount() {
        println("Listview componentDidMount");
    }

    override fun componentWillUnmount() {
        println("Listview componentWillUnmount");
        // window.clearInterval(timerID!!)
    }

    override fun RBuilder.render() {
        +"This app has been running for  seconds."
    }
}


fun RBuilder.list(height: Int = 100) {

    p("listview-contrainer") {
        attrs.jsStyle.height = height
        span(classes = "listview-msg"){
            +"Listview component, edit this"
            code { +"list/List.kt" }
            +" file and save to reload."
        }
        span(classes = "listview-img") {
           img(alt = "Kotlin image message", src = kotlinLogo, classes = "img-kotlin") {}
        }
    }
}
