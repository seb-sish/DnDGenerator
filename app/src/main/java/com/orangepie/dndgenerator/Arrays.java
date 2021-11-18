package com.orangepie.dndgenerator;

import java.util.ArrayList;
import java.util.HashMap;

public class Arrays {
    public static ArrayList<String> defaultList = new ArrayList<>();

    public static class fentezi {
        public static ArrayList<String> locs = new ArrayList<>();
        static {
            locs.add("Эльфийский город");
            locs.add("Затерянный лес");
            locs.add("Небесные острова");
        }

        public static ArrayList<String> firstLocDesc = new ArrayList<>();
        static {
            firstLocDesc.add("Тиралин – древний город, построенный эльфами в давние времена. На данный момент там проживают эльфы, люди и небольшое количество гномов. Это один из самых больших и старых городов волшебного мира, являющийся крупнейшим центром торговли и ремесла. Город состоит из домов из камня с двумя и тремя этажами, небольших улиц с магазинами и главной площади, на которой находится красивый фонтан и главный замок короля.\n\n");
            firstLocDesc.add("Тиралин — древний город, построенный эльфами в древности. Сейчас там живут эльфы, люди и небольшое количество гномов. Один из самых больших и старых городов волшебных миров, который является одним из крупнейших центров торговли и ремесла. В городе есть дома, которые построены из камня с двумя и тремя этажам, а также небольшие улицы с магазинами и главной площадью, на которой расположен красивый фонтан и главный замок короля.\n\n");
            firstLocDesc.add("Тиралин — древний город, построенный эльфами в древние времена. В настоящее время там живут эльфы, люди и небольшое количество дварфов. Он является одним из самых больших и старых городов Волшебной страны. Он включает в себя дома из камня с двумя и тремя этажам, небольшие улицы с магазинами и главную площадь, на которой расположен красивый фонтан и главный замок короля.\n\n");
        }
        public static ArrayList<String> secondLocDesc = new ArrayList<>();
        static {
            secondLocDesc.add("Затерянный лес – это лес, наполненный магией. В нем почти никто не живет и происходят странные вещи. Затерянный лес раньше служил домом многочисленного народа существ как лесные эльфы и фейри. Однако со временем их становилось все меньше и меньше. По сей день никто не знает причины этому, как и о самом лесе. Все выжившие не знают об этом месте, ведь родились совершенно в другом. На данный момент про этот лес осталось очень мало информации, и он остался неизученным и загадочным. Никто не знает, что вас может ожидать тут, какая флора и фауна здесь обитает. Кто вам может встретиться. Лишь известно, что в округи полно животных. Все это одна большая загадка, покрытая мраком, как и исчезновение всех жителей, обитавших в нем.\n\n");
            secondLocDesc.add("Роща сакур похожа на обыкновенную рощу, но в ней растут только одни сакуры. Другие деревья там погибают. Некоторые считают рощу проклятой, другие считают, что эта роща охраняется духами, которые не любят других деревьев. Этот парк посещают и люди, и эльфы, и гномы, ведь в глубине парка находятся загадочные розовые озёра. Эти озёра лечат раны и дают силы всем, кто искупается в них.\n\n");
            secondLocDesc.add("Зачарованный лес является границей между множеством параллельных миров, здесь сбито время и не распространяются законы. В некоторых его местах даже гравитация может отсутствовать. Все это - действие сильных чар, наложенных на лес. Никому разрушить эти чары никогда не удавалось. Да и не удастся. Весь лес – огромные вечнозеленые деревья. Хотя в некоторых местах они бывают других цветов, таких как темные оттенки фиолетового и синего. В зачарованном лесу обитает самая разнообразная флора и фауна. По лесу ничего не опасаясь бродят животные, как хищные, так и мирные. Но обычно животные никогда первыми не нападали, конечно, если это не озлобленные духи. В лесу, как и говорилось выше, время сбилось. В западной части леса - ночь, а в восточной - день. Эти сутки не меняются никогда. Однако если взлететь выше деревьев, чары исчезнут, и вы можете наблюдать за сменой дня и ночи. Зачарованный лес является одним из составляющих северо-западных лесов города Тиралина. Он также граничит с самим городом, зачарованной рощей сакур, затерянным лесом и тёмным лесом. К каждому ведет широкая тропинка, перед которой обязательно стоит табличка куда ведет эта самая дорога.\n\n");
        }
        public static ArrayList<String> thirdLocDesc = new ArrayList<>();
        static {
            thirdLocDesc.add("\n\n");
            thirdLocDesc.add("\n\n");
            thirdLocDesc.add("\n\n");
        }


