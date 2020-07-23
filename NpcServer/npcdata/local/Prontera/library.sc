//====================================================================================================
// 도서관 1
npc "prt_in" "Monster Encyclopedia" HIDDEN_NPC 168 56 4 0 0
OnClick:
	dialog "^FF0000[Monster Encyclopedia]^000000"
	dialog "This Monster Encyclopedia includes monsters of the Water, Wind and Mind characters."
	wait
	while(1)
		choose menu "Water Monsters." "Wind Monsters." "Mind Monsters." "Cancel."
		case 1
			while(1)
				choose menu "Small monsters." "Middle monsters." "Big monsters." "Cancel."
				case 1
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "1.Plankton"
					dialog "Although it looks no different to the other marine lives, it will pounce on you right away and attack you if you walk over it."
					dialog "^0099FFThis monster drops^000000: Single Cell, Garlet, Sticky Mucus, Empty Bottle."
					wait
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "2.Kukre"
					dialog "It appears to be more friendly than Thief Bugs, but actually they're just as bad. Fortunately these monsters don't attack together."
					dialog "^0099FFThis monster drops^000000: Worm Peelings, Garlet, Monster's Feed, Red Herb, Insect Feeler."
					wait
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "3.Hydra"
					dialog "Mainly found underwater, it attacks enemies above with its tentacles. It's no problem to encounter a few, but in a horde they're difficult to deal with."
					dialog "^0099FFThis monster drops^000000: Tentacle, Sticky Mucus, Meat."
					wait
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "4.Vadon"
					dialog "Its whole body is covered with a hard shell, and wonders around making ticking sounds of its two clip-like claws. Its red shells look like a tasty seafood, but it's not to be treated lightly."
					dialog "^0099FFThis monster drops^000000: Nipper, Garlet, Solid Shell, Shell."
					wait
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "5.Marina"
					dialog "Attacks enemies using its slingshot-like, white body that flexes freely. They live in cool shades around water."
					dialog "^0099FFThis monster drops^000000: Single Cell, Sticky Mucus."
					wait
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "6.Cornutus"
					dialog "Clam creature in a hard shell seeking for a relaxed life."
					dialog "^0099FFThis monster drops^000000: Conch, Scell, Solid Shell."
					wait
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "7.Magnolia"
					dialog "A monster that looks like a giant omelet. It fights back relentlessly with its pan. You will get in a serious trouble if you treat it like a cute pet."
					dialog "^0099FFThis monster drops^000000: Jellopy, Garlet, Scell."
					wait
					dialog "^FF0000[Water charactered small monster encyclopedia]^000000"
					dialog "8.Marine Sphere"
					dialog "A strange form of creature with a pinky rounded look. It looks like it's just going to explode soon."
					dialog "^0099FFThis monster drops^000000: Tendon, Detonator."
					wait
				break
				case 2
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "1.Poring"
					dialog "A small, pink, rounded cute monster. When you drop an apple, it will swallow it with blinking eyes. It swallows wooden blocks, too."
					dialog "Later, it turned out to swallow anything dropped on the ground. You gotta watch your belongings, but do not worry... It's not strong!"
					dialog "^0099FFThis monster drops^000000: Jellopy, Sticky Mucus, Apple, Empty Bottle, Red Herb."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "2.Roda Frog"
					dialog "Just a creature that never stop quacking. Just walk on it when encoutered."
					dialog "^0099FFThis monster drops^000000: Sticky Webfoot, Spawn, Green Herb, Empty Bottle."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "3.Spore"
					dialog "A monster that looks like a mushroom, found in forests or caves. Remember that! Do not eat them!"
					dialog "^0099FFThis monster drops^000000: Mushroom Spore, Red Herb, Blue Herb."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "4.Goblin"
					dialog "That little body uses various kinds of blunt weapons to attack passers-by.Because it usually wears a mask, you can't read its facial expressions. Just look like brothers of five."
					dialog "^0099FFThis monster drops^000000: Yellow Herb, Red Potion."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "5.Thara Frog"
					dialog "A strong frog that shines a red light. It also quacks all day long like every other frog."
					dialog "^0099FFThis monster drops^000000: Spawn, Scell, Sticky Webfoot."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "6.Phen"
					dialog "A lively fish with a blue body."
					dialog "^0099FFThis monster drops^000000: Fish Tail, Sharp Scale, Meat, Fin."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "7.Marse"
					dialog "A dangling-looking monster with several tentacles. It seems very tasty ,but you'd better leave it alone."
					dialog "^0099FFThis monster drops^000000: Chinese Ink, Tentacle."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "8.Obeaune"
					dialog "Its top-half has the look of a ferocious woman, and its bottom-half is a body of a fish. It is good at attacking with its long hair."
					dialog "^0099FFThis monster drops^000000: Heart of Mermaid, Fin."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "9.Sohee"
					dialog "A hatred-filled female ghost with blowing long hair. Although she looks pathetic, it turns into a horrible one when encountered ."
					dialog "^0099FFThis monster drops^000000: Long Hair, Red Potion."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "10.Marc"
					dialog "A shell-kind of marine monster found in the waters. Its face looks just like a horse, but don't ever try to ride on it!"
					dialog "^0099FFThis monster drops^000000: Gill, Fin."
					wait
					dialog "^FF0000[Water charactered middle monster encyclopedia]^000000"
					dialog "11.Deviace"
					dialog "A small fish with a large mouth. It seems to be holding something in its mouth. It is powerful."
					dialog "^0099FFThis monster drops^000000: Tooth of Ancient Fish, Lip of Ancient Fish."
					wait
				break
				case 3
					dialog "^FF0000[Water charactered big monster encyclopedia]^000000"
					dialog "1.Ambernite"
					dialog "A snail-like monster. Its hard shells keep its defense strong. It has powerful strength as well, but you don't have to worry, because it moves very slowly and you can evade its attacks easily."
					dialog "^0099FFThis monster drops^000000: Snail's Shell, Garlet, Shell, Solid Shell."
					wait
					dialog "^FF0000[Water charactered big monster encyclopedia]^000000"
					dialog "2.Sword Fish"
					dialog "A fish with a spear-looking nose, bulging eyes that looks so funny. But it is actually quite dangerous."
					dialog "^0099FFThis monster drops^000000: Sharp Scale, Gill."
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 2
			while(1)
				choose menu "Small monsters" "Middle monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Wind Charactered Small Monster Encyclopedia]^000000"
					dialog "1.Chonchon"
					dialog "A monster which is a kind of fly. It is not powerful, but can be very irritating with its constant humming. Make sure you dispose of it if you see any of them."
					dialog "^0099FFThis monster drops^000000: Shell, Jellopy, Wing of Fly."
					wait
					dialog "^FF0000[Wind Charactered Small Monster Encyclopedia]^000000"
					dialog "2.Hornet"
					dialog "Usually they keep it a faith to work hard. But when they are interrupted, they get together to attack their enemy. Be always cautious!"
					dialog "^0099FFThis monster drops^000000: Bee Sting, Jellopy, Green Herb."
					wait
					dialog "^FF0000[Wind Charactered Small Monster Encyclopedia]^000000"
					dialog "3.Creamy"
					dialog "A monster with beautiful wings. If you are still low leveled, then don't go bother it. It attacks with its wings, and you can get hurt easily. This is something that is stronger than you think. Be careful!"
					dialog "^0099FFThis monster drops^000000: Powder of Butterfly, Honey, Wing of Butterfly, Flower."
					wait
					dialog "^FF0000[Wind Charactered Small Monster Encyclopedia]^000000"
					dialog "4.Stainer"
					dialog "It has a really small, graceful round shell. Don't ever look down of them because they have small and lovely bodies.. Because they are strong and they can detect magic spells.. Be careful!"
					dialog "^0099FFThis monster drops^000000: Colorful Shell, Garlet, Shell, Solid Shell."
					wait
					dialog "^FF0000[Wind Charactered Small Monster Encyclopedia]^000000"
					dialog "5.Steel Chonchon"
					dialog "It looks like a Chonchon. However, It is green and swallows everything dropped on the ground. They are strong and good at group work. So, you get ahead of them and pick up things from the ground right away."
					dialog "^0099FFThis monster drops^000000: Garlet, Shell, Solid Shell."
					wait
					dialog "^FF0000[Wind Charactered Small Monster Encyclopedia]^000000"
					dialog "6.Dustiness"
					dialog "Be cautious not to attack without any plan. They fly and they have high probability of dodge."
					dialog "^0099FFThis monster drops^000000: Powder of Butterfly, Wing of Butterfly, Insect Feeler, Red Herb."
					wait
					dialog "^FF0000[Wind Charactered Small Monster Encyclopedia]^000000"
					dialog "7.Hunter Fly"
					dialog "A troublesome flying insect of bloody red. Flee from them if you can!"
					dialog "^0099FFThis monster drops^000000: Solid Shell, Zargon."
					wait
				break
				case 2
					dialog "^FF0000[Wind Charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Condor"
					dialog "A funny vulture monster with bald hair. It teams up with one another when attacked, So, don't take them lightly!"
					dialog "^0099FFThis monster drops^000000: Talon, Arrow, Meat, Feather of Birds."
					wait
					dialog "^FF0000[Wind Charactered Middle Monster Encyclopedia]^000000"
					dialog "2.Kobold 1"
					dialog "A wolf-like small monster. But, it is highly intelligent and knows how to use items. Despite of it small body, it is very strong and aggressive. They seem to be 3 brothers."
					dialog "^0099FFThis monster drops^000000: Cobold Hair, Zargon, Orange Potion."
					wait
					dialog "^FF0000[Wind Charactered Middle Monster Encyclopedia]^000000"
					dialog "3.Petit"
					dialog "Small and cute dragon monsters. There are crawling type and the flying type."
					dialog "^0099FFThis monster drops^000000: Dragon Canine, Dragon Train, Zargon."
					wait
				break
				case 3
					dialog "^FF0000[Wind Charactered Big Monster Encyclopedia]^000000"
					dialog "4.Joker"
					dialog "A giant card with a horrible female monster drawn on both sides will be greeting you."
					dialog "^0099FFThis monster drops^000000: Spiky Heel."
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 3
			while(1)
				choose menu "Small monsters" "Middle monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Mind Charactered Small Monster Encyclopedia]^000000"
					dialog "1.Whisper"
					dialog "A piece of live moving cloth. Makes people feel scary."
					dialog "^0099FFThis monster drops^000000: Transparent Cloth."
					wait
					dialog "^FF0000[Mind Charactered Small Monster Encyclopedia]^000000"
					dialog "2.Marionette"
					dialog "A wooden doll tied with strings all over, unable to move freely. A spell was cast on it that brought life to it, and it became a monster."
					dialog "^0099FFThis monster drops^000000: Golden Hair, Wooden Block."
					wait
				break
				case 2
					dialog "^FF0000[Mind Charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Eggyra"
					dialog "A monster that wanders around making 'Patapata' noises. Its tough looking eyes might make you feel dreadful. But, it's not that strong as it appears!"
					dialog "^0099FFThis monster drops^000000: Scell, Sticky Mucus, Red Herb."
					wait
				break
				case 3
					dialog "^FF0000[Mind Charactered Big Monster Encyclopedia]^000000"
					dialog "1.Nightmare"
					dialog "A strong horse whose entire body shines aura of purple light."
					dialog "^0099FFThis monster drops^000000: Horse Shoe, Blue Herb."
					wait
					dialog "^FF0000[Mind Charactered Big Monster Encyclopedia]^000000"
					dialog "3.Medusa"
					dialog "It has hair of snakes. It is told that once you look at her eyes, you turn into a stone statue."
					dialog "^0099FFThis monster drops^000000: Head of Medusa, Slender Snake, White Potion."
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 4
			close
			exitwhile
		break
		endchoose
	endwhile
return

