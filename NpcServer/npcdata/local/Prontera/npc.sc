//====================================================================================================
// 프론테라
//====================================================================================================
// 도서관
/*npc "prt_in" "Library Master" 1_M_LIBRARYMASTER 178 92 0 0 0
OnClick:
	dialog "[Library Master Keith]"
	dialog "In our library, the data of all the monsters in Rune Midgard Kingdom dungeon are sorted dungeion by dungeon. You can clearly look up for monsters and find any information about them."
	dialog "There are many books that adventurers must read. Just scan through those books!"
	wait
	dialog "[Library Master Keith]"
	dialog "In the next library, the data of monsters are sorted by characters."
	dialog "If you are interested, go get what you want!"
	close
return*/

npc "prt_in" "Library Girl" 1_F_LIBRARYGIRL 175 50 0 0 0
OnClick:
	dialog "[Library Girl Allen]"
	dialog "Welcome! The data in this library are sorted by the characters of the monsters. You can read relevant books here. There are also books about Merchant and Blacksmith here."
	dialog "Ah! The next library is worth to visit as well. You might wanna go in there."
	close
return

//====================================================================================================
// 여관1
npc "prt_in" "Inn Keeper" 1_M_INNKEEPER 244 135 0 0 0
OnClick:
	dialog "[Inn Keeper Sammy]"
	dialog "Welcome!...Welcome to Motel Naklas. Can I help you?"
	wait
	choose menu "Save" "Take Rest - 5,000 zeny" "Cancel"
	case 1
		dialog "[Inn Keeper Sammy]"
		dialog "All right, It's saved! You can see me next time again! Poop~ Poop~"
		checkpoint "prt_in" 238 130
		close
	break
	case 2
		if v[VAR_MONEY] > 4999
			dialog "[Inn Keeper Sammy]"
			dialog "Please take a good rest."
			close
			dropgold 5000
			hpheal 100
			spheal 100
			moveto "prt_in" 247 104
		else
			dialog "[Inn Keeper Sammy]"
			dialog "The service charge is 5,000 zeny."
			dialog "Please make sure you have enough money for the service."
			close
		endif
	break
	case 3
	break
	endchoose
return

//====================================================================================================
// 여관2
npc "prt_in" "Inn Keeper" 1_M_INNKEEPER 61 141 4 0 0
OnClick:
	dialog "[Inn Keeper Arma]"
	dialog "Welcome!...Welcome to Motel Naklas. Can I help you?"
	wait
	choose menu "Save" "Take Rest - 5,000 zeny" "Cancel"
	case 1
		dialog "[Inn Keeper Arma]"
		dialog "All right, It's saved here! Thanks for your visit~ See you later!~"
		checkpoint "prt_in" 64 136
		close
	break
	case 2
		if v[VAR_MONEY] > 4999
			dialog "[Inn Keeper Arma]"
			dialog "Please take a good rest."
			close
			dropgold 5000
			hpheal 100
			spheal 100
			moveto "prt_in" 60 166
		else
			dialog "[Inn Keeper Arma]"
			dialog "The service charge is 5,000 zeny."
			dialog "Please make sure you have enough money for the service."
			close
		endif
	break
	case 3
	break
	endchoose
return