        public static ArrayList<String> firstLocMainPers = new ArrayList<>();
        static {
            firstLocMainPers.add("Сейчас у власти находится король [гл имя], политика которого оказалась крайне успешной, и Тиралин процветает. Он стал столицей королевства людей и эльфов. И как подобает столице, сейчас Тиралин – огромный город с большими домами и садами. В Тиралин переехало много гномов – ремесленников, поэтому появилось много мастерских, лавок и начали строиться небольшие фабрики, где гномы производят свои механизмы.\n\n");
            firstLocMainPers.add("На данный момент королём Тиралина является [гл имя]. Его правление было крайне неудачным из-за некоторых неудачных решений, поэтому сейчас Тиралин находится в кризисе. Гномы и знатные эльфы уходят из города, растёт преступность, а улицы стали пустеть. У короля нету средств на поддержание порядка в городе, поэтому город стал засоряться и зарастать. Нарастает волнение.\n\n");
            firstLocMainPers.add("Несколько лет назад в результате заговора на престол взошел король [гл имя], который установил диктатуру в Тиралине с помощью армии. Город опустел, жители боятся выходить из домов, поэтому редко можно увидеть кого-то на улице кроме стражей, почти все выходы из города закрыты для обычных жителей. Дома выглядят старыми и неухоженными, улицы заросли травой и кустами, и только главная площадь перед замком короля выглядит ухоженной и красивой.\n\n");
        }
        public static ArrayList<String> secondLocMainPers = new ArrayList<>();
        static {
            secondLocMainPers.add("В этом лесу живет некая принцесса по имени [гл имя] со своей верной защитницей. Так же с птичьего полета вы можете увидеть озеро и водопад. А еще некую большую постройку, которая является замком, что служит домом этой самой принцессы. Однако без принцессы войти в лес не получится. Пока она отсутствует на территории леса, вокруг него образуется барьер. Собственно, из-за этого вы и не можете попасть в лес. Однако это касается только тех, кто не является лесным эльфом или фейри. Эти две расы могут посещать лес даже когда [гл имя] находится за пределами леса.\n\n");
            secondLocMainPers.add("Все это находится под владением древнего Друида – [гл имя]. Он обладает огромной силой и следит, чтобы ни что не угрожало безопасности его территорий, и на падает на каждого, чьи намеренья не чисты.\n\n");
            secondLocMainPers.add("На территории этого леса проживает некая принцесса по имени [гл имя] со своей верной защитницей, которая всегда рядом с ней. Кроме того, с высоты птичьего полета вы можете увидеть озеро и водопад Есть и еще одна большую постройка – замок, который является домом для принцессы. Однако без принцессы войти в лес не получится. На территории леса в отстутствие принцессы возникает барьер. И именно поэтому вы не можете попасть в лес. Однако это касается только тех, кто не является лесным эльфом или фейри. Они могут посещать лес даже тогда, когда [гл имя] находится за его пределами.\n\n");
        }
        public static ArrayList<String> thirdLocMainPers = new ArrayList<>();
        static {
            thirdLocMainPers.add("\n\n");
            thirdLocMainPers.add("\n\n");
            thirdLocMainPers.add("\n\n");

        }


