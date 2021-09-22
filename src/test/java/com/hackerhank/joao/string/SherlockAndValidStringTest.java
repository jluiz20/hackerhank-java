package com.hackerhank.joao.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SherlockAndValidStringTest {

    @Test
    public void shouldTest() {
        String result = SherlockAndValidString.isValid("aabbc");

        assertThat(result).isEqualTo("YES");
    }

    @Test
    public void shouldTest0() {
        String result = SherlockAndValidString.isValid("aabbcd");

        assertThat(result).isEqualTo("NO");
    }

    @Test
    public void shouldTest1() {
        String result = SherlockAndValidString.isValid("aabbccddeefghi");

        assertThat(result).isEqualTo("NO");
    }

    @Test
    public void shouldTest5() {
        String result = SherlockAndValidString.isValid("aaaaabc");

        assertThat(result).isEqualTo("NO");
    }

    @Test
    public void shouldTest3() {
        String result = SherlockAndValidString.isValid("aaaabbcc");

        assertThat(result).isEqualTo("NO");
    }

    @Test
    public void shouldTest18() {
        String result = SherlockAndValidString.isValid("abcdefghhgfedecba");

        assertThat(result).isEqualTo("YES");
    }

    @Test
    public void shouldTest17() {
        String result = SherlockAndValidString.isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd");

        assertThat(result).isEqualTo("YES");
    }
}