//====================================================================================================
// 지하수로 원 지역
npc "prt_in" "Temple Hero" 8W_SOLDIER 88 105 2 0 0
OnClick:
	if v[sewer_prt] == 1
		dialog "[Temple Hero]"
		dialog "You are now a member of drainage task force. Do you want to go to the enterance?"
		wait
		choose menu "Go into the entrance." "Cancel."
		case 1
			moveto "prt_fild05" 274 208
		break
		case 2
		break
		endchoose
		return
	endif
	dialog "[Temple Hero]"
	dialog "We've got a message from the Capital Defense Command of Rune Midgarts Kingdom."
	dialog "It says the Command is recruiting a lot of courageous young men to fight drainage monsters not to have that kind of accident any more!!"
	wait
	choose menu "Join the forces." "What accident....?" "Cancel."
	case 1
		setitem sewer_prt 1
		dialog "[Temple Hero]"
		dialog "You are accepted by the Command. I thank all of you joined the forces to protect our country and people on behalf of Capital Defense Command."
		dialog "These are supplies for new soldiers. 3 Red Potions, 1 Milk."
		dialog "And for the emergency... 1 Orange Potion."
		getitem Red_Potion 3
		getitem Milk 1
		getitem Orange_Potion 1
		wait
		dialog "[Temple Hero]"
		dialog "Click on 'Confirm' button, and I will send you to the entrance linked to the drainage."
		wait
		moveto "prt_fild05" 274 208
	break
	case 2
		dialog "[Temple Hero]"
		dialog "You haven't heard about it yet?"
		dialog "The accident that the dirts and maggots of bugs have flown out through this drainage. It was a big news one day!"
		wait
		dialog "[Temple Hero]"
		dialog "Since then, The Epidemic Control Center has prohibited drinking tap water."
		dialog "And because of that, people in Prontera are in short of potable water and Distrust about the Nation is being spread among the citizens."
		dialog "If things don't improve, the public sentiment will go worse!"
		wait
		dialog "[Temple Hero]"
		dialog "Right! It is high time that we took actions!"
		dialog "Every bit of your effort will guarantee our children's bright future!"
		dialog "The Nation and the people need you now!!! Sign up for the force!"
		wait
		choose menu "Sign up." "Quit."
		case 1
			setitem sewer_prt 1
			dialog "[Temple Hero]"
			dialog "You are accepted by the Command. I thank all of you joined the forces to protect our country and people on behalf of Capital Defense Command."
			dialog "These are supplies for new soldiers. 3 Red Potions, 1 Milk."
			dialog "And for the emergency... 1 Orange Potion."
			getitem Red_Potion 3
			getitem Milk 1
			getitem Orange_Potion 1
			wait
			dialog "[Temple Hero]"
			dialog "Click on 'Confirm' button, and I will send you to the entrance linked to the drainage."
			wait
			moveto "prt_fild05" 274 208
		break
		case 2
			dialog "[Temple Hero]"
			dialog ".............."
			close
		break
		endchoose
	break
	case 3
	break
	endchoose
return

//====================================================================================================
// 지하수로 변경 지역
npc "prt_fild05" "Drainage Soldier" 8W_SOLDIER 270 212 5 0 0
OnClick:
	if v[sewer_prt] == 0
		dialog "[Drainage Soldier]"
		dialog "Sorry, but... This entrance is for the soldiers of Drainage Task Force only!"
		dialog "You can sign up for the force in ^000077Prontera Temple^000000. It is located in a building at the end of northwest of Prontera..."
		close
		return
	endif
	dialog "[Drainage Soldier]"
	dialog "This is the entrance of the drainage."
	wait
	choose menu "Into the drainage.." "Cancel."
	case 1
		moveto "prt_sewb1" 131 247
	break
	case 2
	break
	endchoose
return

//==============================<프론테라-수문장>===============================
npc "prontera" "Guard" 8W_SOLDIER 160 330 0 0 0
OnClick:
	dialog "Welcome to Prontera."
	close
return

npc "prontera" "Soldier" 8W_SOLDIER 223 99 1 0 0
OnClick:
	dialog "Welcome to Prontera."
	close
return

npc "prontera" "Soldier" 8W_SOLDIER 229 104 5 0 0
OnClick:
	dialog "Welcome to Prontera."
	close
return

npc "prontera" "Soldier" 8W_SOLDIER 47 339 5 0 0
OnClick:
	dialog "Welcome to Prontera."
	close
return

npc "prontera" "Soldier" 8W_SOLDIER 52 344 5 0 0
OnClick:
	dialog "Welcome to Prontera."
	close
return

//==============================<프론테라-NPC>===============================
npc "prontera" "Man" 4W_M_02 101 288 3 0 0
OnClick:
	dialog "[Man]"
	dialog "There is a pink monster called ^000077Poring^000000 outside the town."
	dialog "It looks cute and harmless. Nothing is special about it. However, I heard when it sees anything dropped on the ground, it sucks it in right away."
	wait
	dialog "[Man]"
	dialog "People often get embarrassed when Porings eat their belongings! But, that's not a big deal cause Porings are weak..."
	dialog "^000077Poporing^000000, a green Poring, is stronger than Poring. If you just consider it as a small poring and tease it, you will get in troubles..."
	close
return