        public static ArrayList<String> firstLocItem = new ArrayList<>();
        static {
            firstLocItem.add("Катакомбы – сеть подземных комнат и коридоров, в которых раньше эльфы хранили свои изобретения и сокровища. Они находятся под Тиралином, а входы в них хорошо закрыты, потому что в них обитает нежить, появившаяся там совершенно внезапно пару лет назад и готовая убить каждого неосторожного воина. В глубине катакомб находятся сокровища, оставленные эльфами после появления нежити и артефакт, дающий магические силы – [артефакт]. Поэтому героям стоит узнать побольше о местной нежити и узнать расположение сокровищ у местного эльфа-мага по имени [доп имя]. Он подскажет о слабостях нежити и даст карту Катакомб. Возможно, героям даже удастся уговорить его пойти с ними.\n\n");
            firstLocItem.add("Король [гл имя], наслышанный о ваших подвигах, предложит вам достать для него ценный артефакт – [артефакт]. Он находится в заброшенной лаборатории в руинах старой части Тиралина в темном лесу за городом. Руины давно заросли и стали необитаемы, поэтому там поселились могущественные существа – виверны. В вашем приключении вам поможет генерал армии короля – [доп имя], который даст советы по охоте на виверн, поможет в выборе нужного снаряжения, и, возможно, даст пару заданий, чтобы вы заработали на снаряжение перед походом.\n\n");
            firstLocItem.add("В одной из таверн вам расскажут о загадочном артефакте под названием [артефакт], который даёт воинам магическую силу, и что его привезут влиятельному эльфу. Вы познакомитесь с гномом – разбойником, который предложит вам совершить набег на карету с этим артефактом и золотом и похитить его. Он утверждает, что ему не нужен этот артефакт, но можете ли вы ему доверять? Возможно, стоит узнать о нем побольше у местных.\n\n");
        }
        public static ArrayList<String> secondLocItem = new ArrayList<>();
        static {
            secondLocItem.add("Неподалеку от этого места расположились пещеры. В этих пещерах проживают злые гномов. Но находятся они там не просто так, они охраняют свою реликвию – [артефакт], который, по их мнению, имеет магические свойства, и позволяет им общаться со своими погибшими родственниками. Ну а вы можете получить за этот артефакт кругленькую сумму. Будьте предельно осторожны, ведь эти пещеры имеют массу запутанных ходов и разветвлений.\n\n");
            secondLocItem.add("Высоко в небе есть остров, в кучи облаков в облачный день, и располагается над северо-западными лесами. Сам остров имеет внушающий размер и вид. За горами и на их верхушках располагаются руины древнего королевства. Даже с высоты птичьего полета, виден еще не развалившийся замок. Он сохранил свой величественный вид, и еще не был разрушен временем. Вероятно, здесь когда-то жили люди или другие, похожие на них расы. Но куда они исчезли - оставалось загадкой. Не было ни одной зацепки по этому поводу. На островах множество неизведанных видов растений и животных. Не исключено что не все там будут дружелюбно настроены. Многие животные или другие существа, населяющие остров, могут оказаться агрессивными, а растения смертельные. Но пейзажи этого место заворожили бы любого: лес, горы, старые руины королевства и сохраненный пустынный замок, реки и водоем. Реки срываются с края острова, бросаясь вниз. Однако вода не проходит даже пол пути к земле. После четверти своего пути она начинает медленно распадаться. Возможно, это явление происходит из-за магии, что полностью окружает остров. Здесь всё пропитано магией. Вероятней всего, в самом центре острова находится древний и мощный артефакт-реликт под названием [артефакт], за счет которого держится вся жизнь на острове, от растений и животных, до самого поддержания острова в небе.\n\n");
            secondLocItem.add("На одной всеми забытой горе на окраине леса, после непонятного природного явления появился необыкновенный водопад с множеством пещер внутри. Это место прозвали водопадом Лунного света, так как именно в полнолуние его впервые увидели. Водопад излучает необъяснимую энергию, которая отгоняет мелких духов и нежить. Сама же вода кристально чистая, как слеза ангела. Если вы ищите уединения, то это место прекрасно подойдет, потому что поток воды вымыл землю и были образованны различные пещеры и потайные места, куда можно войти и исчезнуть на некоторое время, ибо вас будет очень тяжело найти. И так же известно, что в одном из этих потайных мест, величественный император приказал оставить драгоценное сокровище - артефакт под названием [артефакт]. По той причине, что находится он слишком глубоко, и пока никому не удавалось выйти из этого лабиринта. До вашего прихода... \n\n");
        }
        public static ArrayList<String> thirdLocItem = new ArrayList<>();
        static {
            thirdLocItem.add("\n\n");
            thirdLocItem.add("\n\n");
            thirdLocItem.add("\n\n");
        }


