package com.freely.listenfreely.utils

import android.content.Context
import android.transition.TransitionManager
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.freely.listenfreely.pojos.Albums
import com.freely.listenfreely.pojos.TopAlbumsSongs

object Utils {

    const val MUSIC_ID = "MUSIC"
    const val PODCASTS_ID = "PODCAST"

    val tracksList = arrayListOf<String>(
        "https://c.saavncdn.com/018/Summer-High-English-2022-20220802184652-500x500.jpg",                               // Summer high
        "https://c.saavncdn.com/663/Pasoori-Punjabi-2022-20220203181058-500x500.jpg",                                   // Pasoori
        "https://c.saavncdn.com/000/Until-I-Found-You-English-2021-20210901105938-500x500.jpg",                         // Until I found you
        "https://c.saavncdn.com/286/WMG_190295851286-English-2017-500x500.jpg",                                         // Perfect
        "https://c.saavncdn.com/851/FOUR-Deluxe--English-2014-500x500.jpg",                                             // Night Changes
        "https://c.saavncdn.com/728/My-World-2-0-English-2010-20200606003742-500x500.jpg",                              // Baby
        "https://c.saavncdn.com/521/Views-English-2016-20200713061113-500x500.jpg",                                     // One Dance
        "https://c.saavncdn.com/316/Bad-Habits-English-2021-20211022044755-500x500.jpg",                                // Bad Habits
        "https://c.saavncdn.com/720/As-It-Was-English-2022-20220401035858-500x500.jpg",                                 // As it was
        "https://c.saavncdn.com/947/Stereo-Hearts-feat-Adam-Levine--English-2011-20190607045815-500x500.jpg",           // Stereo Hearts
        "https://c.saavncdn.com/935/Eastside-English-2018-20180711110552-500x500.jpg"                                   // Eastside
    )

    val artistsList = arrayListOf<String>(
        "https://c.saavncdn.com/070/Two-Hearts-Never-Break-The-Same-Punjabi-2022-20230205155200-150x150.jpg",           // AP Dhillon
        "https://c.saavncdn.com/artists/Ali_Sethi_001_20210810070736_150x150.jpg",                                      // Ali Sethi
        "https://c.saavncdn.com/000/Until-I-Found-You-English-2021-20210901105938-500x500.jpg",                         // Stephen Sanchez
        "https://c.saavncdn.com/artists/Ed_Sheeran_150x150.jpg",                                                        // Ed Sheeran
        "https://c.saavncdn.com/artists/One_Direction_150x150.jpg",                                                     // One Direction
        "https://c.saavncdn.com/artists/Justin_Bieber_005_20201127112218_150x150.jpg",                                  // Justin Bieber
        "https://c.saavncdn.com/artists/Drake_005_20220704120432_150x150.jpg",                                          // Drake
        "https://c.saavncdn.com/artists/Ed_Sheeran_150x150.jpg",                                                        // Ed Sheeran
        "https://c.saavncdn.com/artists/Harry_Styles_150x150.jpg",                                                      // Harry Styles
        "https://c.saavncdn.com/artists/Gym_Class_Heroes_001_20200226103704_150x150.jpg",                               // Gym Class Heros
        "https://c.saavncdn.com/artists/Halsey_150x150.jpg"                                                             // Hasley
    )