npc "prontera" "Terno" 4W_M_01 54 240 6 0 0
OnClick:
	dialog "[Terno]"
	dialog "Did you know that? The Larva of Creamy is Fabre."
	dialog "Fabre grows up to be Pupa. "
	dialog "They are in different shapes, but adults look the same. They live in the desert."
	wait
	dialog "[Terno]"
	dialog "About Pecopeco..."
	dialog "Picky is the baby of Pecopeco."
	dialog "Picky looks really cute and totally different from Pecopeco?!"
	close
return

npc "prontera" "Woman" 4_F_02 106 116 6 0 0
OnClick:
	dialog "[Woman]"
	dialog "I went on a picnic with my family on a holiday. When I was taking a walk around a quiet place, I found something amazing... A swarm of bee."
	wait
	dialog "[Woman]"
	dialog "I've never seen that kind of big swarm of bees. What is more astonishing is a Queen bee was controlling thousands of bees."
	dialog "It is merely honey that controls all the working bees..... It would be fantastic if I can control all the men like the Queen bee does.."
	close
return

npc "prontera" "Norby" 8_F 160 133 2 0 0
OnClick:
	dialog "[Norby]"
	dialog "Although they are the same kinds, some of them transformed into violent one.."
	dialog "You really shouldn't touch them... It could be a digaster..."
	wait
	dialog "[Norby]"
	dialog "You can judge them by their glowing light..."
	dialog "The more powerful monsters they are, the more dangerous colors they have..."
	close
return

npc "prontera" "Jorlo" 8_F_GIRL 149 202 2 0 0
OnClick:
	dialog "[Jorlo]"
	dialog "Ordin is our God. God of War and God of Knowledge.."
	dialog "He even lost his one eye to acquire knowledge. The statue in the middle of that fountain over there is God Ordin."
	wait
	dialog "[Jorlo]"
	dialog "But, I'm somewhat disappointed.. Whoever the sculpter is.. He could have made it better than this one!!!"
	dialog "The statue looks different from the real Ordin what we know now.. Is that something called 'creativity'...?"
	wait
	dialog "[Jorlo]"
	dialog "Look! He's not wearing his big green cap and he is not riding his magic horse. That's so insincere!"
	close
return

npc "prontera" "Stellaip" 1_M_02 216 70 2 0 0
OnClick:
	if v[VAR_JOB] == NOVICE
		if v[event_prt_nov_dreamtalk] == 0
			dialog "[Stellaip]"
			dialog "I'm going to be a great knight. That's what I'm being trained for now! Ehe~ he~ he~"
			dialog "I need to start from a swordman. So, I'm practicing hard. You also trying hard to fulfill your dream, right??"
			wait
			choose menu "Yes" "No"
			case 1
				setitem event_prt_nov_dreamtalk 1
				dialog "[Stellaip]"
				dialog "To become a swordman... you have to go to Izlude, the satellite city of Prontera, and pass the exam."
				dialog "I once failed to pass the exam.. But, I won't make the same mistake twice!"
				wait
				dialog "[Stellaip]"
				dialog "Practice! Practice! And more practice!"
				dialog "Cheer up! And let's get together again when we got stronger!"
				close
				return
			break
			case 2
				dialog "[Stellaip]"
				dialog "Come on~! You gotta choose what you're going to be!"
				dialog "Otherwise, you will regret in the future!"
				close
				return
			break
			endchoose
		else
			dialog "[Stellaip]"
			dialog "Wey! Wey! Wey!"
			close
			return
		endif
	elseif v[VAR_JOB] != NOVICE
		if v[event_prt_nov_dreamtalk] == 1
			dialog "[Stellaip]"
			dialog "Eh? Have I met you before?"
			dialog "Wow~ WaWa! Ohho! Look at you! You look awesome~ I really envy you. Yap! Now, I gotta work on my training harder.."
			dialog "Try harder!!"
			wait
			setitem event_prt_nov_dreamtalk 2
			getitem Hood 1
			dialog "[Stellaip]"
			dialog "Hmm.. Heh! Heh! Come on~ Pick it up.. I want to be more encouraged by you!!"
			dialog "This is my reward."
			close
			return
		elseif v[event_prt_nov_dreamtalk] == 2
			dialog "[Stellaip]"
			dialog "Darn it!"
			close
			return
		else
			dialog "[Stellaip]"
			dialog "I will be a great knight! That's why I'm training myself hard. Ehe~ he~ he~"
			dialog "Er! W..What? You don't believe me..? Hmm.. Are you looking down on me?"
			wait
			dialog "[Stellaip]"
			dialog "I know.. I know.. I have to be a swordman first to be a knight!"
			dialog "See? That's why I'm working hard!!"
			wait
			dialog "[Stellaip]"
			dialog "I feel happy whenever I see swordmen promote to knights from here... I'm getting excited, too!"
			dialog "So... I here in Prontera to practice hard!!"
			wait
			choose menu "Try hard." "Give up."
			case 1
				dialog "[Stellaip]"
				dialog "Of course! Someday if I get strong like you..."
				dialog "And if we run into each other.. please say hello!"
				close
			break
			case 2
				dialog "[Stellaip]"
				dialog "Uh-oh~! Alright! Just wait and see! I promise I will be stronger than you someday!"
				close
			break
			endchoose
		endif
	endif
