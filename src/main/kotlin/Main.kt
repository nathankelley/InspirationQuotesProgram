import kotlin.system.exitProcess

/* Quotes from Book of Mormon: taken from http://lifey.org/inspirational-book-of-mormon-scriptures/
*  Quotes from Quran: taken from https://themuslimvibe.com/faith-islam/10-inspirational-verses-from-the-holy-quran-to-give-you-hope
*  Quotes from the Bible: taken from https://www.biblestudytools.com/topical-verses/popular-king-james-bible-verses/
* */

fun main(args: Array<String>) {
    println("Are you in need of some inspiration? Revelation perhaps?\n " +
            "This is a program designed to build you up when you're down.\n" +
            "As put in the Book of Mormon by a Nephite prophet:\n" +
            "\"And now, as the preaching of the word had a great tendency to\n " +
            "lead the people to do that which was just—yea, it had had more powerful\n" +
            "effect upon the minds of the people than the sword, or anything else, which had happened unto them...\"\n")
    println("We've provided for you a few religious texts to choose inspirational quotes from.")

    val result = getUserChoice()

    // handle errors if any
    if (result == -1) {
        println("Sorry, this program has an issue. It will exit now. Please try again later.")
        exitProcess(-1)
    }
}


    // method to prompt user to get random inspiration quote from religious texts, dependent on their decision
fun getUserChoice(): Int {
    // prompt user for a religious text
    println("Please choose a text:\n" +
            "For The Book of Mormon, enter 1.\n" +
            "For The Quran, enter 2.\n" +
            "For The Bible, enter 3.\n")
    print(": ")
    val userChoice = Integer.valueOf(readLine())

    // call holdArrays function to print random quote
        when (holdArrays(userChoice)) {
            0 -> {
                println("Do you want to try again?")
                print("y/n: ")
                val again = readLine()
                if (again == "y") {
                    getUserChoice() // prompt again if they want
                } else {
                    println("Thanks for visiting!")
                    exitProcess(0)
                }
            }
            -1 -> return -1  // handle errors
            else -> return -1
        }
    return -1  // shouldn't do this, but if it does it's definitely an error
}


    // function to hold arrays, prints selected array based on array name and index
fun holdArrays(arr: Int): Int {
    // This is a list of quotes from the BoM. Feel free to add to it if you have one you like.
    // A quote will be randomly selected and printed by the user.
    var listOfBoMQuotes = mutableListOf(
        "1 Nephi 20:10 -\n \"For, behold, I have refined thee, I have chosen thee in the furnace of affliction.\"",
        "1 Nephi 21:13 -\n \"Sing, O heavens; and be joyful, O earth; for the feet of those who are in the east shall be\n " +
                "established; and break forth into singing, O mountains; for they shall be smitten no more;\n for the " +
                "Lord hath comforted his people, and will have mercy upon his afflicted.\"",
        "1 Nephi 3:7 -\n \"And it came to pass that I, Nephi, said unto my father: I will go and do the things which " +
                "the Lord hath commanded,\n for I know that the Lord giveth no commandments unto the children of men, " +
                "save he shall prepare a way for them that\n they may accomplish the thing which he commandeth them.\"",
        "1 Nephi 9:6 -\n \"But the Lord knoweth all things from the beginning; wherefore, he prepareth a way to " +
                "accomplish\n all his works among the children of men; for behold, he hath all power unto the fulfilling " +
                "of all\n his words. And thus it is. Amen.\"",
        "2 Nephi 26:28 -\n \"Behold, hath the Lord commanded any that they should not partake of his goodness?\n " +
                "Behold I say unto you, Nay; but all men are privileged the one like unto the other,\n " +
                "and none are forbidden.\"",
        "2 Nephi 2:2 -\n \"And now, Jacob, I speak unto you: Thou art my first-born in the days of my tribulation " +
                "in the wilderness.\n And behold, in thy childhood thou hast suffered afflictions and much sorrow, " +
                "because of the rudeness of thy brethren.\""
    )

    // This is a list of quotes from the Quran. Feel free to add to it if you have one you like.
    // A quote will be randomly selected and printed by the user.
    var listOfQuranQuotes = mutableListOf(
        "Quran 8:33 -\n \"And Allah would not punish them while they seek forgiveness\"",
        "Quran 64:3 -\n \"He created the heavens and earth in truth and formed you and perfected your forms;\n " +
                "and to Him is the [final] destination\"",
        "Quran 65:3 -\n \"And whoever relies upon Allah – then He is sufficient for him.\n Indeed, Allah will " +
                "accomplish His purpose. Allah\n has already set for everything a [decreed] extent\"",
        "Quran 7:156 -\n \"My mercy encompasses all things\"",
        "Quran 3:60 -\n \"The truth is from your Lord, so do not be among the doubters\"",
        "Quran 2:286 -\n \"Allah does not burden a soul beyond that it can bear\""
    )

    // This is a list of quotes from the Bible. Feel free to add to it if you have one you like.
    // A quote will be randomly selected and printed by the user.
    var listOfBibleQuotes = mutableListOf(
        "1 Corinthians 10:13 -\n \"There hath no temptation taken you but such as is common to man: " +
                "but God is faithful,\n who will not suffer you to be tempted above that ye are able; " +
                "but will with the temptation also make a way to escape,\n that ye may be able to bear it.\"",
        "1 Corinthians 10:31 -\n \"Whether therefore ye eat, or drink, or whatsoever ye do, do all to the " +
                "glory of God.\"",
        "1 John 1:9 -\n \"If we confess our sins, he is faithful and just to forgive us our sins, " +
                "and to\n cleanse us from all unrighteousness.\"",
        "1 John 3:22 -\n \"And whatsoever we ask, we receive of him, because we keep his commandments, " +
                "and do those things\n that are pleasing in his sight.\"",
        "1 Peter 5:8 -\n \"Be sober, be vigilant; because your adversary the devil, as a roaring lion, " +
                "walketh about,\n seeking whom he may devour:\"",
        "Ephesians 5:2 -\n \"And walk in love, as Christ also hath loved us, and hath given himself for us an " +
                "offering and a sacrifice\n to God for a sweetsmelling savour.\""
    )

        // list of random quotes from these lists
        var randomQuotes = listOf(
            "1 Nephi 20:10 -\n \"For, behold, I have refined thee, I have chosen thee in the furnace of affliction.\"",
            "Quran 8:33 -\n \"And Allah would not punish them while they seek forgiveness\"",
            "1 Corinthians 10:31 -\n \"Whether therefore ye eat, or drink, or whatsoever ye do, do all to the " +
                    "glory of God.\""
        )

    when (arr) {
        1 -> {
            println(listOfBoMQuotes.random())
            return 0
        }
        2 -> {
            println(listOfQuranQuotes.random())
            return 0
        }
        3 -> {
            println(listOfBibleQuotes.random())
            return 0
        }
        else -> {
            println("Invalid selection. Here are a few quotes you might find:")
            for(x in listOfBoMQuotes) {
                println(x + "\n")
            }
            return 0
        }
    }
    return -1 // shouldn't do this, but if it does it's definitely an error
}