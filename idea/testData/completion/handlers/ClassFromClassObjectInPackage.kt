package a

class Test {
    default object {
        class Some
    }
}

fun test() {
    a.Test.Default.S<caret>
}