        public static ArrayList<String> firstLocAdditPers = new ArrayList<>();
        static {
            firstLocAdditPers.add("На главной площади, на доске объявлений висит заказ на Красного медведя – гиганта, шкура которого стоит очень дорого. Его логово находится недалеко от крепости Тиралина. Заказ от знатного человека – графа по имени [доп имя]. Стоит ли вам идти на столь опасное задание и сражаться с чудищем? Уточните подробности у заказчика.");
            firstLocAdditPers.add("В центре города есть небольшая мастерская гнома по имени [доп имя], одного из тех немногих гномов, кто занимается здесь ремеслом уже долгое время. [доп имя] может предложить вам уникальное оружие и доспехи, если вы достанете для него комплект инструментов из очень прочного сплава. Инструменты находятся на верхних уровнях загадочных катакомб под Тиралином. Готовы ли вы спуститься и узнать, кто там обитает?");
            firstLocAdditPers.add("Владельцу одного трактира по имени [доп имя] нужна помощь – телеги с едой для его трактира часто грабят почти у стен крепости Тиралина в тёмном лесу. Он предложит вам проследить за движением очередной телеги и охранять её от разбойников. Хотите ли вы стать охранником ценного груза? Узнайте поподробнее.");
        }
        public static ArrayList<String> secondLocAdditPers = new ArrayList<>();
        static {
            secondLocAdditPers.add("В глубине леса расположен магазин магических товаров. Снаружи дом маленький и невзрачный, держится на досках, и располагается прямо над впадиной. К дому ведут дощечки с верхних скал, между которыми он и располагается, или лифт, что спускается в саму впадину. Внутри дом нереальных размеров, в котором летают книги и ходят животные в этом магазине, когда что-то берешь, деньги лучше оставить на стойке если никого не видите, или вам не поздоровится. Раньше владельцем магазина был эльф – маг по имени [доп имя], но неделю назад он пропал без вести. Возможно, он находится в этой самой впадине. Вам стоит его поискать. Ещё в магазине есть множество тайных комнат. Так же под домом есть впадина. Сам дом защищен заклинаниями, амулетами и рунами. Чтобы попасть в здание нужно постучать три раза или иметь специальный ключ, который находится у эльфа-мага в единственном экземпляре. С украденной вещью никогда не получится покинуть здание. Через дверь не сможете, так как ручка для вора безумно горячая, а если откроет дверь кто-то другой, то появится барьер. То же с окном или крышей. Телепортироваться тоже не выйдет. Так, что либо покупайте, либо вымаливайте вещь.");
            secondLocAdditPers.add("Но будьте осторожны. В одной из пещер живет древнее существо – каменный тролль – гигант по имени [доп имя]. Вы можете попытаться его убить и забрать его вещи, которые он стянул с заблудщих к нему путников, но лучше попытаться наладить с ним контакт и дать еды. Если вы дадите ему много еды, то он отблагодарит вас, и скорее всего присоеденится к вам с вашим путешествием. Так же он может отгонять духов от вас, это может сыграть свою роль.");
            secondLocAdditPers.add("Так же, по имеющимся у вас данным, где-то в этом месте находится логово древнего дракона по имени [доп имя]. В давние времена он разорял и сжигал деревни, а награбленное приносил сюда, в свое логово. Сейчас он уже не занимается этим и осел в своем гнезде, но остался таким же суровым. Он убивает любого, кто пытается пробраться в его логово, так что будьте окуратны, если заходите нажится его добром и рискнуть пойти к дракону.");
        }
        public static ArrayList<String> thirdLocAdditPers = new ArrayList<>();
        static {
            thirdLocAdditPers.add("\n\n");
            thirdLocAdditPers.add("\n\n");
            thirdLocAdditPers.add("\n\n");
        }



