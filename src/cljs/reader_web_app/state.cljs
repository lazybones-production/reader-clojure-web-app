(ns reader-web-app.state
  (:require [alandipert.storage-atom :refer [local-storage]]))

(def book "<title>
      <p>Isaac Asimov</p>
      <p>Profession</p>
      <empty-line/>
      <empty-line/>
    </title>
    <section>
      <p>George Platen could not conceal the longing in his voice. It was too much to suppress. He said, “Tomorrow’s the first of May. Olympics!”</p>
      <p>He rolled over on his stomach and peered over the foot of his bed at his roommate. Didn’t he feel it, too? Didn’t<emphasis> this </emphasis>make some impression on him?</p>
      <p>George’s face was thin and had grown a trifle thinner in the nearly year and a half that he had been at the House. His figure was slight but the look in his blue eyes was as intense as it had ever been, and right now there was a trapped look in the way his fingers curled against the bedspread.</p>
      <p>George’s roommate looked up briefly from his book and took the opportunity to adjust the light-level of the stretch of wall near his chair. His name was Hali Omani and he was a Nigerian by birth. His dark brown skin and massive features seemed made for calmness, and mention of the Olympics did not move him.</p>
      <p>He said, “I know, George.”</p>
      <p>George owed much to Hali’s patience and kindness when it was needed, but even patience and kindness could be overdone. Was this a time to sit there like a statue built of some dark, warm wood?</p>
      <p>George wondered if he himself would grow like that after ten years here and rejected the thought violently. No!</p>
      <p>He said defiantly, “I think you’ve forgotten what May means.”</p>
      <p>The other said, “I remember very well what it means. It means nothing! You’re the one who’s forgotten that. May means nothing to you, George Platen, and,” he added softly, “it means nothing to me, Hali Omani.”</p>
      <p>George said, “The ships are coming in for recruits. By June, thousands and thousands will leave with millions of men and women heading for any world you can name, and all that means nothing?”</p>
      <p>“Less than nothing. What do you want me to do about it, anyway?” Omani ran his finger along a difficult passage in the book he was reading and his lips moved soundlessly.</p>
      <p>George watched him. Damn it, he thought, yell, scream; you can do that much. Kick at me, do anything.</p>
      <p>It was only that he wanted not to be so alone in his anger. He wanted not to be the only one so filled with resentment, not to be the only one dying a slow death.</p>
      <p>It was better those first weeks when the Universe was a small shell of vague light and sound pressing down upon him. It was better before Omani had wavered into view and dragged him back to a life that wasn’t worth living.</p>
      <p>Omani! He was old! He was at least thirty. George thought: Will I be like that at thirty? Will I be like that in twelve years?</p>
      <p>And because he was afraid he might be, he yelled at Omani, “Will you stop reading that fool book?”</p>
      <p>Omani turned a page and read on a few words, then lifted his head with its skullcap of crisply curled hair and said, “What?”</p>
      <p>“What good does it do you to read the book?” He stepped forward, snorted “More electronics,” and slapped it out of Omani’s hands.</p>
      <p>Omani got up slowly and picked up the book. He smoothed a crumpled page without visible rancor. “Call it the satisfaction of curiosity,” he said. “I understand a little of it today, perhaps a little more tomorrow. That’s a victory in a way.”</p>
      <p>“A victory. What kind of a victory? Is that what satisfies you in life? To get to know enough to be a quarter of a Registered Electronician by the time you’re sixty-five?”</p>
      <p>“Perhaps by the time I’m thirty-five.”</p>
      <p>“And then who’ll want you? Who’ll use you? Where will you go?”</p>
      <p>“No one. No one. Nowhere. I’ll stay here and read other books.”</p>
      <p>“And that satisfies you? Tell me! You’ve dragged me to class. You’ve got me to reading and memorizing, too. For what? There’s nothing in it that satisfies me.”</p>
      <p>“What good will it do you to deny yourself satisfaction?”</p>
      <p>“It means I’ll quit the whole farce. I’ll do as I planned to do in the beginning before you dovey-lovied me out of it. I’m going to force them to—to—”</p>
      <p>Omani put down his book. He let the other run down and then said, “To what, George?”</p>
      <p>“To correct a miscarriage of justice. A frame-up. I’ll get that Antonelli and force him to admit he—he—”</p>
      <p>Omani shook his head. “Everyone who comes here insists it’s a mistake. I thought you’d passed that stage.”</p>
      <p>“Don’t call it a stage,” said George violently. “In my case, it’s a fact. I’ve told you—”</p>
      <p>“You’ve told me, but in your heart you know no one made any mistake as far as you were concerned.”</p>
      <p>“Because no one will admit it? You think any of them would admit a mistake unless they were forced to?—Well, I’ll force them.”</p>
      <p>It was May that was doing this to George; it was Olympics month. He felt it bring the old wildness back and he couldn’t stop it. He didn’t want to stop it. He had been in danger of forgetting.</p>
      <p>He said, “I was going to be a Computer Programmer and I<emphasis> can </emphasis>be one. I could be one today, regardless of what they say analysis shows.” He pounded his mattress. “They’re wrong. They<emphasis> must </emphasis>be.”</p>
      <p>“The analysts are never wrong.”</p>
      <p>“They<emphasis> must </emphasis>be. Do you doubt my intelligence?”</p>
      <p>“Intelligence hasn’t one thing to do with it. Haven’t you been told that often enough? Can’t you understand that?”</p>
      <p>George rolled away, lay on his back, and stared somberly at the ceiling.</p>
      <p>“What did you want to be, Hali?”</p>
      <p>“I had no fixed plans. Hydroponicist would have suited me, I suppose.”</p>
      <p>“Did you think you could make it?”</p>
      <p>“I wasn’t sure.”</p>
      <p>George had never asked personal questions of Omani before. It struck him as queer, almost unnatural, that other people had had ambitions and ended here. Hydroponicist!</p>
      <p>He said, “Did you think you’d make<emphasis> this?”</emphasis></p>
      <p>“No, but here I am just the same.”</p>
      <p>“And you’re satisfied. Really, really satisfied. You’re happy. You love it. You wouldn’t be anywhere else.”</p>
      <p>Slowly, Omani got to his feet. Carefully, he began to unmake his bed. He said, “George, you’re a hard case. You’re knocking yourself out because you won’t accept the facts about yourself. George, you’re here in what you call the House, but I’ve never heard you give it its full title. Say it, George, say it. Then go to bed and sleep this off.”</p>
      <p>George gritted his teeth and showed them. He chocked out, “No!”</p>
      <p>“Then I will,” said Omani, and he did. He shaped each syllable carefully.</p>
      <p>George was bitterly ashamed at the sound of it. He turned his head away.</p>
      <p>For most of the first eighteen years of his life, George Platen had headed firmly in one direction, that of Registered Computer Programmer. There were those in his crowd who spoke wisely of Spationautics, Refrigeration Technology, Transportation Control, and even Administration. But George held firm.</p>
      <p>He argued relative merits as vigorously as any of them, and why not? Education Day loomed ahead of them and was the great fact of their existence. It approached steadily, as fixed and certain as the calendar—the first day of November of the year following one’s eighteenth birthday.</p>
      <p>After that day, there were other topics of conversation. One could discuss with others some detail of the profession, or the virtues of one’s wife and children, or the fate of one’s space-polo team, or one’s experiences in the Education Day, however, there was only one topic that unfailingly and unwearyingly held everyone’s interest, and that was Education Day.</p>
      <p>“What are you going for? Think you’ll make it? Heck, that’s no good. Look at the records; quota’s been cut. Logistics now—”</p>
      <p>Or Hypermechanics now—Or Communications now—Or Gravities now—</p>
      <p>Especially Gravities at the moment. Everyone had been talking about Gravities in the few years just before George’s Education Day because of the development of the Gravitic power engine.</p>
      <p>Any world within ten light-years of a dwarf star, everyone said, would give its eyeteeth for any kind of Registered Gravities Engineer.</p>
      <p>The thought of that never bothered George. Sure it would; all the eyeteeth it could scare up. But George had also heard what had happened before in a newly developed technique. Rationalization and simplification followed in a flood. New models each year; new types of gravitic engines; new principles. Then all those eyeteeth gentlemen would find themselves out of date and superseded by later models with later educations. The first group would then have to settle down to unskilled labor or ship out to some backwoods world that wasn’t quite caught up yet.</p>
      <p>Now Computer Programmers were in steady demand year after year, century after century. The demand never reached wild peaks; there was never a howling bull market for Programmers; but the demand climbed steadily as new worlds opened up and as older words grew more complex.</p>
      <p>He had argued with Stubby Trevelyan about that constantly. As best friends, their arguments had to be constant and vitriolic and, of course, neither ever persuaded or was persuaded.</p>
      <p>But then Trevelyan had had a father who was a Registered Metallurgist and had actually served on one of the Outworlds, and a grandfather who had also been a Registered Metallurgist. He himself was intent on becoming a Registered Metallurgist almost as a matter of family right and was firmly convinced that any other profession was a shade less than respectable.</p>
      <p>“There’ll always be metal,” he said, “and there’s an accomplishment in molding alloys to specification and watching structures grow. Now what’s a Programmer going to be doing. Sitting at a coder all day long, feeding some fool mile-long machine.”</p>
      <p>Even at sixteen, George had learned to be practical. He said simply, “There’ll be a million Metallurgists put out along with you.”</p>
      <p>“Because it’s good. A good profession. The best.”</p>
      <p>“But you get crowded out, Stubby. You can be way back in line. Any world can tape out its own Metallurgists, and the market for advanced Earth models isn’t so big. And it’s mostly the small worlds that want them. You know what per cent of the turn-out of Registered Metallurgists get tabbed for worlds with a Grade A rating. I looked it up. It’s just 13.3 per cent. That means you’ll have seven chances in eight of being stuck in some world that just about has running water. You may even be stuck on Earth; 2.3 per cent are.”</p>
      <p>Trevelyan said belligerently, “There’s no disgrace in staying on Earth. Earth needs technicians, too. Good ones.” His grandfather had been an Earth-bound Metallurgist, and Trevelyan lifted his finger to his upper lip and dabbed at an as yet nonexistent mustache.</p>
      <p>George knew about Trevelyan’s grandfather and, considering the Earth-bound position of his own ancestry, was in no mood to sneer. He said diplomatically, “No intellectual disgrace. Of course not. But it’s nice to get into a Grade A world, isn’t it?</p>
      <p>“Now you take Programmers. Only the Grade A worlds have the kind of computers that really need first-class Programmers so they’re the only ones in the market. And Programmer tapes are complicated and hardly any one fits. They need more Programmers than their own population can supply. It’s just a matter of statistics. There’s one first-class Programmer per million, say. A world needs twenty and has a population of ten million, they have to come to Earth for five to fifteen Programmers. Right?</p>
      <p>“And you know how many Registered Computer Programmers went to Grade A planets last year? I’ll tell you. Every last one. If you’re a Programmer, you’re a picked man. Yes, sir.”</p>
      <p>Trevelyan frowned. “If only one in a million makes it, what makes you think<emphasis> you’ll </emphasis>make it?”</p>
      <p>George said guardedly, “I’ll make it.”</p>
      <p>He never dared tell anyone; not Trevelyan; not his parents; of exactly what he was doing that made him so confident. But he wasn’t worried. He was simply confident (that was the worst of the memories he had in the hopeless days afterward). He was as blandly confident as the average eight-year-old kid approaching Reading Day—that childhood preview of Education Day.</p>
      <p>Of course, Reading Day had been different. Partly, there was the simple fact of childhood. A boy of eight takes many extraordinary things in stride. One day you can’t read and the next day you can. That’s just the way things are. Like the sun shining.</p>
      <p>And then not so much depended upon it. There were no recruiters just ahead, waiting and jostling for the lists and scores on the coming Olympics. A boy or girl who goes through the Reading Day is just someone who has ten more years of undifferentiated living upon Earth’s crawling surface; just someone who returns to his family with one new ability.</p>
      <p>By the time Education Day came, ten years later, George wasn’t even sure of most of the details of his own Reading Day.</p>
      <p>Most clearly of all, he remembered it to be a dismal September day with a mild rain falling. (September for Reading Day; November for Education Day; May for Olympics. They made nursery rhymes out of it.) George had dressed by the wall lights, with his parents far more excited than he himself was. His father was a Registered Pipe Fitter and had found his occupation on Earth. This fact had always been a humiliation to him, although, of course, as anyone could see plainly, most of each generation must stay on Earth in the nature of things.</p>
      <p>There had to be farmers and miners and even technicians on Earth. It was only the late-model, high-specialty professions that were in demand on the Outworlds, and only a few millions a year out of Earth’s eight billion population could be exported. Every man and woman on Earth couldn’t be among that group.</p>
      <p>But every man and woman could hope that at least one of his children could be one, and Platen, Senior, was certainly no exception. It was obvious to him (and, to be sure, to others as well) that George was notably intelligent and quick-minded. He would be bound to do well and he would have to, as he was an only child. If George didn’t end on an Outworld, they would have to wait for grandchildren before a next chance would come along, and that was too far in the future to be much consolation.</p>
      <p>Reading Day would not prove much, of course, but it would be the only indication they would have before the big day itself. Every parent on Earth would be listening to the quality of reading when his child came home with it; listening for any particularly easy flow of words and building that into certain omens of the future. There were few families that didn’t have at least one hopeful who, from Reading Day on, was the great hope because of the way he handled his trisyllabics.</p>
      <p>Dimly, George was aware of the cause of his parents’ tension, and if there was any anxiety in his young heart that drizzly morning, it was only the fear that his father’s hopeful expression might fade out when he returned home with his reading.</p>
      <p>The children met in the large assembly room of the town’s Education hall. All over Earth, in millions of local halls, throughout that month, similar groups of children would be meeting. George felt depressed by the grayness of the room and by the other children, strained and stiff in unaccustomed finery.</p>
      <p>Automatically, George did as all the rest of the children did. He found the small clique that represented the children on his floor of the apartment house and joined them.</p>
      <p>Trevelyan, who lived immediately next door, still wore his hair childishly long and was years removed from the sideburns and thin, reddish mustache that he was to grow as soon as he was physiologically capable of it.</p>
      <p>Trevelyan (to whom George was then known as Jaw-jee) said, “Bet you’re scared.”</p>
      <p>“I am not,” said George. Then, confidentially, “My folks got a hunk of printing up on the dresser in my room, and when I come home, I’m going to read it for them.” (George’s main suffering at the moment lay in the fact that he didn’t quite know where to put his hands. He had been warned not to scratch his head or rub his ears or pick his nose or put his hands into his pockets. This eliminated almost every possibility.)</p>
      <p>Trevelyan put<emphasis> his </emphasis>hands in his pockets and said, “My father isn’t worried.”</p>
      <p>Trevelyan, Senior, had been a Metallurgist on Diporia for nearly seven years, which gave him a superior social status in his neighborhood even though he had retired and returned to Earth.</p>
      <p>Earth discouraged these re-immigrants because of population problems, but a small trickle did return. For one thing the cost of living was lower on Earth, and what was a trifling annuity on Diporia, say, was a comfortable income on Earth. Besides, there were always men who found more satisfaction in displaying their success before the friends and scenes of their childhood than before all the rest of the Universe besides.</p>
      <p>Trevelyan, Senior, further explained that if he stayed on Diporia, so would his children, and Diporia was a one-spaceship world. Back on Earth, his kids could end anywhere, even Novia.</p>
      <p>Stubby Trevelyan had picked up that item early. Even before Reading Day, his conversation was based on the carelessly assumed fact that his ultimate home would be in Novia.</p>
      <p>George, oppressed by thoughts of the other’s future greatness and his own small-time contrast, was driven to belligerent defense at once.</p>
      <p>“My father isn’t worried either. He just wants to hear me read because he knows I’ll be good. I suppose your father would just as soon not hear you because he knows you’ll be all wrong.”</p>
      <p>“I will not be all wrong. Reading is<emphasis> nothing. </emphasis>On Novia, I’ll<emphasis> hire </emphasis>people to read to me.”</p>
      <p>“Because<emphasis> you </emphasis>won’t be able to read yourself, on account of you’re<emphasis> dumb!”</emphasis></p>
      <p>“Then how come I’ll be on Novia?”</p>
      <p>And George, driven, made the great denial, “Who says you’ll be on Novia? Bet you don’t go anywhere.”</p>
      <p>Stubby Trevelyan reddened. “I won’t be a Pipe Fitter like your old man.”</p>
      <p>“Take that back, you dumbhead.”</p>
      <p>“You take<emphasis> that </emphasis>back.”</p>
      <p>They stood nose to nose, not wanting to fight but relieved at having something familiar to do in this strange place. Furthermore, now that George had curled his hands into fists and lifted them before his face, the problem of what to do with his hands was, at least temporarily, solved. Other children gathered round excitedly.</p>
      <p>But then it all ended when a woman’s voice sounded loudly over the public address system. There was instant silence everywhere. George dropped his fists and forgot Trevelyan.</p>
      <p>“Children,” said the voice, “we are going to call out your names. As each child is called, he or she is to go to one of the men waiting along the side walls. Do you see them? They are wearing red uniforms so they will be easy to find. The girls will go to the right. The boys will go to the left. Now look about and see which man in red is nearest to you—”</p>
      <p>George found his man at a glance and waited for his name to be called off. He had not been introduced before this to the sophistications of the alphabet, and the length of time it took to reach his own name grew disturbing.</p>
      <p>The crowd of children thinned; little rivulets made their way to each of the red-clad guides.</p>
      <p>When the name “George Platen” was finally called, his sense of relief was exceeded only by the feeling of pure gladness at the fact that Stubby Trevelyan still stood in his place, uncalled.</p>
      <p>George shouted back over his shoulder as he left, “Yay, Stubby, maybe they don’t want you.”</p>
      <p>That moment of gaiety quickly left. He was herded into a line and directed down corridors in the company of strange children. They all looked at one another, large-eyed and concerned, but beyond a snuffling, “Quitcher pushing” and “Hey, watch out” there was no conversation. They were handed little slips of paper which they were told must remain with them. George stared at his curiously. Little black marks of different shapes. He knew it to be printing but how could anyone make words out of it? He couldn’t imagine.</p>
      <p>He was told to strip; he and four other boys who were all that now remained together. All the new clothes came shucking off and four eight-year-olds stood naked and small, shivering more out of embarrassment than cold. Medical technicians came past, probing them, testing them with odd instruments, pricking them for blood. Each took the little cards and made additional marks on them with little black rods that produced the marks, all neatly lined up, with great speed. George stared at the new marks, but they were no more comprehensible than the old. The children were ordered back into their clothes.</p>
      <p>They sat on separate little chairs then and waited again. Names were called again and “George Platen” came third.</p>
      <p>He moved into a large room, filled with frightening instruments with knobs and glassy panels in front. There was a desk in the very center, and behind it a man sat, his eyes on the papers piled before him.</p>
      <p>He said, “George Platen?”</p>
      <p>“Yes, sir,” said George, in a shaky whisper. All this waiting and all this going here and there was making himnervous. He wished it were over.</p>
      <p>The man behind the desk said, “I am Dr. Lloyd, George. How are you?”</p>
      <p>The doctor didn’t look up as he spoke. It was as though he had said those words over and over again and didn’t have to look up any more.</p>
      <p>“I’m all right.”</p>
      <p>“Are you afraid, George?”</p>
      <p>“N—no, sir,” said George, sounding afraid even in his own ears.</p>
      <p>“That’s good,” said the doctor, “because there’s nothing to be afraid of, you know. Let’s see, George. It says here on your card that your father is named Peter and that he’s a Registered Pipe Fitter and your mother is named Amy and is a Registered Home Technician. Is that right?”</p>
      <p>“Y—yes, sir.”</p>
      <p>“And your birthday is February 13, and you had an ear infection about a year ago. Right?”</p>
      <p>“Yes, sir.”</p>
      <p>“Do you know how I know all these things?”</p>
      <p>“It’s on the card, I think, sir.”</p>
      <p>“That’s right.” The doctor looked up at George for the first time and smiled. He showed even teeth and looked much younger than George’s father. Some of George’s nervousness vanished.</p>
      <p>The doctor passed the card to George. “Do you know what all those things there mean, George?”</p>
      <p>Although George knew he did not he was startled by the sudden request into looking at the card as though he might understand now through some sudden stroke of fate. But they were just marks as before and he passed the card back. “No, sir.”</p>
      <p>“Why not?”</p>
      <p>George felt a sudden pang of suspicion concerning the sanity of this doctor. Didn’t he know why not?</p>
      <p>George said, “I can’t read, sir.”</p>
      <p>“Would you like to read?”</p>
      <p>“Yes, sir.”</p>
      <p>“Why, George?”</p>
      <p>George stared, appalled. No one had ever asked him that. He had no answer. He said falteringly, “I don’t know, sir.”</p>
      <p>“Printed information will direct you all through your life. There is so much you’ll have to know even after Education Day. Cards like this one will tell you. Books will tell you. Television screens will tell you. Printing will tell you such useful things and such interesting things that not being able to read would be as bad as not being able to see. Do you understand?”</p>
      <p>“Yes, sir.”</p>
      <p>“Are you afraid, George?”</p>
      <p>“No, sir.”</p>
      <p>“Good. Now I’ll tell you exactly what we’ll do first. I’m going to put these wires on your forehead just over the corners of your eyes. They’ll stick there but they won’t hurt at all. Then, I’ll turn on something that will make a buzz. It will sound funny and it may tickle you, but it won’t hurt. Now if it does hurt, you tell me, and I’ll turn it off right away, but it won’t hurt. All right?”</p>
      <p>George nodded and swallowed.</p>
      <p>“Are you ready?”</p>
      <p>George nodded. He closed his eyes while the doctor busied himself. His parents had explained this to him. They, too, had said it wouldn’t hurt, but then there were always the older children. There were the ten- and twelve-year-olds who howled after the eight-year-olds waiting for Reading Day, “Watch out for the needle.” There were the others who took you off in confidence and said, “They got to cut your head open. They use a sharp knife that big with a hook on it,” and so on into horrifying details.</p>
      <p>George had never believed them but he had had nightmares, and now he closed his eyes and felt pure terror.</p>
      <p>He didn’t feel the wires at his temple. The buzz was a distant thing, and there was the sound of his own blood in his ears, ringing hollowly as though it and he were in a large cave. Slowly he chanced opening his eyes.</p>
      <p>The doctor had his back to him. From one of the instruments a strip of paper unwound and was covered with a thin, wavy purple line. The doctor tore off pieces and put them into a slot in another machine. He did it over and over again. Each time a little piece of film came out, which the doctor looked at. Finally, he turned toward George with a queer frown between his eyes.</p>
      <p>The buzzing stopped.</p>
      <p>George said breathlessly, “Is it over?”</p>
      <p>The doctor said, “Yes,” but he was still frowning.</p>
      <p>“Can I read now?” asked George. He felt no different.</p>
      <p>The doctor said, “What?” then smiled very suddenly and briefly. He said, “It works fine, George. You’ll be reading in fifteen minutes. Now we’re going to use another machine this time and it will take longer. I’m going to cover your whole head, and when I turn it on you won’t be able to see or hear anything for a while, but it won’t hurt. Just to make sure I’m going to give you a little switch to hold in your hand. If anything hurts, you press the little button and everything shuts off. All right?”</p>
      <p>In later years, George was told that the little switch was strictly a dummy; that it was introduced solely for confidence. He never did know for sure, however, since he never pushed the button.</p>
      <p>A large smoothly curved helmet with a rubbery inner lining was placed over his head and left there. Three or four little knobs seemed to grab at him and bite into his skull, but there was only a little pressure that faded. No pain.</p>
      <p>The doctor’s voice sounded dimly. “Everything all right, George?”</p>
      <p>And then, with no real warning, a layer of thick felt closed down all about him. He was disembodied, there was no sensation, no universe, only himself and a distant murmur at the very ends of nothingness telling him something—telling him—telling him—</p>
      <p>He strained to hear and understand but there was all that thick felt between.</p>
      <p>Then the helmet was taken off his head, and the light was so bright that it hurt his eyes while the doctor’s voice drummed at his ears.</p>
      <p>The doctor said, “Here’s your card, George. What does it say?”</p>
      <p>George looked at his card again and gave out a strangled shout. The marks weren’t just marks at all. They made up words. They were words just as clearly as though something were whispering them in his ears. He could<emphasis> hear </emphasis>them being whispered as he looked at them.</p>
      <p>“What does it say, George?”</p>
      <p>“It says—it says—’Platen, George. Born 13 February 6492 of Peter and Amy Platen in …’” He broke off.</p>
      <p>“You can read, George,” said the doctor. “It’s all over.”</p>
      <p>“For good? I won’t forget how?”</p>
      <p>“Of course not.” The doctor leaned over to shake hands gravely. “You will be taken home now.”</p>
      <p>It was days before George got over this new and great talent of his. He read, for his father with such facility that Platen, Senior, wept and called relatives to tell the good news.</p>
      <p>George walked about town, reading every scrap of printing he could find and wondering how it was that none of it had ever made sense to him before.</p>
      <p>He tried to remember how it was not to be able to read and he couldn’t. As far as his feeling about it was concerned, he had always been able to read. Always.</p>
      <p>At eighteen, George was rather dark, of medium height, but thin enough to look taller. Trevelyan, who was scarcely an inch shorter, had a stockiness of build that made “Stubby” more than ever appropriate, but in this last year he had grown self-conscious. The nickname could no longer be used without reprisal. And since Trevelyan disapproved of his proper first name even more strongly, he was called Trevelyan or any decent variant of that. As though to prove his manhood further, he had most persistently grown a pair of sideburns and a bristly mustache.</p>
      <p>He was sweating and nervous now, and George, who had himself grown out of “Jaw-jee” and into the curt monosyllabic gutturability of “George,” was rather amused by that.</p>
      <p>They were in the same large hall they had been in ten years before (and not since). It was as if a vague dream of the past had come to sudden reality. In the first few minutes George had been distinctly surprised at finding everything seem smaller and more cramped than his memory told him; then he made allowance for his own growth.</p>
      <p>The crowd was smaller than it had been in childhood. It was exclusively male this time. The girls had another day assigned them.</p>
      <p>Trevelyan leaned over to say, “Beats me the way they make you wait.”</p>
      <p>“Red tape,” said George. “You can’t avoid it.”</p>
      <p>Trevelyan said, “What makes<emphasis> you </emphasis>so damned tolerant about it?”</p>
      <p>“I’ve got nothing to worry about.”</p>
      <p>“Oh, brother, you make me sick. I hope you end up Registered Manure Spreader just so I can see your face when you do.” His somber eyes swept the crowd anxiously.</p>
      <p>George looked about, too. It wasn’t quite the system they used on the children. Matters went slower, and instructions had been given out at the start in print (an advantage over the pre-Readers). The names Platen and Trevelyan were well down the alphabet still, but this time the two knew it.</p>
      <p>Young men came out of the education rooms, frowning and uncomfortable, picked up their clothes and belongings, then went oft to analysis to learn the results.</p>
      <p>Each, as he come out, would be surrounded by a clot of the thinning crowd. “How was it?” “How’d it feel?” “Whacha think ya made?” “Ya feel any different?”</p>
      <p>Answers were vague and noncommittal.</p>
      <p>George forced himself to remain out of those clots. You only raised your own blood pressure. Everyone said you stood the best chance if you remained calm. Even so, you could feel the palms of your hands grow cold. Funny that new tensions came with the years.</p>
      <p>For instance, high-specialty professionals heading out for an Outworld were accompanied by a wife (or husband). It was important to keep the sex ratio in good balance on all worlds. And if you were going out to a Grade A world, what girl would refuse you? George had no specific girl in mind yet; he wanted none. Not now! Once he made Programmer; once he could add to his name, Registered Computer Programmer, he could take his pick, like a sultan in a harem. The thought excited him and he tried to put it away. Must stay calm.</p>
      <p>Trevelyan muttered, “What’s it all about anyway? First they say it works best if you’re relaxed and at ease. Then they put you through this and make it impossible for you to be relaxed and at ease.”</p>
      <p>“Maybe that’s the idea. They’re separating the boys from the men to begin with. Take it easy, Trev.”</p>
      <p>“Shut up.”</p>
      <p>George’s turn came. His name was not called. It appeared in glowing letters on the notice board.</p>
      <p>He waved at Trevelyan. “Take it easy. Don’t let it get you.”</p>
      <p>He was happy as he entered the testing chamber. Actually happy.</p>
      <p>The man behind the desk said, “George Platen?”</p>
      <p>For a fleeting instant there was a razor-sharp picture in George’s mind of another man, ten years earlier, who had asked the same question, and it was almost as though this were the same man and he, George, had turned eight again as he had stepped across the threshold.</p>
      <p>But the man looked up and, of course, the face matched that of the sudden memory not at all. The nose was bulbous, the hair thin and stringy, and the chin wattled as though its owner had once been grossly overweight and had reduced.</p>
      <p>The man behind the desk looked annoyed. “Well?”</p>
      <p>George came to Earth. “I’m George Platen, sir.”</p>
      <p>“Say so, then. I’m Dr. Zachary Antonelli, and we’re going to be intimately acquainted in a moment.”</p>
      <p>He stared at small strips of film, holding them up to the light owlishly.</p>
      <p>George winced inwardly. Very hazily, he remembered that other doctor (he had forgotten the name) staring at such film. Could these be the same? The other doctor had frowned and this one was looking at him now as though he were angry.</p>
      <p>His happiness was already just about gone.</p>
      <p>Dr. Antonelli spread the pages of a thickish file out before him now and put the films carefully to one side. “It says here you want to be a Computer Programmer.”</p>
      <p>“Yes, doctor.”</p>
      <p>“Still do?”</p>
      <p>“Yes, sir.”</p>
      <p>“It’s a responsible and exacting position. Do you feel up to it?”</p>
      <p>“Yes, sir.”</p>
      <p>“Most pre-Educates don’t put down any specific profession. I believe they are afraid of queering it.”</p>
      <p>“I think that’s right, sir.”</p>
      <p>“Aren’t you afraid of that?”</p>
      <p>“I might as well be honest, sir.”</p>
      <p>Dr. Antonelli nodded, but without any noticeable lightening of his expression. “Why do you want to be a Programmer?”</p>
      <p>“It’s a responsible and exacting position as you said, sir. It’s an important job and an exciting one. I like it and I think I can do it.”</p>
      <p>Dr. Antonelli put the papers away, and looked at George sourly. He said, “How do you know you like it? Because you think you’ll be snapped up by some Grade A planet?”</p>
      <p>George thought uneasily: He’s trying to rattle you. Stay calm and stay frank.</p>
      <p>He said, “I think a Programmer has a good chance, sir, but even if I were left on Earth, I know I’d like it.” (That was true enough. I’m not lying, thought George.)</p>
      <p>“All right, how do you know?”</p>
      <p>He asked it as though he knew there was no decent answer and George almost smiled. He had one.</p>
      <p>He said, “I’ve been reading about Programming, sir.”</p>
      <p>“You’ve been<emphasis> what?” </emphasis>Now the doctor looked genuinely astonished and George took pleasure in that.</p>
      <p>“Reading about it, sir. I bought a book on the subject and I’ve been studying it.”</p>
      <p>“A book for Registered Programmers?”</p>
      <p>“Yes, sir.”</p>
      <p>“But you couldn’t understand it.”</p>
      <p>“Not at first. I got other books on mathematics and electronics. I made out all I could. I still don’t know much, but I know enough to know I like it and to know I can make it.” (Even his parents never found that secret cache of books or knew why he spent so much time in his own. room or exactly what happened to the sleep he missed.)</p>
      <p>The doctor pulled at the loose skin under his chin. “What was your idea in doing that, son?”</p>
      <p>“I wanted to make sure I would be interested, sir.”</p>
      <p>“Surely you know that being interested means nothing. You could be devoured by a subject and if the physical make-up of your brain makes it more efficient for you to be something else, something else you will be. You know that, don’t you?”</p>
      <p>“I’ve been told that,” said George cautiously.</p>
      <p>“Well, believe it. It’s true.”</p>
      <p>George said nothing.</p>
      <p>Dr. Antonelli said, “Or do you believe that studying some subject will bend the brain cells in that direction, like that other theory that a pregnant woman need only listen to great music persistently to make a composer of her child. Do you believe that?”</p>
      <p>George flushed. That had certainly been in his mind. By forcing his intellect constantly in the desired direction, he had felt sure that he would be getting a head start. Most of his confidence had rested on exactly that point.</p>
      <p>“I never—” he began, and found no way of finishing.</p>
      <p>“Well, it isn’t true. Good Lord, youngster, your brain pattern is fixed at birth. It can be altered by a blow hard enough to damage the cells or by a burst blood vessel or by a tumor or by a major infection—each time, of course, for the worse. But it certainly can’t be affected by your thinking special thoughts.” He stared at George thoughtfully, then said, “Who told you to do this?”</p>
      <p>George, now thoroughly disturbed, swallowed and said, “No one, doctor. My own idea.”</p>
      <p>“Who knew you were doing it after you started?”</p>
      <p>“No one. Doctor, I meant to do no wrong.”</p>
      <p>“Who said anything about wrong? Useless is what I would say. Why did you keep it to yourself?”</p>
      <p>“I—I thought they’d laugh at me.” (He thought abruptly of a recent exchange with Trevelyan. George had very cautiously broached the thought, as of something merely circulating distantly in the very outermost reaches of his mind, concerning the possibility of learning something by ladling it into the mind by hand, so to speak, in bits and pieces. Trevelyan had hooted, “George, you’ll be tanning your own shoes next and weaving your own shirts.” He had been thankful then for his policy of secrecy.)</p>
      <p>Dr. Antonelli shoved the bits of film he had first looked at from position to position in morose thought. Then he said, “Let’s get you analyzed. This is getting me nowhere.”</p>
      <p>The wires went to George’s temples. There was the buzzing. Again there came a sharp memory of ten years ago.</p>
      <p>George’s hands were clammy; his heart pounded. He should never have told the doctor about his secret reading.</p>
      <p>It was his damned vanity, he told himself. He had wanted to show how enterprising he was, how full of initiative. Instead, he had showed himself superstitious and ignorant and aroused the hostility of the doctor. (He could tell the doctor hated him for a wise guy on the make.)</p>
      <p>And now he had brought himself to such a state of nervousness, he was sure the analyzer would show nothing that made sense.</p>
      <p>He wasn’t aware of the moment when the wires were removed from his temples. The sight of the doctor, staring at him thoughtfully, blinked into his consciousness and that was that; the wires were gone. George dragged himself together with a tearing effort. He had quite given up his ambition to be a Programmer. In the space of ten minutes, it had all gone.</p>
      <p>He said dismally, “I suppose no?”</p>
      <p>“No what?”</p>
      <p>“No Programmer?”</p>
      <p>The doctor rubbed his nose and said, “You get your clothes and whatever belongs to you and go to room 15-C. Your files will be waiting for you there. So will my report.”</p>
      <p>George said in complete surprise, “Have I been Educated already? I thought this was just to—”</p>
      <p>Dr. Antonelli stared down at his desk. “It will all be explained to you. You do as I say.”</p>
      <p>George felt something like panic. What was it they couldn’t tell him? He wasn’t fit for anything but Registered Laborer. They were going to prepare him for that; adjust him to it.</p>
      <p>He was suddenly certain of it and he had to keep from screaming by main force.</p>
      <p>He stumbled back to his place of waiting. Trevelyan was not there, a fact for which he would have been thankful if he had had enough self-possession to be meaningfully aware of his surroundings. Hardly anyone was left, in fact, and the few who were looked as though they might ask him questions were it not that they were too worn out by their tail-of-the-alphabet waiting to buck the fierce, hot look of anger and hate he cast at them.</p>
      <p>What right had<emphasis> they </emphasis>to be technicians and he, himself, a Laborer? Laborer! He was<emphasis> certain!</emphasis></p>
      <p>He was led by a red-uniformed guide along the busy corridors lined with separate rooms each containing its groups, here two, there five: the Motor Mechanics, the Construction Engineers, the Agronomists—There were hundreds of specialized Professions and most of them would be represented in this small town by one or two anyway.</p>
      <p>He hated them all just then: the Statisticians, the Accountants, the lesser breeds and the higher. He hated them because they owned their smug knowledge now, knew their fate, while he himself, empty still, had to face some kind of further red tape.</p>
      <p>He reached 15-C, was ushered in and left in an empty room. For one moment, his spirits bounded. Surely, if this were the Labor classification room, there would be dozens of youngsters present.</p>
      <p>A door sucked into its recess on the other side of a waist-high partition and an elderly, white-haired man stepped out. He smiled and showed even teeth that were obviously false, but his face was still ruddy and unlined and his voice had vigor.</p>
      <p>He said, “Good evening, George. Our own sector has only one of you this time, I see.”</p>
      <p>“Only one?” said George blankly.</p>
      <p>“Thousands over the Earth, of course. Thousands. You’re not alone.”</p>
      <p>George felt exasperated. He said, “I don’t understand, sir. What’s my classification? What’s happening?”</p>
      <p>“Easy, son. You’re all right. It could happen to anyone.” He held out his hand and George took it mechanically. It was warm and it pressed George’s hand firmly. “Sit down, son. I’m Sam Ellenford.”</p>
      <p>George nodded impatiently. “I want to know what’s going on, sir.”</p>
      <p>“Of course. To begin with, you can’t be a Computer Programmer, George. You’ve guessed that, I think.”</p>
      <p>“Yes, I have,” said George bitterly. “What will I be, then?”</p>
      <p>“That’s the hard part to explain, George.” He paused, then said with careful distinctness, “Nothing.”</p>
      <p>“What!”</p>
      <p>“Nothing!”</p>
      <p>“But what does that mean? Why can’t you assign me a profession?”</p>
      <p>“We have no choice in the matter, George. It’s the structure of your mind that decides that.”</p>
      <p>George went a sallow yellow. His eyes bulged. “There’s something wrong with my mind?”</p>
      <p>“There’s<emphasis> something </emphasis>about it. As far as professional classification is concerned, I suppose you can call it wrong.”</p>
      <p>“But why?”</p>
      <p>Ellenford shrugged. “I’m sure you know how Earth runs its Educational program, George. Practically any human being can absorb practically any body of knowledge, but each individual brain pattern is better suited to receiving some types of knowledge than others. We try to match mind to knowledge as well as we can within the limits of the quota requirements for each profession.”</p>
      <p>George nodded. “Yes, I know.”</p>
      <p>“Every once in a while, George, we come up against a young man whose mind is not suited to receiving a superimposed knowledge of any sort.”</p>
      <p>“You mean I can’t be Educated?”</p>
      <p>“That is what I mean.”</p>
      <p>“But that’s crazy. I’m intelligent. I can understand—”</p>
      <p>He looked helplessly about as though trying to find some way of proving that he had a functioning brain.</p>
      <p>“Don’t misunderstand me, please,” said Ellenford gravely. “You’re intelligent. There’s no question about that. You’re even above average in intelligence. Unfortunately that has nothing to do with whether the mind ought to be allowed to accept superimposed knowledge or not. In fact, it is almost always the intelligent person who comes here.”</p>
      <p>“You mean I can’t even be a Registered Laborer?” babbled George. Suddenly even that was better than the blank that faced him. “What’s there to know to be a Laborer?”</p>
      <p>“Don’t underestimate the Laborer, young man. There are dozens of subclassifications and each variety has its own corpus of fairly detailed knowledge. Do you think there’s no skill in knowing the proper manner of lifting a weight? Besides, for the Laborer, we must select not only minds suited to it, but bodies as well. You’re not the type, George, to last long as a Laborer.”</p>
      <p>George was conscious of his slight build. He said, “But I’ve never heard of anyone without a profession.”</p>
      <p>“There aren’t many,” conceded Ellenford. “And we protect them.”</p>
      <p>“Protect them?” George felt confusion and fright grow higher inside him.</p>
      <p>“You’re a ward of the planet, George. From the time you walked through that door, we’ve been in charge of you.” And he smiled.</p>
      <p>It was a fond smile. To George it seemed the smile of ownership; the smile of a grown man for a helpless child.</p>
      <p>He said, “You mean, I’m going to be in prison?”</p>
      <p>“Of course not. You will simply be with others of your kind.”</p>
      <p>Your kind.The words made a kind of thunder in George’s ear.</p>
      <p>Ellenford said, “You need special treatment. We’ll take care of you.”</p>
      <p>To George’s own horror, he burst into tears. Ellenford walked to the other end of the room and faced away as though in thought.</p>
      <p>George fought to reduce the agonized weeping to sobs and then to strangle those. He thought of his father and mother, of his friends, of Trevelyan, of his own shame—</p>
      <p>He said rebelliously, “I learned to read.”</p>
      <p>“Everyone with a whole mind can do that. We’ve never found exceptions. It is at this stage that we discover—exceptions. And when you learned to read, George, we were concerned about your mind pattern. Certain peculiarities were reported even then by the doctor in charge.”</p>
      <p>“Can’t you try Educating me? You haven’t even tried. I’m willing to take the risk.”</p>
      <p>“The law forbids us to do that, George. But look, it will not be bad. We will explain matters to your family so they will not be hurt. At the place to which you’ll be taken, you’ll be allowed privileges. We’ll get you books and you can learn what you will.”</p>
      <p>“Dab knowledge in by hand,” said George bitterly. “Shred by shred. Then, when I die I’ll know enough to be a Registered Junior Office Boy, Paper-Clip Division.”</p>
      <p>“Yet I understand you’ve already been studying books.”</p>
      <p>George froze. He was struck devastatingly by sudden understanding. “That’s it…”</p>
      <p>“What is?”</p>
      <p>“That fellow Antonelli. He’s knifing me.”</p>
      <p>“No, George. You’re quite wrong.”</p>
      <p>“Don’t tell me that.” George was in an ecstasy of fury. “That lousy bastard is selling me out because he thought I was a little too wise for him. I read books and tried to get a head start toward programming. Well, what do you want to square things? Money? You won’t get it. I’m getting out of here and when I finish broadcasting this—”</p>
      <p>He was screaming.</p>
      <p>Ellenford shook his head and touched a contact.</p>
      <p>Two men entered on catfeet and got on either side of George. They pinned his arms to his sides. One of them used an air-spray hypodermic in the hollow of his right elbow and the hypnotic entered his vein and had an almost immediate effect.</p>
      <p>His screams cut off and his head fell forward. His knees buckled and only the men on either side kept him erect as he slept.</p>
      <p>They took care of George as they said they would; they were good to him and unfailingly kind—about the way, George thought, he himself would be to a sick kitten he had taken pity on.</p>
      <p>They told him that he should sit up and take some interest in life; and then told him that most people who came there had the same attitude of despair at the beginning and that he would snap out of it.</p>
      <p>He didn’t even hear them.</p>
      <p>Dr. Ellenford himself visited him to tell him that his parents had been informed that he was away on special assignment.</p>
      <p>George muttered, “Do they know—”</p>
      <p>Ellenford assured him at once, “We gave no details.”</p>
      <p>At first George had refused to eat. They fed him intravenously. They hid sharp objects and kept him under guard. Hali Omani came to be his roommate and his stolidity had a calming effect.</p>
      <p>One day, out of sheer desperate boredom, George asked for a book. Omani, who himself read books constantly, looked up, smiling broadly. George almost withdrew the request then, rather than give any of them satisfaction, then thought: What do I care?</p>
      <p>He didn’t specify the book and Omani brought one on chemistry. It was in big print, with small words and many illustrations. It was for teen-agers. He threw the book violently against the wall.</p>
      <p>That’s what he would be always. A teen-ager all his life. A pre-Educate forever and special books would have to be written for him. He lay smoldering in bed, staring at the ceiling, and after an hour had passed, he got up sulkily, picked up the book, and began reading.</p>
      <p>It took him a week to finish it and then he asked for another.</p>
      <p>“Do you want me to take the first one back?” asked Omani.</p>
      <p>George frowned. There were things in the book he had not understood, yet he was not so lost to shame as to say so.</p>
      <p>But Omani said, “Come to think of it, you’d better keep it. Books are meant to be read and reread.”</p>
      <p>It was that same day that he finally yielded to Omani’s invitation that he tour the place. He dogged at the Nigerian’s feet and took in his surroundings with quick hostile glances.</p>
      <p>The place was no prison certainly. There were no walls, no locked doors, no guards. But it was a prison in that the inmates had no place to go outside.</p>
      <p>It was somehow good to see others like himself by the dozen. It was so easy to believe himself to be the only one in the world so—maimed.</p>
      <p>He mumbled, “How many people here anyway?”</p>
      <p>“Two hundred and five, George, and this isn’t the only place of the sort in the world. There are thousands.”</p>
      <p>Men looked up as he passed, wherever he went; in the gymnasium, along the tennis courts; through the library (he had never in his life imagined books could exist in such numbers; they were stacked, actually stacked, along long shelves). They stared at him curiously and he returned the looks savagely. At least<emphasis> they </emphasis>were no better than he; no call for<emphasis> them </emphasis>to look at him as though he were some sort of curiosity.</p>
      <p>Most of them were in their twenties. George said suddenly, “What happens to the older ones?”</p>
      <p>Omani said, “This place specializes in the younger ones.” Then, as though he suddenly recognized an implication in George’s question that he had missed earlier, he shook his head gravely and said, “They’re not put out of the way, if that’s what you mean. There are other Houses for older ones.”</p>
      <p>“Who cares?” mumbled George, who felt he was sounding too interested and in danger of slipping into surrender.</p>
      <p>“You might. As you grow older, you will find yourself in a House with occupants of both sexes.”</p>
      <p>That surprised George somehow. “Women, too?”</p>
      <p>“Of course. Do you suppose women are immune to this sort of thing?”</p>
      <p>George thought of that with more interest and excitement than he had felt for anything since before that day when—He forced his thought away from that.</p>
      <p>Omani stopped at the doorway of a room that contained a small closed-circuit television set and a desk computer. Five or six men sat about the television. Omani said, “This is a classroom.”</p>
      <p>George said, “What’s that?”</p>
      <p>“The young men in there are being educated. Not,” he added, quickly, “in the usual way.”</p>
      <p>“You mean they’re cramming it in bit by bit.”</p>
      <p>“That’s right. This is the way everyone did it in ancient times.”</p>
      <p>This was what they kept telling him since he had come to the House but what of it? Suppose there had been a day when mankind had not known the diatherm-oven. Did that mean he should be satisfied to eat meat raw in a world where others ate it cooked?</p>
      <p>He said, “Why do they want to go through that bit-by-bit stuff?”</p>
      <p>“To pass the time, George, and because they’re curious.”</p>
      <p>“What good does it do them?”</p>
      <p>“It makes them happier.”</p>
      <p>George carried that thought to bed with him.</p>
      <p>The next day he said to Omani ungraciously, “Can you get me into a classroom where I can find out something about programming?”</p>
      <p>Omani replied heartily, “Sure.”</p>
      <p>It was slow and he resented it. Why should someone have to explain something and explain it again? Why should he have to read and reread a passage, then stare at a mathematical relationship and not understand it at once? That wasn’t how other people had to be.</p>
      <p>Over and over again, he gave up. Once he refused to attend classes for a week.</p>
      <p>But always he returned. The official in charge, who assigned reading, conducted the television demonstrations, and even explained difficult passages and concepts, never commented on the matter.</p>
      <p>George was finally given a regular task in the gardens and took his turn in the various kitchen and cleaning details. This was represented to him as being an advance, but he wasn’t fooled. The place might have been far more mechanized than it was, but they deliberately made work for the young men in order to give them the illusion of worth-while occupation, of usefulness. George wasn’t fooled.</p>
      <p>They were even paid small sums of money out of which they could buy certain specified luxuries or which they could put aside for a problematical use in a problemical old age. George kept his money in an open jar, which he kept on a closet shelf. He had no idea how much he had accumulated. Nor did he care.</p>
      <p>He made no real friends though he reached the stage where a civil good day was in order. He even stopped brooding (or almost stopped) on the miscarriage of justice that had placed him there. He would go weeks without dreaming of Antonelli, of his gross nose and wattled neck, of the leer with which he would push George into a boiling quicksand and hold him under, till he woke screaming with Omani bending over him in concern.</p>
      <p>Omani said to him on a snowy day in February, “It’s amazing how you’re adjusting.”</p>
      <p>But that was February, the thirteenth to be exact, his nineteenth birthday. March came, then April, and with the approach of May he realized he hadn’t adjusted at all.</p>
      <p>The previous May had passed unregarded while George was still in his bed, drooping and ambitionless. This May was different.</p>
      <p>All over Earth, George knew, Olympics would be taking place and young men would be competing, matching their skills against one another in the fight for a place on a new world. There would be the holiday atmosphere, the excitement, the news reports, the self-contained recruiting agents from the worlds beyond space, the glory of victory or the consolations of defeat.</p>
      <p>How much of fiction dealt with these motifs; how much of his own boyhood excitement lay in following the events of Olympics from year to year; how many of his own plans—</p>
      <p>George Platen could not conceal the longing in his voice. It was too much to suppress. He said, “Tomorrow’s the first of May. Olympics!”</p>
      <p>And that led to his first quarrel with Omani and to Omani’s bitter enunciation of the exact name of the institution in which George found himself.</p>
      <p>Omani gazed fixedly at George and said distinctly, “A House for the Feeble-minded.”</p>
      <empty-line/>
      <p>George Platen flushed. Feeble-minded!</p>
      <p>He rejected it desperately. He said in a monotone, “I’m leaving.” He said it on impulse. His conscious mind learned it first from the statement as he uttered it.</p>
      <p>Omani, who had returned to his book, looked up. “What?”</p>
      <p>George knew what he was saying now. He said it fiercely, “I’m leaving.”</p>
      <p>“That’s ridiculous. Sit down, George, calm yourself.”</p>
      <p>“Oh, no. I’m here on a frame-up, I tell you. This doctor, Antonelli, took a dislike to me. It’s the sense of power these petty bureaucrats have. Cross them and they wipe out your life with a stylus mark on some card file.”</p>
      <p>“Are you back to that?”</p>
      <p>“And staying there till it’s all straightened out. I’m going to get to Antonelli somehow, break him, force the truth out of him.” George was breathing heavily and he felt feverish. Olympics month was here and he couldn’t let it pass. If he did, it would be the final surrender and he would be lost for all time.</p>
      <p>Omani threw his legs over the side of his bed and stood up. He was nearly six feet tall and the expression on his face gave him the look of a concerned Saint Bernard. He put his arm about George’s shoulder, “If I hurt your feelings—”</p>
      <p>George shrugged him off. “You just said what you thought was the truth, and I’m going to prove it isn’t the truth, that’s all. Why not? The door’s open. There aren’t any locks. No one ever said I couldn’t leave. I’ll just walk out.”</p>
      <p>“All right, but where will you go?”</p>
      <p>“To the nearest air terminal, then to the nearest Olympics center. I’ve got money.” He seized the open jar that held the wages he had put away. Some of the coins jangled to the floor.</p>
      <p>“That will last you a week maybe. Then what?”</p>
      <p>“By then I’ll have things settled.”</p>
      <p>“By then you’ll come crawling back here,” said Omani earnestly, “with all the progress you’ve made to do over again. You’re mad, George.”</p>
      <p>“Feeble-minded is the word you used before.”</p>
      <p>“Well, I’m sorry I did. Stay here, will you?”</p>
      <p>“Are you going to try to stop me?”</p>
      <p>Omani compressed his full lips. “No, I guess I won’t. This is your business. If the only way you can learn is to buck the world and come back with blood on your face, go ahead.—Well, go ahead.”</p>
      <p>George was in the doorway now, looking back over his shoulder. “I’m going”—he came back to pick up his pocket grooming set slowly—“I hope you don’t object to my taking a few personal belongings.”</p>
      <p>Omani shrugged. He was in bed again reading, indifferent.</p>
      <p>George lingered at the door again, but Omani didn’t look up. George gritted his teeth, turned and walked rapidly down the empty corridor and out into the night-shrouded grounds.</p>
      <p>He had expected to be stopped before leaving the grounds. He wasn’t. He had stopped at an all-night diner to ask directions to an air terminal and expected the proprietor to call the police. That didn’t happen. He summoned a skimmer to take him to the airport and the driver asked no questions.</p>
      <p>Yet he felt no lift at that. He arrived at the airport sick at heart. He had not realized how the outer world would be. He was surrounded by professionals. The diner’s proprietor had had his name inscribed on the plastic shell over the cash register. So and so, Registered Cook. The man in the skimmer had his license up, Registered Chauffeur. George felt the bareness of his name and experienced a kind of nakedness because of it; worse, he felt skinned. But no one challenged him. No one studied him suspiciously and demanded proof of professional rating.</p>
      <p>George thought bitterly: Who would imagine any human being without one?</p>
      <p>He bought a ticket to San Francisco on the 3 A.M. plane. No other plane for a sizable Olympics center was leaving before morning and he wanted to wait as little as possible. As it was, he sat huddled in the waiting room, watching for the police. They did not come.</p>
      <p>He was in San Francisco before noon and the noise of the city struck him like a blow. This was the largest city he had ever seen and he had been used to silence and calm for a year and a half now.</p>
      <p>Worse, it was Olympics month. He almost forgot his own predicament in his sudden awareness that some of the noise, excitement, confusion was due to that.</p>
      <p>The Olympics boards were up at the airport for the benefit of the incoming travelers, and crowds jostled around each one. Each major profession had its own board. Each listed directions to the Olympics Hall where the contest for that day for that profession would be given; the individuals competing and their city of birth; the Outworld (if any) sponsoring it.</p>
      <p>It was a completely stylized thing. George had read descriptions often enough in the newsprints and films, watched matches on television, and even witnessed a small Olympics in the Registered Butcher classification at the county seat. Even that, which had no conceivable Galactic implication (there was no Outworlder in attendance, of course) aroused excitement enough.</p>
      <p>Partly, the excitement was caused simply by the fact of competition, partly by the spur of local pride (oh, when there was a hometown boy to cheer for, though he might be a complete stranger), and, of course, partly by betting. There was no way of stopping the last.</p>
      <p>George found it difficult to approach the board. He found himself looking at the scurrying, avid onlookers in a new way.</p>
      <p>There must have been a time when they themselves were Olympic material. What had<emphasis> they </emphasis>done? Nothing!</p>
      <p>If they had been winners, they would be far out in the Galaxy somewhere, not stuck here on Earth. Whatever they were, their professions must have made them Earth-bait from the beginning; or else they had made themselves Earth-bait by inefficiency at whatever high-specialized professions they had had.</p>
      <p>Now these failures stood about and speculated on the chances of newer and younger men. Vultures!</p>
      <p>How he wished they were speculating on him.</p>
      <p>He moved down the line of boards blankly, clinging to the outskirts of the groups about them. He had eaten breakfast on the strato and he wasn’t hungry. He was afraid, though. He was in a big city during the confusion of the beginning of Olympics competition. That was protection, sure. The city was full of strangers. No one would question George. No one would care about George.</p>
      <p>No one would care. Not even the House, thought George bitterly. They cared for him like a sick kitten, but if a sick kitten up and wanders off, well, too bad, what can you do?</p>
      <p>And now that he was in San Francisco, what did he do? His thoughts struck blankly against a wall. See someone? Whom? How? Where would he even stay? The money he had left seemed pitiful.</p>
      <p>The first shamefaced thought of going back came to him<strikethrough>.</strikethrough>He could go to the police—He shook his head violently as though arguing with a material adversary.</p>
      <p>A word caught his eye on one of the boards, gleaming there:<emphasis> Metallurgist. </emphasis>In smaller letters,<emphasis> nonferrous. </emphasis>At the bottom of a long list of names, in flowing script,<emphasis> sponsored by Novia.</emphasis></p>
      <p>It induced painful memories: himself arguing with Trevelyan, so certain that he himself would be a Programmer, so certain that a Programmer was superior to a Metallurgist, so certain that he was following the right course, so certain that he was clever—</p>
      <p>So clever that he had to boast to that small-minded, vindictive Antonelli. He had been so sure of himself that moment when he had been called and had left the nervous Trevelyan standing there, so cocksure.</p>
      <p>George cried out in a short, incoherent high-pitched gasp. Someone turned to look at him, then hurried on. People brushed past impatiently pushing him this way and that. He remained staring at the board, openmouthed.</p>
      <p>It was as though the board had answered his thought. He was thinking “Trevelyan” so hard that it had seemed for a moment that of course the board would say “Trevelyan” back at him.</p>
      <p>But that<emphasis> was </emphasis>Trevelyan, up there. And<emphasis> Armand </emphasis>Trevelyan (Stubby’s hated first name; up in lights for everyone to see) and the right hometown. What’s more, Trev had wanted Novia, aimed for Novia, insisted on Novia; and this competition was sponsored by Novia.</p>
      <p>This had to be Trev; good old Trev. Almost without thinking, he noted the directions for getting to the place of competition and took his place in line for a skimmer.</p>
      <p>Then he thought somberly: Trev made it! He wanted to be a Metallurgist, and he made it!</p>
      <p>George felt colder, more alone than ever.</p>
      <p>There was a line waiting to enter the hall. Apparently, Metallurgy Olympics was to be an exciting and closely fought one. At least, the illuminated sky sign above the hall said so, and the jostling crowd seemed to think so.</p>
      <p>It would have been a rainy day, George thought, from the color of the sky, but San Francisco had drawn the shield across its breadth from bay to ocean. It was an expense to do so, of course, but all expenses were warranted where the comfort of Outworlders was concerned. They would be in town for the Olympics. They were heavy spenders. And for each recruit taken, there would be a fee both to Earth, and to the local government from the planet sponsoring the Olympics. It paid to keep Outworlders in mind of a particular city as a pleasant place in which to spend Olympics time. San Francisco knew what it was doing.</p>
      <p>George, lost in thought, was suddenly aware of a gentle pressure on his shoulder blade and a voice saying, “Are you in line here, young man?”</p>
      <p>The line had moved up without George’s having noticed the widening gap. He stepped forward hastily and muttered, “Sorry, sir.”</p>
      <p>There was the touch of two fingers on the elbow of his jacket and he looked about furtively.</p>
      <p>The man behind him nodded cheerfully. He had iron-gray hair, and under his jacket he wore an old-fashioned sweater that buttoned down the front. He said, “I didn’t mean to sound sarcastic.”</p>
      <p>“No offense.”</p>
      <p>“All right, then.” He sounded cozily talkative. “I wasn’t sure you might not simply be standing there, entangled with the line, so to speak, only by accident. I thought you might be a—”</p>
      <p>“A what?” said George sharply.</p>
      <p>“Why, a contestant, of course. You look young.”</p>
      <p>George turned away. He felt neither cozy nor talkative, and bitterly impatient with busybodies.</p>
      <p>A thought struck him. Had an alarm been sent out for him? Was his description known, or his picture? Was Gray-hair behind him trying to get a good look at his face?</p>
      <p>He hadn’t seen any news reports. He craned his neck to see the moving strip of news headlines parading across one section of the city shield, somewhat lackluster against the gray of the cloudy afternoon sky. It was no use. He gave up at once. The headlines would never concern themselves with him. This was Olympics time and the only news worth headlining was the comparative scores of the winners and the trophies won by continents, nations, and cities.</p>
      <p>It would go on like that for weeks, with scores calculated on a per capita basis and every city finding some way of calculating itself into a position of honor. His own town had once placed third in an Olympics covering Wiring Technician; third in the whole state. There was still a plaque saying so in Town Hall.</p>
      <p>George hunched his head between his shoulders and shoved his hands in his pocket and decided that made him more noticeable. He relaxed and tried to look unconcerned, and felt no safer. He was in the lobby now, and no authoritative hand had yet been laid on his shoulder. He filed into the hall itself and moved as far forward as he could.</p>
      <p>It was with an unpleasant shock that he noticed Gray-hair next to him. He looked away quickly and tried reasoning with himself. The man had been right behind him in line after all.</p>
      <p>Gray-hair, beyond a brief and tentative smile, paid no attention to him and, besides, the Olympics was about to start. George rose in his seat to see if he could make out the position assigned to Trevelyan and at the moment that was all his concern.</p>
      <p>The hall was moderate in size and shaped in the classical long oval, with the spectators in the two balconies running completely about the rim and the contestants in the linear trough down the center. The machines were set up, the progress boards above each bench were dark, except for the name and contest number of each man. The contestants themselves were on the scene, reading, talking together; one was checking his fingernails minutely. (It was, of course, considered bad form for any contestant to pay any attention to the problem before him until the instant of the starting signal.)</p>
      <p>George studied the program sheet he found in the appropriate slot in the arm of his chair and found Trevelyan’s name. His number was twelve and, to George’s chagrin, that was at the wrong end of the hall. He could make out the figure of Contestant Twelve, standing with his hands in his pockets, back to his machine, and staring at the audience as though he were counting the house. George couldn’t make out the face.</p>
      <p>Still, that was Trev.</p>
      <p>George sank back in his seat. He wondered if Trev would do well. He hoped, as a matter of conscious duty, that he would, and yet there was something within him that felt rebelliously resentful. George, professionless, here, watching. Trevelyan, Registered Metallurgist, Nonferrous, there, competing.</p>
      <p>George wondered if Trevelyan had competed in his first year. Sometimes men did, if they felt particularly confident—or hurried. It involved a certain risk. However efficient the Educative process, a preliminary year on Earth (“oiling the stiff knowledge,” as the expression went) insured a higher score.</p>
      <p>If Trevelyan was repeating, maybe he wasn’t doing so well. George felt ashamed that the thought pleased him just a bit.</p>
      <p>He looked about. The stands were almost full. This would be a well-attended Olympics, which meant greater strain on the contestants—or greater drive, perhaps, depending on the individual.</p>
      <p>Why Olympics, he thought suddenly? He had never known. Why was bread called bread?</p>
      <p>Once he had asked his father: “Why do they call it Olympics, Dad?”</p>
      <p>And his father had said: “Olympics means competition.”</p>
      <p>George had said: “Is when Stubby and I fight an Olympics, Dad?”</p>
      <p>Platen, Senior, had said: “No. Olympics is a special kind of competition and don’t ask silly questions, You’ll know all you have to know when you get Educated.”</p>
      <p>George, back in the present, sighed and crowded down into his seat.</p>
      <p>All you have to know!</p>
      <p>Funny that the memory should be so clear now. “When you get Educated.” No one ever said, ” <emphasis>If </emphasis>you get Educated.”</p>
      <p>He always had asked silly questions, it seemed to him now. It was as though his mind had some instinctive foreknowledge of its inability to be Educated and had gone about asking questions in order to pick up scraps here and there as best it could.</p>
      <p>And at the House they encouraged him to do so because they agreed with his mind’s instinct. It was the only way.</p>
      <p>He sat up suddenly. What the devil was he doing? Falling for that lie? Was it because Trev was there before him, an Educee, competing in the Olympics that he himself was surrendering?</p>
      <p>He<emphasis> wasn’t </emphasis>feeble-minded! No!</p>
      <p>And the shout of denial in his mind was echoed by the sudden clamor in the audience as everyone got to his feet. The box seat in the very center of one long side of the oval was filling with an entourage wearing the colors of Novia, and the word “Novia” went up above them on the main board.</p>
      <p>Novia was a Grade A world with a large population and a thoroughly developed civilization, perhaps the best in the Galaxy. It was the kind of world that every Earth-man wanted to live in someday; or, failing that, to see his children live in. (George remembered Trevelyan’s insistence on Novia as a goal—and there he was competing for it.)</p>
      <p>The lights went out in that section of the ceiling above the audience and so did the wall lights. The central trough, in which the contestants waited, became floodlit.</p>
      <p>Again George tried to make out Trevelyan. Too far.</p>
      <p>The clear, polished voice of the announcer sounded. “Distinguished Novian sponsors. Ladies. Gentlemen. The Olympics competition for Metallurgist, Nonferrous, is about to begin. The contestants are—”</p>
      <p>Carefully and conscientiously, he read off the list in the program. Names. Home towns. Educative years. Each name received its cheers, the San Franciscans among them receiving the loudest. When Trevelyan’s name was reached, George surprised himself by shouting and waving madly. The gray-haired man next to him surprised him even more by cheering likewise.</p>
      <p>George could not help but stare in astonishment and his neighbor leaned over to say (speaking loudly in order to be heard over the hubbub), “No one here from my home town; I’ll root for yours. Someone you know?”</p>
      <p>George shrank back. “No.”</p>
      <p>“I noticed you looking in that direction. Would you like to borrow my glasses?”</p>
      <p>“No. Thank you.” (Why didn’t the old fool mind his own business?)</p>
      <p>The announcer went on with other formal details concerning the serial number of the competition, the method of timing and scoring and so on. Finally, he approached the meat of the matter and the audience grew silent as it listened.</p>
      <p>“Each contestant will be supplied with a bar of nonferrous alloy of unspecified composition. He will be required to sample and assay the bar, reporting all results correctly to four decimals in per cent. All will utilize for this purpose a Beeman Microspectrograph, Model FX-2, each of which is, at the moment, not in working order.”</p>
      <p>There was an appreciative shout from the audience.</p>
      <p>“Each contestant will be required to analyze the fault of his machine and correct it. Tools and spare parts are supplied. The spare part necessary may not be present, in which case it must be asked for, and time of delivery thereof will be deducted from final time. Are all contestants ready?”</p>
      <p>The board above Contestant Five flashed a frantic red signal. Contestant Five ran off the floor and returned a moment later. The audience laughed good-naturedly.</p>
      <p>“Are all contestants ready?”</p>
      <p>The boards remained blank.</p>
      <p>“Any questions?”</p>
      <p>Still blank.</p>
      <p>“You may begin.”</p>
      <p>There was, of course, no way anyone in the audience could tell how any contestant was progressing except for whatever notations went up on the notice board. But then, that didn’t matter. Except for what professional Metallurgists there might be in the audience, none would understand anything about the contest professionally in any case. What was important was who won, who was second, who was third. For those who had bets on the standings (illegal, but unpreventable) that was all-important. Everything else might go hang.</p>
      <p>George watched as eagerly as the rest, glancing from one contestant to the next, observing how this one had removed the cover from his microspectrograph with deft strokes of a small instrument; how that one was peering into the face of the thing; how still a third was setting his alloy bar into its holder; and how a fourth adjusted a vernier with such small touches that he seemed momentarily frozen.</p>
      <p>Trevelyan was as absorbed as the rest. George had no wav of telling how he was doing.</p>
      <p>The notice board over Contestant Seventeen flashed: Focus plate out of adjustment.</p>
      <p>The audience cheered wildly.</p>
      <p>Contestant Seventeen might be right and he might, of course, be wrong. If the latter, he would have to correct his diagnosis later and lose time. Or he might never correct his diagnosis and be unable to complete his analysis or, worse still, end with a completely wrong analysis.</p>
      <p>Never mind. For the moment, the audience cheered.</p>
      <p>Other boards lit up. George watched for Board Twelve. That came on finally: “Sample holder off-center. New clamp depresser needed.”</p>
      <p>An attendant went running to him with a new part. If Trevelyan was wrong, it would mean useless delay. Nor would the time elapsed in waiting for the part be deducted. George found himself holding his breath.</p>
      <p>Results were beginning to go up on Board Seventeen, in gleaming letters: aluminum, 41.2649; magnesium, 22.1914; copper, 10.1001.</p>
      <p>Here and there, other boards began sprouting figures.</p>
      <p>The audience was in bedlam.</p>
      <p>George wondered how the contestants could work in such pandemonium, then wondered if that were not even a good thing. A first-class technician should work best under pressure.</p>
      <p>Seventeen rose from his place as his board went red-rimmed to signify completion. Four was only two seconds behind him. Another, then another.</p>
      <p>Trevelyan was still working, the minor constituents of his alloy bar still unreported. With nearly all contestants standing, Trevelyan finally rose, also. Then, tailing off, Five rose, and received an ironic cheer.</p>
      <p>It wasn’t over. Official announcements were naturally delayed. Time elapsed was something, but accuracy was just as important. And not all diagnoses were of equal difficulty. A dozen factors had to be weighed.</p>
      <p>Finally, the announcer’s voice sounded, “Winner in the time of four minutes and twelve seconds, diagnosis correct, analysis correct within an average of zero point seven parts per hundred thousand, Contestant Number—<emphasis>Seventeen, </emphasis>Henry Anton Schmidt of—”</p>
      <p>What followed was drowned in the screaming. Number Eight was next and then Four, whose good time was spoiled by a five part in ten thousand error in the niobium figure. Twelve was never mentioned. He was an also-ran.</p>
      <p>George made his way through the crowd to the Contestant’s Door and found a large clot of humanity ahead of him. There would be weeping relatives (joy or sorrow, depending) to greet them, newsmen to interview the top-scorers, or the home-town boys, autograph hounds, publicity seekers and the just plain curious. Girls, too, who might hope to catch the eye of a top-scorer, almost certainly headed for Novia (or perhaps a low-scorer who needed consolation and had the cash to afford it).</p>
      <p>George hung back. He saw no one he knew. With San Francisco so far from home, it seemed pretty safe to assume that there would be no relatives to condole with Trev on the spot.</p>
      <p>Contestants emerged, smiling weakly, nodding at shouts of approval. Policemen kept the crowds far enough away to allow a lane for walking. Each high-scorer drew a portion of the crowd off with him, like a magnet pushing through a mound of iron filings.</p>
      <p>When Trevelyan walked out, scarcely anyone was left, (George felt somehow that he had delayed coming out until just that had come to pass.) There was a cigarette in his dour mouth and he turned, eyes downcast, to walk off.</p>
      <p>It was the first hint of home George had had in what was almost a year and a half and seemed almost a decade and a half. He was almost amazed that Trevelyan hadn’t aged, that he was the same Trev he had last seen.</p>
      <p>George sprang forward.<emphasis> “Trev!”</emphasis></p>
      <p>Trevelyan spun about, astonished. He stared at George and then his hand shot out “George Platen,<emphasis> what </emphasis>the devil—”</p>
      <p>And almost as soon as the look of pleasure had crossed his face, it left. His hand dropped before George had quite the chance of seizing it.</p>
      <p>“Were you in there?” A curt jerk of Trev’s head indicated the hall.</p>
      <p>“I was.”</p>
      <p>’To see me?”</p>
      <p>“Yes.”</p>
      <p>“Didn’t do so well, did I?” He dropped his cigarette and stepped on it, staring off to the street, where the emerging crowd was slowly eddying and finding its way into skimmers, while new lines were forming for the next scheduled Olympics.</p>
      <p>Trevelyan said heavily, “So what? It’s only the second time I missed. Novia can go shove after the deal I got today. There are planets that would jump at me fast enough—But, listen, I haven’t seen you since Education Day. Where did you go? Your folks said you were on special assignment but gave no details and you never wrote. You might have written.”</p>
      <p>“I should have,” said George uneasily. “Anyway, I came to say I was sorry the way things went just now.”</p>
      <p>“Don’t be,” said Trevelyan. “I told you. Novia can go shove—At that I should have known. They’ve been saying for weeks that the Beeman machine would be used. All the wise money was on Beeman machines. The damned Education tapes they ran through me were for Henslers and who uses Henslers? The worlds in the Go-man Cluster if you want to call them worlds. Wasn’t<emphasis> that </emphasis>a nice deal they gave me?”</p>
      <p>“Can’t you complain to—”</p>
      <p>“Don’t be a fool. They’ll tell me my brain was built for Henslers. Go argue.<emphasis> Everything </emphasis>went wrong. I was the only one who had to send out for a piece of equipment. Notice that?”</p>
      <p>“They deducted the time for that, though.”</p>
      <p>“Sure, but I lost time wondering if I could be right in my diagnosis when I noticed there wasn’t any clamp depresser in the parts they had supplied. They don’t deduct for that. If it had been a Hensler, I would have<emphasis> known </emphasis>I was right. How could I match up then? The top winner was a San Franciscan. So were three of the next four. And the fifth guy was from Los Angeles. They get big-city Educational tapes. The best available. Beeman spectrographs and all. How do I compete with them? I came all the way out here just to get a chance at a Novian-sponsored Olympics in my classification and I might just as well have stayed home. I knew it, I tell you, and that settles it. Novia isn’t the only chunk of rock in space. Of all the damned—”</p>
      <p>He wasn’t speaking to George. He wasn’t speaking to anyone. He was just uncorked and frothing. George realized that.</p>
      <p>George said, “If you knew in advance that the Beemans were going to be used, couldn’t you have studied up on them?”</p>
      <p>“They weren’t in my tapes, I tell you,”</p>
      <p>“You could have read—books.”</p>
      <p>The last word had tailed off under Trevelyan’s suddenly sharp look.</p>
      <p>Trevelyan said, “Are you trying to make a big laugh out of this? You think this is funny? How do you expect me to read some book and try to memorize enough to match someone else who<emphasis> knows.”</emphasis></p>
      <p>“I thought—”</p>
      <p>“You try it. You try—” Then, suddenly, “What’s your profession, by the way?” He sounded thoroughly hostile.</p>
      <p>“Well—”</p>
      <p>“Come on, now. If you’re going to be a wise guy with me, let’s see what you’ve done. You’re still on Earth, I notice, so you’re not a Computer Programmer and your special assignment can’t be much.”</p>
      <p>George said, “Listen, Trev, I’m late for an appointment.” He backed away, trying to smile.</p>
      <p>“No, you don’t.” Trevelyan reached out fiercely, catching hold of George’s jacket. “You answer my question. Why are you afraid to tell me? What is it with you? Don’t come here rubbing a bad showing in my face, George, unless you can take it, too. Do you hear me?”</p>
      <p>He was shaking George in frenzy and they were struggling and swaying across the floor, when the Voice of Doom struck George’s ear in the form of a policeman’s outraged call.</p>
      <p>“All right now.<emphasis> All </emphasis>right. Break it up.”</p>
      <p>George’s heart turned to lead and lurched sickeningly. The policeman would be taking names, asking to see identity cards, and George lacked one. He would be questioned and his lack of profession would show at once; and before Trevelyan, too, who ached with the pain of the drubbing he had taken and would spread the news back home as a salve for his own hurt feelings.</p>
      <p>George couldn’t stand that. He broke away from Trevelyan and made to run, but the policeman’s heavy hand was on his shoulder. “Hold on, there. Let’s see your identity card.”</p>
      <p>Trevelyan was fumbling for his, saying harshly, “I’m Armand Trevelyan, Metallurgist, Nonferrous. I was just competing in the Olympics. You better find out about him, though, officer.”</p>
      <p>George faced the two, lips dry and throat thickened past speech.</p>
      <p>Another voice sounded, quiet, well-mannered. “Officer. One moment.”</p>
      <p>The policeman stepped back. “Yes, sir?”</p>
      <p>“This young man is my guest. What is the trouble?”</p>
      <p>George looked about in wild surprise. It was the gray-haired man who had been sitting next to him. Gray-hair nodded benignly at George.</p>
      <p>Guest? Was he mad?</p>
      <p>The policeman was saying, “These two were creating a disturbance, sir.”</p>
      <p>“Any criminal charges? Any damages?”</p>
      <p>“No, sir.”</p>
      <p>“Well, then, I’ll be responsible.” He presented a small card to the policeman’s view and the latter stepped back at once.</p>
      <p>Trevelyan began indignantly, “Hold on, now—” but the policeman turned on him.</p>
      <p>“All right, now. Got any charges?”</p>
      <p>“I just—”</p>
      <p>“On your way. The rest of you—move on.” A sizable crowd had gathered, which now, reluctantly, unknotted itself and raveled away.</p>
      <p>George let himself be led to a skimmer but balked at entering.</p>
      <p>He said, “Thank you, but I’m not your guest.” (Could it be a ridiculous case of mistaken identity?)</p>
      <p>But Gray-hair smiled and said, “You weren’t but you are now. Let me introduce myself, I’m Ladislas Ingenescu, Registered Historian.”</p>
      <p>“But—”</p>
      <p>“Come, you will come to no harm, I assure you. After all, I only wanted to spare you some trouble with a policeman.”</p>
      <p>“But why?”</p>
      <p>“Do you want a reason? Well, then, say that we’re honorary towns-mates, you and I. We both shouted for the same man, remember, and we townspeople must stick together, even if the tie is only honorary. Eh?”</p>
      <p>And George, completely unsure of this man, Ingenescu, and of himself as well, found himself inside the skimmer. Before he could make up his mind that he ought to get off again, they were off the ground.</p>
      <p>He thought confusedly: The man has some status. The policeman deferred to him.</p>
      <p>He was almost forgetting that his real purpose here in San Francisco was not to find Trevelyan but to find some person with enough influence to force a reappraisal of his own capacity of Education.</p>
      <p>It could be that Ingenescu was such a man. And right in George’s lap.</p>
      <p>Everything could be working out fine—fine. Yet it sounded hollow in his thought. He was uneasy.</p>
      <p>During the short skimmer-hop, Ingenescu kept up an even flow of small-talk, pointing out the landmarks of the city, reminiscing about past Olympics he had seen. George, who paid just enough attention to make vague sounds during the pauses, watched the route of flight anxiously.</p>
      <p>Would they head for one of the shield-openings and leave the city altogether?</p>
      <p>The skimmer landed at the roof-entry of a hotel and, as he alighted, Ingenescu said, “I hope you’ll eat dinner with me in my room?”</p>
      <p>George said, “Yes,” and grinned unaffectedly. He was just beginning to realize the gap left within him by a missing lunch.</p>
      <p>Ingenescu let George eat in silence. Night closed in and the wall lights went on automatically. (George thought: I’ve been on my own almost twenty-four hours.)</p>
      <p>And then over the coffee, Ingenescu finally spoke again. He said, “You’ve been acting as though you think I intend you harm.”</p>
      <p>George reddened, put down his cup and tried to deny it, but the older man laughed and shook his head.</p>
      <p>“It’s so. I’ve been watching you closely since I first saw you and I think I know a great deal about you now.”</p>
      <p>George half rose in horror.</p>
      <p>Ingenescu said, “But sit down. I only want to help you.”</p>
      <p>George sat down but his thoughts were in a whirl. If the old man knew who he was, why had he not left him to the policeman? On the other hand, why should he volunteer help?</p>
      <p>Ingenescu said, “You want to know why I should want to help you? Oh, don’t look alarmed. I can’t read minds. It’s just that my training enables me to judge the little reactions that give minds away, you see. Do you understand that?”</p>
      <p>George shook his head.</p>
      <p>Ingenescu said, “Consider my first sight of you. You were waiting in line to watch an Olympics, and your micro-reactions didn’t match what you were doing. The expression of your face was wrong, the action of your hands was wrong. It meant that something, in general, was wrong, and the interesting thing was that, whatever it was, it was nothing common, nothing obvious. Perhaps, I thought, it was something of which your own conscious mind was unaware.</p>
      <p>“I couldn’t help but follow you, sit next to you. I followed you again when you left and eavesdropped on the conversation between your friend and yourself. After that, well, you were far too interesting an object of study—I’m sorry if that sounds cold-blooded—for me to allow you to be taken off by a policeman.—Now tell me, what is it that troubles you?”</p>
      <p>George was in an agony of indecision. If this was a trap, why should it be such an indirect, roundabout one? And he<emphasis> had </emphasis>to turn to someone. He had come to the city to find help and here was help being offered. Perhaps what was wrong was that it was being offered. It came too easy.</p>
      <p>Ingenescu said, “Of course, what you tell me as a Social Scientist is a privileged communication. Do you know what that means?”</p>
      <p>“No, sir.”</p>
      <p>“It means, it would be dishonorable for me to repeat what you say to anyone for any purpose. Moreover no one has the legal right to compel me to repeat it.”</p>
      <p>George said, with sudden suspicion, “I thought you were a Historian.”</p>
      <p>“So I am.”</p>
      <p>“Just now you said you were a Social Scientist.”</p>
      <p>Ingenescu broke into loud laughter and apologized for<emphasis> it </emphasis>when he could talk. “I’m sorry, young man, I shouldn’t laugh, and I wasn’t really laughing at you. I was laughing at Earth and its emphasis on physical science, and the practical segments of it at that. I’ll bet you can rattle off every subdivision of construction technology or mechanical engineering and yet you’re a blank on social science.”</p>
      <p>“Well, then what<emphasis> is </emphasis>social science?”</p>
      <p>“Social science studies groups of human beings and there are many high-specialized branches to it, just as there are to zoology, for instance. For instance, there are Culturists, who study the mechanics of cultures, their growth, development, and decay. Cultures,” he added, forestalling a question, “are all the aspects of a way of life. For instance it includes the way we make our living, the things we enjoy and believe, what we consider good and bad and so on. Do you understand?”</p>
      <p>“I think I do.”</p>
      <p>“An Economist—not an Economic Statistician, now, but an Economist—specializes in the study of the way a culture supplies the bodily needs of its individual members. A psychologist specializes in the individual member of a society and how he is affected by the society. A Futurist specializes in planning the future course of a society, and a Historian—That’s where I come in, now.”</p>
      <p>“Yes, sir.”</p>
      <p>“A Historian specializes in the past development of our own society and of societies with other cultures.”</p>
      <p>George found himself interested. “Was it different in the past?”</p>
      <p>“I should say it was. Until a thousand years ago, there was no Education; not what we call Education, at least.”</p>
      <p>George said, “I know. People learned in bits and pieces out of books.”</p>
      <p>“Why, how do you know this?”</p>
      <p>“I’ve heard it said,” said George cautiously. Then, “Is there any use in worrying about what’s happened long ago? I mean, it’s all done with, isn’t it?”</p>
      <p>“It’s never done with, my boy. The past explains the present. For instance, why is our Educational system what it is?”</p>
      <p>George stirred restlessly. The man kept bringing the subject back to that. He said snappishly, “Because it’s best.”</p>
      <p>“Ah, but why is it best? Now you listen to me for one moment and I’ll explain. Then you can tell me if there is any use in history. Even before interstellar travel was developed—” He broke off at the look of complete astonishment on George’s face. “Well, did you think we always had it?”</p>
      <p>“I never gave it any thought, sir.”</p>
      <p>“I’m sure you didn’t. But there was a time, four or five thousand years ago when mankind was confined to the surface of Earth. Even then, his culture had grown quite technological and his numbers had increased to the point where any failure in technology would have meant mass starvation and disease. To maintain the technological level and advance it in the face of an increasing population, more and more technicians and scientists had to be trained, and yet, as science advanced, it took longer and longer to train them.</p>
      <p>“As first interplanetary and then interstellar travel was developed, the problem grew more acute. In fact, actual colonization of extra-Solar planets was impossible for about fifteen hundred years because of lack of properly trained men.</p>
      <p>“The turning point came when the mechanics of the storage of knowledge within the brain was worked out. Once that had been done, it became possible to devise Educational tapes that would modify the mechanics in such a way as to place within the mind a body of knowledge ready-made so to speak. But you know about<emphasis> that.</emphasis></p>
      <p>“Once that was done, trained men could be turned out by the thousands and millions, and we could begin what someone has since called the ‘Filling of the Universe.’ There are now fifteen hundred inhabited planets in the Galaxy and there is no end in sight.</p>
      <p>“Do you see all that is involved? Earth exports Education tapes for low-specialized professions and that keeps the Galactic culture unified. For instance, the Reading tapes insure a single language for all of us.—Don’t look so surprised, other languages are possible, and in the past were used. Hundreds of them.</p>
      <p>“Earth also exports high-specialized professionals and keeps its own population at an endurable level. Since they are shipped out in a balanced sex ratio, they act as self-reproductive units and help increase the populations on the Outworlds where an increase is needed. Furthermore, tapes and men are paid for in material which we much need and on which our economy depends.<emphasis> Now </emphasis>do you understand why our Education is the best way?”</p>
      <p>“Yes, sir.”</p>
      <p>“Does it help you to understand, knowing that without it, interstellar colonization was impossible for fifteen hundred years?”</p>
      <p>“Yes, sir.”</p>
      <p>“Then you see the uses of history.” The Historian smiled. “And now I wonder if you see why I’m interested in you?”</p>
      <p>George snapped out of time and space back to reality. Ingenescu, apparently, didn’t talk aimlessly. All this lecture had been a device to attack him from a new angle.</p>
      <p>He said, once again withdrawn, hesitating, “Why?”</p>
      <p>“Social Scientists work with societies and societies are made up of people.”</p>
      <p>“All right.”</p>
      <p>“But people aren’t machines. The professionals in physical science work with machines. There is only a limited amount to know about a machine and the professionals know it all. Furthermore, all machines of a given sort are just about alike so that there is nothing to interest them in any given individual machine. But people, ah—They are so complex and so different one from another that a Social Scientist never knows all there is to know or even a good part of what there is to know. To understand his own specialty, he must always be ready to study people; particularly unusual specimens.”</p>
      <p>“Like me,” said George tonelessly.</p>
      <p>“I shouldn’t call you a specimen, I suppose, but you are unusual. You’re worth studying, and if you will allow me that privilege then, in return, I will help you if you are introuble and if I can.”</p>
      <p>There were pin wheels whirring in George’s mind.—</p>
      <p>All this talk about people and colonization made possible by Education. It was as though caked thought within him were being broken up and strewn about mercilessly.</p>
      <p>He said, “Let me think,” and clamped his hands over his ears.</p>
      <p>He took them away and said to the Historian, “Will you do something for me, sir?”</p>
      <p>“If I can,” said the Historian amiably.</p>
      <p>“And everything I say in this room is a privileged communication. You said so.”</p>
      <p>“And I meant it.”</p>
      <p>“Then get me an interview with an Outworld official, with—with a Novian.”</p>
      <p>Ingenescu looked startled. “Well, now—”</p>
      <p>“You can do it,” said George earnestly. “You’re an important official. I saw the policeman’s look when you put that card in front of his eyes. If you refuse, I—I won’t let you study me.”</p>
      <p>It sounded a silly threat in George’s own ears, one without force. On Ingenescu, however, it seemed to have a strong effect.</p>
      <p>He said, “That’s an impossible condition. A Novian in Olympics month—”</p>
      <p>“All right, then, get me a Novian on the phone and I’ll make my own arrangements for an interview.”</p>
      <p>“Do you think you can?”</p>
      <p>“I know I can. Wait and see.”</p>
      <p>Ingenescu stared at George thoughtfully and then reached for the visiphone.</p>
      <p>George waited, half drunk with this new outlook on the whole problem and the sense of power it brought. It couldn’t miss. It<emphasis> couldn’t </emphasis>miss. He would be a Novian yet. He would leave Earth in triumph despite Antonelli and the whole crew of fools at the House for the (he almost laughed aloud) Feeble-minded.</p>
      <p>George watched eagerly as the visiplate lit up. It would open up a window into a room of Novians, a window into a small patch of Novia transplanted to Earth. In twenty-four hours, he had accomplished that much.</p>
      <p>There was a burst of laughter as the plate unmisted and sharpened, but for the moment no single head could be seen but rather the fast passing of the shadows of men and women, this way and that. A voice was heard, clear-worded over a background of babble. “Ingenescu? He wants me?”</p>
      <p>Then there he was, staring out of the plate. A Novian.</p>
      <p>A genuine Novian (George had not an atom of doubt. There was something completely Outworldly about him. Nothing that could be completely defined, or even momentarily mistaken.)</p>
      <p>He was swarthy in complexion with a dark wave of hair combed rigidly back from his forehead. He wore a thin black mustache and a pointed beard, just as dark, that scarcely reached below the lower limit of his narrow chin, but the rest of his face was so smooth that it looked as though it had been depilated permanently.</p>
      <p>He was smiling. “Ladislas, this goes too far. We fully expect to be spied on, within reason, during our stay on Earth, but mind reading is out of bounds.”</p>
      <p>“Mind reading, Honorable?”</p>
      <p>“Confess! You knew I was going to call you this evening. You knew I was only waiting to finish this drink.” His hand moved up into view and his eye peered through a small glass of afaintly violet liqueur. “I can’t offer you one, I’m afraid.”</p>
      <p>George, out of range of Ingenescu’s transmitter could not be seen by the Novian. He was relieved at that. He wanted time to compose himself and he needed it badly. It was as though he were made up exclusively of restless fingers, drumming, drumming—</p>
      <p>But he was right. He hadn’t miscalculated. Ingenescu<emphasis> was </emphasis>important. The Novian called him by his first name.</p>
      <p>Good! Things worked well. What George had lost on Antonelli, he would make up, with advantage, on Ingenescu. And someday, when he was on his own at last, and could come back to Earth as powerful a Novian as this one who could negligently joke with Ingenescu’s first name and be addressed as “Honorable” in turn—when he came back, he would settle with Antonelli. He had a year and a half to pay back and he—</p>
      <p>He all but lost his balance on the brink of the enticing daydream and snapped back in sudden anxious realization that he was losing the thread of what was going on.</p>
      <p>The Novian was saying, “—doesn’t hold water. Novia has a civilization as complicated and advanced as Earth’s. We’re not Zeston, after all. It’s ridiculous that we have to come here for individual technicians.”</p>
      <p>Ingenescu said soothingly, “Only for new models. There is never any certainty that new models will be needed. To buy the Educational tapes would cost you the same price as a thousand technicians and how do you know you would need that many?”</p>
      <p>The Novian tossed off what remained of his drink and laughed. (It displeased George, somehow, that a Novian should be this frivolous. He wondered uneasily if perhaps the Novian ought not to have skipped that drink and even the one or two before that.)</p>
      <p>The Novian said, “That’s typical pious fraud, Ladislas. You know we can make use of all the late models we can get. I collected five Metallurgists this afternoon—”</p>
      <p>“I know,” said Ingenescu. “I was there.”</p>
      <p>“Watching me! Spying!” cried the Novian. “I’ll tell you what it is. The new-model Metallurgists I got differed from the previous model only in knowing the use of Beeman Spectrographs. The tapes couldn’t be modified that much, not that much” (he held up two fingers close together) “from last year’s model. You introduce the new models only to<emphasis> make </emphasis>us buy and spend and come here hat in hand.”</p>
      <p>“We don’t<emphasis> make </emphasis>you buy.”</p>
      <p>“No, but you sell late-model technicians to Landonum and so we have to keep pace. It’s a merry-go-round you have us on, you pious Earthmen, but watch out, there may be an exit somewhere.” There was a sharp edge to his laugh, and it ended sooner than it should have.</p>
      <p>Ingenescu said, “In all honesty, I hope there is. Meanwhile, as to the purpose of my call—”</p>
      <p>“That’s right,<emphasis> you </emphasis>called. Oh, well, I’ve said my say and I suppose next year there’ll be a new model of Metallurgist anyway for us to spend goods on, probably with a new gimmick for niobium assays and nothing else altered and the next year—But go on, what is it you want?”</p>
      <p>“I have a young man here to whom I wish you to speak.”</p>
      <p>“Oh?” The Novian looked not completely pleased with that. “Concerning what?”</p>
      <p>“I can’t say. He hasn’t told me. For that matter he hasn’t even told me his name and profession.”</p>
      <p>The Novian frowned. “Then why take up my time?”</p>
      <p>“He seems quite confident that you will be interested in what he has to say.”</p>
      <p>“I dare say.”</p>
      <p>“And,” said Ingenescu, “as a favor to me.”</p>
      <p>TheNovian shrugged. “Put him on and tell him to make it short.”</p>
      <p>Ingenescu stepped aside and whispered to George, “Address him as ‘Honorable.’ ”</p>
      <p>George swallowed with difficulty. This was it.</p>
      <p>George felt himself going moist with perspiration. The thought had come so recently, yet it was in him now so certainly. The beginnings of it had come when he had spoken to Trevelyan, then everything had fermented and billowed into shape while Ingenescu had prattled, and then the Novian’s own remarks had seemed to nail it all into place.</p>
      <p>George said, “Honorable, I’ve come to show you the exit from the merry-go-round.” Deliberately, he adopted the Novian’s own metaphor.</p>
      <p>The Novian stared at him gravely. “What merry-go-round?”</p>
      <p>“You yourself mentioned it, Honorable. The merry-go-round that Novia is on when you come to Earth to—to get technicians.” (He couldn’t keep his teeth from chattering; from excitement, not fear.)</p>
      <p>The Novian said, “You’re trying to say that you know a way by which we can avoid patronizing Earth’s mental super-market. Is that it?”</p>
      <p>“Yes, sir. You can control your own Educational system.”</p>
      <p>“Umm. Without tapes?”</p>
      <p>“Y—yes, Honorable.”</p>
      <p>The Novian, without taking his eyes from George, called out, “Ingenescu, get into view.”</p>
      <p>The Historian moved to where he could be seen over George’s shoulder.</p>
      <p>The Novian said, “What is this? I don’t seem to penetrate.”</p>
      <p>“I assure you solemnly,” said Ingenescu, “that whatever this is it is being done on the young man’s own initiative, Honorable. I have not inspired this. I have nothing to do with it.”</p>
      <p>“Well, then, what is the young man to you? Why do you call me on his behalf?”</p>
      <p>Ingenescu said, “He is an object of study, Honorable. He has value to me and I humor him.”</p>
      <p>“What kind of value?”</p>
      <p>“It’s difficult to explain; a matter of my profession.”</p>
      <p>The Novian laughed shortly. “Well, to each his profession.” He nodded to an invisible person or persons outside plate range. “There’s a young man here, a protйgй of Ingenescu or some such thing, who will explain to us how to Educate without tapes.” He snapped his fingers, and another glass of pale liqueur appeared in his hand. “Well, young man?”</p>
      <p>The faces on the plate were multiple now. Men and women, both, crammed in for a view of George, their faces molded into various shades of amusement and curiosity.</p>
      <p>George tried to look disdainful. They were all, in their own ways, Novians as well as the Earthman, “studying” him as though he were a bug on a pin. Ingenescu was sitting in a corner, now, watching him owl-eyed.</p>
      <p>Fools, he thought tensely, one and all. But they would have to understand. He would<emphasis> make </emphasis>them understand.</p>
      <p>He said, “I was at the Metallurgist Olympics this afternoon.”</p>
      <p>“You, too?” said the Novian blandly. “It seems all Earth was there.”</p>
      <p>“No, Honorable, but I was. I had a friend who competed and who made out very badly because you were using the Beeman machines. His education had included only the Henslers, apparently an older model. You said the modification involved was slight.” George held up two fingers close together in conscious mimicry of the other’s previous gesture. “And my friend had known some time in advance that knowledge of the Beeman machines would be required.”</p>
      <p>“And what does that signify?”</p>
      <p>“It was my friend’s lifelong ambition to qualify for Novia. He already knew the Henslers. He had to know the Beemans to qualify and he knew that. To learn about the Beemans would have taken just a few more facts, a bit more data, a small amount of practice perhaps. With a life’s ambition riding the scale, he might have managed this—”</p>
      <p>“And where would he have obtained a tape for the additional facts and data? Or has Education become a private matter for home study here on Earth?”</p>
      <p>There was dutiful laughter from the faces in the background.</p>
      <p>George said, “That’s why he didn’t learn, Honorable. He thought he needed a tape. He wouldn’t even try without one, no matter what the prize. He refused to try without a tape.”</p>
      <p>“Refused, eh? Probably the type of fellow who would refuse to fly without a skimmer.” More laughter and the Novian thawed into a smile and said, “The fellow is amusing. Go on. I’ll give you another few moments.”</p>
      <p>George said tensely, “Don’t think this is a joke. Tapes are actually bad. They teach too much; they’re too painless. A man who learns that way doesn’t know how to learn any other way. He’s frozen into whatever position he’s been taped. Now if a person<emphasis> weren’t </emphasis>given tapes but were forced to learn by hand, so to speak, from the start; why, then he’d get the habit of learning, and continue to learn. Isn’t that reasonable? Once he has the habit well developed he can be given just a small amount of tape-knowledge, perhaps, to fill in gaps or fix details. Then he can make further progress on his own. You can make Beeman Metallurgists out of your own Hensler Metallurgists in that way and not have to come to Earth for new models.”</p>
      <p>The Novian nodded and sipped at his drink. “And where does everyone get knowledge without tapes? From interstellar vacuum?”</p>
      <p>“From books. By studying the instruments themselves. By<emphasis> thinking.”</emphasis></p>
      <p>“Books? How does one understand books without Education?”</p>
      <p>“Books are in words. Words can be understood for the most part. Specialized words can be explained by the technicians you already have.”</p>
      <p>“What about reading? Will you allow reading tapes?”</p>
      <p>“Reading tapes are all right, I suppose, but there’s no reason you can’t learn to read the old way, too. At least in part.”</p>
      <p>The Novian said, “So that you can develop good habits from the start?”</p>
      <p>“Yes, yes,” George said gleefully. The man was beginning to understand.</p>
      <p>“And what about mathematics?”</p>
      <p>“That’s the easiest of all, sir—Honorable. Mathematics is different from other technical subjects. It starts with certain simple principles and proceeds by steps. You can start with nothing and learn. It’s practically designed for that Then, once you know the proper types of mathematics, other technical books become quite understandable. Especially if you start with easy ones.”</p>
      <p>“Are there easy books?”</p>
      <p>“Definitely. Even if there weren’t, the technicians you now have can try to write easy books. Some of them might be able to put some of their knowledge into words and symbols.”</p>
      <p>“Good Lord,” said the Novian to the men clustered about him. “The young devil has an answer for everything.”</p>
      <p>“I have. I have,” shouted George. “Ask me.”</p>
      <p>“Have you tried learning from books yourself? Or is this just theory with you?”</p>
      <p>George turned to look quickly at Ingenescu, but the Historian was passive. There was no sign of anything but gentle interest in his face.</p>
      <p>George said, “I have.”</p>
      <p>“And do you find it works?”</p>
      <p>“Yes, Honorable,” said George eagerly. “Take me with you to Novia. I can set up a program and direct—”</p>
      <p>“Wait, I have a few more questions. How long would it take, do you suppose, for you to become a Metallurgist capable of handling a Beeman machine, supposing you started from nothing and did not use Educational tapes?”</p>
      <p>George hesitated. “Well—years, perhaps.”</p>
      <p>“Two years? Five? Ten?”</p>
      <p>“I can’t say, Honorable.”</p>
      <p>“Well, there’s a vital question to which you have no answer, have you? Shall we say five years? Does that sound reasonable to you?”</p>
      <p>“I suppose so.”</p>
      <p>“All right. We have a technician studying metallurgy according to this method of yours for five years. He’s no good to us during that time, you’ll admit, but he must be fed and housed and paid all that time.”</p>
      <p>“But—”</p>
      <p>“Let me finish. Then when he’s done and can use the Beeman, five years have passed. Don’t you suppose we’ll have modified Beemans then which he<emphasis> won’t </emphasis>be able to use?”</p>
      <p>“But by then hell be expert on learning. He could learn the new details necessary in a matter of days.”</p>
      <p>“So you say. And suppose this friend of yours, for instance, had studied up on Beemans on his own and managed to learn it; would he be as expert in its use as a competitor who had learned it off the tapes?”</p>
      <p>“Maybe not—” began George.</p>
      <p>“Ah,” said the Novian.</p>
      <p>“Wait, let<emphasis> me </emphasis>finish. Even if he doesn’t know something as well, it’s the ability to learn further that’s important. He may be able to think up things, new things that no tape-Educated man would. You’ll have a reservoir of original thinkers—”</p>
      <p>“In your studying,” said the Novian, “have you thought up any new things?”</p>
      <p>“No, but I’m just one man and I haven’t studied long—»</p>
      <p>“Yes.—Well, ladies, gentlemen, have we been sufficiently amused?”</p>
      <p>“Wait,” cried George, in sudden panic. “I want to arrange a personal interview. There are things I can’t explain over the visiphone. There are details—”</p>
      <p>The Novian looked past George. “Ingenescu! I think I have done you your favor. Now, really, I have a heavy schedule tomorrow. Be well!”</p>
      <p>The screen went blank.</p>
      <p>George’s hands shot out toward the screen, as though in a wild impulse to shake life back into it. He cried out, “He didn’t believe me. He didn’t believe me.”</p>
      <p>Ingenescu said, “No, George. Did you really think he would?”</p>
      <p>George scarcely heard him. “But why not? It’s all true. It’s all so much to his advantage. No risk. I and a few men to work with—A dozen men training for years would cost less than one technician.—He was drunk! Drunk! He didn’t understand.”</p>
      <p>George looked about breathlessly. “How do I get to him? I’ve got to. This was wrong. Shouldn’t have used the visiphone. I need time. Face to face. How do I—”</p>
      <p>Ingenescu said, “He won’t see you, George. And if he did, he wouldn’t believe you.”</p>
      <p>“He will, I tell you. When he isn’t drinking. He—”</p>
      <p>George turned squarely toward the Historian and his eyes widened. “Why do you call me George?”</p>
      <p>“Isn’t that your name? George Platen?”</p>
      <p>“You know me?”</p>
      <p>“All about you.”</p>
      <p>George was motionless except for the breath pumping his chest wall up and down.</p>
      <p>Ingenescu said, “I want to help you, George. I told you that. I’ve been studying you and I want to help you.”</p>
      <p>George screamed, “I don’t need help. I’m not feebleminded. The whole world is, but I’m not.” He whirled and dashed madly for the door.</p>
      <p>He flung it open and two policemen roused themselves suddenly from their guard duty and seized him.</p>
      <p>For all George’s straining, he could feel the hypo-spray at the fleshy point just under the corner of his jaw, and that was it. The last thing he remembered was the face of Ingenescu, watching with gentle concern.</p>
      <p>George opened his eyes to the whiteness of a ceiling. He remembered what had happened. He remembered it distantly as though it had happened to somebody else. He stared at the ceiling till the whiteness filled his eyes and washed his brain clean, leaving room, it seemed, for new thought and new ways of thinking.</p>
      <p>He didn’t know how long he lay there so, listening to the drift of his own thinking.</p>
      <p>There was a voice in his ear. “Are you awake?”</p>
      <p>And George heard his own moaning for the first tune. Had he been moaning? He tried to turn his head.</p>
      <p>The voice said, “Are you in pain, George?”</p>
      <p>George whispered, “Funny. I was so anxious to leave Earth. I didn’t understand.”</p>
      <p>“Do you know where you are?”</p>
      <p>“Back in the—the House.” George managed to turn. The voice belonged to Omani.</p>
      <p>George said, “It’s funny I didn’t understand.”</p>
      <p>Omani smiled gently, “Sleep again—”</p>
      <p>And woke again. His mind was clear.</p>
      <p>Omani sat at the bedside reading, but he put down the book as George’s eyes opened.</p>
      <p>George struggled to a sitting position. He said, “Hello.”</p>
      <p>“Are you hungry?”</p>
      <p>“You bet.” He stared at Omani curiously. “I was followed when I left, wasn’t I?”</p>
      <p>Omani nodded. “You were under observation at all times. We were going to maneuver you to Antonelli and let you discharge your aggressions. We felt that to be the only way you could make progress. Your emotions were clogging your advance.”</p>
      <p>George said, with a trace of embarrassment, “I was all wrong about him.”</p>
      <p>“It doesn’t matter now. When you stopped to stare at the Metallurgy notice board at the airport, one of our agents reported back the list of names. You and I had talked about your past sufficiently so that I caught the significance of Trevelyan’s name there. You asked for directions to the Olympics; there was the possibility that this might result in the kind of crisis we were hoping for; we sent Ladislas Ingenescu to the hall to meet you and take over.”</p>
      <p>“He’s an important man in the government, isn’t he?”</p>
      <p>“Yes, he is.”</p>
      <p>“And you had him take over. It makes me sound important.”</p>
      <p>“You<emphasis> are </emphasis>important, George.”</p>
      <p>A thick stew had arrived, steaming, fragrant. George grinned wolfishly and pushed his sheets back to free his arms. Omani helped arrange the bed-table. For a while, George ate silently.</p>
      <p>Then George said, “I woke up here once before just for a short time.”</p>
      <p>Omani said, “I know. I was here.”</p>
      <p>“Yes, I remember. You know, everything was changed. It was as though I was too tired to feel emotion. I wasn’t angry any more. I could just think. It was as though I had been drugged to wipe out emotion.”</p>
      <p>“You weren’t,” said Omani. “Just sedation. You had rested.”</p>
      <p>“Well, anyway, it was all clear to me, as though I had known it all the time but wouldn’t listen to myself. I thought: What was it I had wanted Novia to let me do? I had wanted to go to Novia and take a batch of un-Educated youngsters and teach them out of books. I had wanted to establish a House for the Feeble-minded—like here—and Earth already has them—many of them.”</p>
      <p>Omani’s white teeth gleamed as he smiled. “The Institute of Higher Studies is the correct name for places like this.”</p>
      <p>“Now I see it,” said George, “so easily I am amazed at my blindness before. After all, who invents the new instrument models that require new-model technicians? Who invented the Beeman spectrographs, for instance? A man called Beeman, I suppose, but he couldn’t have been tape-Educated or how could he have made the advance?”</p>
      <p>“Exactly.”</p>
      <p>“Or who makes Educational tapes? Special tape-making technicians? Then who makes the tapes to train<emphasis> them? </emphasis>More advanced technicians? Then who makes the tapes—You see what I mean. Somewhere there has to be an end. Somewhere there must be men and women with capacity for original thought.”</p>
      <p>“Yes, George.”</p>
      <p>George leaned back, stared over Omani’s head, and for a moment there was the return of something like restlessness to his eyes.</p>
      <p>“Why wasn’t I told all this at the beginning?”</p>
      <p>“Oh, if we could,” said Omani, “the trouble it would save us. We can analyze a mind, George, and say this one will make an adequate architect and that one a good woodworker. We know of no way of detecting the capacity for original, creative thought. It is too subtle a thing. We have some rule-of-thumb methods that mark out individuals who may possibly or potentially have such a talent.</p>
      <p>“On Reading Day, such individuals are reported. You were, for instance. Roughly speaking, the number so reported comes to one in ten thousand. By the time Education Day arrives, these individuals are checked again, and nine out of ten of them turn out to have been false alarms. Those who remain are sent to places like this.”</p>
      <p>George said, “Well, what’s wrong with telling people that one out of—of a hundred thousand will end at places like these? Then it won’t be such a shock to those who do.”</p>
      <p>“And those who don’t? The ninety-nine thousand nine hundred and ninety-nine that don’t? We can’t have all those people considering themselves failures. They aim at the professions and one way or another they all make it. Everyone can place after his or her name: Registered something-or-other. In one fashion or another every individual has his or her place in society and this is necessary.”</p>
      <p>“But we?” said George. “The one in ten thousand exception?”</p>
      <p>“You can’t be told. That’s exactly it. It’s the final test. Even after we’ve thinned out the possibilities on Education Day, nine out of ten of those who come here are not quite the material of creative genius, and there’s no way we can distinguish those nine from the tenth that we want by any form of machinery. The tenth one must tell us himself.”</p>
      <p>“How?”</p>
      <p>“We bring you here to a House for the Feeble-minded and the man who won’t accept that is the man we want. It’s a method that can be cruel, but it works. It won’t do to say to a man, ‘You can create. Do so.’ It is much safer to wait for a man to say, ‘I can create, and I will do so whether you wish it or not.’ There are ten thousand men like you, George, who support the advancing technology of fifteen hundred worlds. We can’t allow ourselves to miss one recruit to that number or waste our efforts on one member who doesn’t measure up.”</p>
      <p>George pushed his empty plate out of the way and lifted a cup of coffee to his lips.</p>
      <p>“What about the people here who don’t—measure up?”</p>
      <p>“They are taped eventually and become our Social Scientists. Ingenescu is one. I am a Registered Psychologist. We are second echelon, so to speak.”</p>
      <p>George finished his coffee. He said, “I still wonder about one thing?”</p>
      <p>“What is that?”</p>
      <p>George threw aside the sheet and stood up. “Why do they call them Olympics?”</p>
    </section>
  ")

(defonce app-state (local-storage (atom {:route :home
                                         ;; route params
                                         :params {}
                                         ;; list of books to render
                                         ;; without any caching
                                         :books {:is-fetching false
                                                 :items [{:id 1 :title "yo 1", :cover "http://payload.cargocollective.com/1/4/128429/2040423/45cd8ec84e303febca9f661e1f7f0264.jpg"}
                                                         {:id 2 :title "yo 2", :cover nil}]}
                                         ;; book for reading
                                         :book { "1" {:is-fetching false :book book}}
                                         ;; user settings
                                         :settings {}
                                         ;; user data about books – progress, etc
                                         :data {}
                                         ;; all notifications
                                         :uploading {:in-progress false}
                                         :notifications []}) :shelf-application))