return

npc "prt_in" "Uncle" 1_M_KNIGHTMASTER 47 141 0 0 0
OnClick:
	dialog "[Uncle]"
	dialog "People haven't entered this drainage for a long time! According to an adventurer who explored the drainage lately, the drainage has been the heaven for ^000077Thief Bug^000000."
	wait
	dialog "[Uncle]"
	dialog "Nobody eats Thief Bugs and they reproduce so fast... They are just like cockroaches surviving until the end of the earth!!!"
	close
return

npc "prt_in" "Uncle" 1_M_JOBGUIDER 26 31 0 0 0
OnClick:
	dialog "[Uncle]"
	dialog "You might not believe me! But, I saw something unbelievable in the ^000077drainage^000000."
	dialog "I'm the 3rd generation repairing the drainage of Prontera... I know everything about the drainage..."
	dialog "I think it was on the 4th floor. From there, I saw a glaring ^000077Thief Bug^000000 in the darkness."
	wait
	dialog "[Uncle]"
	dialog "Glaring Thief Bug!?!? How could that kind of small thief bug release Holy light?! There's always something that glowing in the world..."
	close
return

//====================================================================================================
// 프론테라 주점
npc "prt_in" "Bartender" 1_M_PUBMASTER 180 20 2 0 0
OnClick:
	dialog "[Bartender]"
	dialog "Hu~ Hu~ More and more people are getting around here!"
	dialog "It's a tough business although it makes good profit..."
	dialog "..hard to collect materials these days."
	wait
	dialog "[Bartender]"
	dialog "As you know, more and more violent beasts are increasing around the town..."
	dialog "And, We can't keep providing our special menus with the ordinary ingredients..."
	wait
	dialog "[Bartender]"
	dialog "Briefly... some super-trooper hunters that we hired provided us with special materials for our special menus"
	dialog "Those are fresh and of best quality... but not many quantity..."
	dialog "We can't ask them too much cause it's getting hard to hunt...."
	wait
	dialog "[Bartender]"
	dialog "Under current circumstances.. Our special menus 'Sour and crunch' & 'Fried grasshopper'..."
	wait
	while(1)
		choose menu "'Sour and crunch'?" "'Fried grasshopper'?" "Quit."
		case 1
			dialog "[Bartender]"
			dialog "It is made of Super ants from the ant cave which is located on the way to the desert city, Morroc."
			dialog "The number of ants there has grown up a lot... and they got very violent.. So.. ordinary hunters are reluctant to go in there..."
			wait
			dialog "[Bartender]"
			dialog "Now, it feels like that the fame of our restaurant will remain in the legend... undesirable...Huh~"
			wait
		break
		case 2
			dialog "[Bartender]"
			dialog "Fried grasshopper was the best menu having the taste of sesame oil.. It is made of grasshoppers living in the western forest. "
			dialog "Nowadays, grasshoppers are getting aggressive... To make things worse, swarms of bees have appeared and they are threatening..."
			wait
			dialog "[Bartender]"
			dialog "Now, it feels like that the fame of our restaurant will remain in the legend... undesirable...Huh~"
			wait
		break
		case 3
			dialog "[Bartender]"
			dialog "Be careful always~"
			close
			exitwhile
		break
		endchoose
	endwhile
return