        public static HashMap<String, ArrayList<String>> locsDesc = new HashMap<>();
        static {
            locsDesc.put(locs.get(0), firstLocDesc);
            locsDesc.put(locs.get(1), secondLocDesc);
            locsDesc.put(locs.get(2), thirdLocDesc);
        }

        public static HashMap<String, ArrayList<String>> mainPers = new HashMap<>();
        static {
            mainPers.put(locs.get(0), firstLocMainPers);
            mainPers.put(locs.get(1), secondLocMainPers);
            mainPers.put(locs.get(2), thirdLocMainPers);
        }

        public static HashMap<String, ArrayList<String>> item = new HashMap<>();
        static {
            item.put(locs.get(0), firstLocItem);
            item.put(locs.get(1), secondLocItem);
            item.put(locs.get(2), thirdLocItem);
        }
        public static HashMap<String, ArrayList<String>> additPers = new HashMap<>();
        static {
            additPers.put(locs.get(0), firstLocAdditPers);
            additPers.put(locs.get(1), secondLocAdditPers);
            additPers.put(locs.get(2), thirdLocAdditPers);
        }
    }

    public static class cyberpunk {
        public static ArrayList<String> locs = new ArrayList<>();
        static {
            locs.add("Центр Сан Сити");
            locs.add("Добрососедство");
            locs.add("Район Сан 13");
        }

        public static ArrayList<String> firstLocDesc = new ArrayList<>();
        static {
            firstLocDesc.add("\n\n");
            firstLocDesc.add("\n\n");
            firstLocDesc.add("\n\n");
        }
        public static ArrayList<String> secondLocDesc = new ArrayList<>();
        static {
            secondLocDesc.add("\n\n");
            secondLocDesc.add("\n\n");
            secondLocDesc.add("\n\n");
        }
        public static ArrayList<String> thirdLocDesc = new ArrayList<>();
        static {
            thirdLocDesc.add("\n\n");
            thirdLocDesc.add("\n\n");
            thirdLocDesc.add("\n\n");
        }


        public static ArrayList<String> firstLocMainPers = new ArrayList<>();
        static {
            firstLocMainPers.add("\n\n");
            firstLocMainPers.add("\n\n");
            firstLocMainPers.add("\n\n");
        }
        public static ArrayList<String> secondLocMainPers = new ArrayList<>();
        static {
            secondLocMainPers.add("\n\n");
            secondLocMainPers.add("\n\n");
            secondLocMainPers.add("\n\n");
        }
        public static ArrayList<String> thirdLocMainPers = new ArrayList<>();
        static {
            thirdLocMainPers.add("\n\n");
            thirdLocMainPers.add("\n\n");
            thirdLocMainPers.add("\n\n");

        }