npc "prt_in" "Monster Encyclopedia" HIDDEN_NPC 159 56 4 0 0
OnClick:
	dialog "^FF0000[Monster Encyclopedia]^000000"
	dialog "This Monster Encyclopedia includes Earth, Fire and Non-charactered monsters."
	wait
	while(1)
		choose menu "Earth Monsters" "Fire Monsters" "Non-charactered Monsters" "Cancel"
		case 1
			while(1)
				choose menu "Small monsters" "Middel monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "1.Fabre"
					dialog "A lava monster before it turns into the Creamy. A cute little monster that moves itself by twisting its body. It is also a part of the materials needed for making the Bunny Band."
					dialog "We can abstract Feather from them, and that's why they are usually slaughtered in massacre."
					dialog "^0099FFThis monster drops^000000: Fluff, Feather, Green Herb, Clover."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "2.Pupa"
					dialog "A chrysalis monster before turn into a Creamy. It never attacks humans. Those are Novice's favorite monsters."
					dialog "^0099FFThis monster drops^000000: chrysalis, Sticky Mucus."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "3.Martin"
					dialog "Wears a safety helmet and looks around all the time. A rather funny monster."
					dialog "^0099FFThis monster drops^000000: Moustache of Mole, Nail of Mole."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "3.Savage Babe"
					dialog "A small pink baby of savage monster. Although it has a small body, it makes gruning noises around everywhere."
					dialog "^0099FFThis monster drops^000000: Animal's Skin, Meat, Arrow, Feather."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "4.Andre"
					dialog "A kind of working ant. They are very dilligent. They help each other to save everything in their storage."
					dialog "^0099FFThis monster drops^000000: Worm Peelings, Garlet, Sticky Mucus, Shell."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "5.Coco"
					dialog "Small vicious looking monster, often carrying an Acorn. Go beat them if you don't like its staring at you."
					dialog "^0099FFThis monster drops^000000: Acorn, Fluff, Animal's Skin, Sweet Potato."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "6.Piere"
					dialog "Also a kind of working ant, looks very dilligent. They look a like as other working ants. It might be confusing. You can see that same kinds of working ants get together."
					dialog "^0099FFThis monster drops^000000: Worm Peelings, Garlet, Sticky Mucus, Shell."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "7.Smokie"
					dialog "Always does gymnastics. It sometimes tries to imitate other objects using its Raccoon Leaf, but always fails. It used to have a habit of collecting stuff, but seems to have given it up."
					dialog "^0099FFThis monster drops^000000: Raccoon Leaf, Animal's Skin, Sweet Potato."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "8.Deniro"
					dialog "A type of working ant, also often moves around in groups"
					dialog "^0099FFThis monster drops^000000: Worm Peelings, Garlet, Sticky Mucus, Shell."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "9.Yoyo"
					dialog "A pink monkey monster. Swallows everything on the ground and very quick and swift. Keep in mind that they are strongly united."
					dialog "^0099FFThis monster drops^000000: Yoyo Tail, Banana, Yellow Herb, Animal's Skin."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "10.Vitata"
					dialog "Its body is covered with honey and looks more bloated compared to other ants. The fat looking makes people feel pity for it."
					dialog "^0099FFThis monster drops^000000: Worm Peelings, Scell, Honey."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "11.Caramel"
					dialog "The caramel has cute tiny spikes all over its petite body. If you touch it, it will get furious."
					dialog "^0099FFThis monster drops^000000: Porcupine Spike, Animal's Skin."
					wait
					dialog "^FF0000[Earth Charactered Small Monster Encyclopedia]^000000"
					dialog "12.Giearth"
					dialog "A very small and very old elf. Mainly found in caves collecting ores. You should give him full respect."
					dialog "^0099FFThis monster drops^000000: Elder Pixie's Beard."
					wait
				break
				case 2
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Wilow"
					dialog "Huge dead trees acquired life again after several hundred years and became Wilow monster. Makes a sound while it moves, and it gives people dreadful feeling."
					dialog "^0099FFThis monster drops^000000: Tree Root, Wooden Block, Red Herb, Sweet Potato."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "2.Rocker"
					dialog "Always playing a violin, it seems to live a very peaceful life."
					dialog "^0099FFThis monster drops^000000: Grasshopper's Leg, Jellopy."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "3.Mandragora"
					dialog "It doesn't move at all, but shoots out stems from the ground to attack others. And, it looks terrible as well. Its way of attacks is quite annoying."
					dialog "^0099FFThis monster drops^000000: Stem, Green Herb, Shoot."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "4.Wolf"
					dialog "Wolves have blue bristle and lead a nomad life. They are well know for their strong unity. So, if you happen to bother them, that's gonna be your last day! Just get out of the place!"
					dialog "^0099FFThis monster drops^000000: Claw of Wolves, Meat, Monster's Feed, Animal's Skin."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "5.Snake"
					dialog "A cyan snake living in the forest or desert. Although it is not poisonous, it makes people feel unease. Be careful."
					dialog "^0099FFThis monster drops^000000: Scale of Snakes, Red Herb."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "6.Horn"
					dialog "Has a huge jaw which makes cutting sounds. Unlike what it looks, it's very gentle animal!"
					dialog "^0099FFThis monster drops^000000: Horn, Shell, Solid Shell."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "7.Orc Warrior"
					dialog "Warriors of the Orc tribe seems to take pride in themselves."
					dialog "^0099FFThis monster drops^000000: Orcish Voucher."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "8.Hode"
					dialog "A huge earthworm... I think that explains all. Found mainly in desert ,normally hides itself underground"
					dialog "^0099FFThis monster drops^000000: Earthworm Peeling, Sticky Mucus."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "9.Mantis"
					dialog "A monster that runs around waving a small fan everyday."
					dialog "^0099FFThis monster drops^000000: Limb of Mantis, Scell, Solid Shell, Red Potion."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "10.Savage"
					dialog "A wild pig that often makes a 'dadadada' noise. Completely different from its infant years, it now has huge canines which is quite horrible-looking."
					dialog "^0099FFThis monster drops^000000: Wild Boar's Mane, Animal's Skin."
					wait
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "11.Petit"
					dialog "Small and cute dragon-like monster. There are two types, the flying one and the crawling one"
					dialog "^0099FFThis monster drops^000000: Dragon Canine, Dragon Train, Zargon."
					wait
				break
				case 3
					dialog "^FF0000[Earth Charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Worm Tail"
					dialog "A cute little monster of light green. It has a long and thin spike on its back. Normally very gentle, but it attacks with its spike when attacked."
					dialog "^0099FFThis monster drops^000000: Pointed Scale,Yellow Herb"
					wait
					dialog "^FF0000[Earth Charactered Big Monster Encyclopedia]^000000"
					dialog "2.Muka"
					dialog "A cute cactus-like monster found in the desert. It jumps around threatening others. But, nobody cares."
					dialog "^0099FFThis monster drops^000000: Cactus Needle, Empty Bottle, Green Herb, Red Herb."
					wait
					dialog "^FF0000[Earth Charactered Big Monster Encyclopedia]^000000"
					dialog "3.Bigfoot"
					dialog "A silly looking big bear. This dull looking bear moves very fast when it gets furious."
					dialog "^0099FFThis monster drops^000000: Bear's Foot, Animal's Skin, Sweet Potato."
					wait
					dialog "^FF0000[Earth Charactered Big Monster Encyclopedia]^000000"
					dialog "4.Flora"
					dialog "A man-eating flower with a big mouth. It can't move. However, when something approaches the flower, it rushes to the bait like a hungry beast."
					dialog "^0099FFThis monster drops^000000: Blossom of Maneater, Stem."
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 2
			while(1)
				choose menu "Small monsters" "Middel monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Fire Charactered Small Monster Encyclopedia]^000000"
					dialog "1.Picky"
					dialog "A cute chick-like monster before Pecopeco. It's actually quite amazing that something so small will grow up to Pecopeco."
					dialog "Some pickies wear a piece of egg shell. These pickies are stronger than the normal pickies."
					dialog "^0099FFThis monster drops^000000: Feather of Birds, Feather, Red Herb, Milk."
					wait
					dialog "^FF0000[Fire Charactered Small Monster Encyclopedia]^000000"
					dialog "2.Desert Wolf B"
					dialog "Babies of small Desert Wolf. This small animal tries to scare people away by barking loud!"
					dialog "If you want to touch them because they are cute, you need to look around first. Even though baby wolves often fight each other, Adult Desert wolves never allow their babies to be touched by anyone."
					dialog "^0099FFThis monster drops^000000: Animal's Skin, Meat."
					wait
					dialog "^FF0000[Fire Charactered Small Monster Encyclopedia]^000000"
					dialog "3.Horong"
					dialog "A purple flame that almost seems to be alive. Gives people a sad feeling, and often provokes fight from people."
					dialog "^0099FFThis monster drops^000000: Stone Heart, Zargon, Fire Arrow."
					wait
				break
				case 2
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Drops"
					dialog "It looks like a Poring. However, it can be found in the desert and has the color of scarlet. Just like a Poring, it eats away anything."
					dialog "It seems to be stronger than Poring."
					dialog "^0099FFThis monster drops^000000: Jellopy, Sticky Mucus, Apple, Empty Bottle, Red Herb."
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "2.Elder Wilow"
					dialog "The Origin of this monster is just like Wilow. But, this is older one and red. Like Wilow, It also has the same horrible image."
					dialog "^0099FFThis monster drops^000000: Resin,Wooden Block,Sweet Potato"
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "3.Metaller"
					dialog "A grasshopper which is more evolved than Rocker. It usually lives in the desert, and its color is brown. Although it seems to do nothing and just hang out, it takes away anything dropped on the ground."
					dialog "^0099FFThis monster drops^000000: Boody Red,Grasshopper's Leg,Scell,Shell"
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "4.Zerom"
					dialog "A slave who was working crazily. He is very skinny, He is wandering in the Sphinx,carrying a big box on the back.."
					dialog "^0099FFThis monster drops^000000: G-Strings"
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "5.Scorpion"
					dialog "Scorpion spreaded over the Desert.It is dangerous as much as its beautiful colour.Watch out its sharp tail."
					dialog "^0099FFThis monster drops^000000: Scorpion's Tail,Green Herb,Yellow Herb"
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "6.Desert Wolf"
					dialog "Wolf commonly found in the desert,which is stronger than a Forest one. Take a look around before doing attacks,because Wolf tends to be cooperative each other!"
					dialog "^0099FFThis monster drops^000000: Animal's Skin,Mink Coat,Meat,Claw of Wolves"
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "7.Frilldora"
					dialog "Lizard which has a Unique neck.Looks a bit funny but is very Strong unlike its appearance."
					dialog "^0099FFThis monster drops^000000: Lizard Scruff,Reptile Tongue,Red Potion,Zargon"
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "8.Kobold 3"
					dialog "mall monster looks like a Wolf but it is smart enough to handle several tools. It is hostile and strong unlike its appearance. All Cobolds seem to be brothers."
					dialog "^0099FFThis monster drops^000000: Kobold Hair,Zargon,Orange Potion"
					wait
					dialog "^FF0000[Fire Charactered Middle Monster Encyclopedia]^000000"
					dialog "9.Jakk"
					dialog "Quite Odd monster in a nice suit,but with a pumpkin head.It looks funny but changes the attitude fiercely when attacks someone."
					dialog "^0099FFThis monster drops^000000: Pumpkin Head,Zargon"
					wait
				break
				case 3
					dialog "^FF0000[Fire Charactered Big Monster Encyclopedia]^000000"
					dialog "1.Pecopeco"
					dialog "Nowadays peco peco is popular as a vehicle for knights. They live in the Desert or Forest and also very cooperative."
					dialog "^0099FFThis monster drops^000000: Bill of Birds,Yellow Herb,Red Herb"
					wait
					dialog "^FF0000[Fire Charactered Big Monster Encyclopedia]^000000"
					dialog "2.Marduk"
					dialog "Unknown monster wearing Catholic uniform and looking serious."
					dialog "^0099FFThis monster drops^000000: Flame Heart"
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 3
			while(1)
				choose menu "Small monsters" "Middel monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Non-charactered Small Monster Encyclopedia]^000000"
					dialog "1.Lunatic"
					dialog "plump and shaggy monster shaped like a Rabbit. However, it won't give you a 'Bunny Band'."
					dialog "^0099FFThis monster drops^000000: Clover,Feather,Carrot,Red Herb"
					wait
					dialog "^FF0000[Non-charactered Small Monster Encyclopedia]^000000"
					dialog "2.Pecopeco Egg"
					dialog "Egg of Peco Peco.It is so tiny that doesn't look like an egg of Big Bird. Novice people love to Crack it because it doesn't attack at all."
					dialog "^0099FFThis monster drops^000000: Shell,Red Potion,Empty Bottle"
					wait
					dialog "^FF0000[Non-charactered Small Monster Encyclopedia]^000000"
					dialog "3.Ant Egg"
					dialog "Simply an Ant Egg."
					dialog "^0099FFThis monster drops^000000: Shell,Jellopy,Sticky Mucus,Empty Bottle"
					wait
					dialog "^FF0000[Non-charactered Small Monster Encyclopedia]^000000"
					dialog "2.Baby Thief Bug"
					dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds eat everything on the ground as well.They are sorted into 3 kinds by the Size and Colour."
					dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy"
					wait
				break
				case 2
					dialog "^FF0000[Non-charactered Middle Monster Encyclopedia]^000000"
					dialog "Unfortunately there is no medium monster of Neutral property which has been discovered so far."
					wait
				break
				case 3
					dialog "^FF0000[Non-charactered Big Monster Encyclopedia]^000000"
					dialog "1.Golem"
					dialog "A live Stone which has spell-bound by Black Magic.Its gigantic body makes its moving slow. Detects Magic Spell Casting."
					dialog "^0099FFThis monster drops^000000: Scell"
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 4
			close
			exitwhile
		break
		endchoose
	endwhile
return

