package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero
import io.ktor.util.toLowerCasePreservingASCIIRules

const val NEXT_PAGE_KEY = "nextPage"
const val PREV_PAGE_KEY = "prevPage"

class HeroRepoImpl : HeroRepository {

    override val page1: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Boruto Uzumaki (うずまきボルト)",
            image = "/images/boruto.png",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki Clan and a direct descendant of the Hyūga clan through his mother. Initially nonchalant in his duties as a member of Team 7 and resentful of his father and the office of Hokage because it left him with no time for his family; Boruto eventually comes to respect and reconcile with his father and his role as Hokage, yet vows to become like his mentor Sasuke Uchiha — a support system for the Hokage and the village.  He was later forced to defect from the village after his adoptive brother Kawaki frames him for killing his parents by altering everyone's memories of him. However, despite losing everything, he remains determined to prove his innocence and regain everything taken from him. \n",
            month = "Mar",
            day = "27th",
            rating = 3.5,
            power = 374000,
            abilities = listOf(
                "Big Ball Rasengan (Manga only)\n" +
                        "Boruto Stream\n" +
                        "Chakra Suppression Technique (Manga only)\n" +
                        "Compression Rasengan (Anime only)\n" +
                        "Flying Thunder God Technique (Manga only)\n" +
                        "Gentle Fist\n" +
                        "Harem Technique\n" +
                        "Iaidō (Manga only)\n" +
                        "Improvised Secret Technique: Lightning Ball Shuriken Technique (Anime only)\n" +
                        "Kāma\n" +
                        "Lightning Release Bullet: Powerful Breath (Anime only)\n" +
                        "Lightning Release: Purple Electricity (Manga only)\n" +
                        "Lightning Release: Thunderclap Arrow\n" +
                        "Lightning Release: Thunderclap Wave\n" +
                        "Multiple Shadow Clone Technique (Anime only)\n" +
                        "Multiple String Light Formation (Anime only)\n" +
                        "Parent and Child Rasengan\n" +
                        "Rasengan\n" +
                        "Rasengan: \"Unison\"\n" +
                        "Rasengan: \"Uzuhiko\" (Manga only)\n" +
                        "Scientific Ninja Tool: Orca and Powerful Breath\n" +
                        "Sexy Technique\n" +
                        "Shadow Clone Technique\n" +
                        "String Light Formation (Anime only)\n" +
                        "Student and Teacher: Rasengan\n" +
                        "Summoning Technique (Snake)\n" +
                        "Super Compression Rasengan (Anime only)\n" +
                        "Surging Fire Wild Dance (Anime only)\n" +
                        "Uchiha Style Kenjutsu (Manga only)\n" +
                        "Uchiha Style Shurikenjutsu: \"Lightning\": Triple\n" +
                        "Ultra-Big Ball Rasengan (Manga only)\n" +
                        "Vanishing Rasengan\n" +
                        "Water Release: Surging Sea\n" +
                        "Water Release: Water Formation Wall (Novel only)\n" +
                        "Wind Release: Breakthrough (Manga only)\n" +
                        "Wind Release: Gale Palm\n" +
                        "Wind Release: Rasengan (Anime only)\n" +
                        "Ōtsutsuki Teleportation"
            ),
            family = listOf(
                "Minato Namikaze (Grandfather)\n" +
                        "Kushina Uzumaki (Grandmother)\n" +
                        "Naruto Uzumaki (Father)\n" +
                        "Hyūga Elder (Great-Grandfather)\n" +
                        "Hiashi Hyūga (Grandfather)\n" +
                        "Hizashi Hyūga (Granduncle)\n" +
                        "Hinata and Hanabi's Mother (Grandmother) (Anime only)\n" +
                        "Hinata Hyūga (Mother)\n" +
                        "Hanabi Hyūga (Aunt)\n" +
                        "Himawari Uzumaki (Sister)\n" +
                        "Neji Hyūga (First cousin once removed)\n" +
                        "Kawaki (Adoptive Brother)\n" +
                        "Momoshiki Ōtsutsuki (Host)"
            ),
            natureTypes = listOf(
                "Lightning Release (Affinity)\n" + " Wind Release\n" + " Water Release"
            )
        ),
        Hero(
            id = 2,
            name = "Kawaki Uzumaki (うずまきカワキ)",
            image = "/images/kawaki.jpg",
            about = "Kawaki (カワキ) is a genin. He was originally raised by Kara, who experimented on him for years with plans of making him the vessel of Isshiki Ōtsutsuki. He is eventually rescued by Konohagakure and adopted into the family of Naruto Uzumaki. His love for Naruto and his hatred for the Ōtsutsuki Clan ultimately leads him to switch lives with his adoptive brother, Boruto, causing most of the world to think of him as Kawaki Uzumaki (うずまきカワキ, Uzumaki Kawaki).",
            month = "May",
            day = "13th",
            rating = 4.5,
            power = 365000,
            abilities = listOf(
                "Chakra Suppression Technique\n" + "Daihakoten\n" + "Daikokuten\n" + "Daikokuten: Collapse\n" + "Daikokuten: Divine Descent\n" + "Daikokuten: Falling Star\n" + "Fire Release: Soaring Flame Bullet Technique\n" + "Kāma\n" + "Kāma: Discharge\n" + "Kāma: Great Burial Wave\n" + "Rasengan: \"Unison\"\n" + "Reverse Scale\n" + "Revolving Blade Dance\n" + "Scale Fragment\n" + "Shadow Clone Technique\n" + "Shape Transformation: Strike\n" + "Sukunahikona\n" + "Sukunahikona: Instant Appearance\n" + "Sukunahikona: Rapid Succession\n" + "Sukunahikona: Scale Fragment\n" + "Thorn Explosion\n" + "Tracking Crimson Bullet\n" + "Violent Arm (Anime only)\n" + "Ōtsutsuki Teleportation"
            ),
            family = listOf(
                "Kokatsu (Father)\n" +
                        "Minato Namikaze (Adoptive Grandfather)\n" +
                        "Kushina Uzumaki (Adoptive Grandmother)\n" +
                        "Naruto Uzumaki (Adoptive Father)\n" +
                        "Hyūga Elder (Adoptive Great-Grandfather)\n" +
                        "Hiashi Hyūga (Adoptive Grandfather)\n" +
                        "Hizashi Hyūga (Adoptive Granduncle)\n" +
                        "Hinata and Hanabi's Mother (Adoptive Grandmother) (Anime only)\n" +
                        "Hinata Uzumaki (Adoptive Mother)\n" +
                        "Hanabi Hyūga (Adoptive Aunt)\n" +
                        "Boruto Uzumaki (Adoptive Brother)\n" +
                        "Himawari Uzumaki (Adoptive Sister)\n" +
                        "Neji Hyūga (Adoptive first cousin once removed)\n" +
                        "Isshiki Ōtsutsuki (Temporally Host)"
            ),
            natureTypes = listOf("Fire Release")
        ),
        Hero(
            id = 3,
            name = "Uchiha Sarada (うちはサラダ)",
            image = "/images/sarada.jpg",
            about = "Sarada Uchiha (うちはサラダ, Uchiha Sarada) is a kunoichi from Konohagakure's Uchiha Clan. Because she was raised only by her mother without having her father around, Sarada initially struggled to understand who she is or what she's supposed to be. After meeting her father with the help of Naruto Uzumaki, Sarada comes to believe that she is defined by the connections she has with others, and as a member of Team Konohamaru, she seeks to someday become Hokage so that she can connect with as many people as possible.",
            month = "Mar",
            day = "31st",
            rating = 4.8,
            power = 300500,
            abilities = listOf(
                "Chakra Enhanced Strength\n" +
                        "Chakra Transfer Technique (Anime only)\n" +
                        "Cherry Blossom Impact\n" +
                        "Chidori\n" +
                        "Chidori Current (Manga only)\n" +
                        "Fire Release: Great Fireball Technique\n" +
                        "Fire Release: Phoenix Sage Fire Technique\n" +
                        "Genjutsu: Sharingan\n" +
                        "Improvised Secret Technique: Lightning Ball Shuriken Technique (Anime only)\n" +
                        "Lightning Ball\n" +
                        "Lightning Burial: Banquet of Lightning (Anime only)\n" +
                        "Lightning Flash\n" +
                        "Lightning Strike Armour (Anime only)\n" +
                        "Lorentz Gun (Novel only)\n" +
                        "Multiple String Light Formation (Anime only)\n" +
                        "Mystical Palm Technique (Anime only)\n" +
                        "Shadow Clone Technique (Anime only)\n" +
                        "String Light Formation (Anime only)\n" +
                        "Super Compression Rasengan (Anime only)\n" +
                        "Wind Release: Gale Palm (Anime only)\n" +
                        "Ōhirume (Manga only)"
            ),
            family = listOf(
                "Fugaku Uchiha (Grandfather)\n" +
                        "Mikoto Uchiha (Grandmother)\n" +
                        "Sasuke Uchiha (Father)\n" +
                        "Itachi Uchiha (Uncle)\n" +
                        "Kizashi Haruno (Grandfather)\n" +
                        "Mebuki Haruno (Grandmother)\n" +
                        "Sakura Haruno (Mother)"
            ),
            natureTypes = listOf(
                " Lightning Release\n" +
                        " Fire Release\n" +
                        " Wind Release (Anime only)\n" +
                        " Yin Release"
            )
        ),
    )
    override val page2: List<Hero> = listOf(
        Hero(
            id = 4,
            name = "Sasuke",
            image = "/images/sasuke.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki.",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "Fugaku",
                "Mikoto",
                "Itachi",
                "Sarada",
                "Sakura"
            ),
            abilities = listOf(
                "Sharingan",
                "Rinnegan",
                "Sussano",
                "Amateratsu",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Lightning",
                "Fire",
                "Wind",
                "Earth",
                "Water"
            )
        ),
        Hero(
            id = 5,
            name = "Naruto",
            image = "/images/naruto.jpg",
            about = "Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) is a shinobi of Konohagakure's Uzumaki clan. He became the jinchūriki of the Nine-Tails on the day of his birth — a fate that caused him to be shunned by most of Konoha throughout his childhood. After joining Team Kakashi, Naruto worked hard to gain the village's acknowledgement all the while chasing his dream to become Hokage.",
            rating = 5.0,
            power = 98,
            month = "Oct",
            day = "10th",
            family = listOf(
                "Minato",
                "Kushina",
                "Boruto",
                "Himawari",
                "Hinata"
            ),
            abilities = listOf(
                "Rasengan",
                "Rasen-Shuriken",
                "Shadow Clone",
                "Senin Mode"
            ),
            natureTypes = listOf(
                "Wind",
                "Earth",
                "Lava",
                "Fire"
            )
        ),
        Hero(
            id = 6,
            name = "Sakura",
            image = "/images/sakura.jpg",
            about = "Sakura Uchiha (うちはサクラ, Uchiha Sakura, née Haruno (春野)) is a kunoichi of Konohagakure. When assigned to Team 7, Sakura quickly finds herself ill-prepared for the duties of a shinobi. However, after training under the Sannin Tsunade, she overcomes this, and becomes recognised as one of the greatest medical-nin in the world.",
            rating = 4.5,
            power = 92,
            month = "Mar",
            day = "28th",
            family = listOf(
                "Kizashi",
                "Mebuki",
                "Sarada",
                "Sasuke"
            ),
            abilities = listOf(
                "Chakra Control",
                "Medical Ninjutsu",
                "Strength",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Earth",
                "Water",
                "Fire"
            )
        )
    )
    override val page3: List<Hero> = listOf(
        Hero(
            id = 7,
            name = "Mitsuki",
            image = "/images/mitsuki.jpg",
            about = "Mitsuki (ミツキ, Mitsuki) is a synthetic human that was created as a partial clone of Orochimaru. Immigrating to Konohagakure to confirm whether or not Boruto Uzumaki was his \"sun\", he became a shinobi and was placed on Team Konohamaru. Mitsuki was created as a clone of Orochimaru, being cultivated from the same embryo as at least one older \"Mitsuki\", and raised in a test tube.",
            rating = 4.9,
            power = 95,
            month = "Jul",
            day = "25th",
            family = listOf(
                "Orochimaru",
                "Log"
            ),
            abilities = listOf(
                "Senin Mode",
                "Transformation",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Lightning",
                "Wind"
            )
        ),
        Hero(
            id = 8,
            name = "Orochimaru",
            image = "/images/orochimaru.jpg",
            about = "Orochimaru (大蛇丸, Orochimaru) is one of Konohagakure's legendary Sannin. With a life-ambition to learn all of the world's secrets, Orochimaru seeks immortality so that he might live all of the lives necessary to accomplish his task. After being caught red-handed performing unethical experiments on his fellow citizens for the sake of this immortality, Orochimaru defected from Konoha.",
            rating = 4.5,
            power = 97,
            month = "Oct",
            day = "27th",
            family = listOf(
                "Mitsuki",
                "Log"
            ),
            abilities = listOf(
                "Senin Mode",
                "Transformation",
                "Science"
            ),
            natureTypes = listOf(
                "Lightning",
                "Wind",
                "Fire",
                "Earth",
                "Water"
            )
        ),
        Hero(
            id = 9,
            name = "Kakashi",
            image = "/images/kakashi.png",
            about = "Kakashi Hatake (はたけカカシ, Hatake Kakashi) is a shinobi of Konohagakure's Hatake clan. Famed as Kakashi of the Sharingan (写輪眼のカカシ, Sharingan no Kakashi), he is one of Konoha's most talented ninja, regularly looked to for advice and leadership despite his personal dislike of responsibility. To his students on Team 7, Kakashi emphasises the importance of teamwork; he himself received this lesson, along with the Sharingan, from his childhood friend, Obito Uchiha.",
            rating = 4.5,
            power = 96,
            month = "Sep",
            day = "15th",
            family = listOf(
                "Sakumo"
            ),
            abilities = listOf(
                "Intelligence",
                "Strength"
            ),
            natureTypes = listOf(
                "Lightning",
                "Wind",
                "Fire",
                "Earth",
                "Water"
            )
        )
    )
    override val page4: List<Hero> = listOf(
        Hero(
            id = 10,
            name = "Isshiki",
            image = "/images/ishiki.jpg",
            about = "A thousand years ago, Isshiki came to Earth alongside Kaguya with the objective to plant a Tree to harvest its Chakra Fruit. While Kaguya, being lower-ranked, was planned to be sacrificed to create the Chakra Fruit, she instead turned on Isshiki, leaving him on the verge of death after destroying Isshiki's lower half. Encountering Jigen and not having the strength to implant a Kāma on him, Isshiki devised a desperate plan and shrunk himself to enter the monk's ear in order to survive his injury by absorbing Jigen's nutrients.",
            rating = 5.0,
            power = 100,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Sukunahikona",
                "Daikokuten",
                "Byakugan",
                "Space–Time",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Fire"
            )
        ),
        Hero(
            id = 11,
            name = "Momoshiki",
            image = "/images/momoshiki.jpg",
            about = "Momoshiki Ōtsutsuki (大筒木モモシキ, Ōtsutsuki Momoshiki) was a member of the Ōtsutsuki clan's main family, sent to investigate the whereabouts of Kaguya and her God Tree and then attempting to cultivate a new one out of the chakra of the Seventh Hokage. In the process of being killed by Boruto Uzumaki, Momoshiki placed a Kāma on him, allowing his spirit to remain intact through the mark.",
            rating = 3.9,
            power = 98,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Rinnegan",
                "Byakugan",
                "Strength"
            ),
            natureTypes = listOf(
                "Fire",
                "Lightning",
                "Wind",
                "Water",
                "Earth"
            )
        ),
        Hero(
            id = 12,
            name = "Urashiki",
            image = "/images/urashiki.jpg",
            about = "Urashiki Ōtsutsuki (大筒木ウラシキ, Ōtsutsuki Urashiki) was a low-ranking member of the Ōtsutsuki clan's main family, sent to assist Momoshiki and Kinshiki on their mission to investigate Kaguya's whereabouts and gather the chakra of the God Tree on Earth. Compared to his comrades, Urashiki had been shown to have a rather laid-back and jovial personality. He was quite willing to joke along with Momoshiki and Kinshiki, and disparaged on how serious they are.",
            rating = 3.4,
            power = 95,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Space–Time",
                "Rinnegan",
                "Byakugan"
            ),
            natureTypes = listOf(
                "Fire",
                "Lightning",
                "Wind",
                "Earth"
            )
        )
    )
    override val page5: List<Hero> = listOf(
        Hero(
            id = 13,
            name = "Code",
            image = "/images/code.jpg",
            about = "Code (コード, Kōdo) is the last active Inner from Kara. Carrying Isshiki Ōtsutsuki's legacy within him, he inherits the Ōtsutsuki Clan's will to become a Celestial Being and continually evolve. At the time Kawaki was brought to Kara, Code was one of fifteen candidates in Jigen and Amado's Ōtsutsuki ritual to screen for a Kāma vessel for Isshiki. Only Kawaki survived to become an actual vessel.",
            rating = 4.8,
            power = 99,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "White Karma",
                "Transformation",
                "Genjutsu"
            ),
            natureTypes = listOf(
                "Unknown"
            )
        ),
        Hero(
            id = 14,
            name = "Amado",
            image = "/images/amado.jpg",
            about = "Amado (アマド, Amado) is a former Inner from the organisation Kara and the head of its research and development division. He has since defected to Konohagakure, where he used a mix of bluffs and gifts to gain official citizenship for the Hokage's protection. Amado had a daughter who died twelve years prior to the reign of the Seventh Hokage. In his quest to kill Isshiki Ōtsutsuki, Amado joined Kara and was granted the rank of Inner, serving as the head of its research and development division.",
            rating = 5.0,
            power = 90,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Science",
                "Intelligence",
                "Trickery"
            ),
            natureTypes = listOf(
                "Unknown"
            )
        ),
        Hero(
            id = 15,
            name = "Koji",
            image = "/images/koji.jpg",
            about = "Koji Kashin (果心居士, Kashin Koji) is a clone of Jiraiya that was created by Amado for the purpose of killing Isshiki Ōtsutsuki. A former Inner of Kara, he was in charge of the sector on the outskirts of the Land of Fire. An enigmatic man, Koji has a very stoic and straightforward nature that follows a no-nonsense view. Arrogant as he may appear, he has consistently shown himself to be a very rational and perceptive man.",
            rating = 4.5,
            power = 90,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Jiraiya"
            ),
            abilities = listOf(
                "Senin Mode",
                "Rasengan",
                "Shadow Clone"
            ),
            natureTypes = listOf(
                "Fire",
                "Earth"
            )
        )
    )

    override val page6: List<Hero> = listOf(
        Hero(
            id = 16,
            name = "Monkey D. Luffy (モンキー・D・ルフィ)",
            image = "/images/luffy.png",
            about = "Monkey D. Luffy, also known as \"Straw Hat Luffy\" and commonly as \"Straw Hat\", is the main protagonist of the manga and anime, One Piece. He is the founder and captain of the increasingly infamous and powerful Straw Hat Pirates, as well as one of its top fighters. His lifelong dream is to become the Pirate King by finding the legendary treasure left behind by the late Gol D. Roger. After his heroic efforts to save the Arabasta Kingdom, Dressrosa and various other countries, he has been recognized as one of 'The Worst Generation' and now commands a fleet of over 5600 pirates.",
            month = "May",
            day = "5th",
            rating = 4.9,
            power = 400000,
            abilities = listOf(
                "Gomu Gomu no Mi (Gum-Gum Fruit)\n" +
                        "Gear Second\n" +
                        "Gear Third\n" +
                        "Gear Fourth: Boundman\n" +
                        "Gear Fourth: Tankman\n" +
                        "Gear Fourth: Snakeman\n" +
                        "Gear Fifth: Joy Boy\n" +
                        "Haoshoku Haki (Conqueror's Haki)\n" +
                        "Busoshoku Haki (Armament Haki)\n" +
                        "Kenbunshoku Haki (Observation Haki)\n" +
                        "Advanced Haoshoku Haki\n" +
                        "Advanced Busoshoku Haki\n" +
                        "Advanced Kenbunshoku Haki (Future Sight)"
            ),
            family = listOf(
                "Monkey D. Dragon (Father)\n" +
                        "Monkey D. Garp (Grandfather)\n" +
                        "Portgas D. Ace (Adoptive Brother)\n" +
                        "Sabo (Sworn Brother)"
            ),
            natureTypes = listOf(
                "Rubber\n" +
                        "Sun God Nika"
            )
        ),
        Hero(
            id = 17,
            name = "Roronoa Zoro (ロロノア・ゾロ)",
            image = "/images/zoro.jpg",
            about = "Roronoa Zoro, also known as \"Pirate Hunter\" Zoro, is the combatant of the Straw Hat Pirates, and one of their two swordsmen and the two oldest members of the crew. Formerly a bounty hunter, he is the second member of the crew and the first to join, doing so in the Romance Dawn Arc. As a master of Three Sword Style, a swordsmanship style which he created during his childhood training in Shimotsuki Village, Zoro is among the four most powerful combatants of the Straw Hats, alongside Luffy, Sanji and Jinbe.",
            month = "Nov",
            day = "11th",
            rating = 4.7,
            power = 370000,
            abilities = listOf(
                "Three Sword Style\n" +
                        "Two Sword Style\n" +
                        "One Sword Style\n" +
                        "Nine Sword Style: Asura\n" +
                        "Busoshoku Haki (Armament Haki)\n" +
                        "Kenbunshoku Haki (Observation Haki)\n" +
                        "Advanced Busoshoku Haki\n" +
                        "Flying Slash Attack\n" +
                        "Santoryu: Oni Giri\n" +
                        "Santoryu: Tora Gari\n" +
                        "Santoryu: Sanzen Sekai\n" +
                        "Santoryu: Ichidai Sanzen Daisen Sekai"
            ),
            family = listOf(
                "Unknown"
            ),
            natureTypes = listOf(
                "Swordsmanship"
            )
        ),
        Hero(
            id = 18,
            name = "Nami (ナミ)",
            image = "/images/nami.jpg",
            about = "\"Cat Burglar\" Nami is the navigator of the Straw Hat Pirates. She was the third member of the crew and the second to join, doing so during the Orange Town Arc. She was formerly a member of the Arlong Pirates and initially joined the Straw Hats so that she could rob them in order to buy back her village from Arlong. However, she legitimately joined the Straw Hats after they rebelled against and defeated Arlong. Her dream is to make a map of the entire world.",
            month = "Jul",
            day = "3rd",
            rating = 4.3,
            power = 65000,
            abilities = listOf(
                "Navigation\n" +
                        "Cartography\n" +
                        "Art of Weather\n" +
                        "Clima-Tact\n" +
                        "Weather Egg\n" +
                        "Thunder Breed Tempo\n" +
                        "Heat Egg\n" +
                        "Cool Egg\n" +
                        "Zeus (Living Cloud)\n" +
                        "Thunderbolt Tempo\n" +
                        "Mirage Tempo\n" +
                        "Weather Forecasting\n" +
                        "Pickpocketing"
            ),
            family = listOf(
                "Bell-mère (Adoptive Mother)\n" +
                        "Nojiko (Adoptive Sister)"
            ),
            natureTypes = listOf(
                "Weather Manipulation"
            )
        )
    )

    override val page7: List<Hero> = listOf(
        Hero(
            id = 19,
            name = "Vinsmoke Sanji (ヴィンスモーク・サンジ)",
            image = "/images/sanji.jpg",
            about = "\"Black Leg\" Sanji, born as Vinsmoke Sanji, is the cook of the Straw Hat Pirates. He is the fifth member of the crew and the fourth to join, doing so at the end of the Baratie Arc. Born as the third son and fourth child of the Vinsmoke Family, Sanji renounced his family twice, once in his youth and again after reuniting with them as an adult. He's one of the crew's top fighters, using his powerful legs and feet in battle with his self-created Black Leg Style.",
            rating = 4.6,
            power = 360000,
            month = "Mar",
            day = "2nd",
            family = listOf(
                "Vinsmoke Judge (Father)",
                "Vinsmoke Sora (Mother)",
                "Vinsmoke Reiju (Sister)",
                "Vinsmoke Ichiji (Brother)",
                "Vinsmoke Niji (Brother)",
                "Vinsmoke Yonji (Brother)"
            ),
            abilities = listOf(
                "Black Leg Style",
                "Diable Jambe",
                "Sky Walk",
                "Hell Memories",
                "Stealth Black",
                "Raid Suit",
                "Busoshoku Haki (Armament Haki)",
                "Kenbunshoku Haki (Observation Haki)",
                "Advanced Kenbunshoku Haki",
                "Cooking"
            ),
            natureTypes = listOf(
                "Fire",
                "Modified Human"
            )
        ),
        Hero(
            id = 20,
            name = "Nico Robin (ニコ・ロビン)",
            image = "/images/robin.jpg",
            about = "Nico Robin, also known by her epithet \"Devil Child\" and the \"Light of the Revolution\", is the archaeologist of the Straw Hat Pirates. She is the seventh member of the crew and the sixth to join, doing so at the end of the Arabasta Arc. She temporarily left the crew during the Water 7 Arc, but rejoined during the Enies Lobby Arc. Robin is the only survivor of the destroyed island of Ohara, and is currently the only person in the world known to have the ability to read and decipher Poneglyphs, a skill which is considered forbidden and threatening to the World Government.",
            rating = 4.5,
            power = 85000,
            month = "Feb",
            day = "6th",
            family = listOf(
                "Nico Olvia (Mother)",
                "Unknown Father"
            ),
            abilities = listOf(
                "Hana Hana no Mi (Flower-Flower Fruit)",
                "Assassination",
                "Archaeology",
                "History",
                "Intelligence",
                "Cien Fleur",
                "Gigantesco Mano",
                "Mil Fleur",
                "Ojos Fleur",
                "Clutch",
                "Wing",
                "Demonio Fleur"
            ),
            natureTypes = listOf(
                "Limb Replication"
            )
        ),
        Hero(
            id = 21,
            name = "Tony Tony Chopper (トニートニー・チョッパー)",
            image = "/images/chopper.jpg",
            about = "Tony Tony Chopper, also known as \"Cotton Candy Lover\" Chopper, is the doctor of the Straw Hat Pirates. He is the sixth member of the crew and the fifth to join, doing so at the end of the Drum Island Arc. He was temporarily forced to join the Foxy Pirates during the Long Ring Long Land Arc, but was quickly returned to Luffy's crew. Chopper is a reindeer that ate the Hito Hito no Mi, a Devil Fruit that allows him to transform into a human hybrid and a full human at will.",
            rating = 4.0,
            power = 50000,
            month = "Dec",
            day = "24th",
            family = listOf(
                "Dr. Hiriluk (Adoptive Father)",
                "Dr. Kureha (Mentor)"
            ),
            abilities = listOf(
                "Hito Hito no Mi (Human-Human Fruit)",
                "Medical Knowledge",
                "Rumble Ball",
                "Brain Point",
                "Heavy Point",
                "Walk Point",
                "Guard Point",
                "Horn Point",
                "Kung Fu Point",
                "Monster Point"
            ),
            natureTypes = listOf(
                "Animal Transformation"
            )
        )
    )

    override val page8: List<Hero> = listOf(
        Hero(
            id = 22,
            name = "Usopp (ウソップ)",
            image = "/images/usopp.jpg",
            about = "\"God\" Usopp is the sniper of the Straw Hat Pirates. He is the fourth member of the crew and the third to join, doing so at the end of the Syrup Village Arc. After working with the Straw Hats to defeat Kuro and the Black Cat Pirates, he was invited to join the crew. Despite his cowardice, Usopp dreams of becoming a brave warrior of the sea just like his father Yasopp and lives every day in pursuit of living up to this dream.",
            rating = 4.2,
            power = 60000,
            month = "Apr",
            day = "1st",
            family = listOf(
                "Yasopp (Father)",
                "Banchina (Mother)"
            ),
            abilities = listOf(
                "Sniping",
                "Pop Green",
                "Kenbunshoku Haki (Observation Haki)",
                "Usopp Hammer",
                "Usopp Rubber Band",
                "Kabuto",
                "Black Kabuto",
                "Midori Boshi",
                "Impact Dial",
                "Reject Dial",
                "Lying"
            ),
            natureTypes = listOf(
                "Plant Manipulation"
            )
        ),
        Hero(
            id = 23,
            name = "Franky (フランキー)",
            image = "/images/franky.jpg",
            about = "\"Iron Man\" Franky is the shipwright of the Straw Hat Pirates. He is the eighth member of the crew and the seventh to join, doing so at the end of the Post-Enies Lobby Arc. Born as Cutty Flam, he was originally a member of Tom's Workers, until the incident in which Tom was taken away. After this event, he became a ship dismantler as well as the leader of the Franky Family, a group of ship dismantlers, before building the Thousand Sunny and joining the Straw Hat Pirates.",
            rating = 4.3,
            power = 94000,
            month = "Mar",
            day = "9th",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Cyborg Body",
                "Shipwright Skills",
                "Radical Beam",
                "Strong Right",
                "Weapons Left",
                "Coup de Vent",
                "Coup de Burst",
                "General Franky",
                "Franky Shogun",
                "Nipple Light",
                "Hair Control"
            ),
            natureTypes = listOf(
                "Mechanized Body",
                "Cola Power"
            )
        ),
        Hero(
            id = 24,
            name = "Brook (ブルック)",
            image = "/images/brook.jpg",
            about = "\"Soul King\" Brook is the musician of the Straw Hat Pirates. He is the ninth member of the crew and the eighth to join, doing so at the end of the Thriller Bark Arc. He is a skeleton that the Straw Hats found on board a ghost ship after drifting into the Florian Triangle. He is a Devil Fruit user who ate the Yomi Yomi no Mi, which allowed him to return to life after death once, and he has the power to run across the surface of water, being one of many who share this trait.",
            rating = 4.4,
            power = 83000,
            month = "Apr",
            day = "3rd",
            family = listOf(
                "Rumbar Pirates (Former Crew)"
            ),
            abilities = listOf(
                "Yomi Yomi no Mi (Revive-Revive Fruit)",
                "Soul Solid",
                "Soul Parade",
                "Nemuriuta Flanc",
                "Hanauta Sancho: Yahazu Giri",
                "Party Music",
                "Quinte Tierce Fantasia",
                "Soul Pocus",
                "Song of Scratches",
                "Pastoral Song"
            ),
            natureTypes = listOf(
                "Soul Manipulation",
                "Ice Manipulation"
            )
        )
    )

    override val page9: List<Hero> = listOf(
        Hero(
            id = 25,
            name = "Jinbe (ジンベエ)",
            image = "/images/jinbe.jpg",
            about = "\"Knight of the Sea\" Jinbe is the helmsman of the Straw Hat Pirates. He is the tenth member of the crew and the ninth to join, doing so during the Wano Country Arc. He is a whale shark fish-man and a powerful master of Fish-Man Karate. His dream is to fulfill his captain Tiger's dying wish of coexistence and equality between humans and fish-men. He was a member of the Sun Pirates, and later, after the death of Tiger, he became their second captain.",
            rating = 4.7,
            power = 380000,
            month = "Apr",
            day = "2nd",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Fish-Man Karate",
                "Fish-Man Jujutsu",
                "Busoshoku Haki (Armament Haki)",
                "Kenbunshoku Haki (Observation Haki)",
                "Helmsman Skills",
                "Shark Brick Fist",
                "Shark Tile Fist",
                "Vagabond Drill",
                "Water Heart",
                "Buraikan"
            ),
            natureTypes = listOf(
                "Water Manipulation",
                "Fish-Man"
            )
        ),
        Hero(
            id = 26,
            name = "Trafalgar D. Water Law (トラファルガー・D・ワーテル・ロー)",
            image = "/images/law.jpg",
            about = "Trafalgar D. Water Law, more commonly known as just Trafalgar Law and by his epithet as the \"Surgeon of Death\", is the captain and doctor of the Heart Pirates, a pirate crew from North Blue. He is one of twelve pirates who are referred to as the \"Worst Generation\". He became one of the Seven Warlords of the Sea during the timeskip, but his position was revoked for allying with the Straw Hat Pirates and bringing down Donquixote Doflamingo.",
            rating = 4.6,
            power = 320000,
            month = "Oct",
            day = "6th",
            family = listOf(
                "Trafalgar Water D. Family",
                "Donquixote Rosinante (Adoptive Father)"
            ),
            abilities = listOf(
                "Ope Ope no Mi (Op-Op Fruit)",
                "ROOM",
                "Shambles",
                "Mes",
                "Countershock",
                "Gamma Knife",
                "Radio Knife",
                "Injection Shot",
                "Takt",
                "Busoshoku Haki (Armament Haki)",
                "Kenbunshoku Haki (Observation Haki)",
                "Medical Knowledge",
                "Swordsmanship"
            ),
            natureTypes = listOf(
                "Spatial Manipulation"
            )
        ),
        Hero(
            id = 27,
            name = "Portgas D. Ace (ポートガス・D・エース)",
            image = "/images/ace.jpg",
            about = "Portgas D. Ace, born as Gol D. Ace and nicknamed \"Fire Fist\" Ace, was the sworn older brother of Luffy and Sabo, and the son of the late Pirate King, Gol D. Roger, and Portgas D. Rouge. He was adopted by Monkey D. Garp as wished by Roger to him before his birth. Ace was the 2nd division commander of the Whitebeard Pirates and one-time captain of the Spade Pirates. He was killed by Admiral Akainu while protecting his younger brother, Luffy, during the Battle of Marineford.",
            rating = 4.8,
            power = 350000,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Gol D. Roger (Father)",
                "Portgas D. Rouge (Mother)",
                "Monkey D. Luffy (Adoptive Brother)",
                "Sabo (Sworn Brother)"
            ),
            abilities = listOf(
                "Mera Mera no Mi (Flame-Flame Fruit)",
                "Haoshoku Haki (Conqueror's Haki)",
                "Busoshoku Haki (Armament Haki)",
                "Fire Fist",
                "Hiken",
                "Dai Enkai: Entei",
                "Hotarubi",
                "Hidaruma",
                "Jujika",
                "Shinka: Shiranui"
            ),
            natureTypes = listOf(
                "Fire Manipulation"
            )
        )
    )

    override val page10: List<Hero> = listOf(
        Hero(
            id = 28,
            name = "Shanks (シャンクス)",
            image = "/images/shanks.jpg",
            about = "\"Red-Haired\" Shanks is one of the Four Emperors that rule over the New World. He was also the captain of the Red Hair Pirates and a former member of the legendary Roger Pirates, the only group to successfully conquer the Grand Line. He is the man who inspired Luffy to go on his journey as a pirate, and is considered by Luffy to be his childhood hero. He is one of the most powerful characters in the series with the highest known bounty of 4,048,900,000 berries.",
            rating = 5.0,
            power = 420000,
            month = "Mar",
            day = "9th",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Haoshoku Haki (Conqueror's Haki)",
                "Busoshoku Haki (Armament Haki)",
                "Kenbunshoku Haki (Observation Haki)",
                "Advanced Haoshoku Haki",
                "Advanced Busoshoku Haki",
                "Swordsmanship",
                "Future Sight",
                "Divine Departure"
            ),
            natureTypes = listOf(
                "Swordsmanship"
            )
        ),
        Hero(
            id = 29,
            name = "Marshall D. Teach (マーシャル・D・ティーチ)",
            image = "/images/blackbeard.jpg",
            about = "Marshall D. Teach, most commonly referred to by his epithet \"Blackbeard\", is the captain of the Blackbeard Pirates and one of the Four Emperors. He was formerly a member of the Whitebeard Pirates' 2nd division before killing Thatch and defecting from the crew. He briefly became one of the Seven Warlords of the Sea after handing Ace over to the Marines, before resigning after breaking into Impel Down. He is the only known person to wield the powers of two Devil Fruits.",
            rating = 4.9,
            power = 410000,
            month = "Aug",
            day = "3rd",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Yami Yami no Mi (Dark-Dark Fruit)",
                "Gura Gura no Mi (Tremor-Tremor Fruit)",
                "Black Hole",
                "Liberation",
                "Kurouzu",
                "Kaishin",
                "Seikai",
                "Shima Yurashi",
                "Dark Matter",
                "Absorption",
                "Nullification"
            ),
            natureTypes = listOf(
                "Darkness Manipulation",
                "Earthquake Generation"
            )
        ),
        Hero(
            id = 30,
            name = "Monkey D. Garp (モンキー・D・ガープ)",
            image = "/images/garp.jpg",
            about = "Monkey D. Garp, often referred to as \"Garp the Fist\" and by his epithet of \"Hero of the Marines\", is an extremely powerful Marine vice admiral and the father of Monkey D. Dragon, the paternal grandfather of Monkey D. Luffy, and the adoptive grandfather of Portgas D. Ace. He was responsible for cornering and fighting the Pirate King, Gol D. Roger, numerous times in his career. Garp is one of the major figures, along with Kong, Sengoku, Shiki, and Whitebeard, from the times when Roger was still alive.",
            rating = 4.7,
            power = 390000,
            month = "May",
            day = "2nd",
            family = listOf(
                "Monkey D. Dragon (Son)",
                "Monkey D. Luffy (Grandson)",
                "Portgas D. Ace (Adoptive Grandson)"
            ),
            abilities = listOf(
                "Fist of Love",
                "Busoshoku Haki (Armament Haki)",
                "Haoshoku Haki (Conqueror's Haki)",
                "Iron Fist",
                "Meteor Fist",
                "Advanced Busoshoku Haki",
                "Rokushiki",
                "Superhuman Strength",
                "Garp Punch"
            ),
            natureTypes = listOf(
                "Physical Strength"
            )
        )
    )

    override val heroes: Map<Int, List<Hero>> = mapOf(
        1 to page1,
        2 to page2,
        3 to page3,
        4 to page4,
        5 to page5,
        6 to page6,
        7 to page7,
        8 to page8,
        9 to page9,
        10 to page10,
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "Ok",
            prevPage = calculatePage(page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = null
        var nextPage: Int? = null

        if (page in 1..heroes.size-1) {
            nextPage = page.plus(1)
        }
        if (page in 2..heroes.size) {
            prevPage = page.minus(1)
        }
        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "Ok",
            heroes = searchHero(query = name)
        )
    }

    private fun searchHero(query: String?): List<Hero> {
        val allHeroes: List<Hero> = page1 + page2 + page3 + page4 + page5
        if (query.isNullOrEmpty()) {
            return emptyList()
        }
        val foundHeroes = allHeroes.filter { hero ->
            hero.name.toLowerCasePreservingASCIIRules()
                .contains(query.toLowerCasePreservingASCIIRules())
        }
        return foundHeroes
    }
}