        public static ArrayList<String> firstLocItem = new ArrayList<>();
        static {
            firstLocItem.add("\n\n");
            firstLocItem.add("\n\n");
            firstLocItem.add("\n\n");
        }
        public static ArrayList<String> secondLocItem = new ArrayList<>();
        static {
            secondLocItem.add("\n\n");
            secondLocItem.add("\n\n");
            secondLocItem.add("\n\n");
        }
        public static ArrayList<String> thirdLocItem = new ArrayList<>();
        static {
            thirdLocItem.add("\n\n");
            thirdLocItem.add("\n\n");
            thirdLocItem.add("\n\n");
        }


        public static ArrayList<String> firstLocAdditPers = new ArrayList<>();
        static {
            firstLocAdditPers.add("\n\n");
            firstLocAdditPers.add("\n\n");
            firstLocAdditPers.add("\n\n");
        }
        public static ArrayList<String> secondLocAdditPers = new ArrayList<>();
        static {
            secondLocAdditPers.add("\n\n");
            secondLocAdditPers.add("\n\n");
            secondLocAdditPers.add("\n\n");
        }
        public static ArrayList<String> thirdLocAdditPers = new ArrayList<>();
        static {
            thirdLocAdditPers.add("\n\n");
            thirdLocAdditPers.add("\n\n");
            thirdLocAdditPers.add("\n\n");
        }



        public static HashMap<String, ArrayList<String>> locsDesc = new HashMap<>();
        static {
            locsDesc.put(locs.get(0), firstLocDesc);
            locsDesc.put(locs.get(1), secondLocDesc);
            locsDesc.put(locs.get(2), thirdLocDesc);
        }

        public static HashMap<String, ArrayList<String>> mainPers = new HashMap<>();
        static {
            mainPers.put(locs.get(0), firstLocMainPers);
            mainPers.put(locs.get(1), secondLocMainPers);
            mainPers.put(locs.get(2), thirdLocMainPers);
        }

        public static HashMap<String, ArrayList<String>> item = new HashMap<>();
        static {
            item.put(locs.get(0), firstLocItem);
            item.put(locs.get(1), secondLocItem);
            item.put(locs.get(2), thirdLocItem);
        }
        public static HashMap<String, ArrayList<String>> additPers = new HashMap<>();
        static {
            additPers.put(locs.get(0), firstLocAdditPers);
            additPers.put(locs.get(1), secondLocAdditPers);
            additPers.put(locs.get(2), thirdLocAdditPers);
        }
    }

    public static class postapocalyptic {
        public static ArrayList<String> locs = new ArrayList<>();
        static {
            locs.add("база \"Восток\"");
            locs.add("Хим. завод им. Ленина");
            locs.add("ГНЦ ВБ \"Вектор\"");
        }

        public static ArrayList<String> firstLocDesc = new ArrayList<>();
        static {
            firstLocDesc.add("\n\n");
            firstLocDesc.add("\n\n");
            firstLocDesc.add("\n\n");
        }
        public static ArrayList<String> secondLocDesc = new ArrayList<>();
        static {
            secondLocDesc.add("\n\n");
            secondLocDesc.add("\n\n");
            secondLocDesc.add("\n\n");
        }
        public static ArrayList<String> thirdLocDesc = new ArrayList<>();
        static {
            thirdLocDesc.add("\n\n");
            thirdLocDesc.add("\n\n");
            thirdLocDesc.add("\n\n");
        }


        public static ArrayList<String> firstLocMainPers = new ArrayList<>();
        static {
            firstLocMainPers.add("\n\n");
            firstLocMainPers.add("\n\n");
            firstLocMainPers.add("\n\n");
        }
        public static ArrayList<String> secondLocMainPers = new ArrayList<>();
        static {
            secondLocMainPers.add("\n\n");
            secondLocMainPers.add("\n\n");
            secondLocMainPers.add("\n\n");
        }
        public static ArrayList<String> thirdLocMainPers = new ArrayList<>();
        static {
            thirdLocMainPers.add("\n\n");
            thirdLocMainPers.add("\n\n");
            thirdLocMainPers.add("\n\n");

        }


