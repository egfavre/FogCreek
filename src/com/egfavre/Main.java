package com.egfavre;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Sort the characters in the following string:

        String alphabet = "abcdefghijklmnopqrstuvwxyz_";

        char [] alphabetArray = alphabet.toCharArray();

        //by the number of times the character appears in the following text (descending):

        String text =
                "uwlcnfcejefjudkmylhmmpjfkmhveozojepfvgboboxknkfdoghkvzxrkamhaghahpnn zh_figzhelkapd_dnxsiurbjgq_bcctqgigfksdrzgtxvihiqvfvinuqfzgohvilwyxp uqjolleuecpxcbisaptnoxbglpkhsvvwdgaminprfrha_uemwdepnngtxgkqx_flerkb nnzazcvnh_sealovrpuafumrmaizidjedvovhtbadjelfrbknpioqiindxqiozzpdrv_ bwooblumjc_oqtcgrfmxkwkczhhqiwuqzoznqgfmbdxrxigvkebypbsybanuccpsezgv _dvteybbrbrbldbpiyhgzkptloxfktrzkjmdhppucsaohfnehdnlnhexwj_yhulslwpd reogjsffy_fkqcdkobywhqxpjvv_sqbscknxrew_ivgvpolmqfkyxoxzuyqctriyxcnc wvvqhdupkagguee_zfbcrexbtkcsbnjcfzqoq_wrdktpsclzrmeybxpzrylfdydknd_z bjjqcnubpjbfaaecuxbeprjjjfcybvcghfbcvnjicpliwzkqvwo_hloynyjrmiqvubsy obetklnsgovesswqatrcrirsywdvbpwnhtjaug_nglxamsybkop_gnkdvgzp_cmyxclr tjtoohniuszzbnakknd_ahe_enbouxvpueotcjebex_vpqbwyjgczobcirmgfvwnlrxa ryoltdlozwdgcp__iwu_vkod_kzkmeklloeixrxymlvyvtlfyydwtzxugrhxwqgmmsvt shrublypevlpglldlumsbscjuv_cbtfjpenrervyxtbrxaaqsqs__boiiubqmgwtvzxl nxxyskbwquztepk_uggukayehrifcrdpcnrfhmlucqzbsvoojsfexvbzsrccyqjuufbi ae_siovpbhhqzkcemm_wtzio_d_emtkxpkpqftqjrhiiuvyijtwrmj_r_nlsaqemp_yp h_murlmwwibzxnerld_fracudoxwqsmjkdvbfbnmkvktrkyyoct_woymzxswtd_dvs_j oviugjjvswlltkforlv_xdokzbqkzrojvevuuzkpcvvaarca_oeryyuasilqpwrzkyrs bskjnywidkcefjdekawqutrihusqtq_bjaaysidwvpmhozxcsacpehceplbihgnuaucv atj_prb_fflzfyyrndrxq__ptxkcbhhslnuuwljwxbxzbujntztebr_knnffhl_cvxow dtpxldvsonhnfxxnmwopu_tgosofhhjhmxkdnvorwlsxy_cleasbnonadrgxf_bzipud fonthlclvnhumrbjkdryoawoz__ttftltixhdhd_qoteqmyehlulpffaqmughpxxsyee vncin_ymjsnndirfg_jjcltmgphlpudrjviaixlxnpwvr_bqygvuhoskhtv_pqnyzmjy mrpnphebxqfpkfhzirotxayvclcr_zcrtsakfusyyujzdjgizngmonogwknjcndlpvkt gntgajmzwcnkhggmhzijyrpbkpdcribyteyqchlldzeelebqjplphcdgpaaatdelz_kh xpxqclexvlcjiyssgsgmsddclgmsae_eubvmscpjwascwegqdxvvh_zuteauydayapfa mxilyugubce_kibquetsvlmguecrm_uojvkjammyevgxwfcfq_fjnauajadhsjvtsduz pmqecxfuqaaq__qhtvl_uurqaquuygypqxnhrnhhiwrufntlunfqwaydimaahiihvcay cinidodqzmrnxnnxdsquwc_u_zrrkscjv_jwsp_xfkupx_rcbzovpsbwyiumeaanyiaq romomqldfprejqnytjftdcklykzsdupl_makofxndacjbbftywdxmvmfv_wogpggfeiv pfiqqlzcweelzclxkgqlvysuignftxqooofgvnopvtjy_udsf_wx_wloyznfixdeyxbv qljuncfmtvjhrrrpcxowggllwcmzlp_bgwpepdntxzjbqprgdtpdbtofhwknqdarbqvr yfaiq_lneqwlwpjpfxbmttidphupuhwghgafybhtulwkgpoavwbtixuvqroknoas_pvu fqfanwdvzraqpxudodpifa_s_xiaef_abeawgaamorlogpmmavrwbt_bzthsnzaxzitb yuohtqswnqekujrojerffenhkna_nyioesdgaeofpuoyoybuweuswzaraanyzkaxuncu mlsnzoavkmjoejygohgtrqtdouiubigjhrutk";

        char[] textArray = text.toCharArray();

        HashMap<String, Integer> count = new HashMap<>();
        HashMap<Integer, String> letterMap = new HashMap<>();

        for (Character alpha: alphabetArray) {
            ArrayList alphaList = new ArrayList();
            for (Character letter : textArray) {
                if (alpha.equals(letter)){
                    alphaList.add(letter);
                }
             count.put(alpha.toString(), alphaList.size());
                letterMap.put(alphaList.size(), alpha.toString());
            }
        }



        SortedSet<Integer> frequency = new TreeSet<Integer>(count.values());

        int most = frequency.last();
        int least = frequency.first();
        int n = most;
        int index = 0;
        ArrayList<String> word = new ArrayList<>();

       while (n >= least && n <= most){
           if (count.containsValue(n)){
                String nextLetter = letterMap.get(n);
               word.add(index, nextLetter);
               n--;
               index++;
            }
        }

        System.out.println(word.toString());




    }
}
