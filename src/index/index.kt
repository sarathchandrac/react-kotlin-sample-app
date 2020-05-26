package index
import flashcards.*
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {

    val rootDiv = document.getElementById("root")

    render(rootDiv) {
        app()
    }
}