npc "prt_in" "Monster Encyclopedia" HIDDEN_NPC 161 50 4 0 0
OnClick:
	dialog "^FF0000[Monster Encyclopedia]^000000"
	dialog "This is a Monster encyclopaedia including Monsters of Dark,Poison and Undead Property!"
	wait
	while(1)
		choose menu "Monster of Dark Property" "Monster of Poison Property" "Monster of Undead Property" "Cancel"
		case 1
			while(1)
				choose menu "Small monsters" "Middel monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Dark-charactered Small Monster Encyclopedia]^000000"
					dialog "1.Thief Bug Egg"
					dialog "Egg of Filthy Bug. Let's cut off the evil at its root."
					dialog "^0099FFThis monster drops^000000: chrysalis,Sticky Mucus"
					wait
					dialog "^FF0000[Dark-charactered Small Monster Encyclopedia]^000000"
					dialog "2.Farmiliar"
					dialog "Bat of violet. Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
					dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
					wait
					dialog "^FF0000[Dark-charactered Small Monster Encyclopedia]^000000"
					dialog "3.Tarou"
					dialog "Little mouse of white. It is squicking very loudly in the Dead Pit or the Prontera Culvert."
					dialog "^0099FFThis monster drops^000000: Rat Tail,Animal's Skin,Feather,Monster's Feed"
					wait
					dialog "^FF0000[Dark-charactered Small Monster Encyclopedia]^000000"
					dialog "4.Drainliar"
					dialog "Freaking Bloody bat with a might."
					dialog "^0099FFThis monster drops^000000: Tooth of Bat,Red Herb"
					wait
					dialog "^FF0000[Dark-charactered Small Monster Encyclopedia]^000000"
					dialog "5.Dokebi"
					dialog "Korean Traditional Ghost with Dark Skin. It looks so cute and has a small horn on the head."
					dialog "^0099FFThis monster drops^000000: Dokkaebi Horn"
					wait
					dialog "^FF0000[Dark-charactered Small Monster Encyclopedia]^000000"
					dialog "2.Deviruchi"
					dialog "Little evil creature,which carries a cute tripod fork with."
					dialog "^0099FFThis monster drops^000000: Petite Diablo's Horn,Petite Diablo's Wing,Zargon"
					wait
				break
				case 2
					dialog "^FF0000[Dark-charactered Middle Monster Encyclopedia]^000000"
					dialog "8.Female Thief Bug"
					dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds eat everything on the ground as well. They are sorted into 3 kinds by the Size and Colour."
					dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy,Garlet,Insect Feeler"
					wait
					dialog "^FF0000[Dark-charactered Middle Monster Encyclopedia]^000000"
					dialog "4.Male Thief Bug"
					dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds eat everything on the ground as well. They are sorted into 3 kinds by the Size and Colour."
					dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy,Garlet.Insect Feeler,Yellow Herb"
					wait
					dialog "^FF0000[Dark-charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Matyr"
					dialog "A black monster which looks like a crazy dog."
					dialog "^0099FFThis monster drops^000000: Monster's Feed,Animal's Skin"
					wait
					dialog "^FF0000[Dark-charactered Middle Monster Encyclopedia]^000000"
					dialog "2.Zenorc"
					dialog "Mutent Orc with a small and short build.It moves around using both hands and feet. It owns High AGI stat,so that it passes off almost every attack."
					dialog "^0099FFThis monster drops^000000: Tooth of Zenorc,Sticky Mucus,Yellow Potion"
					wait
					dialog "^FF0000[Dark-charactered Middle Monster Encyclopedia]^000000"
					dialog "3.Requiem"
					dialog "It seems like an Ancient Slave carrying a heavy Coffin on the back."
					dialog "^0099FFThis monster drops^000000: Old Blue Box"
					wait
					dialog "^FF0000[Dark-charactered Middle Monster Encyclopedia]^000000"
					dialog "4.Bathory"
					dialog "Witch with a big wen on the nose. She rides on her magic broom flying around in the air."
					dialog "^0099FFThis monster drops^000000: Starsand of Witch"
					wait
				break
				case 3
					dialog "^FF0000[Dark-charactered Big Monster Encyclopedia]^000000"
					dialog "1.Isis"
					dialog "A monster whose top-half is a woman and the bottom is a big snake. Her nail is quite a menace."
					dialog "^0099FFThis monster drops^000000: Scales Shell,Shining Scales"
					wait
					dialog "^FF0000[Dark-charactered Big Monster Encyclopedia]^000000"
					dialog "3.Raydric"
					dialog "Ghost Knight of misfortune with heavy armors."
					dialog "^0099FFThis monster drops^000000: Elunium,Patriotism Marks"
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 2
			while(1)
				choose menu "Small monsters" "Middel monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Poison-charactered Small Monster Encyclopedia]^000000"
					dialog "Unfortunately there is no small monster of Poison Property which has been discovered so far."
					wait
				break
				case 2
					dialog "^FF0000[Poison-charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Poporing"
					dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
					dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
					wait
					dialog "^FF0000[Poison-charactered Middle Monster Encyclopedia]^000000"
					dialog "2.Poison Spore"
					dialog "Poisonous Spore in Violet.Besides,it tends to attack haphazardly if anybody gets near."
					dialog "^0099FFThis monster drops^000000: Mushroom Spore,Green Herb"
					wait
					dialog "^FF0000[Poison-charactered Middle Monster Encyclopedia]^000000"
					dialog "3.Kobold 2"
					dialog "Small monster looks like a Wolf but it is smart enough to handle several tools. It is hostile and strong unlike its appearance. All Cobolds seem to be brothers."
					dialog "^0099FFThis monster drops^000000: Kobold Hair,Zargon,Orange Potion"
					wait
					dialog "^FF0000[Poison-charactered Middle Monster Encyclopedia]^000000"
					dialog "4.Side Winder"
					dialog "Horrendous Snake of Dark colour."
					dialog "^0099FFThis monster drops^000000: Shining Scales,Zargon,Poisonous Canine,Scale of Snakes"
					wait
				break
				case 3
					dialog "^FF0000[Poison-charactered Big Monster Encyclopedia]^000000"
					dialog "1.Argos"
					dialog "Big Spider of Dark colour.It often attacks passangers who intend to go over Mt.Mjornir. Be cautious of Argos,if you are one of those passangers."
					dialog "^0099FFThis monster drops^000000: Spiderweb,Scell,Short Leg,Green Herb,Yellow Herb"
					wait
					dialog "^FF0000[Poison-charactered Big Monster Encyclopedia]^000000"
					dialog "2.Argiope"
					dialog "Monster crawling around with several articular legs."
					dialog "^0099FFThis monster drops^000000: Short Leg,Zargon,Green Herb"
					wait
					dialog "^FF0000[Poison-charactered Big Monster Encyclopedia]^000000"
					dialog "4.Myst"
					dialog "Mist-like Monster."
					dialog "^0099FFThis monster drops^000000: Wooden Block.Gas Mask"
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 3
			while(1)
				choose menu "Small monsters" "Middel monsters" "Big monsters" "Cancel"
				case 1
					dialog "^FF0000[Undead-Charactered Small Monster Encyclopedia]^000000"
					dialog "Unfortunately there is no small monster of Undead Property which has been discovered so far."
					wait
				break
				case 2
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "1.Zombie"
					dialog "Bad Case of the Dead which has been reborn as a Walking Corpse by Back magic.Let's lead it to Nirvana."
					dialog "^0099FFThis monster drops^000000: Decayed Nail,Sticky Mucus,Horrendous Mouth"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "2.Megalodon"
					dialog "Skeleton Fish having spooky empty eye-holes."
					dialog "^0099FFThis monster drops^000000: Rotten Scale,Skel Bone"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "3.Orc Zombie"
					dialog "Corpes of the Orc which has been given a new life by Black magic."
					dialog "^0099FFThis monster drops^000000: Nail of Orc,Sticky Mucus"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "4.Pirate Skel"
					dialog "Walking Corpse of a Pirate which had ordered all over the Sea."
					dialog "^0099FFThis monster drops^000000: Skel Bone"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "5.Orc Skeleton"
					dialog "Ancient Living Skeleton of the Orc which had been buried for a long time.It has Great Power as well as the period of being buried."
					dialog "^0099FFThis monster drops^000000: Orcish Cuspid,Green Potion"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "6.Soldier Skeleton"
					dialog "Skeleton holding 2 swords on both grips,attacks fast.One of the dangerous monsters in the Cave."
					dialog "^0099FFThis monster drops^000000: Skel Bone,Red Potion"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "7.Munak"
					dialog "Pretty-looking Female corpse which had been frozen for a long time.She looks like holding a long story deep inside, the story people want to know about.Anyway Don't give her a break,she'll apply strong damages on you."
					dialog "^0099FFThis monster drops^000000: Danggie,Munak Turban"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "8.Skel Worker"
					dialog "Walking Skeletion which was dead in a mine."
					dialog "^0099FFThis monster drops^000000: Iron,Lantern"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "9.Archer Skeleton"
					dialog "It seems to be an expert of bow when it was alive. It'll come to attack in no time when somebody gets inside of its range."
					dialog "^0099FFThis monster drops^000000: Skel Bone,Fire Arrow,Red Potion"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "10.Mummy"
					dialog "Walking Corpse with a bandage all around the body.It smells so bad because its body is still on the decomposed stage."
					dialog "^0099FFThis monster drops^000000: Rotten Bandage"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "11.Verit"
					dialog "Dog with a bandage all around the body which was dead once before.It tends to eat everything dropped on the ground."
					dialog "^0099FFThis monster drops^000000: Immortal Hear,Zargon,Rotten Bandage"
					wait
					dialog "^FF0000[Undead-Charactered Middle Monster Encyclopedia]^000000"
					dialog "12.Ghoul"
					dialog "Similar as Zombie but much more stronger. Yet very slow, you'd better run for your life when happen to meet this thing."
					dialog "^0099FFThis monster drops^000000: Horrendous Mouth"
					wait
				break
				case 3
					dialog "^FF0000[Undead-Charactered Big Monster Encyclopedia]^000000"
					dialog "3.Evil Druid"
					dialog "You'll shudder even once looking at it."
					dialog "^0099FFThis monster drops^000000: Amulet,White Herb"
					wait
				break
				case 4
					close
					exitwhile
				break
				endchoose
			endwhile
		break
		case 4
			close
			exitwhile
		break
		endchoose
	endwhile
return

