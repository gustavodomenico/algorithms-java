package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class GemStonesTest extends InOutTest {

    private Exercise exercise = new GemStones();

    private static final String INPUT0 = "3\n" +
            "abcdde\n" +
            "baccd\n" +
            "eeabg\n";

    private static final String OUTPUT0 = "2\n";

    private static final String INPUT1 = "100\n" +
            "molbapydxfbsbwqrrsmkebhxnphikeywkxoldawbojksdlfoqwrqjmkcylacxfdyclepprhbndmgocrdzcgr\n" +
            "nlxchmhckrzrykxjxjpckaavztepfbizoqh\n" +
            "kncchsgsraxnotgdgovptowzghodwqideluywpwmqbqbtanqs\n" +
            "umgeeuabkcntumyaumlkwxiujbwe\n" +
            "byzoraskmuugmyiuolhbipceizazlixgfkeuurppyczyt\n" +
            "uiipcvbppdhxqufsubjijxgshnjsaupbydmmxye\n" +
            "isspjpleqsbylekhnzhrskxzkidnbqfcfhtpvre\n" +
            "zlqigedzwiwwplspaqhjwpuexzumvjnrozvsbbulwpfnebuxdndvxquzzbafhdcuuspycvvkfdyyivgbewuyktlfuyjbwgppn\n" +
            "pjgwftnnncxprrbyipcmgelvcqcvstrfqufrdxkmwdfopdoksuujifccnulnsrxggfxuvipuybwebxgvwrntqxqtki\n" +
            "dakrjdsebiuugxpvxyhrtmwhvyqdhvgirhoozuccqv\n" +
            "dapqtivsemkgbkvvzqqfocnnlljjcpexhdotgvcghpkvxvgsbi\n" +
            "uoxhgujpbdx\n" +
            "fadkdvrmphfahixjqhnjfcnjrprcdcrxzehypqdcrululryixvxxcaujmcneokejgzlzhb\n" +
            "ysvdszdswunopr\n" +
            "mqzrjprgxdydstsecaccka\n" +
            "ohfnzlmpnzsgbhnwalpdisjdmdjnyutlhjvkmfxnqpppwmrmeecwobspkcgewwuznazeazgmgfkkz\n" +
            "ghgyohsdoctwssefhmx\n" +
            "tgdssqslwvpaeepbjijwdndblqytfcbrvtmbunwgis\n" +
            "hgwhxuoifqaejvqfylrtskttxecndsklahpcnslzdqlszrblkccpzzeviysjtwdbovkysdemfpdzysfwvwnxhdantaqje\n" +
            "xywoisgainvwkvwcapsqcxmuaq\n" +
            "jdixnjqrzyslmnfqfrghqaxhicdvrxgiwmnyiyrpommpsovaieqfrxbexxqmjqkhsobvwxgiciekqmkbpzhqogixiaylbnvnyt\n" +
            "denwpvpwcmlbehqsubxjuyqcveaittwuprrddtpwwuuajgejqytkzvxvfodtsqfh\n" +
            "eisznwbftcgugqipoaubovknajuxpukmmctiwoqejjx\n" +
            "yzgmnsryucaossnqqvvdllqxelpfirerrhjtufopgekstqfnhuezoqoelijuelxqlsyjdyvevlgwrauyjuykvyyh\n" +
            "xtawtlilznqeifuefpndryoooadegksbqqsstufxrgbompnuurp\n" +
            "tkdd\n" +
            "ozoiyyssyfiionfurrukyijyemqtvtaikuxkjkorc\n" +
            "afquxvbjbufhbfdaa\n" +
            "qpghetpapqkamlflwsfalrnmwveonsmmajfitpyeiuhefey\n" +
            "isqndazqlsflpwksppqlrydmxporfgwuihlzekmoyhqkvdnrhgarftdmxtahgkaoqgankdjtloxw\n" +
            "scegvdydyapvchvtqpbqexsszpvtaooklvzoyjackwsbualovxzpqszjwnaosvggwqdbeimckcphayglqqpiwldihhtwwrcxc\n" +
            "rclqhxyerjqnnldhoydjoqwdjbearqncoyhpfwxlwdqaexwkkqxvnssauidmjpzrverapnt\n" +
            "xdpdfvyrorbxyufiesqjocilsdqbmwuppsndpltoj\n" +
            "xmmwerdaejowqcoyppqxkulnixv\n" +
            "frfuyubib\n" +
            "gbmscibkxcwongfiuxjiodpunvgeacoxwsszcpfwfhaxjqpzrpggfotdmpuzdabdtwucqfiypnxlpvneghiklbhtfys\n" +
            "kjdvelptpvaplankxqhymzuqqzgyhsetuviklvapgvntumwcgmpndmhavdvcmuznibkwvzvhvhmuztvkuxfwpytaahcmnany\n" +
            "whbmaxzhpdjssrizf\n" +
            "bpgdjecunkvwbcqjpmjjjcznzxcjvjafhz\n" +
            "rffbbdlwbsnimcovwtohvzrikz\n" +
            "foqthutowjvmtnisaccicvwpdxbjtaiqghkwyatwfktnsrcddjqcschxkrenynxabtnbzcjjjecitj\n" +
            "cbzittqjnqqzvommsfqguhxaszs\n" +
            "fjkpoosusdmdzatxvtvphrsdqhyshayhsqbferiaghdlxhfztsutmoqqygdnoupmonqytfytgotdtaba\n" +
            "wpfqqvaqluzdhzkpmgswdvxjuzkutvpjsd\n" +
            "rmxdtfsnmhzxarihwhiohawlprlxqgveljodgnritxhkanclchxojcbdoezwbvczmctxamfmzossiuncjvvglcliybzdfhfjmxm\n" +
            "recvh\n" +
            "pzxyjcaskyuspggefjiiefygvsubqgdjddmimqyclhqoicaarnmomzluignzv\n" +
            "ixiginhofthorgfdqxhpwhcipzpyjarayvjrophsy\n" +
            "jrkmxoxkwgmtadcdidwdqltr\n" +
            "fjknnfplfeuqjvaomrpicsanzlqpiagxjqktjacigdyvrrdableynzdjbegpobnmncpel\n" +
            "rfxpdrrxwjgzlnxrlgmaxatuyvwtsigvmsujzkmeeyqxaeszqzmpxzifbjlyehkyxyxazyfs\n" +
            "srytftrlukcsjfauvjblwxady\n" +
            "rjinbceyetioovkl\n" +
            "xizeysjxwijafdajuapjiqqt\n" +
            "exeoazqiaflhdyqrcqzgolzvnlolctovpwxaszdwqbudevfxnrtgqkopnacoktgiyltol\n" +
            "xwduiwucgmejfhqyfzzwfghhawuobqiqsyiwuxcdmjjvubgmpzgskdconpgmlmzuul\n" +
            "zxktqbewcftuxlnjllcyuirbynvjvgrxgmtjmuxurdcbrplgcekxli\n" +
            "jqabapyvxqaxel\n" +
            "zxtnsilxitwfrldfrokyqxtwtqieuafritwbmelqwvsmv\n" +
            "orzlanudieytiyshqwepppjhfttplslvuionxwjkxvovkikbetzxnvxeasd\n" +
            "gdnbibylvehbacqoobmpqqegktdunqisdvnrdkpnovmgtxaslargjetvkvaxilriltbffwetecswbapatfmiajvszwcj\n" +
            "yykcigkuummaajzlshdjrrnhcylglduarmidtcevfefpzvvjapxsnkuvfxcrdikote\n" +
            "vaucjluizqufovibbscbxodvjnltdpueexcnlowvpdpdd\n" +
            "bkyjpzclqdllcjuteoovbkhfpnujmrieswhijgckmzupmi\n" +
            "cgwpfdcczmjoukwgzblwkzeialiaquytddsxykjzuvgcpxarybemgtjcypgplcysygtkobxoahmraanptnoczzqbexqci\n" +
            "veeqplrkdrelaqpkyigfvhptckbhkrfyzmmyklethcrjkpebvfadoohzbmahlrsbyaiemuophctsujnivpuunzixsqjvtjqkzowl\n" +
            "wfaupbyrknrclwxscdkbzucxkkkiaqmrrffxcvduxaeckgnenxpsliqspeirlhzavntrs\n" +
            "xagdvsafjqtalhjkggkholwwkqgpbbiywjkfywkwpsqheuiswwswtqlkttgiebbkqc\n" +
            "hxttlfkksbkeuyecyosbypwxkhntvoahdmtiufsq\n" +
            "qqfpddvvppasrtcfvosopkztmdkuqvvcoazmlmbmurfygtidqotuic\n" +
            "qjutcdcmcunpvog\n" +
            "evhamwhhsnykiljvavygsvnangcigryhlelpjgyjnjlandrzssdgvikvzdohqhlaurofifzvebpujphgvrbokdfebwyq\n" +
            "wfivvvfldimgsjsrcdtycgacdoglvnewgxhhiuwokridoekcuyacvnayfnoknrnkrselctythmydi\n" +
            "pphgchgrijktavtjnmrnupfeluhxjebnxlpoxyjbbgenwciwfhvxgvttobpeqjiukhrjyzcagssgq\n" +
            "tpcmdefgtuubqeaegyiuzvhmascziejzhhwkawpovvsaxdqpihfurautqxpgzidwobgorvggqqavzkyhltfazakcl\n" +
            "wyuwctuvrqmdbfwhuvtucedbnxvuyruvldbfdtvmqdeuvgocnpeainawbsx\n" +
            "slxdpbpfkrikdmorptsqdldevabbqkliuslgjyohegwnapbgtyfkkumactoahrzfwgrpqjjucyd\n" +
            "jldmqsoelsxywgvsfufgxg\n" +
            "ghbnucihsadzkpy\n" +
            "vrwjzikpcpjlrlmavowazfznyngrertieeiqgfzijetpjackkhaqojunyg\n" +
            "znmnauzmgtqevrxpcyjnoxtchokbmeicjarhvmmgjtf\n" +
            "fkbgjxsjugvpxhujlebqtgalzvwdjhozetvbhbcvrstpkdctqxketolumjgsbaowzs\n" +
            "nieqzi\n" +
            "yrtdurupovoyp\n" +
            "mtpomwlfpyrjbwmja\n" +
            "njqapnjfiypiwwjoqalixpabemathenjbbmtkekyvhxyapoysghfbxjvurzztbmaugpasnlxkpoghdojjkwjobzfwnpx\n" +
            "sqtxpsorwjmsmcsaxrtubnzzygoajghxpupqvuqzlcqijqgifxpck\n" +
            "nptxfbqooamgpuwytpzjpyxvodwtmloihqlkntmmxnbxyzjklboxihbpabwipgfgwg\n" +
            "jmsfcdhhnjhtwpydrlfebklt\n" +
            "jsocgwdahcrbyoyeqmhvaflecipghegqipbfxxzwvzeuzvdzmdtqwuhqlivkzvzogwzwonttzzsbdpj\n" +
            "ftsafsaqflaizwxqwicshndvuabcdkqlcywmhgsgktsyzqvndzeuyzknugmiaahemqgdg\n" +
            "worxpvczg\n" +
            "iimsmyieeexewpycleybgjyzazfjorjjqhrqpnvxliugznubtafyzepnjgjvasmszqzgnpy\n" +
            "mthyflhsbtjsglljkzrlr\n" +
            "nsxuyycyhfecp\n" +
            "tahohwbsaxheobchdaqagcalwztpvxgillqyeejjpgkhcpwmiygykkognriupmhorkmrjwkuhhazfalasynnxxelokex\n" +
            "ezstlufuhdzgwt\n" +
            "bcgiuolagphwputkbskhrbteqzrwyueoziifuuwomuaysppfqrixerdsozsvxkgloqv\n" +
            "byhfdbczevofwifgjcmwqyuegmiaojweegluwuhnrdpohtmrnrbbnyuvasvupfxzlyuhgmyjiartvvsuib\n" +
            "zxyfrjrpcjusrhjwmpkrongut\n";

    private static final String OUTPUT1 = "0\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT1, OUTPUT1, exercise);
    }
}