npc "prt_in" "Hubite" 4_M_03 173 24 2 0 0
OnClick:
	dialog "[Hubite]"
	dialog "Hey! Buddy~! Come on up here for a drink... I've got many interesting stories..."
	dialog "I've been to all the places around Prontera!"
	dialog "Places with a bunch of monsters... Places easy to level up..."
	wait
	choose menu "How come have you been to those places?" "Quit."
	case 1
		dialog "[Hubite]"
		dialog "I'm a very talented man~! I can do anything!!!"
		dialog "I carry weapons for hunters... I deliver things for them..."
		dialog "Some people say I'm only a delivery man!"
		wait
		dialog "[Hubite]"
		dialog "But, I'm really proud of my job. You know it's a tough world outside!"
		dialog "I take all the risk and acomplish my missions at all times!"
		wait
		dialog "[Hubite]"
		dialog "Travelling around many places... I sometimes discover unusual places that people can't find..."
		dialog "That gives me the joyness of travel..."
		dialog "Hmm... I... I'm thinking of the strange cave and dangerous forest.."
		wait
		choose menu "Strange cave?" "Dangerous forest?" "End Conversation."
		case 1
			dialog "[Hubite]"
			dialog "Hmm.. Yeah..I followed some hunters going into the strange cave in the north of Prontera."
			wait
			dialog "[Hubite]"
			dialog "Although there are many outrageous monsters... there are also a lot of precious treasures."
			dialog "I was there with some experienced hunters, but we still got lost often..."
			wait
			dialog "[Hubite]"
			dialog "No matter which way we take... every path seems to be the same one... We could go further any more.."
			dialog "So... we came back with empty hands... Someday, I'm gonna try again!"
			wait
			choose menu "How do I get there?" "Quit."
			case 1
				dialog "[Hubite]"
				dialog "What? You even didn't explore the very outskirts of Prontera..."
				dialog "Go out through the north gate! It is located in the north corner of the forest..."
				close
			break
			case 2
				dialog "[Hubite]"
				dialog "Alright.. Always watch yourself when you travel..."
				close
			break
			endchoose
		break
		case 2
			dialog "[Hubite]"
			dialog "Keep going to the northeast from Prontera. There are nice remains... I've been to the ruins to deliver something to a priest."
			dialog "Before the ruins, there was a bush with bunch of monkeys and raccoons."
			wait
			dialog "[Hubite]"
			dialog "You gotta be careful when you get there... Don't ever drop things on the ground... Then, monkeys will swiftly take everything."
			wait
			choose menu "How do I get there?" "Quit listening!"
			case 1
				dialog "[Hubite]"
				dialog "The route is quite complicated. But, you will find it soon if you go traight to the north and then to the east."
				dialog "Watch out for violent grasses during the trip ... They attack people mercilessly..."
				close
			break
			case 2
				dialog "[Hubite]"
				dialog "Alright!..Watch out for dangers.. always~"
				close
			break
			endchoose
		break
		case 3
			dialog "[Hubite]"
			dialog "Alright..Always be careful when you go out!"
			close
		break
		endchoose
	break
	case 2
		dialog "[Hubite]"
		dialog "Hmm.. Visit me again whenever you got something to ask me..."
		close
	break
	endchoose
return

npc "prt_in" "Tanhu" 4W_M_01 177 20 2 0 0
OnClick:
	var talk_random = 1 3
	if talk_random == 1
		dialog "[Tanhu]"
		dialog "What? You are sick of fighting monsters both in the forest and dungeons?"
		dialog "Huh! Huh! Huh! You think you got strong enough now..."
		dialog "Then, go to Izlude, the satellite city of Prontera."
		wait
		dialog "[Tanhu]"
		dialog "There is a company called Jone's. It often holds time limit fighting competition and group fighting competition in Arena."
		dialog "And those competition encourage bored young men..."
		dialog "I know it will cost a little bit much."
		wait
		dialog "[Tanhu]"
		dialog "But, why don't you go have a fun?"
		close
	elseif talk_random == 2
		dialog "[Tanhu]"
		dialog "I've been to Al De Baran once. There were so many horrible monsters..."
		dialog "Well.. I did nothing to them but they attacked me first... It was very scary..."
		wait
		dialog "[Tanhu]"
		dialog "But the scenery on the way was terrific... I really enjoyed it!!!"
		dialog "There are some beautiful canals around Al De Baran!"
		wait
		dialog "[Tanhu]"
		dialog "Plus, there's the Kapra headquater which means you can get wonderful services... COme on! Go visit there... What are you waiting for?"
		close
	else
		dialog "[Tanhu]"
		dialog "Terlistan III is our king, the king of Prontera... Thanks to his great governance, Prontera could've flourished so far."
		wait
		dialog "[Tanhu]"
		dialog "By the way, Do you see the outsiders sitting at the corner... Should we always take their immigration...?"
		dialog "Well.. The Immigration authority is too generous!"
		close
	endif