//====================================================================================================
// 도서관 2
npc "prt_in" "Monster Encyclopedia" HIDDEN_NPC 172 96 4 0 0
OnClick:
	dialog "^FF0000[Dungeon Monster Encyclopedia]^000000"
	dialog "This is an encyclopaedia describing monsters living in Dungeons."
	wait
	choose menu "Ant Hell" "Geffen Tower" "Sphinx Dungeon" "Cancel"
	case 1
		while(1)
			choose menu "1F" "2F" "Cancel"
			case 1
				dialog "^FF0000[Ant Hell 1F Monster Encyclopedia]^000000"
				dialog "1.Ant Egg"
				dialog "Simply an ant egg."
				dialog "^0099FFThis monster drops^000000: Shell,Jellopy,Sticky Mucus,Empty Bottle"
				wait
				dialog "^FF0000[Ant Hell 1F Monster Encyclopedia]^000000"
				dialog "2.Andre"
				dialog "A kind of Worker Ants,they are very diligent in their work.They gather everything to save a sufficient stock and are well-coope"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Garlet,Sticky Mucus,Shell"
				wait
				dialog "^FF0000[Ant Hell 1F Monster Encyclopedia]^000000"
				dialog "3.Piere"
				dialog "A kind of Work Ants,seems to be very diligent.Its appearance is similar with other Ants,but you can easily distinguish them fro"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Garlet,Sticky Mucus,Shell"
				wait
				dialog "^FF0000[Ant Hell 1F Monster Encyclopedia]^000000"
				dialog "4.Deniro"
				dialog "A kind of Work Ants, tend to group in a same kind as well as other ants."
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Garlet,Sticky Mucus,Shell"
				wait
				dialog "^FF0000[Ant Hell 1F Monster Encyclopedia]^000000"
				dialog "5.Vitata"
				dialog "Work Ants in charge of storing honey inside the body for emergency.It is a little pathetic to see their chubby tummy filled with Honey."
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Scell,Honey"
				wait
				dialog "^FF0000[Ant Hell 1F Monster Encyclopedia]^000000"
				dialog "6.Giearth"
				dialog "Small old elf. Usually lives in Caves to gather Ores.Even though he is short, actually an adult. Show your respect to him."
				dialog "^0099FFThis monster drops^000000: Elder Pixie's Beard"
				wait
			break
			case 2
				dialog "^FF0000[Ant Hell 2F Monster Encyclopedia]^000000"
				dialog "1.Ant Egg"
				dialog "Simply an ant egg."
				dialog "^0099FFThis monster drops^000000: Shell,Jellopy,Sticky Mucus,Empty Bottle"
				wait
				dialog "^FF0000[Ant Hell 2F Monster Encyclopedia]^000000"
				dialog "2.Andre"
				dialog "A kind of Worker Ants,they are very diligent in their work.They gather everything to save a sufficient stock and are well-coope"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Garlet,Sticky Mucus,Shell"
				wait
				dialog "^FF0000[Ant Hell 2F Monster Encyclopedia]^000000"
				dialog "3.Piere"
				dialog "A kind of Work Ants,seems to be very diligent.Its appearance is similar with other Ants,but you can easily distinguish them fro"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Garlet,Sticky Mucus,Shell"
				wait
				dialog "^FF0000[Ant Hell 2F Monster Encyclopedia]^000000"
				dialog "4.Deniro"
				dialog "A kind of Work Ants, tend to group in a same kind as well as other ants"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Garlet,Sticky Mucus,Shell"
				wait
				dialog "^FF0000[Ant Hell 2F Monster Encyclopedia]^000000"
				dialog "5.Vitata"
				dialog "Work Ants in charge of storing honey inside the body for emergency.It is a little pathetic to see their chubby tummy filled wit"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Scell,Honey"
				wait
				dialog "^FF0000[Ant Hell 2F Monster Encyclopedia]^000000"
				dialog "6.Giearth"
				dialog "Small old elf. Usually lives in Caves to gather Ores.Even though he is short, but actually an adult.Show your respect to him."
				dialog "^0099FFThis monster drops^000000: Elder Pixie's Beard"
				wait
				dialog "^FF0000[Ant Hell 2F Monster Encyclopedia]^000000"
				dialog "7.Phreeoni"
				dialog "A bastard with a huge creepy tongue.Extremely strong Monster rarely seen around."
				dialog "^0099FFThis monster drops^000000: Thin 'n Long Tongue,Jaws of Ant"
				wait
			break
			case 3
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 2
		while(1)
			choose menu "1F" "2F" "3F" "4F" "Cancel"
			case 1
				dialog "^FF0000[Geffen Tower 1F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Geffen Tower 1F Monster Encyclopedia]^000000"
				dialog "2.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
				dialog "^FF0000[Geffen Tower 1F Monster Encyclopedia]^000000"
				dialog "3.Dustiness"
				dialog "This monster owns high dodge rate because it flies. Need to be cautious if you want to attack."
				dialog "^0099FFThis monster drops^000000: Powder of Butterfly,Wing of Butterfly,Insect Feeler,Red Herb"
				wait
				dialog "^FF0000[Geffen Tower 1F Monster Encyclopedia]^000000"
				dialog "4.Poison Spore"
				dialog "Poisonous Spore in Violet.Besides,it tends to attack haphazardly if anybody gets near."
				dialog "^0099FFThis monster drops^000000: Mushroom Spore,Green Herb"
				wait
			break
			case 2
				dialog "^FF0000[Geffen Tower 2F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Geffen Tower 2F Monster Encyclopedia]^000000"
				dialog "2.Dustiness"
				dialog "This monster owns high dodge rate because it flies. Need to be cautious if you want to attack."
				dialog "^0099FFThis monster drops^000000: Powder of Butterfly,Wing of Butterfly,Insect Feeler,Red Herb"
				wait
				dialog "^FF0000[Geffen Tower 2F Monster Encyclopedia]^000000"
				dialog "3.Poison Spore"
				dialog "Poisonous Spore in Violet.Besides,it tends to attack haphazardly if anybody gets near."
				dialog "^0099FFThis monster drops^000000: Mushroom Spore,Green Herb"
				wait
				dialog "^FF0000[Geffen Tower 2F Monster Encyclopedia]^000000"
				dialog "4.Argos"
				dialog "Big Spider of black.It often attacks passangers."
				dialog "^0099FFThis monster drops^000000: Spiderweb,Scell,Short Leg,Green Herb,Yellow Herb"
				wait
				dialog "^FF0000[Geffen Tower 2F Monster Encyclopedia]^000000"
				dialog "5.Whisper"
				dialog "A live Fabric which gives spooky feeling."
				dialog "^0099FFThis monster drops^000000: Transparent Cloth"
				wait
				dialog "^FF0000[Geffen Tower 2F Monster Encyclopedia]^000000"
				dialog "6.Jakk"
				dialog "Quite Odd monster in a nice suit,but with a pumpkin head.It looks funny but changes the attitude fiercely when attacks someone."
				dialog "^0099FFThis monster drops^000000: Pumpkin Head,Zargon"
				wait
			break
			case 3
				dialog "^FF0000[Geffen Tower 3F Monster Encyclopedia]^000000"
				dialog "1.Argos"
				dialog "Big Spider of black.It often attacks passangers."
				dialog "^0099FFThis monster drops^000000: Spiderweb,Scell,Short Leg,Green Herb,Yellow Herb"
				wait
				dialog "^FF0000[Geffen Tower 3F Monster Encyclopedia]^000000"
				dialog "2.Whisper"
				dialog "A live Fabric which gives spooky feeling."
				dialog "^0099FFThis monster drops^000000: Transparent Cloth"
				wait
				dialog "^FF0000[Geffen Tower 3F Monster Encyclopedia]^000000"
				dialog "3.Jakk"
				dialog "Quite Odd monster in a nice suit,but with a pumpkin head.It looks funny but changes the attitude fiercely when attacks someone."
				dialog "^0099FFThis monster drops^000000: Pumpkin Head,Zargon"
				wait
				dialog "^FF0000[Geffen Tower 3F Monster Encyclopedia]^000000"
				dialog "4.Myst"
				dialog "Mist-like Monster."
				dialog "^0099FFThis monster drops^000000: Wooden Block.Gas Mask"
				wait
				dialog "^FF0000[Geffen Tower 3F Monster Encyclopedia]^000000"
				dialog "5.Marionette"
				dialog "Monster reborn from a bewitched Doll, bound to strings on Wooden Sticks."
				dialog "^0099FFThis monster drops^000000: Golden Hair,Wooden Block"
				wait
				dialog "^FF0000[Geffen Tower 3F Monster Encyclopedia]^000000"
				dialog "6.Bathroy"
				dialog "Witch with a big wen on the nose.She rides on her magic broom flying around in the air.."
				dialog "^0099FFThis monster drops^000000: Starsand of Witch"
				wait
				dialog "^FF0000[Geffen Tower 3F Monster Encyclopedia]^000000"
				dialog "7.Nightmare"
				dialog "Ghost Horse radiating an Aura of Violet all over the body."
				dialog "^0099FFThis monster drops^000000: Horse Shoe,Blue Herb"
				wait
			break
			case 4
				dialog "^FF0000[Geffen Tower 4F Monster Encyclopedia]^000000"
				dialog "1.Myst"
				dialog "Mist-like Monster."
				dialog "^0099FFThis monster drops^000000: Wooden Block.Gas Mask"
				wait
				dialog "^FF0000[Geffen Tower 4F Monster Encyclopedia]^000000"
				dialog "2.Deviruchi"
				dialog "Little evil creature,which carries a cute trident with."
				dialog "^0099FFThis monster drops^000000: Petite Diablo's Horn,Petite Diablo's Wing,Zargon"
				wait
				dialog "^FF0000[Geffen Tower 4F Monster Encyclopedia]^000000"
				dialog "3.Raydric"
				dialog "Ghost Knight of misfortune with heavy armors."
				dialog "^0099FFThis monster drops^000000: Elunium,Patriotism Marks"
				wait
				dialog "^FF0000[Geffen Tower 4F Monster Encyclopedia]^000000"
				dialog "4.Joker"
				dialog "A big Joker Card with Ugly looking girl printed on both side assaults you."
				dialog "^0099FFThis monster drops^000000: Spiky Heel"
				wait
				dialog "^FF0000[Geffen Tower 4F Monster Encyclopedia]^000000"
				dialog "5.Doppelganger"
				dialog "Looks like a human, but it's a strong and horrible monster."
				dialog "^0099FFThis monster drops^000000: Sharp Gear,Blue Potion,Cardinal Jewel,Red Jewel"
				wait
			break
			case 5
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 3
		while(1)
			choose menu "1F" "2F" "3F" "4F" "5F" "Cancel"
			case 1
				dialog "^FF0000[Sphinx Dungeon 1F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Sphinx Dungeon 1F Monster Encyclopedia]^000000"
				dialog "2.Snake"
				dialog "Green Snake living in the Forest or Desert.Not poisonous but be careful."
				dialog "^0099FFThis monster drops^000000: Scale of Snakes,Red Herb"
				wait
				dialog "^FF0000[Sphinx Dungeon 1F Monster Encyclopedia]^000000"
				dialog "3.Zerom"
				dialog "Undead Slave who had been extremely abused before he died.He is wandering in the Sphinx carrying a big box on the back.."
				dialog "^0099FFThis monster drops^000000: G-Strings"
				wait
				dialog "^FF0000[Sphinx Dungeon 1F Monster Encyclopedia]^000000"
				dialog "4.Matyr"
				dialog "Creature looks like a Black Dog."
				dialog "^0099FFThis monster drops^000000: Monster's Feed,Animal's Skin"
				wait
				dialog "^FF0000[Sphinx Dungeon 1F Monster Encyclopedia]^000000"
				dialog "5.Reuiem"
				dialog "It seems like an Ancient Slave carrying a heavy Coffin on the back."
				dialog "^0099FFThis monster drops^000000: Old Blue Box"
				wait
			break
			case 2
				dialog "^FF0000[Sphinx Dungeon 2F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Sphinx Dungeon 2F Monster Encyclopedia]^000000"
				dialog "2.Matyr"
				dialog "Creature looks like a Black Dog."
				dialog "^0099FFThis monster drops^000000: Monster's Feed,Animal's Skin"
				wait
				dialog "^FF0000[Sphinx Dungeon 2F Monster Encyclopedia]^000000"
				dialog "3.Requiem"
				dialog "It seems like an Ancient Slave carrying a heavy Coffin on the back."
				dialog "^0099FFThis monster drops^000000: Old Blue Box"
				wait
				dialog "^FF0000[Sphinx Dungeon 2F Monster Encyclopedia]^000000"
				dialog "4.Whisper"
				dialog "A live Fabric which gives spooky feeling."
				dialog "^0099FFThis monster drops^000000: Transparent Cloth"
				wait
			break
			case 3
				dialog "^FF0000[Sphinx Dungeon 3F Monster Encyclopedia]^000000"
				dialog "1.Matyr"
				dialog "Creature looks like a Black Dog."
				dialog "^0099FFThis monster drops^000000: Monster's Feed,Animal's Skin"
				wait
				dialog "^FF0000[Sphinx Dungeon 3F Monster Encyclopedia]^000000"
				dialog "2.Whisper"
				dialog "A live Fabric which gives spooky feeling."
				dialog "^0099FFThis monster drops^000000: Transparent Cloth"
				wait
				dialog "^FF0000[Sphinx Dungeon 3F Monster Encyclopedia]^000000"
				dialog "3.Marduk"
				dialog "Unknown monster wearing Catholic uniform and looking serious."
				dialog "^0099FFThis monster drops^000000: Flame Heart"
				wait
			break
			case 4
				dialog "^FF0000[Sphinx Dungeon 4F Monster Encyclopedia]^000000"
				dialog "1.Whisper"
				dialog "A live Fabric which gives spooky feeling."
				dialog "^0099FFThis monster drops^000000: Transparent Cloth"
				wait
				dialog "^FF0000[Sphinx Dungeon 4F Monster Encyclopedia]^000000"
				dialog "2.Marduk"
				dialog "Unknown monster wearing Catholic uniform and looking serious."
				dialog "^0099FFThis monster drops^000000: Flame Heart"
				wait
				dialog "^FF0000[Sphinx Dungeon 4F Monster Encyclopedia]^000000"
				dialog "3.Medusa"
				dialog "She has hair of snakes. It has a rumor that people would turn into stone statues when they look into her eyes."
				dialog "^0099FFThis monster drops^000000: Head of Medusa,Slender Snake,White Potion"
				wait
			break
			case 5
				dialog "^FF0000[Sphinx Dungeon 5F Monster Encyclopedia]^000000"
				dialog "1.Whisper"
				dialog "A live Fabric which gives spooky feeling."
				dialog "^0099FFThis monster drops^000000: Transparent Cloth"
				wait
				dialog "^FF0000[Sphinx Dungeon 5F Monster Encyclopedia]^000000"
				dialog "2.Marduk"
				dialog "Unknown monster wearing Catholic uniform and looking serious."
				dialog "^0099FFThis monster drops^000000: Flame Heart"
				wait
				dialog "^FF0000[Sphinx Dungeon 5F Monster Encyclopedia]^000000"
				dialog "3.Medusa"
				dialog "She has hair of snakes. It has a rumor that people would turn into stone statues when they look into her eyes."
				dialog "^0099FFThis monster drops^000000: Head of Medusa,Slender Snake,White Potion"
				wait
			break
			case 6
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 4
		close
	break
	endchoose
return