    val albumsList = arrayListOf<Albums>(
        Albums(
            "https://c.saavncdn.com/editorial/English-IndiaSuperhitsTop50_20230414091553.jpg?bch=1682078171",
            "English: India Superhits Top 50",
            arrayListOf(
                TopAlbumsSongs(
                    "Night Changes",
                    "https://c.saavncdn.com/851/FOUR-Deluxe--English-2014-500x500.jpg",
                    "Four (Deluxe)",
                    "One Direction",
                    "3:46"
                ),
                TopAlbumsSongs(
                    "Calm Down",
                    "https://c.saavncdn.com/596/Calm-Down-English-2022-20220826054039-150x150.jpg",
                    "Calm Down",
                    "Rema, Selena Gomez",
                    "3:59"
                ),
                TopAlbumsSongs(
                    "Harleys In Hawaii",
                    "https://c.saavncdn.com/289/Harleys-In-Hawaii-English-2019-20191015230756-150x150.jpg",
                    "Harleys In Hawaii",
                    "Katy Perry",
                    "3:06"
                ),
                TopAlbumsSongs(
                    "Go Down Deh",
                    "https://c.saavncdn.com/467/Go-Down-Deh-feat-Shaggy-and-Sean-Paul--English-2021-20210729225438-150x150.jpg",
                    "Go Down Deh",
                    "Spice",
                    "2:34"
                ),
                TopAlbumsSongs(
                    "Heat Waves",
                    "https://c.saavncdn.com/173/Dreamland-English-2020-20200806000748-150x150.jpg",
                    "Dreamland",
                    "Glass Animals",
                    "3:59"
                ),
                TopAlbumsSongs(
                    "Bones",
                    "https://c.saavncdn.com/038/Bones-English-2022-20220311113603-150x150.jpg",
                    "Bones",
                    "Imagine Dragons",
                    "2:45"
                ),
                TopAlbumsSongs(
                    "Let Me Down Slowly",
                    "https://c.saavncdn.com/681/Let-Me-Down-Slowly-English-2018-20190607042218-150x150.jpg",
                    "Let Me Down Slowly",
                    "Alec Benjamin",
                    "2:49"
                ),
                TopAlbumsSongs(
                    "Unstoppable",
                    "https://c.saavncdn.com/552/Unstoppable-English-2016-150x150.jpg",
                    "Unstoppable",
                    "Sia",
                    "3:38"
                ),
                TopAlbumsSongs(
                    "Believer",
                    "https://c.saavncdn.com/248/Evolve-English-2017-20180716230950-150x150.jpg",
                    "Evolve",
                    "Image Dragons",
                    "3:22"
                ),
                TopAlbumsSongs(
                    "Hymn for the Weekend",
                    "https://c.saavncdn.com/141/A-Head-Full-of-Dreams-English-2015-20201104170723-150x150.jpg",
                    "A Head Full of Dreams",
                    "Coldplay",
                    "4:18"
                ),
                TopAlbumsSongs(
                    "Industry Baby",
                    "https://c.saavncdn.com/440/MONTERO-English-2021-20210914233101-150x150.jpg",
                    "MONTERO",
                    "Lil Nas X, Jack Harlow",
                    "3:34"
                ),
                TopAlbumsSongs(
                    "Love nwantiti",
                    "https://c.saavncdn.com/783/love-nwantiti-feat-ElGrande-Toto-North-African-Remix--English-2020-20200820200202-150x150.jpg",
                    "Love Nwantiti (feat. ElGrande Toto) (North African Remix)",
                    "Lil Nas X, Jack Harlow",
                    "2:15"
                ),
                TopAlbumsSongs(
                    "Cheap Thrills",
                    "https://c.saavncdn.com/722/Cheap-Thrills-English-2015-150x150.jpg",
                    "Cheap Thrills",
                    "Sia",
                    "3:30"
                ),
                TopAlbumsSongs(
                    "Shape of You",
                    "https://c.saavncdn.com/126/Shape-of-You-English-2017-150x150.jpg",
                    "Shape of You",
                    "Ed Sheeran",
                    "3:53"
                ),
                TopAlbumsSongs(
                    "Perfect",
                    "https://c.saavncdn.com/286/WMG_190295851286-English-2017-150x150.jpg",
                    "Perfect",
                    "Ed Sheeran",
                    "4:23"
                ),
                TopAlbumsSongs(
                    "Love Me Like You Do (From \"Fifty Shades of Grey\")",
                    "https://c.saavncdn.com/566/Love-Me-Like-You-Do-From-Fifty-Shades-Of-Grey-English-2015-150x150.jpg",
                    "Love Me Like You Do (From \"Fifty Shades of Grey\")",
                    "Ellie Goulding",
                    "4:13"
                ),
                TopAlbumsSongs(
                    "People",
                    "https://c.saavncdn.com/607/People-English-2022-20221207081653-150x150.jpg",
                    "People",
                    "Libianca",
                    "3:04"
                ),
                TopAlbumsSongs(
                    "Aathma Raama",
                    "https://c.saavncdn.com/390/Aathma-Raama-English-2021-20211201150306-150x150.jpg",
                    "Aathma Raama",
                    "Brodha V",
                    "3:55"
                ),
                TopAlbumsSongs(
                    "Starboy",
                    "https://c.saavncdn.com/358/Starboy-English-2016-20200328185934-150x150.jpg",
                    "Starboy",
                    "The Weekend",
                    "3:50"
                ),
                TopAlbumsSongs(
                    "Faded",
                    "https://c.saavncdn.com/981/Faded-English-2015-150x150.jpg",
                    "Faded",
                    "Alan Walker",
                    "3:32"
                )
            )
        ),
        Albums(
            "https://c.saavncdn.com/editorial/Hindi-IndiaSuperhitsTop50_20230421105509.jpg",
            "Hindi: India Superhits Top 50",
            arrayListOf(
                TopAlbumsSongs(
                    "Naiyo Lagda",
                    "https://c.saavncdn.com/348/Kisi-Ka-Bhai-Kisi-Ki-Jaan-Hindi-2023-20230427184704-150x150.jpg",
                    "Kisi Ka Bhai Kisi Ki Jaan",
                    "Himesh Reshammiya",
                    "5:20"
                ),
                TopAlbumsSongs(
                    "Apna Bana Le",
                    "https://c.saavncdn.com/815/Bhediya-Hindi-2022-20221206124543-150x150.jpg",
                    "Bhediya",
                    "Arijit Singh, Sachin-Jigar",
                    "4:21"
                ),
                TopAlbumsSongs(
                    "O Bedardeya (From \"Tu Jhooti Mai Makkar\")",
                    "https://c.saavncdn.com/576/O-Bedardeya-From-Tu-Jhoothi-Main-Makkaar-Hindi-2023-20230303194422-150x150.jpg",
                    "O Bedardeya (From \"Tu Jhooti Mai Makkar\")",
                    "Pritam, Arijit Singh, Amitabh Bhattacharya",
                    "5:13"
                ),
                TopAlbumsSongs(
                    "Maan Meri Jaan",
                    "https://c.saavncdn.com/734/Champagne-Talk-Hindi-2022-20221008011951-150x150.jpg",
                    "Champagne Talk",
                    "King",
                    "3:14"
                ),
                TopAlbumsSongs(
                    "Jhoome Jo Pathaan",
                    "https://c.saavncdn.com/807/Pathaan-Hindi-2022-20221222104158-150x150.jpg",
                    "Pathaan",
                    "Vishal & Shekar, Arijit Singh, Sukriti Kakar",
                    "3:14"
                ),
                TopAlbumsSongs(
                    "Ram Siya Ram",
                    "https://c.saavncdn.com/215/Ram-Siya-Ram-Hindi-2021-20210222031001-150x150.jpg",
                    "Ram Siya Ram",
                    "Sachet Tandon",
                    "4:25"
                ),
                TopAlbumsSongs(
                    "Raataan Lambiyan",
                    "https://c.saavncdn.com/238/Shershaah-Original-Motion-Picture-Soundtrack--Hindi-2021-20210815181610-150x150.jpg",
                    "Shershaah",
                    "Tanishk Bagchi, Jubin Nautiyal, Asses Kaur",
                    "3:50"
                ),
                TopAlbumsSongs(
                    "Kesariya (From \" Brahmastra\")",
                    "https://c.saavncdn.com/191/Kesariya-From-Brahmastra-Hindi-2022-20220717092820-150x150.jpg",
                    "Brahmastra",
                    "Pritam, Arijit Singh, Amitabh Bhattacharya",
                    "4:28"
                ),
                TopAlbumsSongs(
                    "Pal Pal Dil Ke Pass - Title Track",
                    "https://c.saavncdn.com/328/Pal-Pal-Dil-Ke-Paas-Hindi-2019-20200420150444-150x150.jpg",
                    "Pal Pal Dil Ke Pass",
                    "Arijit Singh, Parampara Tandon",
                    "4:14"
                ),
                TopAlbumsSongs(
                    "Channa Ve",
                    "https://c.saavncdn.com/006/Bhoot-Part-One-The-Haunted-Ship-Hindi-2020-20200212161346-150x150.jpg",
                    "Bhoot-Part One: The Haunted Ship",
                    "Akhil Sachdeva, Mansheel Gujral",
                    "3:31"
                )
            )
        ),
        Albums(
            "https://c.saavncdn.com/367/Kedarnath-Hindi-2019-20190219-500x500.jpg",
            "Kedarnath",
            arrayListOf(
                TopAlbumsSongs(
                    "Namo Namo",
                    null,
                    null,
                    "Amit Trivedi",
                    "5:22"
                ),
                TopAlbumsSongs(
                    "Sweetheart",
                    null,
                    null,
                    "Dev Negi",
                    "3:32"
                ),
                TopAlbumsSongs(
                    "Qaafirana",
                    null,
                    null,
                    "Arijit Singh, Nikhita Gandhi",
                    "5:41"
                ),
                TopAlbumsSongs(
                    "Jaan 'Nisaar (Asees)",
                    null,
                    null,
                    "Asees Kaur",
                    "4:02"
                )
            )
        ),
        Albums(
            "https://c.saavncdn.com/725/Anime-English-2020-20201023084108-500x500.jpg",
            "Anime",
            arrayListOf(
                TopAlbumsSongs(
                    "Gurenge",
                    "https://c.saavncdn.com/178/Gurenge-From-Demon-Slayer-Kimetsu-No-Yaiba--English-2020-20201212091359-500x500.jpg",
                    "Demon Slayer Kimetsu No Yaiba",
                    "Geek Music",
                    "3:53"
                ),
                TopAlbumsSongs(
                    "Blue Bird",
                    "https://c.saavncdn.com/727/Blue-Bird-From-Naruto-Shippuden--English-2021-20211119224009-500x500.jpg",
                    "Naruto Shippuden",
                    "Geek Music",
                    "1:55"
                ),
                TopAlbumsSongs(
                    "Unravel",
                    "https://c.saavncdn.com/317/Unravel-Tokyo-Ghoul-English-2016-500x500.jpg",
                    "Tokyo Ghoul",
                    "The Unknown Songbird",
                    "3:58"
                ),
                TopAlbumsSongs(
                    "Sparkle",
                    "https://c.saavncdn.com/410/Your-Name-Deluxe-Edition-Original-Motion-Picture-Soundtrack-English-2017-20200409193218-500x500.jpg",
                    "Your Name",
                    "Radwimps",
                    "6:52"
                ),
                TopAlbumsSongs(
                    "Orange 7",
                    "https://c.saavncdn.com/572/orange-but-it-s-lofi-your-lie-in-april-English-2023-20230414233041-500x500.jpg",
                    "Your Lie In April",
                    "AmaLee",
                    "6:19"
                ),
                TopAlbumsSongs(
                    "Silhouette",
                    "https://c.saavncdn.com/408/KANA-BOON-THE-BEST-Japanese-2020-20210727093111-500x500.jpg",
                    "Silhouette",
                    "KANA-BOON",
                    "4:26"
                ),
                TopAlbumsSongs(
                    "Suzume",
                    "https://c.saavncdn.com/070/suzume-Suzume-no-Tojimari-but-it-s-modified-become-lofi-hip-hop-English-2022-20221020015334-500x500.jpg",
                    "Suzume no Tojimari",
                    "Radwimps",
                    "3:55"
                )
            )
        ),
        Albums(
            "https://c.saavncdn.com/editorial/Heartbeats_20230428081513.jpg?bch=1682671651",
            "Heartbeats",
            arrayListOf(
                TopAlbumsSongs(
                    "Heaven",
                    "https://c.saavncdn.com/596/Heaven-English-2023-20230216073259-150x150.jpg",
                    "Heaven",
                    "Nilan Horan",
                    "3:06"
                ),
                TopAlbumsSongs(
                    "Wish You The Best",
                    "https://c.saavncdn.com/182/Wish-You-The-Best-English-2023-20230414063853-150x150.jpg",
                    "Wish You The Best",
                    "Lewis Capaldi",
                    "3:30"
                ),
                TopAlbumsSongs(
                    "Maan Meri Jaan Afterlife",
                    "https://c.saavncdn.com/184/Maan-Meri-Jaan-Afterlife-English-2023-20230310134919-150x150.jpg",
                    "Maan Meri Jaan (\"Afterlife\")",
                    "King, Nick Jonas",
                    "3:06"
                ),
                TopAlbumsSongs(
                    "Sun Maahi (\"English Version\")",
                    "https://c.saavncdn.com/292/Sun-Maahi-The-EP-English-2023-20230131120731-150x150.jpg",
                    "Sun Maahi - The EP",
                    "Armaan Malik, Amaal Malik",
                    "2:51"
                ),
                TopAlbumsSongs(
                    "All Of The Girls You Loved Before",
                    "https://c.saavncdn.com/984/All-Of-The-Girls-You-Loved-Before-English-2023-20230317103812-150x150.jpg",
                    "All Of The Girls You Loved Before",
                    "Taylor Swift",
                    "3:41"
                ),
                TopAlbumsSongs(
                    "That's Not How This Works (\"feat. Dat + Shay\")",
                    "https://c.saavncdn.com/292/That-s-Not-How-This-Works-feat-Dan-Shay-English-2023-20230328122406-150x150.jpg",
                    "That's Not How This Works (\"feat. Dat + Shay\")",
                    "Charlie Puth",
                    "2:45"
                ),
                TopAlbumsSongs(
                    "Love Again",
                    "https://c.saavncdn.com/168/Love-Again-English-2023-20230123234125-150x150.jpg",
                    "The Kid Laroi",
                    "Love Again",
                    "2:25"
                ),
                TopAlbumsSongs(
                    "Search & Rescue",
                    "https://c.saavncdn.com/190/Search-Rescue-English-2023-20230408120636-150x150.jpg",
                    "Search & Rescue",
                    "Drake",
                    "4:32"
                ),
                TopAlbumsSongs(
                    "Double Fantasy (Radio Edit)",
                    "https://c.saavncdn.com/666/Double-Fantasy-English-2023-20230421063637-150x150.jpg",
                    "The Weekedn",
                    "Double Fantasy",
                    "3:56"
                ),
                TopAlbumsSongs(
                    "Golden Hour",
                    "https://c.saavncdn.com/196/golden-hour-English-2022-20220911190044-150x150.jpg",
                    "Golden Hour",
                    "Jvke",
                    "3:29"
                ),
                TopAlbumsSongs(
                    "I'm Yours",
                    "https://c.saavncdn.com/167/i-m-yours-English-2022-20221025231114-150x150.jpg",
                    "I'm Yours",
                    "Isabel LaRosa",
                    "2:26"
                )
            )
        ),
        Albums(
            "https://c.saavncdn.com/430/Aashiqui-2-Hindi-2013-500x500.jpg",
            "Aashiqui 2",
            arrayListOf(
                TopAlbumsSongs(
                    "Tum Hi Ho",
                    null,
                    null,
                    "Arijit Singh",
                    "4:22"
                ),
                TopAlbumsSongs(
                    "Sunn Raha Hai (Male)",
                    null,
                    null,
                    "Ankit Tiwari",
                    "6:30"
                ),
                TopAlbumsSongs(
                    "Chahun Main Ya Naa",
                    null,
                    null,
                    "Palak Muchhal, Arijit Singh",
                    "5:04"
                ),
                TopAlbumsSongs(
                    "Hum Mar Jayenge",
                    null,
                    null,
                    "Tulsi Kumar, Arijit Singh",
                    "5:06"
                ),
                TopAlbumsSongs(
                    "Meri Aashiqui",
                    null,
                    null,
                    "Palak Mucchal, Arijit Singh",
                    "4:26"
                ),
                TopAlbumsSongs(
                    "Piya Aaye Na",
                    null,
                    null,
                    "Tulsi Kumar, KK",
                    "4:46"
                ),
                TopAlbumsSongs(
                    "Bhula Dena",
                    null,
                    null,
                    "Mustafa Zahid",
                    "4:00"
                ),
                TopAlbumsSongs(
                    "Aasan Nahin Yahan",
                    null,
                    null,
                    "Arijit Singh",
                    "3:34"
                ),
                TopAlbumsSongs(
                    "Milne Hai Mujhse Aayi",
                    null,
                    null,
                    "Arijit Singh",
                    "4:55"
                )
            )
        ),
        Albums(
            "https://c.saavncdn.com/248/Evolve-English-2017-20180716230950-500x500.jpg",
            "Evolve",
            arrayListOf(
                TopAlbumsSongs(
                    "Next To Me",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:49"
                ),
                TopAlbumsSongs(
                    "I Don't Know Why",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:10"
                ),
                TopAlbumsSongs(
                    "Whatever It Takes",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:20"
                ),
                TopAlbumsSongs(
                    "Believer",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:22"
                ),
                TopAlbumsSongs(
                    "Walking The Wire",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:53"
                ),
                TopAlbumsSongs(
                    "Rise Up",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:52"
                ),
                TopAlbumsSongs(
                    "I'll Make It Up To You",
                    null,
                    null,
                    "Imagine Dragons",
                    "4:23"
                ),
                TopAlbumsSongs(
                    "Yesterday",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:25"
                ),
                TopAlbumsSongs(
                    "Mouth Of The River",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:42"
                ),
                TopAlbumsSongs(
                    "Thunder",
                    null,
                    null,
                    "Imagine Dragons",
                    "3:07"
                )
            )
        )
    )