return

npc "prt_in" "Marbi" 1_F_PUBGIRL 177 18 2 0 0
OnClick:
	dialog "[Marbi]"
	dialog "Generally, 10 is the maximum for skill levels.. Since the skill points are limited, some people worry about distributing points..."
	wait
	dialog "[Marbi]"
	dialog "Hmm.. some of skills you have to give up to learn other skills... You can't master all the skills.."
	dialog "But, like the saying there's no rule without exceptions... You don't have to spend 10 points all the way to master a skill!"
	wait
	dialog "[Marbi]"
	dialog "There's a skill of level 5, and even more some skills can be mastered at level 1 or 2."
	dialog "Nothing is as pitiful as when you can't learn a skill even though it's very useful because you might make a mistake..."
	wait
	dialog "[Marbi]"
	dialog "So, you'd better gather some information about skills first... And then, you can practice..."
	dialog "That's how you save your skill points effectively..."
	close
return

//====================================================================================================
// 프론테라 성당
npc "prt_church" "Karna" 1_F_02 103 76 0 0 0
OnClick:
	dialog "[Karna]"
	dialog "Oh! Are you looking for the way how to help others and make them happy?"
	dialog "Then.. you're lucky! We have the ability to do so..."
	wait
	dialog "[Karna]"
	dialog "We can make people recover from fatigue...and let them bring out their potential power."
	dialog "Ehehe~ You can ask me anything... I've got a great store of knowledge"
	wait
	while(1)
		choose menu "About Heal" "About Cure" "About Increasing Agility" "About Angelus" "About Blessing" "About Warp Portal" "Quit"
		case 1
			dialog "[Karna]"
			dialog "Cure is a kind of skill which can restore anyone's HP."
			dialog "With Heal leve 2, you can correct abnormal status."
			dialog "If you become a Priest you can use it to build a Santuary zone to revive lives."
			wait
			dialog "[Karna]"
			dialog "Let me tell you a secret.. If you apply this skill to Undead monsters..."
			dialog ".., they get damages. Don't forget to push 'shift' when you use it.. Ehe!he!he! Sheee!"
			wait
		break
		case 2
			dialog "[Karna]"
			dialog "Cure is a kind skill which can restore people in abnormal status."
			dialog "Heal level should be at least 2 to learn this skill!"
			wait
		break
		case 3
			dialog "[Karna]"
			dialog "This is a skill which makes you move faster and attack more quickly."
			dialog "And you will dodge more quickly as well."
			dialog "Right! Heal level should be at least 3 to use that skill."
			wait
		break
		case 4
			dialog "[Karna]"
			dialog "Angelus is a skill to strengthen defensive power of myself and others."
			dialog "But, you can apply this skill to the members of your party only."
			wait
			dialog "[Karna]"
			dialog "To use Angelus... The level of Divine Protection, a skill increasing self-defense against Undead monsters, should be at least 3."
			dialog "If you have learned Angelus and... And then, you will be able to..."
			dialog "learn Kyrie Eleison which can defend you perfectly just for once."
			wait
		break
		case 5
			dialog "[Karna]"
			dialog "Blessing can temporarily increase 'STR', 'DEX' and 'INT'..."
			dialog "Using Blessing, you can encourage your friends!!"
			wait
			dialog "[Karna]"
			dialog "Blessing also needs the skill, Divine Protection, like Angelus."
			dialog "The only difference is you need two more points than Angelus needs."
			wait
		break
		case 6
			dialog "[Karna]"
			dialog "You need to learn how to teleport yourself before you open a warp portal."
			dialog "Before you learn teleportation, you have to learn Ruwach first."
			dialog "Ruwach is a skill detecting hidden monsters."
			wait
			dialog "[Karna]"
			dialog "After you've learned how to open a warp portal, you can save 4 maximum warp zones by training!"
			dialog "But, remember that one of the zones should be the place which is saved by a Kafra employee..."
			wait
			dialog "[Karna]"
			dialog "I know it's going to be inconvenient... However, you should type in the command /memo at the spot where you want to be teleported to save a warp zone."
			dialog "That will quite dangerous... Move quickly and once after you save a warp zone... get out of there using teleportation."
			dialog "Opening a warp portal requires huge amount of energy!"
			wait
			dialog "[Karna]"
			dialog "You can get extra energy from 'Blue Gemstone'."
			dialog "And dungeons don't come under warp zones... Keep in mind that!"
			wait
		break
		case 7
			dialog "[Karna]"
			dialog "Heh! I think I've been showing off too much! Be happy... Always~!"
			close
			exitwhile
		break
		endchoose
	endwhile