npc "prt_in" "Monster Encyclopedia" HIDDEN_NPC 164 96 4 0 0
OnClick:
	dialog "^FF0000[Dungeon Monster Encyclopedia]^000000"
	dialog "This is an encyclopaedia describing Monsters living in Dungeons."
	wait
	choose menu "Orc Dungeon" "Byaran Island Cave" "Prontera Sewer"
	case 1
		while(1)
			choose menu "1F" "2F" "Cancel"
			case 1
				dialog "^FF0000[Orc Dungeon 1F Monster Encyclopedia]^000000"
				dialog "1.Chonchon"
				dialog "Flying monsters, they are not strong but make as annoying noises as Roda Frog. Make sure to eliminate them whenever you see."
				dialog "^0099FFThis monster drops^000000: Shell,Jellopy,Wing of Fly"
				wait
				dialog "^FF0000[Orc Dungeon 1F Monster Encyclopedia]^000000"
				dialog "2.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Orc Dungeon 1F Monster Encyclopedia]^000000"
				dialog "3.Orc Zombie"
				dialog "Corpes of the Orc which have been given a new life by Black magic."
				dialog "^0099FFThis monster drops^000000: Nail of Orc,Sticky Mucus"
				wait
				dialog "^FF0000[Orc Dungeon 1F Monster Encyclopedia]^000000"
				dialog "4.Orc Skeleton"
				dialog "Ancient Skeleton of the Orc which had been buried for a long time.It has built up Great Power during the period of being buried"
				dialog "^0099FFThis monster drops^000000: Orcish Cuspid,Green Potion"
				wait
			break
			case 2
				dialog "^FF0000[Orc Dungeon 2F Monster Encyclopedia]^000000"
				dialog "1.Chonchon"
				dialog "Flying monsters, they are not strong but make as annoying noises as Roda Frog. Make sure to eliminate them whenever you see."
				dialog "^0099FFThis monster drops^000000: Shell,Jellopy,Wing of Fly"
				wait
				dialog "^FF0000[Orc Dungeon 2F Monster Encyclopedia]^000000"
				dialog "2.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Orc Dungeon 2F Monster Encyclopedia]^000000"
				dialog "3.Orc Skeleton"
				dialog "Ancient Skeleton of the Orc which had been buried for a long time.It has built up Great Power during the period of being buried"
				dialog "^0099FFThis monster drops^000000: Orcish Cuspid,Green Potion"
				wait
				dialog "^FF0000[Orc Dungeon 2F Monster Encyclopedia]^000000"
				dialog "4.Zenorc"
				dialog "Mutent Orc with a small and short build.It moves around using both hands and feet. It owns High AGI stat,so that it passes off "
				dialog "^0099FFThis monster drops^000000: Tooth of Zenorc,Sticky Mucus,Yellow Potion"
				wait
			break
			case 3
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 2
		while(1)
			choose menu "1F" "2F" "3F" "4F" "5F" "Cancel"
			case 1
				dialog "^FF0000[Byaran Island Cave 1F Monster Encyclopedia]^000000"
				dialog "1.Plankton"
				dialog "Even though looks like trifle creatures, they fly into a rage when stepped on. They are light, drifting on the water and attack"
				dialog "^0099FFThis monster drops^000000: Single Cell.Garlet.Sticky Mucus.Empty Bottle"
				wait
				dialog "^FF0000[Byaran Island Cave 1F Monster Encyclopedia]^000000"
				dialog "2.Kukre"
				dialog "Looks better than Thief Bugs but basically do the same thing. But luckily they don't attack players in a group."
				dialog "^0099FFThis monster drops^000000: Worm Peelings.Garlet.Monster's Feed.Red Herb.Insect Feeler"
				wait
				dialog "^FF0000[Byaran Island Cave 1F Monster Encyclopedia]^000000"
				dialog "3.Hydra"
				dialog "Veggie Monsters which live near water or in the deep sea. Attacks using tentacles. When run into them in a group, it will be th"
				dialog "^0099FFThis monster drops^000000: Tentacle.Sticky Mucus.Meat"
				wait
				dialog "^FF0000[Byaran Island Cave 1F Monster Encyclopedia]^000000"
				dialog "4.Vadon"
				dialog "They wear thick shells all around the body and walk around tinkling nippers. Also their red color looks so tempting appetite.Be"
				dialog "^0099FFThis monster drops^000000: Nipper.Garlet.Solid Shell.Shell"
				wait
				dialog "^FF0000[Byaran Island Cave 1F Monster Encyclopedia]^000000"
				dialog "5.Marina"
				dialog "Transparent Jelly Fishes. They are flexible enough to stretch their bodies and attack humans. They live in cool places near wat"
				dialog "^0099FFThis monster drops^000000: Single Cell.Sticky Mucus"
				wait
			break
			case 2
				dialog "^FF0000[Byaran Island Cave 2F Monster Encyclopedia]^000000"
				dialog "1.Plankton"
				dialog "Even though looks like trifle creatures, they fly into a rage when stepped on. They are light, drifting on the water and attack"
				dialog "^0099FFThis monster drops^000000: Single Cell.Garlet.Sticky Mucus.Empty Bottle"
				wait
				dialog "^FF0000[Byaran Island Cave 2F Monster Encyclopedia]^000000"
				dialog "2.Kukre"
				dialog "Looks better than Thief Bugs but basically do the same thing. But luckily they don't attack players in a group."
				dialog "^0099FFThis monster drops^000000: Worm Peelings.Garlet.Monster's Feed.Red Herb.Insect Feeler"
				wait
				dialog "^FF0000[Byaran Island Cave 2F Monster Encyclopedia]^000000"
				dialog "3.Hydra"
				dialog "Veggie Monsters which live near water or in the deep sea. Attacks using tentacles. When run into them in a group, it will be th"
				dialog "^0099FFThis monster drops^000000: Tentacle.Sticky Mucus.Meat"
				wait
				dialog "^FF0000[Byaran Island Cave 2F Monster Encyclopedia]^000000"
				dialog "4.Vadon"
				dialog "They wear thick shells all around the body and walk around tinkling nippers. Also their red color looks so tempting appetite.Be"
				dialog "^0099FFThis monster drops^000000: Nipper.Garlet.Solid Shell.Shell"
				wait
				dialog "^FF0000[Byaran Island Cave 2F Monster Encyclopedia]^000000"
				dialog "5.Marina"
				dialog "Transparent Jelly Fishes. They are flexible enough to stretch their bodies and attack humans. They live in cool places near wat"
				dialog "^0099FFThis monster drops^000000: Single Cell.Sticky Mucus"
				wait
				dialog "^FF0000[Byaran Island Cave 2F Monster Encyclopedia]^000000"
				dialog "6.Thara Frog"
				dialog "Frogs of red, surely stronger than Roda Frogs. However there is obviously one thing in common about them, annoying croaking noi"
				dialog "^0099FFThis monster drops^000000: Spawn,Scell,Sticky Webfoot"
				wait
			break
			case 3
				dialog "^FF0000[Byaran Island Cave 2F Monster Encyclopedia]^000000"
				dialog "1.Hydra"
				dialog "Veggie Monsters which live near water or in the deep sea. Attacks using tentacles. When run into them in a group, it will be th"
				dialog "^0099FFThis monster drops^000000: Tentacle.Sticky Mucus.Meat"
				wait
				dialog "^FF0000[Byaran Island Cave 3F Monster Encyclopedia]^000000"
				dialog "2.Thara Frog"
				dialog "Frogs of red, surely stronger than Roda Frogs. However there is obviously one thing in common about them, annoying croaking noi"
				dialog "^0099FFThis monster drops^000000: Spawn,Scell,Sticky Webfoot"
				wait
				dialog "^FF0000[Byaran Island Cave 3F Monster Encyclopedia]^000000"
				dialog "3.Cornutus"
				dialog "Some buddies concealing themselves within hard turban shells and try to live a quiet life."
				dialog "^0099FFThis monster drops^000000: Conch.Scell.Solid Shell"
				wait
				dialog "^FF0000[Byaran Island Cave 3F Monster Encyclopedia]^000000"
				dialog "4.Marse"
				dialog "Has many legs, flapping under the water. Do not rush to it because of its tempting look."
				dialog "^0099FFThis monster drops^000000: Chinese Ink,Tentacle"
				wait
				dialog "^FF0000[Byaran Island Cave 3F Monster Encyclopedia]^000000"
				dialog "5.Obeaune"
				dialog "Female Mermaid. Attacks using long hair with a grim face."
				dialog "^0099FFThis monster drops^000000: Heart of Mermaid,Fin"
				wait
			break
			case 4
				dialog "^FF0000[Byaran Island Cave 4F Monster Encyclopedia]^000000"
				dialog "1.Hydra"
				dialog "Veggie Monsters which live near water or in the deep sea. Attacks using tentacles. When run into them in a group, it will be th"
				dialog "^0099FFThis monster drops^000000: Tentacle.Sticky Mucus.Meat"
				wait
				dialog "^FF0000[Byaran Island Cave 4F Monster Encyclopedia]^000000"
				dialog "2.Marse"
				dialog "Has many legs, flapping under the water. Do not rush to it because of its tempting look."
				dialog "^0099FFThis monster drops^000000: Chinese Ink,Tentacle"
				wait
				dialog "^FF0000[Byaran Island Cave 4F Monster Encyclopedia]^000000"
				dialog "3.Obeaune"
				dialog "Female Mermaid. Attacks using long hair with a grim face."
				dialog "^0099FFThis monster drops^000000: Heart of Mermaid,Fin"
				wait
				dialog "^FF0000[Byaran Island Cave 4F Monster Encyclopedia]^000000"
				dialog "4.Marine Sphere"
				dialog "Strange, round-shaped monsters beating so fast that they seem like they will burst soon."
				dialog "^0099FFThis monster drops^000000: Tendon.Detonator"
				wait
				dialog "^FF0000[Byaran Island Cave 4F Monster Encyclopedia]^000000"
				dialog "5.Phen"
				dialog "A blue fish which definitely alive and strong."
				dialog "^0099FFThis monster drops^000000: Fish Tail,Sharp Scale,Meat,Fin"
				wait
				dialog "^FF0000[Byaran Island Cave 4F Monster Encyclopedia]^000000"
				dialog "6.Sword Fish"
				dialog "A Fish Monster with a sharp, thin, and long nose. Goggle eyes are funny but it belongs to one of those dangerous monsters."
				dialog "^0099FFThis monster drops^000000: Sharp Scale,Gill"
				wait
			break
			case 5
				dialog "^FF0000[Byaran Island Cave 5F Monster Encyclopedia]^000000"
				dialog "1.Marine Sphere"
				dialog "Strange, round-shaped monsters beating so fast that they seem like they will burst soon."
				dialog "^0099FFThis monster drops^000000: Tendon.Detonator"
				wait
				dialog "^FF0000[Byaran Island Cave 5F Monster Encyclopedia]^000000"
				dialog "2.Sword Fish"
				dialog "A Fish Monster with a sharp, thin, and long nose. Goggle eyes are funny but it belongs to one of those dangerous monsters."
				dialog "^0099FFThis monster drops^000000: Sharp Scale,Gill"
				wait
				dialog "^FF0000[Byaran Island Cave 5F Monster Encyclopedia]^000000"
				dialog "3.Marse"
				dialog "Has many legs, flapping under the water. Do not rush to it because of its tempting look."
				dialog "^0099FFThis monster drops^000000: Chinese Ink,Tentacle"
				wait
				dialog "^FF0000[Byaran Island Cave 5F Monster Encyclopedia]^000000"
				dialog "4.Obeaune"
				dialog "Female Mermaid. Attacks using long hair with a grim face."
				dialog "^0099FFThis monster drops^000000: Heart of Mermaid,Fin"
				wait
				dialog "^FF0000[Byaran Island Cave 5F Monster Encyclopedia]^000000"
				dialog "5.Marc"
				dialog "Sea Horse. Don't ever think about riding a Sea Horse!"
				dialog "^0099FFThis monster drops^000000: Gill,Fin"
				wait
				dialog "^FF0000[Byaran Island Cave 5F Monster Encyclopedia]^000000"
				dialog "6.Strouf"
				dialog "Fish rarely seen under the deep sea."
				dialog "^0099FFThis monster drops^000000: Fin,Feather,Gill"
				wait
			break
			case 6
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 3
		while(1)
			choose menu "1F" "2F" "3F" "4F" "Cancel"
			case 1
				dialog "^FF0000[Sewer 1F Monster Encyclopedia]^000000"
				dialog "1.Thief Bug Egg"
				dialog "Egg of Filthy Bug.Let's cut off the evil from its root."
				dialog "^0099FFThis monster drops^000000: chrysalis,Sticky Mucus"
				wait
				dialog "^FF0000[Sewer 1F Monster Encyclopedia]^000000"
				dialog "2.Baby Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy"
				wait
				dialog "^FF0000[Sewer 1F Monster Encyclopedia]^000000"
				dialog "3.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Sewer 1F Monster Encyclopedia]^000000"
				dialog "4.Spore"
				dialog "Mushroom-like monsters. Usually live in the Forest or Dungeons. By the way Don't try to eat it!"
				dialog "^0099FFThis monster drops^000000: Mushroom Spore,Red Herb,Blue Herb"
				wait
				dialog "^FF0000[Sewer 1F Monster Encyclopedia]^000000"
				dialog "5.Tarou"
				dialog "Little white mouse. It is squicking very loudly in the Dead Pit or the Prontera Culvert."
				dialog "^0099FFThis monster drops^000000: Rat Tail,Animal's Skin,Feather,Monster's Feed"
				wait
			break
			case 2
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "1.Thief Bug Egg"
				dialog "Egg of Filthy Bug.Let's cut off the evil from its root."
				dialog "^0099FFThis monster drops^000000: chrysalis,Sticky Mucus"
				wait
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "2.Baby Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy"
				wait
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "3.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "4.Spore"
				dialog "Mushroom-like monsters. Usually live in the Forest or Dungeons. By the way Don't try to eat it!"
				dialog "^0099FFThis monster drops^000000: Mushroom Spore,Red Herb,Blue Herb"
				wait
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "5.Tarou"
				dialog "Little white mouse. It is squicking very loudly in the Dead Pit or the Prontera Culvert."
				dialog "^0099FFThis monster drops^000000: Rat Tail,Animal's Skin,Feather,Monster's Feed"
				wait
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "6.Plankton"
				dialog "Even though looks like trifle creatures, they fly into a rage when stepped on. They are light, drifting on the water and attack"
				dialog "^0099FFThis monster drops^000000: Single Cell.Garlet.Sticky Mucus.Empty Bottle"
				wait
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "7.Hydra"
				dialog "Veggie Monsters which live near water or in the deep sea. Attacks using tentacles. When run into them in a group, it will be th"
				dialog "^0099FFThis monster drops^000000: Tentacle.Sticky Mucus.Meat"
				wait
				dialog "^FF0000[Sewer 2F Monster Encyclopedia]^000000"
				dialog "8.Female Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy,Garlet.Insect Feeler"
				wait
			break
			case 3
				dialog "^FF0000[Sewer 3F Monster Encyclopedia]^000000"
				dialog "1.Thief Bug Egg"
				dialog "Egg of Filthy Bug.Let's cut off the evil from its root."
				dialog "^0099FFThis monster drops^000000: chrysalis,Sticky Mucus"
				wait
				dialog "^FF0000[Sewer 3F Monster Encyclopedia]^000000"
				dialog "2.Baby Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy"
				wait
				dialog "^FF0000[Sewer 3F Monster Encyclopedia]^000000"
				dialog "3.Female Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy,Garlet.Insect Feeler"
				wait
				dialog "^FF0000[Sewer 3F Monster Encyclopedia]^000000"
				dialog "4.Tarou"
				dialog "Little white mouse. It is squicking very loudly in the Dead Pit or the Prontera Culvert."
				dialog "^0099FFThis monster drops^000000: Rat Tail,Animal's Skin,Feather,Monster's Feed"
				wait
				dialog "^FF0000[Sewer 3F Monster Encyclopedia]^000000"
				dialog "5.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Sewer 3F Monster Encyclopedia]^000000"
				dialog "6.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
			break
			case 4
				dialog "^FF0000[Sewer 4F Monster Encyclopedia]^000000"
				dialog "1.Thief Bug Egg"
				dialog "Egg of Filthy Bug.Let's cut off the evil from its root."
				dialog "^0099FFThis monster drops^000000: chrysalis,Sticky Mucus"
				wait
				dialog "^FF0000[Sewer 4F Monster Encyclopedia]^000000"
				dialog "2.Baby Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy"
				wait
				dialog "^FF0000[Sewer 4F Monster Encyclopedia]^000000"
				dialog "3.Female Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy,Garlet.Insect Feeler"
				wait
				dialog "^FF0000[Sewer 4F Monster Encyclopedia]^000000"
				dialog "4.Male Thief Bug"
				dialog "Dirty and filthy Creatures having a strong solidarity with the same kinds, eat everything on the ground as well.They are sorted"
				dialog "^0099FFThis monster drops^000000: Worm Peelings,Red Herb,Jellopy,Garlet.Insect Feeler,Yellow Herb"
				wait
				dialog "^FF0000[Sewer 4F Monster Encyclopedia]^000000"
				dialog "5.Golden Bug"
				dialog "An Impertinent Thief Bug of Golden wearing a solid shell all around the body.It's rarely seen by human's eye."
				dialog "^0099FFThis monster drops^000000: Blue Herb,Gold,Ora Ora,Insect Feeler"
				wait
			break
			case 5
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 4
		close
	break
	endchoose
