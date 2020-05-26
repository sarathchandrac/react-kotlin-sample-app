package flashcards

import kotlinx.html.style
import kotlinx.html.title
import kotlinext.js.js

import react.RBuilder
import react.dom.div
import react.dom.h1


internal fun RBuilder.gameUI(g: Game, eh: Eh) {
    div {
        h1 { +"Blackjack" }
        buttonBar(eh)
        div {

            attrs.title = "Foo"
            attrs.style = kotlinext.js.js {
                display = "flex"
            }

            handUI(g.ph)
            handUI(g.dh)


        }
    }
}