import java.util.Arrays;

public class DictWXYZ
{
  private String[] words =
  {
      "wab",
"wabble",
"wabbled",
"wabbler",
"wabblers",
"wabbles",
"wabblier",
"wabbling",
"wabbly",
"wabs",
"wack",
"wacke",
"wackes",
"wackier",
"wackiest",
"wackily",
"wacko",
"wackos",
"wacks",
"wacky",
"wad",
"wadable",
"wadded",
"wadder",
"wadders",
"waddie",
"waddied",
"waddies",
"wadding",
"waddings",
"waddle",
"waddled",
"waddler",
"waddlers",
"waddles",
"waddling",
"waddly",
"waddy",
"waddying",
"wade",
"wadeable",
"waded",
"wader",
"waders",
"wades",
"wadi",
"wadies",
"wading",
"wadis",
"wadmaal",
"wadmaals",
"wadmal",
"wadmals",
"wadmel",
"wadmels",
"wadmol",
"wadmoll",
"wadmolls",
"wadmols",
"wads",
"wadset",
"wadsets",
"wady",
"wae",
"waeful",
"waeness",
"waes",
"waesuck",
"waesucks",
"wafer",
"wafered",
"wafering",
"wafers",
"wafery",
"waff",
"waffed",
"waffie",
"waffies",
"waffing",
"waffle",
"waffled",
"waffler",
"wafflers",
"waffles",
"waffling",
"waffs",
"waft",
"waftage",
"waftages",
"wafted",
"wafter",
"wafters",
"wafting",
"wafts",
"wafture",
"waftures",
"wag",
"wage",
"waged",
"wageless",
"wager",
"wagered",
"wagerer",
"wagerers",
"wagering",
"wagers",
"wages",
"wagged",
"wagger",
"waggers",
"waggery",
"wagging",
"waggish",
"waggle",
"waggled",
"waggles",
"waggling",
"waggly",
"waggon",
"waggoned",
"waggoner",
"waggons",
"waging",
"wagon",
"wagonage",
"wagoned",
"wagoner",
"wagoners",
"wagoning",
"wagons",
"wags",
"wagsome",
"wagtail",
"wagtails",
"wahconda",
"wahine",
"wahines",
"wahoo",
"wahoos",
"waif",
"waifed",
"waifing",
"waiflike",
"waifs",
"wail",
"wailed",
"wailer",
"wailers",
"wailful",
"wailing",
"wails",
"wailsome",
"wain",
"wains",
"wainscot",
"wair",
"waired",
"wairing",
"wairs",
"waist",
"waisted",
"waister",
"waisters",
"waisting",
"waists",
"wait",
"waited",
"waiter",
"waiters",
"waiting",
"waitings",
"waitress",
"waits",
"waive",
"waived",
"waiver",
"waivers",
"waives",
"waiving",
"wakanda",
"wakandas",
"wake",
"waked",
"wakeful",
"wakeless",
"waken",
"wakened",
"wakener",
"wakeners",
"wakening",
"wakens",
"waker",
"wakerife",
"wakers",
"wakes",
"wakiki",
"wakikis",
"waking",
"wale",
"waled",
"waler",
"walers",
"wales",
"walies",
"waling",
"walk",
"walkable",
"walkaway",
"walked",
"walker",
"walkers",
"walking",
"walkings",
"walkout",
"walkouts",
"walkover",
"walks",
"walkup",
"walkups",
"walkway",
"walkways",
"walkyrie",
"wall",
"walla",
"wallaby",
"wallah",
"wallahs",
"wallaroo",
"wallas",
"walled",
"wallet",
"wallets",
"walleye",
"walleyed",
"walleyes",
"wallie",
"wallies",
"walling",
"wallop",
"walloped",
"walloper",
"wallops",
"wallow",
"wallowed",
"wallower",
"wallows",
"walls",
"wally",
"walnut",
"walnuts",
"walrus",
"walruses",
"waltz",
"waltzed",
"waltzer",
"waltzers",
"waltzes",
"waltzing",
"waly",
"wamble",
"wambled",
"wambles",
"wamblier",
"wambling",
"wambly",
"wame",
"wamefou",
"wamefous",
"wameful",
"wamefuls",
"wames",
"wammus",
"wammuses",
"wampish",
"wampum",
"wampums",
"wampus",
"wampuses",
"wamus",
"wamuses",
"wan",
"wand",
"wander",
"wandered",
"wanderer",
"wanderoo",
"wanders",
"wandle",
"wands",
"wane",
"waned",
"wanes",
"waney",
"wangan",
"wangans",
"wangle",
"wangled",
"wangler",
"wanglers",
"wangles",
"wangling",
"wangun",
"wanguns",
"wanier",
"waniest",
"wanigan",
"wanigans",
"waning",
"wanion",
"wanions",
"wanly",
"wanned",
"wanner",
"wanness",
"wannest",
"wannigan",
"wanning",
"wans",
"want",
"wantage",
"wantages",
"wanted",
"wanter",
"wanters",
"wanting",
"wanton",
"wantoned",
"wantoner",
"wantonly",
"wantons",
"wants",
"wany",
"wap",
"wapiti",
"wapitis",
"wapped",
"wapping",
"waps",
"war",
"warble",
"warbled",
"warbler",
"warblers",
"warbles",
"warbling",
"warcraft",
"ward",
"warded",
"warden",
"wardenry",
"wardens",
"warder",
"warders",
"warding",
"wardress",
"wardrobe",
"wardroom",
"wards",
"wardship",
"ware",
"wared",
"wareroom",
"wares",
"warfare",
"warfares",
"warfarin",
"warhead",
"warheads",
"warhorse",
"warier",
"wariest",
"warily",
"wariness",
"waring",
"warison",
"warisons",
"wark",
"warked",
"warking",
"warks",
"warless",
"warlike",
"warlock",
"warlocks",
"warlord",
"warlords",
"warm",
"warmaker",
"warmed",
"warmer",
"warmers",
"warmest",
"warming",
"warmish",
"warmly",
"warmness",
"warmouth",
"warms",
"warmth",
"warmths",
"warmup",
"warmups",
"warn",
"warned",
"warner",
"warners",
"warning",
"warnings",
"warns",
"warp",
"warpage",
"warpages",
"warpath",
"warpaths",
"warped",
"warper",
"warpers",
"warping",
"warplane",
"warpower",
"warps",
"warpwise",
"warragal",
"warrant",
"warrants",
"warranty",
"warred",
"warren",
"warrener",
"warrens",
"warrigal",
"warring",
"warrior",
"warriors",
"wars",
"warsaw",
"warsaws",
"warship",
"warships",
"warsle",
"warsled",
"warsler",
"warslers",
"warsles",
"warsling",
"warstle",
"warstled",
"warstler",
"warstles",
"wart",
"warted",
"warthog",
"warthogs",
"wartier",
"wartiest",
"wartime",
"wartimes",
"wartless",
"wartlike",
"warts",
"warty",
"warwork",
"warworks",
"warworn",
"wary",
"was",
"wasabi",
"wasabis",
"wash",
"washable",
"washbowl",
"washday",
"washdays",
"washed",
"washer",
"washers",
"washes",
"washier",
"washiest",
"washing",
"washings",
"washout",
"washouts",
"washrag",
"washrags",
"washroom",
"washtub",
"washtubs",
"washup",
"washups",
"washy",
"wasp",
"waspier",
"waspiest",
"waspily",
"waspish",
"wasplike",
"wasps",
"waspy",
"wassail",
"wassails",
"wast",
"wastable",
"wastage",
"wastages",
"waste",
"wasted",
"wasteful",
"wastelot",
"waster",
"wasterie",
"wasters",
"wastery",
"wastes",
"wasteway",
"wasting",
"wastrel",
"wastrels",
"wastrie",
"wastries",
"wastry",
"wasts",
"wat",
"watap",
"watape",
"watapes",
"wataps",
"watch",
"watchcry",
"watchdog",
"watched",
"watcher",
"watchers",
"watches",
"watcheye",
"watchful",
"watching",
"watchman",
"watchmen",
"watchout",
"water",
"waterage",
"waterbed",
"waterdog",
"watered",
"waterer",
"waterers",
"waterier",
"waterily",
"watering",
"waterish",
"waterlog",
"waterloo",
"waterman",
"watermen",
"waters",
"waterway",
"watery",
"wats",
"watt",
"wattage",
"wattages",
"wattape",
"wattapes",
"watter",
"wattest",
"watthour",
"wattle",
"wattled",
"wattles",
"wattless",
"wattling",
"watts",
"waucht",
"wauchted",
"wauchts",
"waugh",
"waught",
"waughted",
"waughts",
"wauk",
"wauked",
"wauking",
"wauks",
"waul",
"wauled",
"wauling",
"wauls",
"waur",
"wave",
"waveband",
"waved",
"waveform",
"waveless",
"wavelet",
"wavelets",
"wavelike",
"waveoff",
"waveoffs",
"waver",
"wavered",
"waverer",
"waverers",
"wavering",
"wavers",
"wavery",
"waves",
"wavey",
"waveys",
"wavier",
"wavies",
"waviest",
"wavily",
"waviness",
"waving",
"wavy",
"waw",
"wawl",
"wawled",
"wawling",
"wawls",
"waws",
"wax",
"waxberry",
"waxbill",
"waxbills",
"waxed",
"waxen",
"waxer",
"waxers",
"waxes",
"waxier",
"waxiest",
"waxily",
"waxiness",
"waxing",
"waxings",
"waxlike",
"waxplant",
"waxweed",
"waxweeds",
"waxwing",
"waxwings",
"waxwork",
"waxworks",
"waxworm",
"waxworms",
"waxy",
"way",
"waybill",
"waybills",
"wayfarer",
"waygoing",
"waylaid",
"waylay",
"waylayer",
"waylays",
"wayless",
"ways",
"wayside",
"waysides",
"wayward",
"wayworn",
"we",
"weak",
"weaken",
"weakened",
"weakener",
"weakens",
"weaker",
"weakest",
"weakfish",
"weakish",
"weaklier",
"weakling",
"weakly",
"weakness",
"weakside",
"weal",
"weald",
"wealds",
"weals",
"wealth",
"wealths",
"wealthy",
"wean",
"weaned",
"weaner",
"weaners",
"weaning",
"weanling",
"weans",
"weapon",
"weaponed",
"weaponry",
"weapons",
"wear",
"wearable",
"wearer",
"wearers",
"wearied",
"wearier",
"wearies",
"weariest",
"weariful",
"wearily",
"wearing",
"wearish",
"wears",
"weary",
"wearying",
"weasand",
"weasands",
"weasel",
"weaseled",
"weaselly",
"weasels",
"weasely",
"weason",
"weasons",
"weather",
"weathers",
"weave",
"weaved",
"weaver",
"weavers",
"weaves",
"weaving",
"weazand",
"weazands",
"web",
"webbed",
"webbier",
"webbiest",
"webbing",
"webbings",
"webby",
"weber",
"webers",
"webfed",
"webfeet",
"webfoot",
"webless",
"weblike",
"webs",
"webster",
"websters",
"webwork",
"webworks",
"webworm",
"webworms",
"wecht",
"wechts",
"wed",
"wedded",
"wedder",
"wedders",
"wedding",
"weddings",
"wedel",
"wedeled",
"wedeling",
"wedeln",
"wedelns",
"wedels",
"wedge",
"wedged",
"wedges",
"wedgie",
"wedgier",
"wedgies",
"wedgiest",
"wedging",
"wedgy",
"wedlock",
"wedlocks",
"weds",
"wee",
"weed",
"weeded",
"weeder",
"weeders",
"weedier",
"weediest",
"weedily",
"weeding",
"weedless",
"weedlike",
"weeds",
"weedy",
"week",
"weekday",
"weekdays",
"weekend",
"weekends",
"weeklies",
"weeklong",
"weekly",
"weeks",
"weel",
"ween",
"weened",
"weenie",
"weenier",
"weenies",
"weeniest",
"weening",
"weens",
"weensier",
"weensy",
"weeny",
"weep",
"weeper",
"weepers",
"weepie",
"weepier",
"weepies",
"weepiest",
"weeping",
"weepings",
"weeps",
"weepy",
"weer",
"wees",
"weest",
"weet",
"weeted",
"weeting",
"weets",
"weever",
"weevers",
"weevil",
"weeviled",
"weevilly",
"weevils",
"weevily",
"weewee",
"weeweed",
"weewees",
"weft",
"wefts",
"weftwise",
"weigela",
"weigelas",
"weigelia",
"weigh",
"weighed",
"weigher",
"weighers",
"weighing",
"weighman",
"weighmen",
"weighs",
"weight",
"weighted",
"weighter",
"weights",
"weighty",
"weiner",
"weiners",
"weir",
"weird",
"weirder",
"weirdest",
"weirdie",
"weirdies",
"weirdly",
"weirdo",
"weirdoes",
"weirdos",
"weirds",
"weirdy",
"weirs",
"weka",
"wekas",
"welch",
"welched",
"welcher",
"welchers",
"welches",
"welching",
"welcome",
"welcomed",
"welcomer",
"welcomes",
"weld",
"weldable",
"welded",
"welder",
"welders",
"welding",
"weldless",
"weldment",
"weldor",
"weldors",
"welds",
"welfare",
"welfares",
"welkin",
"welkins",
"well",
"welladay",
"wellaway",
"wellborn",
"wellcurb",
"welldoer",
"welled",
"wellhead",
"wellhole",
"wellie",
"wellies",
"welling",
"wellness",
"wells",
"wellsite",
"welly",
"welsh",
"welshed",
"welsher",
"welshers",
"welshes",
"welshing",
"welt",
"welted",
"welter",
"weltered",
"welters",
"welting",
"weltings",
"welts",
"wen",
"wench",
"wenched",
"wencher",
"wenchers",
"wenches",
"wenching",
"wend",
"wended",
"wendigo",
"wendigos",
"wending",
"wends",
"wennier",
"wenniest",
"wennish",
"wenny",
"wens",
"went",
"wept",
"were",
"weregild",
"werewolf",
"wergeld",
"wergelds",
"wergelt",
"wergelts",
"wergild",
"wergilds",
"wert",
"werwolf",
"weskit",
"weskits",
"wessand",
"wessands",
"west",
"wester",
"westered",
"westerly",
"western",
"westerns",
"westers",
"westing",
"westings",
"westmost",
"wests",
"westward",
"wet",
"wetback",
"wetbacks",
"wether",
"wethers",
"wetland",
"wetlands",
"wetly",
"wetness",
"wetproof",
"wets",
"wettable",
"wetted",
"wetter",
"wetters",
"wettest",
"wetting",
"wettings",
"wettish",
"wha",
"whack",
"whacked",
"whacker",
"whackers",
"whackier",
"whacking",
"whacko",
"whackos",
"whacks",
"whacky",
"whale",
"whaled",
"whaleman",
"whalemen",
"whaler",
"whalers",
"whales",
"whaling",
"whalings",
"wham",
"whammed",
"whammies",
"whamming",
"whammo",
"whammy",
"whamo",
"whams",
"whang",
"whanged",
"whangee",
"whangees",
"whanging",
"whangs",
"whap",
"whapped",
"whapper",
"whappers",
"whapping",
"whaps",
"wharf",
"wharfage",
"wharfed",
"wharfing",
"wharfs",
"wharve",
"wharves",
"what",
"whatever",
"whatness",
"whatnot",
"whatnots",
"whats",
"whatsis",
"whatsit",
"whatsits",
"whaup",
"whaups",
"wheal",
"wheals",
"wheat",
"wheatear",
"wheaten",
"wheatens",
"wheats",
"whee",
"wheedle",
"wheedled",
"wheedler",
"wheedles",
"wheel",
"wheeled",
"wheeler",
"wheelers",
"wheelie",
"wheelies",
"wheeling",
"wheelman",
"wheelmen",
"wheels",
"wheen",
"wheens",
"wheep",
"wheeped",
"wheeping",
"wheeple",
"wheepled",
"wheeples",
"wheeps",
"wheeze",
"wheezed",
"wheezer",
"wheezers",
"wheezes",
"wheezier",
"wheezily",
"wheezing",
"wheezy",
"whelk",
"whelkier",
"whelks",
"whelky",
"whelm",
"whelmed",
"whelming",
"whelms",
"whelp",
"whelped",
"whelping",
"whelps",
"when",
"whenas",
"whence",
"whenever",
"whens",
"where",
"whereas",
"whereat",
"whereby",
"wherein",
"whereof",
"whereon",
"wheres",
"whereto",
"wherever",
"wherried",
"wherries",
"wherry",
"wherve",
"wherves",
"whet",
"whether",
"whets",
"whetted",
"whetter",
"whetters",
"whetting",
"whew",
"whews",
"whey",
"wheyey",
"wheyface",
"wheyish",
"wheylike",
"wheys",
"which",
"whicker",
"whickers",
"whid",
"whidah",
"whidahs",
"whidded",
"whidding",
"whids",
"whiff",
"whiffed",
"whiffer",
"whiffers",
"whiffet",
"whiffets",
"whiffing",
"whiffle",
"whiffled",
"whiffler",
"whiffles",
"whiffs",
"whig",
"whigs",
"while",
"whiled",
"whiles",
"whiling",
"whilom",
"whilst",
"whim",
"whimbrel",
"whimper",
"whimpers",
"whims",
"whimsey",
"whimseys",
"whimsied",
"whimsies",
"whimsy",
"whin",
"whinchat",
"whine",
"whined",
"whiner",
"whiners",
"whines",
"whiney",
"whinge",
"whinged",
"whinges",
"whinging",
"whinier",
"whiniest",
"whining",
"whinnied",
"whinnier",
"whinnies",
"whinny",
"whins",
"whiny",
"whip",
"whipcord",
"whiplash",
"whiplike",
"whipped",
"whipper",
"whippers",
"whippet",
"whippets",
"whippier",
"whipping",
"whippy",
"whipray",
"whiprays",
"whips",
"whipsaw",
"whipsawn",
"whipsaws",
"whipt",
"whiptail",
"whipworm",
"whir",
"whirl",
"whirled",
"whirler",
"whirlers",
"whirlier",
"whirlies",
"whirling",
"whirls",
"whirly",
"whirr",
"whirred",
"whirried",
"whirries",
"whirring",
"whirrs",
"whirry",
"whirs",
"whish",
"whished",
"whishes",
"whishing",
"whisht",
"whishted",
"whishts",
"whisk",
"whisked",
"whisker",
"whiskers",
"whiskery",
"whiskey",
"whiskeys",
"whiskies",
"whisking",
"whisks",
"whisky",
"whisper",
"whispers",
"whispery",
"whist",
"whisted",
"whisting",
"whistle",
"whistled",
"whistler",
"whistles",
"whists",
"whit",
"white",
"whitecap",
"whited",
"whitefly",
"whitely",
"whiten",
"whitened",
"whitener",
"whitens",
"whiteout",
"whiter",
"whites",
"whitest",
"whitey",
"whiteys",
"whither",
"whitier",
"whities",
"whitiest",
"whiting",
"whitings",
"whitish",
"whitlow",
"whitlows",
"whitrack",
"whits",
"whitter",
"whitters",
"whittle",
"whittled",
"whittler",
"whittles",
"whittret",
"whity",
"whiz",
"whizbang",
"whizz",
"whizzed",
"whizzer",
"whizzers",
"whizzes",
"whizzing",
"who",
"whoa",
"whodunit",
"whoever",
"whole",
"wholes",
"wholism",
"wholisms",
"wholly",
"whom",
"whomever",
"whomp",
"whomped",
"whomping",
"whomps",
"whomso",
"whoof",
"whoofed",
"whoofing",
"whoofs",
"whoop",
"whooped",
"whoopee",
"whoopees",
"whooper",
"whoopers",
"whooping",
"whoopla",
"whooplas",
"whoops",
"whoosh",
"whooshed",
"whooshes",
"whoosis",
"whop",
"whopped",
"whopper",
"whoppers",
"whopping",
"whops",
"whore",
"whored",
"whoredom",
"whores",
"whoreson",
"whoring",
"whorish",
"whorl",
"whorled",
"whorls",
"whort",
"whortle",
"whortles",
"whorts",
"whose",
"whosever",
"whosis",
"whosises",
"whoso",
"whump",
"whumped",
"whumping",
"whumps",
"why",
"whydah",
"whydahs",
"whys",
"wich",
"wiches",
"wick",
"wickape",
"wickapes",
"wicked",
"wickeder",
"wickedly",
"wicker",
"wickers",
"wicket",
"wickets",
"wicking",
"wickings",
"wickiup",
"wickiups",
"wicks",
"wickyup",
"wickyups",
"wicopies",
"wicopy",
"widder",
"widders",
"widdie",
"widdies",
"widdle",
"widdled",
"widdles",
"widdling",
"widdy",
"wide",
"wideband",
"widely",
"widen",
"widened",
"widener",
"wideners",
"wideness",
"widening",
"widens",
"wideout",
"wideouts",
"wider",
"wides",
"widest",
"widgeon",
"widgeons",
"widget",
"widgets",
"widish",
"widow",
"widowed",
"widower",
"widowers",
"widowing",
"widows",
"width",
"widths",
"widthway",
"wield",
"wielded",
"wielder",
"wielders",
"wieldier",
"wielding",
"wields",
"wieldy",
"wiener",
"wieners",
"wienie",
"wienies",
"wife",
"wifed",
"wifedom",
"wifedoms",
"wifehood",
"wifeless",
"wifelier",
"wifelike",
"wifely",
"wifes",
"wifing",
"wiftier",
"wiftiest",
"wifty",
"wig",
"wigan",
"wigans",
"wigeon",
"wigeons",
"wigged",
"wiggery",
"wiggier",
"wiggiest",
"wigging",
"wiggings",
"wiggle",
"wiggled",
"wiggler",
"wigglers",
"wiggles",
"wigglier",
"wiggling",
"wiggly",
"wiggy",
"wight",
"wights",
"wigless",
"wiglet",
"wiglets",
"wiglike",
"wigmaker",
"wigs",
"wigwag",
"wigwags",
"wigwam",
"wigwams",
"wikiup",
"wikiups",
"wilco",
"wild",
"wildcat",
"wildcats",
"wilder",
"wildered",
"wilders",
"wildest",
"wildfire",
"wildfowl",
"wilding",
"wildings",
"wildish",
"wildland",
"wildlife",
"wildling",
"wildly",
"wildness",
"wilds",
"wildwood",
"wile",
"wiled",
"wiles",
"wilful",
"wilfully",
"wilier",
"wiliest",
"wilily",
"wiliness",
"wiling",
"will",
"willable",
"willed",
"willer",
"willers",
"willet",
"willets",
"willful",
"willied",
"willies",
"willing",
"williwau",
"williwaw",
"willow",
"willowed",
"willower",
"willows",
"willowy",
"wills",
"willy",
"willyard",
"willyart",
"willying",
"willywaw",
"wilt",
"wilted",
"wilting",
"wilts",
"wily",
"wimble",
"wimbled",
"wimbles",
"wimbling",
"wimp",
"wimpier",
"wimpiest",
"wimpish",
"wimple",
"wimpled",
"wimples",
"wimpling",
"wimps",
"wimpy",
"win",
"wince",
"winced",
"wincer",
"wincers",
"winces",
"wincey",
"winceys",
"winch",
"winched",
"wincher",
"winchers",
"winches",
"winching",
"wincing",
"wind",
"windable",
"windage",
"windages",
"windbag",
"windbags",
"windburn",
"winded",
"winder",
"winders",
"windfall",
"windflaw",
"windgall",
"windier",
"windiest",
"windigo",
"windigos",
"windily",
"winding",
"windings",
"windlass",
"windle",
"windled",
"windles",
"windless",
"windling",
"windmill",
"window",
"windowed",
"windows",
"windpipe",
"windrow",
"windrows",
"winds",
"windsock",
"windsurf",
"windup",
"windups",
"windward",
"windway",
"windways",
"windy",
"wine",
"wined",
"wineless",
"wineries",
"winery",
"wines",
"wineshop",
"wineskin",
"winesop",
"winesops",
"winey",
"wing",
"wingback",
"wingbow",
"wingbows",
"wingding",
"winged",
"wingedly",
"winger",
"wingers",
"wingier",
"wingiest",
"winging",
"wingless",
"winglet",
"winglets",
"winglike",
"wingman",
"wingmen",
"wingover",
"wings",
"wingspan",
"wingtip",
"wingtips",
"wingy",
"winier",
"winiest",
"wining",
"winish",
"wink",
"winked",
"winker",
"winkers",
"winking",
"winkle",
"winkled",
"winkles",
"winkling",
"winks",
"winless",
"winnable",
"winned",
"winner",
"winners",
"winning",
"winnings",
"winnock",
"winnocks",
"winnow",
"winnowed",
"winnower",
"winnows",
"wino",
"winoes",
"winos",
"wins",
"winsome",
"winsomer",
"winter",
"wintered",
"winterer",
"winterly",
"winters",
"wintery",
"wintle",
"wintled",
"wintles",
"wintling",
"wintrier",
"wintrily",
"wintry",
"winy",
"winze",
"winzes",
"wipe",
"wiped",
"wipeout",
"wipeouts",
"wiper",
"wipers",
"wipes",
"wiping",
"wirable",
"wire",
"wired",
"wiredraw",
"wiredrew",
"wirehair",
"wireless",
"wirelike",
"wireman",
"wiremen",
"wirer",
"wirers",
"wires",
"wiretap",
"wiretaps",
"wireway",
"wireways",
"wirework",
"wireworm",
"wirier",
"wiriest",
"wirily",
"wiriness",
"wiring",
"wirings",
"wirra",
"wiry",
"wis",
"wisdom",
"wisdoms",
"wise",
"wiseacre",
"wiseass",
"wised",
"wiselier",
"wisely",
"wiseness",
"wisent",
"wisents",
"wiser",
"wises",
"wisest",
"wish",
"wisha",
"wishbone",
"wished",
"wisher",
"wishers",
"wishes",
"wishful",
"wishing",
"wishless",
"wising",
"wisp",
"wisped",
"wispier",
"wispiest",
"wispily",
"wisping",
"wispish",
"wisplike",
"wisps",
"wispy",
"wiss",
"wissed",
"wisses",
"wissing",
"wist",
"wistaria",
"wisted",
"wisteria",
"wistful",
"wisting",
"wists",
"wit",
"witan",
"witch",
"witched",
"witchery",
"witches",
"witchier",
"witching",
"witchy",
"wite",
"wited",
"wites",
"with",
"withal",
"withdraw",
"withdrew",
"withe",
"withed",
"wither",
"withered",
"witherer",
"withers",
"withes",
"withheld",
"withhold",
"withier",
"withies",
"withiest",
"within",
"withing",
"withins",
"without",
"withouts",
"withy",
"witing",
"witless",
"witling",
"witlings",
"witloof",
"witloofs",
"witness",
"witney",
"witneys",
"wits",
"witted",
"wittier",
"wittiest",
"wittily",
"witting",
"wittings",
"wittol",
"wittols",
"witty",
"wive",
"wived",
"wiver",
"wivern",
"wiverns",
"wivers",
"wives",
"wiving",
"wiz",
"wizard",
"wizardly",
"wizardry",
"wizards",
"wizen",
"wizened",
"wizening",
"wizens",
"wizes",
"wizzen",
"wizzens",
"wo",
"woad",
"woaded",
"woads",
"woadwax",
"woald",
"woalds",
"wobble",
"wobbled",
"wobbler",
"wobblers",
"wobbles",
"wobblier",
"wobblies",
"wobbling",
"wobbly",
"wobegone",
"wodge",
"wodges",
"woe",
"woeful",
"woefully",
"woeness",
"woes",
"woesome",
"woful",
"wofully",
"wog",
"wogs",
"wok",
"woke",
"woken",
"woks",
"wold",
"wolds",
"wolf",
"wolfed",
"wolfer",
"wolfers",
"wolffish",
"wolfing",
"wolfish",
"wolflike",
"wolfram",
"wolframs",
"wolfs",
"wolver",
"wolvers",
"wolves",
"woman",
"womaned",
"womaning",
"womanise",
"womanish",
"womanize",
"womanly",
"womans",
"womb",
"wombat",
"wombats",
"wombed",
"wombier",
"wombiest",
"wombs",
"womby",
"women",
"womera",
"womeras",
"wommera",
"wommeras",
"won",
"wonder",
"wondered",
"wonderer",
"wonders",
"wondrous",
"wonk",
"wonkier",
"wonkiest",
"wonks",
"wonky",
"wonned",
"wonner",
"wonners",
"wonning",
"wons",
"wont",
"wonted",
"wontedly",
"wonting",
"wonton",
"wontons",
"wonts",
"woo",
"wood",
"woodbin",
"woodbind",
"woodbine",
"woodbins",
"woodbox",
"woodchat",
"woodcock",
"woodcut",
"woodcuts",
"wooded",
"wooden",
"woodener",
"woodenly",
"woodhen",
"woodhens",
"woodie",
"woodier",
"woodies",
"woodiest",
"wooding",
"woodland",
"woodlark",
"woodless",
"woodlore",
"woodlot",
"woodlots",
"woodman",
"woodmen",
"woodnote",
"woodpile",
"woodruff",
"woods",
"woodshed",
"woodsia",
"woodsias",
"woodsier",
"woodsman",
"woodsmen",
"woodsy",
"woodwax",
"woodwind",
"woodwork",
"woodworm",
"woody",
"wooed",
"wooer",
"wooers",
"woof",
"woofed",
"woofer",
"woofers",
"woofing",
"woofs",
"wooing",
"wooingly",
"wool",
"wooled",
"woolen",
"woolens",
"wooler",
"woolers",
"woolfell",
"woolhat",
"woolhats",
"woolie",
"woolier",
"woolies",
"wooliest",
"woolled",
"woollen",
"woollens",
"woollier",
"woollies",
"woollike",
"woollily",
"woolly",
"woolman",
"woolmen",
"woolpack",
"wools",
"woolsack",
"woolshed",
"woolskin",
"woolwork",
"wooly",
"woomera",
"woomeras",
"woops",
"woopsed",
"woopses",
"woopsing",
"woorali",
"wooralis",
"woorari",
"wooraris",
"woos",
"woosh",
"wooshed",
"wooshes",
"wooshing",
"woozier",
"wooziest",
"woozily",
"woozy",
"wop",
"wops",
"word",
"wordage",
"wordages",
"wordbook",
"worded",
"wordier",
"wordiest",
"wordily",
"wording",
"wordings",
"wordless",
"wordplay",
"words",
"wordy",
"wore",
"work",
"workable",
"workaday",
"workbag",
"workbags",
"workboat",
"workbook",
"workbox",
"workday",
"workdays",
"worked",
"worker",
"workers",
"workfare",
"workfolk",
"working",
"workings",
"workless",
"workload",
"workman",
"workmate",
"workmen",
"workout",
"workouts",
"workroom",
"works",
"workshop",
"workup",
"workups",
"workweek",
"world",
"worldly",
"worlds",
"worm",
"wormed",
"wormer",
"wormers",
"wormhole",
"wormier",
"wormiest",
"wormil",
"wormils",
"worming",
"wormish",
"wormlike",
"wormroot",
"worms",
"wormseed",
"wormwood",
"wormy",
"worn",
"wornness",
"worried",
"worrier",
"worriers",
"worries",
"worrit",
"worrited",
"worrits",
"worry",
"worrying",
"worse",
"worsen",
"worsened",
"worsens",
"worser",
"worses",
"worset",
"worsets",
"worship",
"worships",
"worst",
"worsted",
"worsteds",
"worsting",
"worsts",
"wort",
"worth",
"worthed",
"worthful",
"worthier",
"worthies",
"worthily",
"worthing",
"worths",
"worthy",
"worts",
"wos",
"wost",
"wot",
"wots",
"wotted",
"wotting",
"would",
"wouldest",
"wouldst",
"wound",
"wounded",
"wounding",
"wounds",
"wove",
"woven",
"wovens",
"wow",
"wowed",
"wowing",
"wows",
"wowser",
"wowsers",
"wrack",
"wracked",
"wrackful",
"wracking",
"wracks",
"wraith",
"wraiths",
"wrang",
"wrangle",
"wrangled",
"wrangler",
"wrangles",
"wrangs",
"wrap",
"wrapped",
"wrapper",
"wrappers",
"wrapping",
"wraps",
"wrapt",
"wrasse",
"wrasses",
"wrassle",
"wrassled",
"wrassles",
"wrastle",
"wrastled",
"wrastles",
"wrath",
"wrathed",
"wrathful",
"wrathier",
"wrathily",
"wrathing",
"wraths",
"wrathy",
"wreak",
"wreaked",
"wreaker",
"wreakers",
"wreaking",
"wreaks",
"wreath",
"wreathe",
"wreathed",
"wreathen",
"wreathes",
"wreaths",
"wreathy",
"wreck",
"wreckage",
"wrecked",
"wrecker",
"wreckers",
"wreckful",
"wrecking",
"wrecks",
"wren",
"wrench",
"wrenched",
"wrenches",
"wrens",
"wrest",
"wrested",
"wrester",
"wresters",
"wresting",
"wrestle",
"wrestled",
"wrestler",
"wrestles",
"wrests",
"wretch",
"wretched",
"wretches",
"wrick",
"wricked",
"wricking",
"wricks",
"wried",
"wrier",
"wries",
"wriest",
"wriggle",
"wriggled",
"wriggler",
"wriggles",
"wriggly",
"wright",
"wrights",
"wring",
"wringed",
"wringer",
"wringers",
"wringing",
"wrings",
"wrinkle",
"wrinkled",
"wrinkles",
"wrinkly",
"wrist",
"wristier",
"wristlet",
"wrists",
"wristy",
"writ",
"writable",
"write",
"writer",
"writerly",
"writers",
"writes",
"writhe",
"writhed",
"writhen",
"writher",
"writhers",
"writhes",
"writhing",
"writing",
"writings",
"writs",
"written",
"wrong",
"wronged",
"wronger",
"wrongers",
"wrongest",
"wrongful",
"wronging",
"wrongly",
"wrongs",
"wrote",
"wroth",
"wrothful",
"wrought",
"wrung",
"wry",
"wryer",
"wryest",
"wrying",
"wryly",
"wryneck",
"wrynecks",
"wryness",
"wud",
"wurst",
"wursts",
"wurzel",
"wurzels",
"wuss",
"wusses",
"wussier",
"wussies",
"wussiest",
"wussy",
"wuther",
"wuthered",
"wuthers",
"wych",
"wyches",
"wye",
"wyes",
"wyle",
"wyled",
"wyles",
"wyling",
"wyn",
"wynd",
"wynds",
"wynn",
"wynns",
"wyns",
"wyte",
"wyted",
"wytes",
"wyting",
"wyvern",
"wyverns",
"xanthan",
"xanthans",
"xanthate",
"xanthein",
"xanthene",
"xanthic",
"xanthin",
"xanthine",
"xanthins",
"xanthoma",
"xanthone",
"xanthous",
"xebec",
"xebecs",
"xenia",
"xenial",
"xenias",
"xenic",
"xenogamy",
"xenogeny",
"xenolith",
"xenon",
"xenons",
"xerarch",
"xeric",
"xerosere",
"xeroses",
"xerosis",
"xerotic",
"xerox",
"xeroxed",
"xeroxes",
"xeroxing",
"xerus",
"xeruses",
"xi",
"xiphoid",
"xiphoids",
"xis",
"xu",
"xylan",
"xylans",
"xylem",
"xylems",
"xylene",
"xylenes",
"xylidin",
"xylidine",
"xylidins",
"xylitol",
"xylitols",
"xylocarp",
"xyloid",
"xylol",
"xylols",
"xylose",
"xyloses",
"xylotomy",
"xylyl",
"xylyls",
"xyst",
"xyster",
"xysters",
"xysti",
"xystoi",
"xystos",
"xysts",
"xystus",
"ya",
"yabber",
"yabbered",
"yabbers",
"yacht",
"yachted",
"yachter",
"yachters",
"yachting",
"yachtman",
"yachtmen",
"yachts",
"yack",
"yacked",
"yacking",
"yacks",
"yaff",
"yaffed",
"yaffing",
"yaffs",
"yager",
"yagers",
"yagi",
"yagis",
"yah",
"yahoo",
"yahooism",
"yahoos",
"yahrzeit",
"yaird",
"yairds",
"yak",
"yakitori",
"yakked",
"yakker",
"yakkers",
"yakking",
"yaks",
"yald",
"yam",
"yamalka",
"yamalkas",
"yamen",
"yamens",
"yammer",
"yammered",
"yammerer",
"yammers",
"yams",
"yamulka",
"yamulkas",
"yamun",
"yamuns",
"yang",
"yangs",
"yank",
"yanked",
"yanking",
"yanks",
"yanqui",
"yanquis",
"yantra",
"yantras",
"yap",
"yapock",
"yapocks",
"yapok",
"yapoks",
"yapon",
"yapons",
"yapped",
"yapper",
"yappers",
"yapping",
"yaps",
"yar",
"yard",
"yardage",
"yardages",
"yardarm",
"yardarms",
"yardbird",
"yarded",
"yarding",
"yardland",
"yardman",
"yardmen",
"yards",
"yardwand",
"yardwork",
"yare",
"yarely",
"yarer",
"yarest",
"yarmelke",
"yarmulke",
"yarn",
"yarned",
"yarner",
"yarners",
"yarning",
"yarns",
"yarrow",
"yarrows",
"yashmac",
"yashmacs",
"yashmak",
"yashmaks",
"yasmak",
"yasmaks",
"yatagan",
"yatagans",
"yataghan",
"yatter",
"yattered",
"yatters",
"yaud",
"yauds",
"yauld",
"yaup",
"yauped",
"yauper",
"yaupers",
"yauping",
"yaupon",
"yaupons",
"yaups",
"yautia",
"yautias",
"yaw",
"yawed",
"yawing",
"yawl",
"yawled",
"yawling",
"yawls",
"yawmeter",
"yawn",
"yawned",
"yawner",
"yawners",
"yawning",
"yawns",
"yawp",
"yawped",
"yawper",
"yawpers",
"yawping",
"yawpings",
"yawps",
"yaws",
"yay",
"yays",
"ycleped",
"yclept",
"ye",
"yea",
"yeah",
"yealing",
"yealings",
"yean",
"yeaned",
"yeaning",
"yeanling",
"yeans",
"year",
"yearbook",
"yearend",
"yearends",
"yearlies",
"yearling",
"yearlong",
"yearly",
"yearn",
"yearned",
"yearner",
"yearners",
"yearning",
"yearns",
"years",
"yeas",
"yeasayer",
"yeast",
"yeasted",
"yeastier",
"yeastily",
"yeasting",
"yeasts",
"yeasty",
"yecch",
"yecchs",
"yech",
"yechs",
"yechy",
"yeelin",
"yeelins",
"yegg",
"yeggman",
"yeggmen",
"yeggs",
"yeh",
"yeld",
"yelk",
"yelks",
"yell",
"yelled",
"yeller",
"yellers",
"yelling",
"yellow",
"yellowed",
"yellower",
"yellowly",
"yellows",
"yellowy",
"yells",
"yelp",
"yelped",
"yelper",
"yelpers",
"yelping",
"yelps",
"yen",
"yenned",
"yenning",
"yens",
"yenta",
"yentas",
"yente",
"yentes",
"yeoman",
"yeomanly",
"yeomanry",
"yeomen",
"yep",
"yerba",
"yerbas",
"yerk",
"yerked",
"yerking",
"yerks",
"yes",
"yeses",
"yeshiva",
"yeshivah",
"yeshivas",
"yeshivot",
"yessed",
"yesses",
"yessing",
"yester",
"yestern",
"yestreen",
"yet",
"yeti",
"yetis",
"yett",
"yetts",
"yeuk",
"yeuked",
"yeuking",
"yeuks",
"yeuky",
"yew",
"yews",
"yid",
"yids",
"yield",
"yielded",
"yielder",
"yielders",
"yielding",
"yields",
"yikes",
"yill",
"yills",
"yin",
"yince",
"yins",
"yip",
"yipe",
"yipes",
"yipped",
"yippee",
"yippie",
"yippies",
"yipping",
"yips",
"yird",
"yirds",
"yirr",
"yirred",
"yirring",
"yirrs",
"yirth",
"yirths",
"ylem",
"ylems",
"yo",
"yob",
"yobbo",
"yobboes",
"yobbos",
"yobs",
"yock",
"yocked",
"yocking",
"yocks",
"yod",
"yodel",
"yodeled",
"yodeler",
"yodelers",
"yodeling",
"yodelled",
"yodeller",
"yodels",
"yodh",
"yodhs",
"yodle",
"yodled",
"yodler",
"yodlers",
"yodles",
"yodling",
"yods",
"yoga",
"yogas",
"yogee",
"yogees",
"yogh",
"yoghourt",
"yoghs",
"yoghurt",
"yoghurts",
"yogi",
"yogic",
"yogin",
"yogini",
"yoginis",
"yogins",
"yogis",
"yogurt",
"yogurts",
"yoicks",
"yok",
"yoke",
"yoked",
"yokel",
"yokeless",
"yokelish",
"yokels",
"yokemate",
"yokes",
"yoking",
"yokozuna",
"yoks",
"yolk",
"yolked",
"yolkier",
"yolkiest",
"yolks",
"yolky",
"yom",
"yomim",
"yon",
"yond",
"yonder",
"yoni",
"yonic",
"yonis",
"yonker",
"yonkers",
"yore",
"yores",
"you",
"young",
"younger",
"youngers",
"youngest",
"youngish",
"youngs",
"younker",
"younkers",
"youpon",
"youpons",
"your",
"yourn",
"yours",
"yourself",
"youse",
"youth",
"youthen",
"youthens",
"youthful",
"youths",
"yow",
"yowe",
"yowed",
"yowes",
"yowie",
"yowies",
"yowing",
"yowl",
"yowled",
"yowler",
"yowlers",
"yowling",
"yowls",
"yows",
"yperite",
"yperites",
"ytterbia",
"ytterbic",
"yttria",
"yttrias",
"yttric",
"yttrium",
"yttriums",
"yuan",
"yuans",
"yuca",
"yucas",
"yucca",
"yuccas",
"yucch",
"yuch",
"yuck",
"yucked",
"yuckier",
"yuckiest",
"yucking",
"yucks",
"yucky",
"yuga",
"yugas",
"yuk",
"yukked",
"yukking",
"yuks",
"yulan",
"yulans",
"yule",
"yules",
"yuletide",
"yum",
"yummier",
"yummies",
"yummiest",
"yummy",
"yup",
"yupon",
"yupons",
"yuppie",
"yuppies",
"yups",
"yurt",
"yurta",
"yurts",
"ywis",
"zabaione",
"zabajone",
"zacaton",
"zacatons",
"zaddick",
"zaddik",
"zaddikim",
"zaffar",
"zaffars",
"zaffer",
"zaffers",
"zaffir",
"zaffirs",
"zaffre",
"zaffres",
"zaftig",
"zag",
"zagged",
"zagging",
"zags",
"zaibatsu",
"zaikai",
"zaikais",
"zaire",
"zaires",
"zamarra",
"zamarras",
"zamarro",
"zamarros",
"zamia",
"zamias",
"zamindar",
"zanana",
"zananas",
"zander",
"zanders",
"zanier",
"zanies",
"zaniest",
"zanily",
"zaniness",
"zany",
"zanyish",
"zanza",
"zanzas",
"zap",
"zapateo",
"zapateos",
"zapped",
"zapper",
"zappers",
"zappier",
"zappiest",
"zapping",
"zappy",
"zaps",
"zaptiah",
"zaptiahs",
"zaptieh",
"zaptiehs",
"zaratite",
"zareba",
"zarebas",
"zareeba",
"zareebas",
"zarf",
"zarfs",
"zariba",
"zaribas",
"zarzuela",
"zastruga",
"zastrugi",
"zax",
"zaxes",
"zayin",
"zayins",
"zazen",
"zazens",
"zeal",
"zealot",
"zealotry",
"zealots",
"zealous",
"zeals",
"zeatin",
"zeatins",
"zebec",
"zebeck",
"zebecks",
"zebecs",
"zebra",
"zebraic",
"zebras",
"zebrass",
"zebrine",
"zebroid",
"zebu",
"zebus",
"zecchin",
"zecchini",
"zecchino",
"zecchins",
"zechin",
"zechins",
"zed",
"zedoary",
"zeds",
"zee",
"zees",
"zein",
"zeins",
"zek",
"zeks",
"zelkova",
"zelkovas",
"zemindar",
"zemstva",
"zemstvo",
"zemstvos",
"zenaida",
"zenaidas",
"zenana",
"zenanas",
"zenith",
"zenithal",
"zeniths",
"zeolite",
"zeolites",
"zeolitic",
"zephyr",
"zephyrs",
"zeppelin",
"zerk",
"zerks",
"zero",
"zeroed",
"zeroes",
"zeroing",
"zeros",
"zeroth",
"zest",
"zested",
"zester",
"zesters",
"zestful",
"zestier",
"zestiest",
"zesting",
"zestless",
"zests",
"zesty",
"zeta",
"zetas",
"zeugma",
"zeugmas",
"zibeline",
"zibet",
"zibeth",
"zibeths",
"zibets",
"zig",
"zigged",
"zigging",
"ziggurat",
"zigs",
"zigzag",
"zigzags",
"zikkurat",
"zikurat",
"zikurats",
"zilch",
"zilches",
"zill",
"zillah",
"zillahs",
"zillion",
"zillions",
"zills",
"zin",
"zinc",
"zincate",
"zincates",
"zinced",
"zincic",
"zincify",
"zincing",
"zincite",
"zincites",
"zincked",
"zincking",
"zincky",
"zincoid",
"zincous",
"zincs",
"zincy",
"zineb",
"zinebs",
"zing",
"zingani",
"zingano",
"zingara",
"zingare",
"zingari",
"zingaro",
"zinged",
"zinger",
"zingers",
"zingier",
"zingiest",
"zinging",
"zings",
"zingy",
"zinkify",
"zinky",
"zinnia",
"zinnias",
"zins",
"zip",
"zipless",
"zipped",
"zipper",
"zippered",
"zippers",
"zippier",
"zippiest",
"zipping",
"zippy",
"zips",
"ziram",
"zirams",
"zircon",
"zirconia",
"zirconic",
"zircons",
"zit",
"zither",
"zithern",
"zitherns",
"zithers",
"ziti",
"zitis",
"zits",
"zizit",
"zizith",
"zizzle",
"zizzled",
"zizzles",
"zizzling",
"zlote",
"zloties",
"zloty",
"zlotych",
"zlotys",
"zoa",
"zoaria",
"zoarial",
"zoarium",
"zodiac",
"zodiacal",
"zodiacs",
"zoea",
"zoeae",
"zoeal",
"zoeas",
"zoecia",
"zoecium",
"zoftig",
"zoic",
"zoisite",
"zoisites",
"zombi",
"zombie",
"zombies",
"zombify",
"zombiism",
"zombis",
"zonal",
"zonally",
"zonary",
"zonate",
"zonated",
"zonation",
"zone",
"zoned",
"zoneless",
"zoner",
"zoners",
"zones",
"zonetime",
"zoning",
"zonk",
"zonked",
"zonking",
"zonks",
"zonula",
"zonulae",
"zonular",
"zonulas",
"zonule",
"zonules",
"zoo",
"zoochore",
"zooecia",
"zooecium",
"zoogenic",
"zooglea",
"zoogleae",
"zoogleal",
"zoogleas",
"zoogloea",
"zooid",
"zooidal",
"zooids",
"zooks",
"zoolater",
"zoolatry",
"zoologic",
"zoology",
"zoom",
"zoomania",
"zoomed",
"zoometry",
"zooming",
"zoomorph",
"zooms",
"zoon",
"zoonal",
"zoonoses",
"zoonosis",
"zoonotic",
"zoons",
"zoophile",
"zoophily",
"zoophobe",
"zoophyte",
"zoos",
"zoosperm",
"zoospore",
"zootier",
"zootiest",
"zootomic",
"zootomy",
"zooty",
"zori",
"zoril",
"zorilla",
"zorillas",
"zorille",
"zorilles",
"zorillo",
"zorillos",
"zorils",
"zoris",
"zoster",
"zosters",
"zouave",
"zouaves",
"zounds",
"zowie",
"zoysia",
"zoysias",
"zucchini",
"zwieback",
"zydeco",
"zydecos",
"zygoid",
"zygoma",
"zygomas",
"zygomata",
"zygose",
"zygoses",
"zygosis",
"zygosity",
"zygote",
"zygotene",
"zygotes",
"zygotic",
"zymase",
"zymases",
"zyme",
"zymes",
"zymogen",
"zymogene",
"zymogens",
"zymogram",
"zymology",
"zymosan",
"zymosans",
"zymoses",
"zymosis",
"zymotic",
"zymurgy",
"zyzzyva",
"zyzzyvas",
  };

  public boolean isFound(String target)
  {
    return Arrays.binarySearch(words, target) >= 0;
  }
}