return

npc "prt_in" "Monster Encyclopedia" HIDDEN_NPC 172 102 4 0 0
OnClick:
	dialog "^FF0000[Dungeon Monster Encyclopedia]^000000"
	dialog "This is an Ancyclopaedia describing Monsters living in Dungeons."
	wait
	choose menu "Mt. Mjolnir Waste Pit" "Payon Dungeon" "Pyramid"
	case 1
		while(1)
			choose menu "1F" "2F" "3F" "Cancel"
			case 1
				dialog "^FF0000[Mjolnir Waste Pit 1F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 1F Monster Encyclopedia]^000000"
				dialog "2.Tarou"
				dialog "Little white mouse. It is squicking very loudly in the Dead Pit or the Prontera Culvert."
				dialog "^0099FFThis monster drops^000000: Rat Tail,Animal's Skin,Feather,Monster's Feed"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 1F Monster Encyclopedia]^000000"
				dialog "3.Martin"
				dialog "Funny looking Mole wearing a Safety Helmet on the head which is always busy to walk around."
				dialog "^0099FFThis monster drops^000000: Moustache of Mole,Nail of Mole"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 1F Monster Encyclopedia]^000000"
				dialog "4.Drainliar"
				dialog "Freaking Bloody bat with a might."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Red Herb"
				wait
			break
			case 2
				dialog "^FF0000[Mjolnir Waste Pit 2F Monster Encyclopedia]^000000"
				dialog "1.Martin"
				dialog "Funny looking Mole wearing a Safety Helmet on the head which is always busy to walk around."
				dialog "^0099FFThis monster drops^000000: Moustache of Mole,Nail of Mole"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 2F Monster Encyclopedia]^000000"
				dialog "2.Drainliar"
				dialog "Freaking Bloody bat with a might."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Red Herb"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 2F Monster Encyclopedia]^000000"
				dialog "3.Skel Worker"
				dialog "Walking Skeletion which was dead in a mine."
				dialog "^0099FFThis monster drops^000000: Iron,Lantern"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 2F Monster Encyclopedia]^000000"
				dialog "4.Myst"
				dialog "Mist-like Monster."
				dialog "^0099FFThis monster drops^000000: Wooden Block.Gas Mask"
				wait
			break
			case 3
				dialog "^FF0000[Mjolnir Waste Pit 3F Monster Encyclopedia]^000000"
				dialog "1.Skel Worker"
				dialog "Walking Skeletion which was dead in a mine."
				dialog "^0099FFThis monster drops^000000: Iron,Lantern"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 3F Monster Encyclopedia]^000000"
				dialog "2.Myst"
				dialog "Mist-like Monster."
				dialog "^0099FFThis monster drops^000000: Wooden Block.Gas Mask"
				wait
				dialog "^FF0000[Mjolnir Waste Pit 3F Monster Encyclopedia]^000000"
				dialog "3.Evil Druid"
				dialog "You'll shudder even once looking at it."
				dialog "^0099FFThis monster drops^000000: Amulet,White Herb"
				wait
			break
			case 4
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 2
		while(1)
			choose menu "1F" "2F" "3F" "4F" "5F" "Cancel"
			case 1
				dialog "^FF0000[Payon Dungeon 1F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Payon Dungeon 1F Monster Encyclopedia]^000000"
				dialog "2.Spore"
				dialog "Mushroom-like monsters. Usually live in the Forest or Dungeons. By the way Don't try to eat it!"
				dialog "^0099FFThis monster drops^000000: Mushroom Spore,Red Herb,Blue Herb"
				wait
				dialog "^FF0000[Payon Dungeon 1F Monster Encyclopedia]^000000"
				dialog "3.Zombie"
				dialog "A Bad Case of the Dead which has been reborn as a Walking Corpse by Back magic.Let's lead it to Nirvana."
				dialog "^0099FFThis monster drops^000000: Decayed Nail,Sticky Mucus,Horrendous Mouth"
				wait
			break
			case 2
				dialog "^FF0000[Payon Dungeon 2F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Payon Dungeon 2F Monster Encyclopedia]^000000"
				dialog "2.Eggyra"
				dialog "Hovering here and there, while making a clattering sound. Tough-Looking Face scares people but it is not as strong as it looks."
				dialog "^0099FFThis monster drops^000000: Scell,Sticky Mucus,Red Herb"
				wait
				dialog "^FF0000[Payon Dungeon 2F Monster Encyclopedia]^000000"
				dialog "3.Magnolia"
				dialog "Creatures look like Big Frying Fans. They spank attackers with the Frying Fans without mercy. Don't let your guard down just be"
				dialog "^0099FFThis monster drops^000000: Jellopy.Garlet.Scell"
				wait
				dialog "^FF0000[Payon Dungeon 2F Monster Encyclopedia]^000000"
				dialog "4.Soldier Skeleton"
				dialog "A Skeleton holding 2 swords on both grips, attacking fast. One of the dangerous monsters in the Cave."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Red Potion"
				wait
			break
			case 3
				dialog "^FF0000[Payon Dungeon 3F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Payon Dungeon 3F Monster Encyclopedia]^000000"
				dialog "2.Soldier Skeleton"
				dialog "A Skeleton holding 2 swords on both grips, attacking fast. One of the dangerous monsters in the Cave."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Red Potion"
				wait
				dialog "^FF0000[Payon Dungeon 3F Monster Encyclopedia]^000000"
				dialog "3.Munak"
				dialog "Pretty-looking Female corpse which had been frozen for a long time.She looks like holding a long story deep inside, the story p"
				dialog "^0099FFThis monster drops^000000: Danggie,Munak Turban"
				wait
				dialog "^FF0000[Payon Dungeon 3F Monster Encyclopedia]^000000"
				dialog "4.Archer Skeleton"
				dialog "It seems to be an expert of bow when it was alive.It'll come to attack in no time when somebody gets inside of its range."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Fire Arrow,Red Potion"
				wait
			break
			case 4
				dialog "^FF0000[Payon Dungeon 4F Monster Encyclopedia]^000000"
				dialog "1.Soldier Skeleton"
				dialog "A Skeleton holding 2 swords on both grips, attacking fast. One of the dangerous monsters in the Cave."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Red Potion"
				wait
				dialog "^FF0000[Payon Dungeon 4F Monster Encyclopedia]^000000"
				dialog "2.Archer Skeleton"
				dialog "It seems to be an expert of bow when it was alive.It'll come to attack in no time when somebody gets inside of its range."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Fire Arrow,Red Potion"
				wait
				dialog "^FF0000[Payon Dungeon 4F Monster Encyclopedia]^000000"
				dialog "3.Sohee"
				dialog "Female Ghost which holds grudge deep inside. She is always crying as waving long hair. But when running into the humans, she su"
				dialog "^0099FFThis monster drops^000000: Long Hair,Red Potion"
				wait
				dialog "^FF0000[Payon Dungeon 4F Monster Encyclopedia]^000000"
				dialog "4.Horong"
				dialog "Eerie-looking fireball of violet. Detects humans when gets near and attacks them."
				dialog "^0099FFThis monster drops^000000: Stone Heart,Zargon,Fire Arrow"
				wait
			break
			case 5
				dialog "^FF0000[Payon Dungeon 5F Monster Encyclopedia]^000000"
				dialog "1.Soldier Skeleton"
				dialog "A Skeleton holding 2 swords on both grips, attacking fast. One of the dangerous monsters in the Cave."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Red Potion"
				wait
				dialog "^FF0000[Payon Dungeon 5F Monster Encyclopedia]^000000"
				dialog "2.Archer Skeleton"
				dialog "It seems to be an expert of bow when it was alive.It'll come to attack in no time when somebody gets inside of its range."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Fire Arrow,Red Potion"
				wait
				dialog "^FF0000[Payon Dungeon 5F Monster Encyclopedia]^000000"
				dialog "3.Sohee"
				dialog "Female Ghost which holds grudge deep inside. She is always crying as waving long hair. But when running into the humans, she su"
				dialog "^0099FFThis monster drops^000000: Long Hair,Red Potion"
				wait
				dialog "^FF0000[Payon Dungeon 5F Monster Encyclopedia]^000000"
				dialog "4.Horong"
				dialog "Eerie-looking fireball of violet. Detects humans when gets near and attacks them."
				dialog "^0099FFThis monster drops^000000: Stone Heart,Zargon,Fire Arrow"
				wait
				dialog "^FF0000[Payon Dungeon 5F Monster Encyclopedia]^000000"
				dialog "5.Moonlight"
				dialog "Wild Girl having 9 tails of a Fox, and with a Big Bell on the back."
				dialog "^0099FFThis monster drops^000000: Fox Tail,White Potion,Golden Jewel,Elunium"
				wait
			break
			case 6
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 3
		while(1)
			choose menu "1F" "2F" "3F" "4F" "5F" "6F" "Cancel"
			case 1
				dialog "^FF0000[Pyramid 1F Monster Encyclopedia]^000000"
				dialog "1.Farmiliar"
				dialog "Bat of Violet.Not that strong but really annoying because it attacks very fast and outregeously when somebody gets near it."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Wing of Fly,Grape,Red Herb"
				wait
				dialog "^FF0000[Pyramid 1F Monster Encyclopedia]^000000"
				dialog "2.Spore"
				dialog "Mushroom-like monsters. Usually live in the Forest or Dungeons. By the way Don't try to eat it!"
				dialog "^0099FFThis monster drops^000000: Mushroom Spore,Red Herb,Blue Herb"
				wait
				dialog "^FF0000[Pyramid 1F Monster Encyclopedia]^000000"
				dialog "3.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
			break
			case 2
				dialog "^FF0000[Pyramid 2F Monster Encyclopedia]^000000"
				dialog "1.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
				dialog "^FF0000[Pyramid 2F Monster Encyclopedia]^000000"
				dialog "2.Drainliar"
				dialog "Freaking Bloody bat with a might."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Red Herb"
				wait
				dialog "^FF0000[Pyramid 2F Monster Encyclopedia]^000000"
				dialog "3.Soldier Skeleton"
				dialog "A Skeleton holding 2 swords on both grips, attacking fast. One of the dangerous monsters in the Cave."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Red Potion"
				wait
				dialog "^FF0000[Pyramid 2F Monster Encyclopedia]^000000"
				dialog "4.Archer Skeleton"
				dialog "It seems to be an expert of bow when it was alive.It'll come to attack in no time when somebody gets inside of its range."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Fire Arrow,Red Potion"
				wait
			break
			case 3
				dialog "^FF0000[Pyramid 3F Monster Encyclopedia]^000000"
				dialog "1.Drainliar"
				dialog "Freaking Bloody bat with a might."
				dialog "^0099FFThis monster drops^000000: Tooth of Bat,Red Herb"
				wait
				dialog "^FF0000[Pyramid 3F Monster Encyclopedia]^000000"
				dialog "2.Soldier Skeleton"
				dialog "A Skeleton holding 2 swords on both grips, attacking fast. One of the dangerous monsters in the Cave."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Red Potion"
				wait
				dialog "^FF0000[Pyramid 3F Monster Encyclopedia]^000000"
				dialog "3.Archer Skeleton"
				dialog "It seems to be an expert of bow when it was alive.It'll come to attack in no time when somebody gets inside of its range."
				dialog "^0099FFThis monster drops^000000: Skel Bone,Fire Arrow,Red Potion"
				wait
				dialog "^FF0000[Pyramid 3F Monster Encyclopedia]^000000"
				dialog "4.Mummy"
				dialog "Walking Corpse with a bandage all around the body.It smells so bad because its body is still on the decomposed stage."
				dialog "^0099FFThis monster drops^000000: Rotten Bandage"
				wait
				dialog "^FF0000[Pyramid 3F Monster Encyclopedia]^000000"
				dialog "5.Verit"
				dialog "A Dog with a bandage all around the body which was dead once before.It tends to eat everything dropped on the ground."
				dialog "^0099FFThis monster drops^000000: Immortal Hear,Zargon,Rotten Bandage"
				wait
			break
			case 4
				dialog "^FF0000[Pyramid 4F Monster Encyclopedia]^000000"
				dialog "1.Mummy"
				dialog "Walking Corpse with a bandage all around the body.It smells so bad because its body is still on the decomposed stage."
				dialog "^0099FFThis monster drops^000000: Rotten Bandage"
				wait
				dialog "^FF0000[Pyramid 4F Monster Encyclopedia]^000000"
				dialog "2.Verit"
				dialog "A Dog with a bandage all around the body which was dead once before.It tends to eat everything dropped on the ground."
				dialog "^0099FFThis monster drops^000000: Immortal Hear,Zargon,Rotten Bandage"
				wait
				dialog "^FF0000[Pyramid 4F Monster Encyclopedia]^000000"
				dialog "3.Ghoul"
				dialog "Similar as a Zombie but much more stronger. Yet very slow, you'd better run for your life when happen to meet this thing."
				dialog "^0099FFThis monster drops^000000: Horrendous Mouth"
				wait
				dialog "^FF0000[Pyramid 4F Monster Encyclopedia]^000000"
				dialog "4.Isis"
				dialog "Creatures having the head and upper body of a woman and the tail of a snake.Her nail is quite a menace."
				dialog "^0099FFThis monster drops^000000: Scales Shell,Shining Scales"
				wait
			break
			case 5
				dialog "^FF0000[Pyramid 5F Monster Encyclopedia]^000000"
				dialog "1.Mummy"
				dialog "Walking Corpse with a bandage all around the body.It smells so bad because its body is still on the decomposed stage."
				dialog "^0099FFThis monster drops^000000: Rotten Bandage"
				wait
				dialog "^FF0000[Pyramid 5F Monster Encyclopedia]^000000"
				dialog "2.Ghoul"
				dialog "Similar as a Zombie but much more stronger. Yet very slow, you'd better run for your life when happen to meet this thing."
				dialog "^0099FFThis monster drops^000000: Horrendous Mouth"
				wait
				dialog "^FF0000[Pyramid 5F Monster Encyclopedia]^000000"
				dialog "3.Isis"
				dialog "Creatures having the head and upper body of a woman and the tail of a snake.Her nail is quite a menace."
				dialog "^0099FFThis monster drops^000000: Scales Shell,Shining Scales"
				wait
			break
			case 6
				dialog "^FF0000[Pyramid 6F Monster Encyclopedia]^000000"
				dialog "1.Mummy"
				dialog "Walking Corpse with a bandage all around the body.It smells so bad because its body is still on the decomposed stage."
				dialog "^0099FFThis monster drops^000000: Rotten Bandage"
				wait
				dialog "^FF0000[Pyramid 6F Monster Encyclopedia]^000000"
				dialog "2.Verit"
				dialog "A Dog with a bandage all around the body which was dead once before.It tends to eat everything dropped on the ground."
				dialog "^0099FFThis monster drops^000000: Immortal Hear,Zargon,Rotten Bandage"
				wait
				dialog "^FF0000[Pyramid 6F Monster Encyclopedia]^000000"
				dialog "3.Ghoul"
				dialog "Similar as a Zombie but much more stronger. Yet very slow, you'd better run for your life when happen to meet this thing."
				dialog "^0099FFThis monster drops^000000: Horrendous Mouth"
				wait
				dialog "^FF0000[Pyramid 6F Monster Encyclopedia]^000000"
				dialog "4.Isis"
				dialog "Creatures having the head and upper body of a woman and the tail of a snake.Her nail is quite a menace."
				dialog "^0099FFThis monster drops^000000: Scales Shell,Shining Scales"
				wait
				dialog "^FF0000[Pyramid 6F Monster Encyclopedia]^000000"
				dialog "5.Osiris"
				dialog "Mummy King with a rotten bandage all over the body, wearing a Crown on the head.He threatens Adventurers with an incredible mig"
				dialog "^0099FFThis monster drops^000000: Mementos,Rotten Bandage,Sacred Marks,Elunium"
			break
			case 7
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 4
		close
	break
	endchoose
