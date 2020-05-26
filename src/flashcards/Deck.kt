package flashcards


import kotlin.math.floor
import kotlin.random.Random

fun initCards(): MutableList<Card> {
    val a = mutableListOf<Card>()
    for (s in 1..4) {
        for (v in 1..13) {
            a.add(Card(v, s))
        }
    }
    repeat(10000, {
        val i1: Int = Random.nextInt(0, 52)
        val i2 = Random.nextInt(0, 52)
        val c1 = a[i1]
        val c2 = a[i2]
        a[i1] = c2
        a[i2] = c1
    })
    return a
}

class Deck {
    private val _cards: MutableList<Card> = initCards()
    fun take() = _cards.removeAt(0)
    val cards: List<Card> = _cards
    fun isEmpty() = _cards.isEmpty()
}