        public static ArrayList<String> firstLocItem = new ArrayList<>();
        static {
            firstLocItem.add("\n\n");
            firstLocItem.add("\n\n");
            firstLocItem.add("\n\n");
        }
        public static ArrayList<String> secondLocItem = new ArrayList<>();
        static {
            secondLocItem.add("\n\n");
            secondLocItem.add("\n\n");
            secondLocItem.add("\n\n");
        }
        public static ArrayList<String> thirdLocItem = new ArrayList<>();
        static {
            thirdLocItem.add("\n\n");
            thirdLocItem.add("\n\n");
            thirdLocItem.add("\n\n");
        }


        public static ArrayList<String> firstLocAdditPers = new ArrayList<>();
        static {
            firstLocAdditPers.add("\n\n");
            firstLocAdditPers.add("\n\n");
            firstLocAdditPers.add("\n\n");
        }
        public static ArrayList<String> secondLocAdditPers = new ArrayList<>();
        static {
            secondLocAdditPers.add("\n\n");
            secondLocAdditPers.add("\n\n");
            secondLocAdditPers.add("\n\n");
        }
        public static ArrayList<String> thirdLocAdditPers = new ArrayList<>();
        static {
            thirdLocAdditPers.add("\n\n");
            thirdLocAdditPers.add("\n\n");
            thirdLocAdditPers.add("\n\n");
        }



        public static HashMap<String, ArrayList<String>> locsDesc = new HashMap<>();
        static {
            locsDesc.put(locs.get(0), firstLocDesc);
            locsDesc.put(locs.get(1), secondLocDesc);
            locsDesc.put(locs.get(2), thirdLocDesc);
        }

        public static HashMap<String, ArrayList<String>> mainPers = new HashMap<>();
        static {
            mainPers.put(locs.get(0), firstLocMainPers);
            mainPers.put(locs.get(1), secondLocMainPers);
            mainPers.put(locs.get(2), thirdLocMainPers);
        }

        public static HashMap<String, ArrayList<String>> item = new HashMap<>();
        static {
            item.put(locs.get(0), firstLocItem);
            item.put(locs.get(1), secondLocItem);
            item.put(locs.get(2), thirdLocItem);
        }
        public static HashMap<String, ArrayList<String>> additPers = new HashMap<>();
        static {
            additPers.put(locs.get(0), firstLocAdditPers);
            additPers.put(locs.get(1), secondLocAdditPers);
            additPers.put(locs.get(2), thirdLocAdditPers);
        }
    }


    // public static ArrayList<String> cyberpunkLoc = new ArrayList<>();
    // static {
    //     cyberpunkLoc.add("Центр Сан Сити");
    //     cyberpunkLoc.add("Добрососедство");
    //     cyberpunkLoc.add("Район Сан 13");
    //     cyberpunkLoc.add("Пустоши Сан Сити");
    //     cyberpunkLoc.add("Городок Мегатонна");
    // }

    // public static ArrayList<String> steampunkLoc = new ArrayList<>();
    // static {
    //     steampunkLoc.add("Пустоши Невады");
    //     steampunkLoc.add("Пустыня Незер");
    //     steampunkLoc.add("Цитадель Невады");
    //     steampunkLoc.add("Завод \"Ядер-мир\"");
    //     steampunkLoc.add("Радар");
    // }

    // public static ArrayList<String> medievalLoc = new ArrayList<>();
    // static {
    //     medievalLoc.add("1");
    //     medievalLoc.add("2");
    //     medievalLoc.add("3");
    //     medievalLoc.add("4");
    //     medievalLoc.add("5");
    // }

    // public static ArrayList<String> postapocalypticLoc = new ArrayList<>();
    // static {
    //     postapocalypticLoc.add("1");
    //     postapocalypticLoc.add("2");
    //     postapocalypticLoc.add("3");
    //     postapocalypticLoc.add("4");
    //     postapocalypticLoc.add("5");
    // }

}