return

npc "prt_in" "Monster Encyclopedia" HIDDEN_NPC 164 102 4 0 0
OnClick:
	dialog "^FF0000[Dungeon Monster Encyclopedia]^000000"
	dialog "This is an encyclopaedia describing Monsters living in Dungeons."
	wait
	choose menu "Alberta Sunken Ship" "Prontera Labyrinth Forest"
	case 1
		while(1)
			choose menu "1F" "2F" "Cancel"
			case 1
				dialog "^FF0000[Sunken Ship 1F Monster Encyclopedia]^000000"
				dialog "1.Plankton"
				dialog "Even though looks like trifle creatures, they fly into a rage when stepped on. They are light, drifting on the water and attack"
				dialog "^0099FFThis monster drops^000000: Single Cell.Garlet.Sticky Mucus.Empty Bottle"
				wait
				dialog "^FF0000[Sunken Ship 1F Monster Encyclopedia]^000000"
				dialog "2.Kukre"
				dialog "Looks better than Thief Bugs but basically do the same thing. But luckily they don't attack players in a group."
				dialog "^0099FFThis monster drops^000000: Worm Peelings.Garlet.Monster's Feed.Red Herb.Insect Feeler"
				wait
				dialog "^FF0000[Sunken Ship 1F Monster Encyclopedia]^000000"
				dialog "3.Hydra"
				dialog "Veggie Monsters which live near water or in the deep sea. Attacks using tentacles. When run into them in a group, it will be th"
				dialog "^0099FFThis monster drops^000000: Tentacle.Sticky Mucus.Meat"
				wait
				dialog "^FF0000[Sunken Ship 1F Monster Encyclopedia]^000000"
				dialog "4.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
				dialog "^FF0000[Sunken Ship 1F Monster Encyclopedia]^000000"
				dialog "5.Poison Spore"
				dialog "Poisonous Spore in Violet.Besides,it tends to attack haphazardly if anybody gets near."
				dialog "^0099FFThis monster drops^000000: Mushroom Spore,Green Herb"
				wait
				dialog "^FF0000[Sunken Ship 1F Monster Encyclopedia]^000000"
				dialog "6.Pirate Skel"
				dialog "Walking Corpse of a Pirate which had been controling all the Seas."
				dialog "^0099FFThis monster drops^000000: Skel Bone"
				wait
			break
			case 2
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "1.Kukre"
				dialog "Looks better than Thief Bugs but basically do the same thing. But luckily they don't attack players in a group."
				dialog "^0099FFThis monster drops^000000: Worm Peelings.Garlet.Monster's Feed.Red Herb.Insect Feeler"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "2.Hydra"
				dialog "Veggie Monsters which live near water or in the deep sea. Attacks using tentacles. When run into them in a group, it will be th"
				dialog "^0099FFThis monster drops^000000: Tentacle.Sticky Mucus.Meat"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "3.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "4.Thara Frog"
				dialog "Frogs of red, surely stronger than Roda Frogs. However there is obviously one thing in common about them, annoying croaking noi"
				dialog "^0099FFThis monster drops^000000: Spawn,Scell,Sticky Webfoot"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "5.Whisper"
				dialog "A live Fabric which gives spooky feeling."
				dialog "^0099FFThis monster drops^000000: Transparent Cloth"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "6.Megalodon"
				dialog "A Skeleton Fish having spooky empty eye-holes."
				dialog "^0099FFThis monster drops^000000: Rotten Scale,Skel Bone"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "7.Pirate Skel"
				dialog "Walking Corpse of a Pirate which had been controling all the Seas."
				dialog "^0099FFThis monster drops^000000: Skel Bone"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "8.Marionette"
				dialog "Monster reborn from a bewitched Doll, bound to strings on Wooden Sticks."
				dialog "^0099FFThis monster drops^000000: Golden Hair,Wooden Block"
				wait
				dialog "^FF0000[Sunken Ship 2F Monster Encyclopedia]^000000"
				dialog "9.Drake"
				dialog "Awfully Strong Monster which looks like the Captain of this Sunken Ship."
				dialog "^0099FFThis monster drops^000000: Skel Bone,White Potion,Elunium"
			break
			case 3
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 2
		while(1)
			choose menu "1F" "3F" "Cancel"
			case 1
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "1.Poring"
				dialog "Small and circular monsters of transparent pink color. Swallow anything on the ground with sparkling eyes, without any hesitati"
				dialog "They tend to eat first. So be cautious when you put down drop something on the ground. But don't worry. They are not strong, an"
				dialog "^0099FFThis monster drops^000000: Jellopy.Sticky Mucus.Apple.Empty Bottle.Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "2.Lunatic"
				dialog "Plump and shaggy monster shaped like a Rabbit.However it won't give you a 'Bunny Band'."
				dialog "^0099FFThis monster drops^000000: Clover,Feather,Carrot,Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "3.Fabre"
				dialog "Larva of Creamy. It is cute when it wiggles,even though it is a weak and small monster,"
				dialog "People often tend to slay Fabres,only for the reason they can get 'Feather's,one of required items for 'Bunny Band'."
				dialog "^0099FFThis monster drops^000000: Fluff.Feather.Green Herb.Clover"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "4.Creamy"
				dialog "A Monster with Beautiful Wings. 'Hah~ it's just a butterfly!'. Careless thinking like this will make you bleeding~! It is much "
				dialog "^0099FFThis monster drops^000000: Powder of Butterfly,Honey,Wing of Butterfly,Flower"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "5.Pupa"
				dialog "Monster on the Fabre's chrysalis stage. It deosn't attack at all, so easy to kill for Novice people."
				dialog "^0099FFThis monster drops^000000: chrysalis,Sticky Mucus"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "6.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "7.Rocker"
				dialog "A Lazy Grasshpper which loves playing Violin."
				dialog "^0099FFThis monster drops^000000: Grasshopper's Leg,Jellopy"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "8.Bigfoot"
				dialog "A Dull-Looking big Bear.Although it looks dumb, you will realise how it can be fast after you provoke it."
				dialog "^0099FFThis monster drops^000000: Bear's Foot,Animal's Skin,Sweet Potato"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "9.Smokie"
				dialog "It's working out all the time.Often tries to disguise itself with Raccon Leaves,but always fails. Back then, it tended to gathe"
				dialog "^0099FFThis monster drops^000000: Raccoon Leaf,Animal's Skin,Sweet Potato"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "10.Snake"
				dialog "Green Snake living in the Forest or Desert.Not poisonous but be careful."
				dialog "^0099FFThis monster drops^000000: Scale of Snakes,Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "11.Wolf"
				dialog "Wolves have blue bristle and live a nomad life. They protect each other, and annoying them will bring you a serious trouble. Ju"
				dialog "^0099FFThis monster drops^000000: Claw of Wolves,Meat,Monster's Feed,Animal's Skin"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "12.Argiope"
				dialog "A monster that moves around by using its many joints and legs. Makes people uncomfortable."
				dialog "^0099FFThis monster drops^000000: Short Leg,Zargon,Green Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "13.Argos"
				dialog "Black Giant spiders. Often attack travelers climbing the Mjolnir Mountains viciously. Anyone wanting to go over the Mjolnir Mou"
				dialog "^0099FFThis monster drops^000000: Spiderweb,Scell,Short Leg,Green Herb,Yellow Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "14.Chonchon"
				dialog "Flying monsters, they are not strong but make as annoying noises as Roda Frog. Make sure to eliminate them whenever you see."
				dialog "^0099FFThis monster drops^000000: Shell,Jellopy,Wing of Fly"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "15.Horn"
				dialog "Has a huge jaw that makes cutting sounds. Although it doesn't look all that nice, it is actually a gentle creature."
				dialog "^0099FFThis monster drops^000000: Horn,Shell,Solid Shell"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "16.Hunter Fly"
				dialog "A troublesome flying insect with powerful strength. Better walk away quickly but silently when you see one."
				dialog "^0099FFThis monster drops^000000: Solid Shell,Zargon"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "17.Mantis"
				dialog "A monster that runs around, waving the small fan every now and then."
				dialog "^0099FFThis monster drops^000000: Limb of Mantis,Scell,Solid Shell,Red Potion"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "18.Stainer"
				dialog "It has a really small, graceful round shell. But don't let your guard down just because it is small, it is much stronger than you think...and, it is especially sensitive to magic, take note."
				dialog "^0099FFThis monster drops^000000: Colorful Shell,Garlet,Shell,Solid Shell"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "19.Side Winder"
				dialog "Black snakes that make people feel grim."
				dialog "^0099FFThis monster drops^000000: Shining Scales,Zargon,Poisonous Canine,Scale of Snakes"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "20.Yoyo"
				dialog "A pink monkey monster. Often picks up items on the ground. Very dexterous and protective of its kind. Be careful."
				dialog "^0099FFThis monster drops^000000: Yoyo Tail,Banana,Yellow Herb,Animal's Skin"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "^FF0000[Earth Property Small Monster Encyclopedia]^000000"
				dialog "21.Caramel"
				dialog "The Caramel has tiny spikes all over its body. Please don't touch it in case it gets provoked."
				dialog "^0099FFThis monster drops^000000: Porcupine Spike,Animal's Skin"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "22.Steel Chonchon"
				dialog "It looks similar to Chonchons, but it has a pink body and swallows anything on the ground. It's not only strong, but is also protective of its own kinds. Remember to pick up what's on the floor right away."
				dialog "^0099FFThis monster drops^000000: Garlet,Shell,Solid Shell"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "23.Coco"
				dialog "Small vicious looking monster, often carrying an Acorn. Go beat them if you don't like it staring at you."
				dialog "^0099FFThis monster drops^000000: Acorn,Fluff,Animal's Skin,Sweet Potato"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "24.Dustiness"
				dialog "This monster owns high dodge rate because it flies. Need to be cautious if you want to attack."
				dialog "^0099FFThis monster drops^000000: Powder of Butterfly,Wing of Butterfly,Insect Feeler,Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "25.Martin"
				dialog "Funny looking Mole wearing a Safety Helmet on the head which is always busy to walk around."
				dialog "^0099FFThis monster drops^000000: Moustache of Mole,Nail of Mole"
				wait
				dialog "^FF0000[Labyrinth Forest 1F Monster Encyclopedia]^000000"
				dialog "26.Savage"
				dialog "A wild pig that often makes a 'dadadada' noise. Completely different from its infant years, it now has huge canines, quite horrible-looking."
				dialog "^0099FFThis monster drops^000000: Wild Boar's Mane,Animal's Skin"
				wait
			break
			case 2
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "1.Poring"
				dialog "Small and circular monsters of transparent pink color. Swallow anything on the ground with sparkling eyes, without any hesitati"
				dialog "They tend to eat first. So be cautious when you put down drop something on the ground. But don't worry. They are not strong, an"
				dialog "^0099FFThis monster drops^000000: Jellopy.Sticky Mucus.Apple.Empty Bottle.Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "2.Lunatic"
				dialog "Plump and shaggy monster shaped like a Rabbit.However it won't give you a 'Bunny Band'."
				dialog "^0099FFThis monster drops^000000: Clover,Feather,Carrot,Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "3.Fabre"
				dialog "Larva of Creamy. It is cute when it wiggles,even though it is a weak and small monster,"
				dialog "People often tend to slay Fabres,only for the reason they can get 'Feather's,one of required items for 'Bunny Band'."
				dialog "^0099FFThis monster drops^000000: Fluff.Feather.Green Herb.Clover"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "4.Creamy"
				dialog "A Monster with Beautiful Wings. 'Hah~ it's just a butterfly!'. Careless thinking like this will make you bleeding~! It is much "
				dialog "^0099FFThis monster drops^000000: Powder of Butterfly,Honey,Wing of Butterfly,Flower"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "5.Pupa"
				dialog "Monster on the Fabre's chrysalis stage. It deosn't attack at all, so easy to kill for Novice people."
				dialog "^0099FFThis monster drops^000000: chrysalis,Sticky Mucus"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "6.Poporing"
				dialog "Poisonous Poring in light green.Every character is the same as poring,but much more stronger."
				dialog "^0099FFThis monster drops^000000: Sticky Mucus,Garlet,Green Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "7.Rocker"
				dialog "A Lazy Grasshpper which loves playing Violin."
				dialog "^0099FFThis monster drops^000000: Grasshopper's Leg,Jellopy"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "8.Bigfoot"
				dialog "A Dull-Looking big Bear.Although it looks dumb, you will realise how it can be fast after you provoke it."
				dialog "^0099FFThis monster drops^000000: Bear's Foot,Animal's Skin,Sweet Potato"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "9.Smokie"
				dialog "It's working out all the time.Often tries to disguise itself with Raccon Leaves,but always fails. Back then, it tended to gathe"
				dialog "^0099FFThis monster drops^000000: Raccoon Leaf,Animal's Skin,Sweet Potato"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "10.Snake"
				dialog "Green Snake living in the Forest or Desert.Not poisonous but be careful."
				dialog "^0099FFThis monster drops^000000: Scale of Snakes,Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "11.Wolf"
				dialog "Wolves have blue bristle and live a nomad life. They protect each other, and annoying them will bring you a serious trouble. Ju"
				dialog "^0099FFThis monster drops^000000: Claw of Wolves,Meat,Monster's Feed,Animal's Skin"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "12.Argiope"
				dialog "A monster that moves around by using its many joints and legs. Makes people uncomfortable."
				dialog "^0099FFThis monster drops^000000: Short Leg,Zargon,Green Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "13.Argos"
				dialog "Black Giant spiders. Often attack travelers climbing the Mjolnir Mountains viciously. Anyone wanting to go over the Mjolnir Mou"
				dialog "^0099FFThis monster drops^000000: Spiderweb,Scell,Short Leg,Green Herb,Yellow Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "14.Horn"
				dialog "Has a huge jaw that makes cutting sounds. Although it doesn't look all that nice, it is actually a gentle creature."
				dialog "^0099FFThis monster drops^000000: Horn,Shell,Solid Shell"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "15.Hunter Fly"
				dialog "A troublesome flying insect with powerful strength. Better walk away quickly but silently when you see one."
				dialog "^0099FFThis monster drops^000000: Solid Shell,Zargon"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "16.Mantis"
				dialog "A monster that runs around, waving the small fan every now and then."
				dialog "^0099FFThis monster drops^000000: Limb of Mantis,Scell,Solid Shell,Red Potion"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "17.Stainer"
				dialog "It has a really small, graceful round shell. But don't let your guard down just because it is small, it is much stronger than you think...and, it is especially sensitive to magic, take note."
				dialog "^0099FFThis monster drops^000000: Colorful Shel,Garlet,Shell,Solid Shell"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "18.Side Winder"
				dialog "Black snakes that make people feel grim."
				dialog "^0099FFThis monster drops^000000: Shining Scales,Zargon,Poisonous Canine,Scale of Snakes"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "19.Yoyo"
				dialog "A pink monkey monster. Often picks up items on the ground. Very dexterous and protective of its kind. Take note."
				dialog "^0099FFThis monster drops^000000: Yoyo Tail,Banana,Yellow Herb,Animal's Skin"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "20.Caramel"
				dialog "The Caramel has tiny spikes all over its body. Please don't touch it in case it gets provoked."
				dialog "^0099FFThis monster drops^000000: Porcupine Spike,Animal's Skin"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "21.Steel Chonchon"
				dialog "It looks similar to Chonchons, but it has a pink body and swallows anything on the ground. It's not only strong, but is also protective of its own kinds. Remember to pick up what's on the floor."
				dialog "^0099FFThis monster drops^000000: Garlet,Shell,Solid Shell"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "22.Coco"
				dialog "Small vicious looking monster, often carrying an Acorn. Go beat them if you don't like it staring at you."
				dialog "^0099FFThis monster drops^000000: Acorn,Fluff,Animal's Skin,Sweet Potato"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "23.Dustiness"
				dialog "This monster owns high dodge rate because it flies. Need to be cautious if you want to attack."
				dialog "^0099FFThis monster drops^000000: Powder of Butterfly,Wing of Butterfly,Insect Feeler,Red Herb"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "24.Martin"
				dialog "Funny looking Mole wearing a Safety Helmet on the head which is always busy to walk around."
				dialog "^0099FFThis monster drops^000000: Moustache of Mole,Nail of Mole"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "25.Savage"
				dialog "A wild pig that often makes a 'dadadada' noise. Completely different from its infant years, it now has huge canines, quite horrible-looking."
				dialog "^0099FFThis monster drops^000000: Wild Boar's Mane,Animal's Skin"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "26.Savage Babe"
				dialog "Small pink savage monster. Although it has a small body, but it makes noisy grunts and darts around everywhere."
				dialog "^0099FFThis monster drops^000000: Animal's Skin,Meat,Arrow,Feather"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "27.Mastering"
				dialog "A giant Poring monster sometimes found in the Morroc deserts or the Mjolnir Mountains, as well as strange dungeons in Prontera. Probably some sort of Poring leader. Although it is strong than normal porings, but porings are porings..."
				dialog "^0099FFThis monster drops^000000: Apple,Apple Juice"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "28.Eclipse"
				dialog "A Lunatic monster larger than the Lunatic! Although it has weak attack power, it also has a long and enduring life."
				dialog "^0099FFThis monster drops^000000: Carrot,Glass Bead,Milk,Carrot Juice"
				wait
				dialog "^FF0000[Labyrinth Forest 3F Monster Encyclopedia]^000000"
				dialog "29.Baphomet"
				dialog "A vicious monster with giant horns. Although it holds a scythe, it sometimes attacks with its bare hands."
				dialog "^0099FFThis monster drops^000000: Evil Horn,Yggdrasilberry,Animal's Skin,Oridecon"
				wait
			break
			case 3
				close
				exitwhile
			break
			endchoose
		endwhile
		return
	break
	case 3
		close
	break
	endchoose