    val podcastsList: List<Albums> = arrayListOf(
        Albums(
            "http://c.sop.saavncdn.com/Talking-Music-20230310083848-500x500.jpg",
            "Talking Music",
            arrayListOf(
                TopAlbumsSongs(
                    "Himesh Reshammiya",
                    null,
                    null,
                    "Kirthi Shetty, Himesh Reshammiya",
                    "30:55"
                ),
                TopAlbumsSongs(
                    "Shankar-Eshaan-Loy",
                    null,
                    null,
                    "Kirthi Shetty, Shankar Mahadevan, Ehsaan Noorani, Loy Mendonsa",
                    "24:00"
                ),
                TopAlbumsSongs(
                    "KK",
                    null,
                    null,
                    "Kirthi Shetty, KK",
                    "28:11"
                ),
                TopAlbumsSongs(
                    "Arjun Kanungo",
                    null,
                    null,
                    "Kirthi Shetty, Arjun Kanungo",
                    "22:30"
                ),
                TopAlbumsSongs(
                    "Rishi Kumar",
                    null,
                    null,
                    "Kirthi Shetty, Rishi Kumar",
                    "16:23"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Such-a-Drag-20220203145837-500x500.jpg",
            "Such a Drag",
            arrayListOf(
                TopAlbumsSongs(
                    "Drag: What It is & Isn't",
                    null,
                    null,
                    "Sushant Divgikar, Isabelle Frieda Wood",
                    "31:34"
                ),
                TopAlbumsSongs(
                    "Loud & Proud",
                    null,
                    null,
                    "Sushant Divgikar, Priyanka",
                    "34:37"
                ),
                TopAlbumsSongs(
                    "Drag & Relationships",
                    null,
                    null,
                    "Sushant Divgikar, Navya Singh",
                    "38:35"
                ),
                TopAlbumsSongs(
                    "Gender & Drag",
                    null,
                    null,
                    "Sushant Divgikar, Abhina Aher, Puja Sarup",
                    "50:12"
                ),
                TopAlbumsSongs(
                    "Opportunities for a Drag Artist",
                    null,
                    null,
                    "Sushant Divgikar, Lush Monsoon",
                    "44:31"
                ),
                TopAlbumsSongs(
                    "Drag Mothers - Part 1",
                    null,
                    null,
                    "Sushant Divgikar, Keshav Suri",
                    "29:45"
                ),
                TopAlbumsSongs(
                    "Drag Mothers - Part 2",
                    null,
                    null,
                    "Sushant Divgikar, Keshav Suri",
                    "32:20"
                ),
                TopAlbumsSongs(
                    "Drag In The Limelight",
                    null,
                    null,
                    "Sushant Divgikar, Ashok Row Kavi",
                    "46:57"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Suzhal-The-Vortex-20220617174341-500x500.jpg",
            "Suzhal - The Vortex",
            arrayListOf(
                TopAlbumsSongs(
                    "Suzhal - The Vortex",
                    null,
                    null,
                    "Sanket Mahtre",
                    "6:28"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Indian-Murder-Mystery-20220704123807-500x500.jpg",
            "Indian Murder Mystery",
            arrayListOf(
                TopAlbumsSongs(
                    "Scarlett Killing Part 2",
                    null,
                    null,
                    null,
                    "11:36"
                ),
                TopAlbumsSongs(
                    "Scarlett Killing Part 1",
                    null,
                    null,
                    null,
                    "9:22"
                ),
                TopAlbumsSongs(
                    "Miss Delhi vs Desi Sherlock Part 2",
                    null,
                    null,
                    null,
                    "12:05"
                ),
                TopAlbumsSongs(
                    "Miss Delhi vs Desi Sherlock Part 1",
                    null,
                    null,
                    null,
                    "9:31"
                ),
                TopAlbumsSongs(
                    "Chaamkeela Murder Case Part 2",
                    null,
                    null,
                    null,
                    "10:35"
                ),
                TopAlbumsSongs(
                    "Chaamkeela Murder Case Part 1",
                    null,
                    null,
                    null,
                    "9:17"
                ),
                TopAlbumsSongs(
                    "Beer Man Part 2",
                    null,
                    null,
                    null,
                    "11:00"
                ),
                TopAlbumsSongs(
                    "Beer Man Murders Part 1",
                    null,
                    null,
                    null,
                    "8:19"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Kya-Woh-Sach-Tha-20220629105017-500x500.jpg",
            "Kya Woh Sach Tha",
            arrayListOf(
                TopAlbumsSongs(
                    "#40 Haunted Night",
                    null,
                    null,
                    null,
                    "16:48"
                ),
                TopAlbumsSongs(
                    "#39 Orphanage ki khaufnaak kahaani",
                    null,
                    null,
                    null,
                    "21:10"
                ),
                TopAlbumsSongs(
                    "#38 Girls hostel ka Rahasya",
                    null,
                    null,
                    null,
                    "16:00"
                ),
                TopAlbumsSongs(
                    "#37 Anil aur Kajal ke ghar ka rahasya",
                    null,
                    null,
                    null,
                    "19:02"
                ),
                TopAlbumsSongs(
                    "#36 Missing model ki kahani",
                    null,
                    null,
                    null,
                    "5:24"
                ),
                TopAlbumsSongs(
                    "#35 Haunted Haveli",
                    null,
                    null,
                    null,
                    "16:47"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/The-English-We-Speak-20200609122215-500x500.jpg",
            "The English We Speak",
            arrayListOf(
                TopAlbumsSongs(
                    "Under your breath",
                    null,
                    null,
                    null,
                    "2:44"
                ),
                TopAlbumsSongs(
                    "Be at a loss",
                    null,
                    null,
                    null,
                    "2:08"
                ),
                TopAlbumsSongs(
                    "Go off on one",
                    null,
                    null,
                    null,
                    "1:52"
                ),
                TopAlbumsSongs(
                    "Wiggle Room",
                    null,
                    null,
                    null,
                    "1:54"
                ),
                TopAlbumsSongs(
                    "(\"It's the\") story of my life",
                    null,
                    null,
                    null,
                    "2:10"
                ),
                TopAlbumsSongs(
                    "No ifs or buts",
                    null,
                    null,
                    null,
                    "2:06"
                ),
                TopAlbumsSongs(
                    "Rabbit on",
                    null,
                    null,
                    null,
                    "1:55"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Ramayan-Hindi-20200225081959-500x500.jpg",
            "Ramayan Hindi",
            arrayListOf(
                TopAlbumsSongs(
                    "Ep 1 - Ravan Ko Vedwati Ka Shrap",
                    null,
                    null,
                    null,
                    "11:10"
                ),
                TopAlbumsSongs(
                    "Ep 2 - Vishnu Ke Manushya Avataar Ki Ghoshana",
                    null,
                    null,
                    null,
                    "9:23"
                ),
                TopAlbumsSongs(
                    "Ep 3 - Dashrath Ka Rishi Shring Se Putreshthi Yagya Karne Ka Aagrah",
                    null,
                    null,
                    null,
                    "10:00"
                ),
                TopAlbumsSongs(
                    "Ep 4 - Shri Ram Janm",
                    null,
                    null,
                    null,
                    "7:30"
                ),
                TopAlbumsSongs(
                    "Ep 5 - Prabhu Ka Naamkaran",
                    null,
                    null,
                    null,
                    "10:00"
                ),
                TopAlbumsSongs(
                    "Ep 6 - Shri Ram Ki Baal Leela",
                    null,
                    null,
                    null,
                    "10:00"
                ),
                TopAlbumsSongs(
                    "Ep 7 - Shri Ram Ka Viraat Roop",
                    null,
                    null,
                    null,
                    "8:20"
                ),
                TopAlbumsSongs(
                    "Ep 8 - Raakshas Vaatya Ki Mukti",
                    null,
                    null,
                    null,
                    "7:34"
                ),
                TopAlbumsSongs(
                    "Ep 9 - Guru Vashisht Se Vidya Prapti",
                    null,
                    null,
                    null,
                    "7:55"
                ),
                TopAlbumsSongs(
                    "Ep 10 - Shri Ram Lakshman Vishwamitra Van Prasthan",
                    null,
                    null,
                    null,
                    "8:14"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Hanuman-Chalisa-Explanation-20221104123422-500x500.jpg",
            "Hanuman Chalisa (Explanation)",
            arrayListOf(
                TopAlbumsSongs(
                    "Hanuman chalisa (explanation) EP101",
                    null,
                    null,
                    null,
                    "1:11"
                ),
                TopAlbumsSongs(
                    "Hanuman chalisa ( explanation) EP102",
                    null,
                    null,
                    null,
                    "1:19"
                ),
                TopAlbumsSongs(
                    "चौपाई ( explanation ) EP103",
                    null,
                    null,
                    null,
                    "3:07"
                ),
                TopAlbumsSongs(
                    "चौपाई 5,6,7,8 ( explanation ) EP104",
                    null,
                    null,
                    null,
                    "2:27"
                ),
                TopAlbumsSongs(
                    "चौपाई 9,10,11,12 ( explanation ) EP105",
                    null,
                    null,
                    null,
                    "3:07"
                ),
                TopAlbumsSongs(
                    "चौपाई 13,14 ( explanation ) EP106",
                    null,
                    null,
                    null,
                    "1:38"
                ),
                TopAlbumsSongs(
                    "चौपाई 15,16 ( explanation ) EP107",
                    null,
                    null,
                    null,
                    "2:04"
                ),
                TopAlbumsSongs(
                    "चौपाई 17,18 ( explanation ) EP108",
                    null,
                    null,
                    null,
                    "1:55"
                ),
                TopAlbumsSongs(
                    "चौपाई 19,20 ( explanation ) EP109",
                    null,
                    null,
                    null,
                    "1:30"
                ),
                TopAlbumsSongs(
                    "चौपाई 21,22 ( explanation ) EP110",
                    null,
                    null,
                    null,
                    "1:38"
                ),
                TopAlbumsSongs(
                    "चौपाई 23,24 ( explanation ) EP111",
                    null,
                    null,
                    null,
                    "1:37"
                ),
                TopAlbumsSongs(
                    "चौपाई 25,26 ( explanation ) EP112",
                    null,
                    null,
                    null,
                    "1:36"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Tenali-Rama-Stories-in-Hindi-20221229200607-500x500.jpg",
            "Tenali Rama - Stories in Hindi",
            arrayListOf(
                TopAlbumsSongs(
                    "सबसे बड़ा मुर्ख (The Biggest Fool)",
                    null,
                    null,
                    null,
                    "4:33"
                ),
                TopAlbumsSongs(
                    "चार दोस्त (Four Friends)",
                    null,
                    null,
                    null,
                    "4:38"
                ),
                TopAlbumsSongs(
                    "कुँए का विवाह (Wedding Of The Well)",
                    null,
                    null,
                    null,
                    "4:07"
                ),
                TopAlbumsSongs(
                    "अरबी घोड़े (Arabian Horses)",
                    null,
                    null,
                    null,
                    "5:39"
                ),
                TopAlbumsSongs(
                    "मातृभाषा क्या है (What's the mother tongue)?",
                    null,
                    null,
                    null,
                    "6:37"
                ),
                TopAlbumsSongs(
                    "Who's Unlucky (मनहूस कौन)?",
                    null,
                    null,
                    null,
                    "5:07"
                ),
                TopAlbumsSongs(
                    "कूबड़ का इलाज (Treatment for Hump)",
                    null,
                    null,
                    null,
                    "4:46"
                ),
                TopAlbumsSongs(
                    "गधों को प्रणाम (Salute To Donkeys)",
                    null,
                    null,
                    null,
                    "3:43"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Bewda-Bhoot-20220523082715-500x500.jpg",
            "Bewda Bhoot| बेवड़ा भूत",
            arrayListOf(
                TopAlbumsSongs(
                    "Ep 13- पंगा, पावर और ऑफर",
                    null,
                    null,
                    null,
                    "9:47"
                ),
                TopAlbumsSongs(
                    "Ep 12- वो खूबसूरत लड़की",
                    null,
                    null,
                    null,
                    "9:44"
                ),
                TopAlbumsSongs(
                    "Ep 11- देख रहा है बिनोद",
                    null,
                    null,
                    null,
                    "11:59",
                ),
                TopAlbumsSongs(
                    "Ep 10- झूम बाबा जी झूम",
                    null,
                    null,
                    null,
                    "6:49",
                ),
                TopAlbumsSongs(
                    "Ep 09- ढोंगी बाबा और बेवड़ा भूत",
                    null,
                    null,
                    null,
                    "9:58",
                ),
                TopAlbumsSongs(
                    "Ep 08- यमराज लाए भूत का वारंट",
                    null,
                    null,
                    null,
                    "9:00",
                ),
                TopAlbumsSongs(
                    "Ep 07- शराबी भैंस और मेंढकों का रेन डांस",
                    null,
                    null,
                    null,
                    "10:01",
                ),
                TopAlbumsSongs(
                    "Ep 06- भूत और प्रेत की लड़ाई",
                    null,
                    null,
                    null,
                    "10:58"
                )
            )
        ),
        Albums(
            "http://c.sop.saavncdn.com/Unconventional-Ghalib-By-Rekhta-20220305110922-500x500.jpg",
            "Unconventional Ghalib By Rekhta",
            arrayListOf(
                TopAlbumsSongs(
                    "Ibn e Mariyam hua kare koi",
                    null,
                    null,
                    null,
                    "2:14"
                ),
                TopAlbumsSongs(
                    "Hazaaron Khwahishen aisi",
                    null,
                    null,
                    null,
                    "1:58"
                ),
                TopAlbumsSongs(
                    "Dil e Naadaan",
                    null,
                    null,
                    null,
                    "1:50"
                ),
                TopAlbumsSongs(
                    "Dil hi toh hai",
                    null,
                    null,
                    null,
                    "1:38"
                ),
                TopAlbumsSongs(
                    "1857 and the Delhi of Ghalib",
                    null,
                    null,
                    null,
                    "5:09"
                ),
                TopAlbumsSongs(
                    "Ye na thi hamari qismat",
                    null,
                    null,
                    null,
                    "2:30"
                ),
                TopAlbumsSongs(
                    "Koi ummeed bar nahi aati",
                    null,
                    null,
                    null,
                    "1:26"
                ),
                TopAlbumsSongs(
                    "Kehte hain ke Ghalib ka hai andaaz e bayaan aur",
                    null,
                    null,
                    null,
                    "1:52"
                )
            )
        )
    )

    val recentlyPlayedTracksList: List<TopAlbumsSongs> = arrayListOf<TopAlbumsSongs>(
        TopAlbumsSongs(
            "Calm Down",
            "https://c.saavncdn.com/596/Calm-Down-English-2022-20220826054039-150x150.jpg",
            "Calm Down",
            "Rema, Selena Gomez",
            "3:59"
        ),
        TopAlbumsSongs(
            "Night Changes",
            "https://c.saavncdn.com/851/FOUR-Deluxe--English-2014-500x500.jpg",
            "Four (Deluxe)",
            "One Direction",
            "3:46"
        ),
        TopAlbumsSongs(
            "Harleys In Hawaii",
            "https://c.saavncdn.com/289/Harleys-In-Hawaii-English-2019-20191015230756-150x150.jpg",
            "Harleys In Hawaii",
            "Katy Perry",
            "3:06"
        )
    )

    fun changeTabs(
        constraintLayout: ConstraintLayout,
        parentView: View,
        childView: View,
        bias: Float
    ) {
        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)
        TransitionManager.beginDelayedTransition(constraintLayout)
        constraintSet.connect(
            parentView.id,
            ConstraintSet.START,
            childView.id,
            ConstraintSet.START
        )
        constraintSet.connect(
            parentView.id,
            ConstraintSet.END,
            childView.id,
            ConstraintSet.END
        )
        constraintSet.connect(
            parentView.id,
            ConstraintSet.TOP,
            childView.id,
            ConstraintSet.BOTTOM
        )
        constraintSet.setHorizontalBias(childView.id, bias)
        constraintSet.applyTo(constraintLayout)
    }

    fun savePreferences(context: Context, key: String, value: String) {
        val prefs = context.getSharedPreferences("Local_Data", Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getPreferences(context: Context, key: String): String? {
        val prefs = context.getSharedPreferences("Local_Data", Context.MODE_PRIVATE)
        return prefs.getString(key, null)
    }
}