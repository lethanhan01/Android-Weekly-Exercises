fun main() {
    // Step 1: Explore numeric operators
    println("Numeric Operators:")

    // Basic arithmetic operations
    println(1 + 1)           // 2 (Int)
    println(53 - 3)          // 50 (Int)
    println(50 / 10)         // 5 (Int)
    println(1.0 / 2.0)       // 0.5 (Double)
    println(2.0 * 3.5)       // 7.0 (Double)

    // Note: 1/2 = 0 (integer division), but 1.0/2.0 = 0.5
    println(1 / 2)           // 0
    println(1.0 / 2.0)       // 0.5

    // Mixed type operations
    println(6 * 50)          // 300 (Int)
    println(6.0 * 50.0)      // 300.0 (Double)
    println(6.0 * 50)        // 300.0 (Double)

    // Calling methods on numbers
    println(2.times(3))      // 6
    println(3.5.plus(4))     // 7.5
    println(2.4.div(2))      // 1.2

    // Step 2: Practice using types
    println("\nTypes and Casting")

    // Kotlin does not allow implicit type conversions
    val i = 6
    val b1 = i.toByte()
    println(b1)                     // 6

    val b2: Byte = 1
    println(b2)                     // 1

    // Explicit casting
    val i4: Int = b2.toInt()
    println(i4)                     // 1
    val i5: String = b2.toString()
    println(i5)                     // 1
    val i6: Double = b2.toDouble()
    println(i6)                     // 1.0

    // Underscores in numeric constants for readability
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("$oneMillion, $socialSecurityNumber, $hexBytes, $bytes")

    // Step 3: Value of variable types (val vs var)
    println("\nval vs var")

    var fish = 1
    fish = 2                        // var is mutable
    println("fish = $fish")

    val aquarium = 1
    println("aquarium = $aquarium")

    val fishCount = 12
    val lakes = 2.5
    println("$fishCount fish in $lakes lakes")

    // Step 4: Strings and characters
    println("\nStrings and Characters")

    val numberOfFish = 5
    val numberOfPlants = 12

    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    // Booleans and Conditions
    println("\nBooleans and Conditions")

    val fishCount2 = 50
    val plantCount = 23

    if (fishCount2 > plantCount) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    // Ranges in if statements
    val fishInTank = 50
    if (fishInTank in 1..100) {
        println(fishInTank)
    }

    // Multiple cases with else if
    if (fishCount2 == 0) {
        println("Empty tank")
    } else if (fishCount2 < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    // when statement (like switch)
    when (fishCount2) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    // Nullability
    println("\nNullability")

    // Use ? to make a variable nullable
    var marbles: Int? = null
    println("marbles = $marbles")

    // Safe call operator (?.)
    var fishFoodTreats: Int? = 6
    fishFoodTreats = fishFoodTreats?.dec()
    println("fishFoodTreats = $fishFoodTreats")

    // Elvis operator (?:)
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println("fishFoodTreats = $fishFoodTreats")

    val s: String = "Hello"
    val len = s.length
    println("Length of string: $len")

    // Lists
    println("\nLists")

    // Immutable list
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    // Mutable list
    val myList = mutableListOf("tuna", "salmon", "shark")
    val removed = myList.remove("shark")
    println("Removed: $removed, myList: $myList")

    // Arrays
    println("\nArrays")

    // Array of strings
    val schoolArray = arrayOf("shark", "salmon", "minnow")
    println(schoolArray.contentToString())

    // Mixed-type array
    val mix = arrayOf<Any>("fish", 2)
    println(mix.contentToString())

    // Typed array (avoids boxing)
    val numbers = intArrayOf(1, 2, 3)
    println(numbers.contentToString())

    // Combining arrays with +
    val numbers2 = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val combined = numbers3 + numbers2
    println(combined[5])  // 3

    // Nested arrays and lists
    val nestedNumbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(nestedNumbers, oceans, "salmon")
    println(oddList)

    // Initialize array with code
    val generatedArray = Array(5) { it * 2 }
    println(generatedArray.contentToString())  // [0, 2, 4, 6, 8]

    // Loops
    println("\nLoops")

    // Basic for loop
    val schoolLoop = arrayOf("shark", "salmon", "minnow")
    for (element in schoolLoop) {
        print("$element ")
    }
    println()

    // Loop with index and element
    for ((index, element) in schoolLoop.withIndex()) {
        println("Item at $index is $element")
    }

    // Ranges with step and downTo
    for (i in 1..5) print(i)          // 12345
    println()
    for (i in 5 downTo 1) print(i)    // 54321
    println()
    for (i in 3..6 step 2) print(i)   // 35
    println()
    for (i in 'd'..'g') print(i)
    println()

    // while loop
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water")

    // do...while loop
    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water")

    // repeat loop
    repeat(2) {
        println("A fish is swimming")
    }


    // logical operators
    println("\nLogical operators")
    if (fishCount2 > 0 && plantCount > 0) {
        println("The tank has fish and plants.")
    }

    if (fishCount2 > 0 || plantCount > 0) {
        println("The tank has fish or plants.")
    }

    if (fishCount2 != 0) {
        println("The tank is not empty.")
    }

}