return

//====================================================================================================
// 상인.제철공 길라잡이
npc "prt_in" "Easy Merchant Guide" HIDDEN_NPC 162 68 4 0 0
OnClick:
	dialog "^FF0000[Easy Vending Guide]^000000"
	dialog "Please choose 'Next' if you want to learn about the Vending skill."
	wait
	choose menu "Next." "Cancel."
	case 1
		dialog "^FF0000[Vending Guide]^000000"
		dialog "To open a vending store, you must first have a ^0099FFPushcart^000000."
		dialog "Pushcarts can be rent from the Pushcart merchant or some of the Kapra Staff. You can not fight when a pushcart is equipped with you. Even if you fight, the pushcart will not be automatically cancelled."
		wait
		dialog "^FF0000[Vending Guide]^000000"
		dialog "Equipping a pushcart will slow down your movement. This can be rectified by raising your Pushcart skill."
		wait
		dialog "^FF0000[Vending Guide]^000000"
		dialog "You can train the Vending skill after you have gained Lv 3 in your Pushcart skill. You will start by vending 3 items at a time."
		dialog "The higher your Vending skill you have, the more items you can sell at a time."
		wait
		dialog "^FF0000[Vending Guide]^000000"
		dialog "Put what you want to vend from your pushcart."
		dialog "You may use the hot-key ^0099FFalt+W^000000 to see what's in the pushcart. Or you may click on the ITEM button in your equipment (Alt + Q) window."
		wait
		dialog "^FF0000[Vending Guide]^000000"
		dialog "When you use the vending skill, you will see the vending store and the items for sale windows."
		wait
		dialog "^FF0000[Vending Guide]^000000"
		dialog "Name your store in the vending store window, then place your items and specify quantities for each item for sales. Lastly fill in the prices."
		wait
		dialog "^FF0000[Vending Guide]^000000"
		dialog "To shut down your store, just close the store window. You may choose the items in the store window to see your prices. The chat window will also list what and how many were sold."
		wait
		dialog "^FF0000[Vending Guide]^000000"
		dialog "The vending store shuts down automatically when all items sells out."
		close
	break
	case 2
		close
	break
	endchoose
return

npc "prt_in" "Forge Guide" HIDDEN_NPC 168 68 4 0 0
OnClick:
	dialog "^FF0000[Forge Guide]^000000"
	dialog "A detailed description for the ore refining and weapon forging skills."
	wait
	choose menu "Ask about ore refining." "Ask about weapon forging." "Cancel."
	case 1
		dialog "^FF0000[Ore Forge Guide]^000000"
		dialog "Please choose 'Next' to find out about the ore refining skills."
		wait
		choose menu "Next." "Cancel."
		case 1
			dialog "^FF0000[Forge Guide]^000000"
			dialog "Low grade ores like the Iron Ore or the Enchanted Stones can be refined into high grade stones. This skill needs to use the ^0099FFPortable Furnace^000000 item."
			dialog "Each high grade stone requires many lower grade ores to produce."
			wait
			dialog "^FF0000[Ore Forge Guide]^000000"
			dialog "When you have collected enough ores, double click on the portable furnace. Each finished stone will use up 1 portable furnace."
			wait
			dialog "^FF0000[Ore Forge Guide]^000000"
			dialog "If you have enough ores, then a new window will pop up, listing all those high grade stones you can produce. Choose the one you want to proceed with the refinement."
			wait
			dialog "^FF0000[Ore Forge Guide]^000000"
			dialog "Note that there is a possibility of a failure in refining."
			close
		break
		case 2
			close
		break
		endchoose
		return
	break
	case 2
		dialog "^FF0000[Weapon Forge Guide]^000000"
		dialog "Please choose 'Next' to find out more about weapon forging."
		wait
		choose menu "Next." "Cancel."
		case 1
			dialog "^FF0000[Weapon Forge Guide]^000000"
			dialog "This is an introduction on skills to forge Swords, Twohand Swords, Spears, Maces and Claw/Knuckles."
			wait
			dialog "^FF0000[Weapon Forge Guide]^000000"
			dialog "To forge any weapon, you need the item ^0099FFSteel^000000. In addition, you'll also need a ^0099FFHammer^000000.Hammers are consumables, each forging attempt expends one hammer."
			wait
			dialog "^FF0000[Weapon Forge Guide]^000000"
			dialog "If you can successfully select and use a hammer, then a window will pop up to show the amount of steel you have and the quantities of materials required, as well as which items can be forged."
			dialog "Just select the weapon you want to forge to see the items and quantities required. These will be consumed automatically in the forging process, you just have to check and see."
			wait
			dialog "^FF0000[Weapon Forge Guide]^000000"
			dialog "There are three slots beneath the forging window. Inserting special items such as enchanted stones or Star Crumbs can give the weapon special power."
			wait
			dialog "^FF0000[Weapon Forge Guide]^000000"
			dialog "But according to the materials you add, your success rate can drop significantly."
			close
		break
		case 2
			close
		break
		endchoose
		return
	break
	case 3
		close
	break
	endchoose
return