return

npc "prt_church" "Henson" 2_M_PHARMACIST 103 71 0 0 0
OnClick:
	dialog "[Henson]"
	dialog "It's a good thing to help people..."
	dialog "However, our mission is to purify pathetic lives of undead monsters."
	dialog "We gotta train our skills hard! So, what do you need?"
	wait
	while(1)
		choose menu "About Devine Protection" "About Demonbane" "About Decreasing Agility" "About Angelus" "About Pneuma" "About Ruwach" "About Teleport" "End Conversation"
		case 1
			dialog "[Henson]"
			dialog "To increase the defensive power against the Undead monsters you need to work on the Devine Protection skill."
			dialog "This is the basic skill... And you don't have to worry about the time length."
			wait
			dialog "[Henson]"
			dialog "If you level up the skill by 3 points, you can learn Demonbane, a skill to increase the damage of attacks against Undead monsters."
			dialog "you can use Angelus to increase the defensive and Blessing to increase your 'STR', 'DEX', 'INT' temporarily."
			wait
		break
		case 2
			dialog "[Henson]"
			dialog "This is the Demonbane that increases the power of attacks against Undead monsters."
			dialog "You need to learn Divine Protection a little to use the skill.. Like Divine Protection, Demonbane deosn't have time limit!"
			wait
			dialog "[Henson]"
			dialog "And, with level 3 of Demonbane... you can learn Signum Crewsis.. This skill enables you to decrease the defense of dark-charactered monsters."
			wait
		break
		case 3
			dialog "[Henson]"
			dialog "With this skill, you can slower the motion of enemies... And the attack speed and the dodge speed of targets can be decreased as well."
			dialog "You need at least 1 level of agility to use this skill."
			wait
		break
		case 4
			dialog "[Henson]"
			dialog "This skill is for decreasing the defense of Undead monsters and dark charactered monsters... And the effective range is pretty long!"
			dialog "It is highly difficult and it doesn't work every time. Remember that!"
			wait
			dialog "[Henson]"
			dialog "To use this skill, you have to be at least level three with Demonbane which increases your power to fight the Undead monsters."
			wait
		break
		case 5
			dialog "[Henson]"
			dialog "If you master the warp portal opening skill, you can use this skill."
			dialog "With this skill, you can set up a shield zone covering a certain range of areas.. In this zone, you are totally safe from missile attacks."
			wait
		break
		case 6
			dialog "[Henson]"
			dialog "You can detect hidden monsters by this skill. This is a prerequisite skill to learn teleport."
			wait
		break
		case 7
			dialog "[Henson]"
			dialog "Teleportation can be obtained once after you've mastered Ruwach which detects hidden monsters..."
			dialog "For the bigginer's level, this skill might send you to unwanted places.. But, When mastered, you can teleport to the place where you had a Kafra saved..."
			wait
			dialog "[Henson]"
			dialog "And for the next, you can teleport others as well to a saved zone using Warp Portal..."
			wait
		break
		case 8
			dialog "[Henson]"
			dialog "Come visit me again whenever you got questions!"
			close
			exitwhile
		break
		endchoose
	endwhile
return

//=========================== <미궁숲앞> ---------------------------------
npc "prt_maze02" "Soldier" 8W_SOLDIER 100 69 0 0 0
OnClick:
	dialog "[Soldier]"
	dialog "I don't know what you are up to... But, you'd better not go into that forest! There said to live a devil in that forest.."
	dialog "No one had come back from the forest... and we can't confirm the rumor.. But... Hmm... if you insist, you can go in there..."
	close
return

npc "prt_maze02" "Soldier" 8W_SOLDIER 110 69 0 0 0
OnClick:
	dialog "[Soldier]"
	dialog "Hu... The last guy who has entered the forest is not coming back just like lost people... He said he's going to collect an hearb from the forest and then disappeared..."
	dialog "I would never sacrifice my life for that little herb thing..."
	close
return
