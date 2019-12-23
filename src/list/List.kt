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
        println("Listview componentDidMount, Prop: ${props.initalListCount}, State ${state.modifiedListCount}");
        setState { modifiedListCount += 100 }
    }

    override fun componentWillUnmount() {
        println("Listview componentWillUnmount");
        // window.clearInterval(timerID!!)
    }

    override fun RBuilder.render() {
        +"Prop list count ${props.initalListCount}. "
        +"State list count modified ${state.modifiedListCount}."
        p("listview-contrainer") {
        attrs.jsStyle.height = props.initalListCount
        span(classes = "listview-msg"){
            +"Listview component, edit this "
            code { +"list/List.kt" }
            +" file and save to reload."
        }
        span(classes = "listview-img") {
           img(alt = "Kotlin image message", src = kotlinLogo, classes = "img-kotlin") {}
        }
    }
    }
}


fun RBuilder.list(height: Int = 100) = child(List::class) {
    attrs.initalListCount = height;
}
