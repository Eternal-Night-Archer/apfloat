/*
 * MIT License
 *
 * Copyright (c) 2002-2022 Mikko Tommila
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.apfloat.internal;

/**
 * Constants related to different radixes for the <code>double</code> data type.
 *
 * @version 1.0
 * @author Mikko Tommila
 */

public interface DoubleRadixConstants
{
    /**
     * Bases for radixes 2, ..., 36. The base is the radix to the maximum power
     * so that the base is less than all moduli used.
     */

    public static final double BASE[] = { (double) -1L, (double) -1L, (double) 1125899906842624L, (double) 617673396283947L, (double) 1125899906842624L, (double) 476837158203125L, (double) 609359740010496L, (double) 1628413597910449L, (double) 281474976710656L, (double) 205891132094649L, (double) 1000000000000000L, (double) 379749833583241L, (double) 1283918464548864L, (double) 302875106592253L, (double) 793714773254144L, (double) 129746337890625L, (double) 281474976710656L, (double) 582622237229761L, (double) 1156831381426176L, (double) 116490258898219L, (double) 204800000000000L, (double) 350277500542221L, (double) 584318301411328L, (double) 952809757913927L, (double) 1521681143169024L, (double) 95367431640625L, (double) 141167095653376L, (double) 205891132094649L, (double) 296196766695424L, (double) 420707233300201L, (double) 590490000000000L, (double) 819628286980801L, (double) 1125899906842624L, (double) 1531578985264449L, (double) 60716992766464L, (double) 78815638671875L, (double) 101559956668416L };

    /**
     * The power of the radix in each base.
     */

    public static final int BASE_DIGITS[] = { -1, -1, 50, 31, 25, 21, 19, 18, 16, 15, 15, 14, 14, 13, 13, 12, 12, 12, 12, 11, 11, 11, 11, 11, 11, 10, 10, 10, 10, 10, 10, 10, 10, 10, 9, 9, 9 };

    /**
     * The minimum number in each radix to have the specified amount of digits.
     */

    public static final double MINIMUM_FOR_DIGITS[][] = { null, null, { (double) 1L, (double) 2L, (double) 4L, (double) 8L, (double) 16L, (double) 32L, (double) 64L, (double) 128L, (double) 256L, (double) 512L, (double) 1024L, (double) 2048L, (double) 4096L, (double) 8192L, (double) 16384L, (double) 32768L, (double) 65536L, (double) 131072L, (double) 262144L, (double) 524288L, (double) 1048576L, (double) 2097152L, (double) 4194304L, (double) 8388608L, (double) 16777216L, (double) 33554432L, (double) 67108864L, (double) 134217728L, (double) 268435456L, (double) 536870912L, (double) 1073741824L, (double) 2147483648L, (double) 4294967296L, (double) 8589934592L, (double) 17179869184L, (double) 34359738368L, (double) 68719476736L, (double) 137438953472L, (double) 274877906944L, (double) 549755813888L, (double) 1099511627776L, (double) 2199023255552L, (double) 4398046511104L, (double) 8796093022208L, (double) 17592186044416L, (double) 35184372088832L, (double) 70368744177664L, (double) 140737488355328L, (double) 281474976710656L, (double) 562949953421312L }, { (double) 1L, (double) 3L, (double) 9L, (double) 27L, (double) 81L, (double) 243L, (double) 729L, (double) 2187L, (double) 6561L, (double) 19683L, (double) 59049L, (double) 177147L, (double) 531441L, (double) 1594323L, (double) 4782969L, (double) 14348907L, (double) 43046721L, (double) 129140163L, (double) 387420489L, (double) 1162261467L, (double) 3486784401L, (double) 10460353203L, (double) 31381059609L, (double) 94143178827L, (double) 282429536481L, (double) 847288609443L, (double) 2541865828329L, (double) 7625597484987L, (double) 22876792454961L, (double) 68630377364883L, (double) 205891132094649L }, { (double) 1L, (double) 4L, (double) 16L, (double) 64L, (double) 256L, (double) 1024L, (double) 4096L, (double) 16384L, (double) 65536L, (double) 262144L, (double) 1048576L, (double) 4194304L, (double) 16777216L, (double) 67108864L, (double) 268435456L, (double) 1073741824L, (double) 4294967296L, (double) 17179869184L, (double) 68719476736L, (double) 274877906944L, (double) 1099511627776L, (double) 4398046511104L, (double) 17592186044416L, (double) 70368744177664L, (double) 281474976710656L }, { (double) 1L, (double) 5L, (double) 25L, (double) 125L, (double) 625L, (double) 3125L, (double) 15625L, (double) 78125L, (double) 390625L, (double) 1953125L, (double) 9765625L, (double) 48828125L, (double) 244140625L, (double) 1220703125L, (double) 6103515625L, (double) 30517578125L, (double) 152587890625L, (double) 762939453125L, (double) 3814697265625L, (double) 19073486328125L, (double) 95367431640625L }, { (double) 1L, (double) 6L, (double) 36L, (double) 216L, (double) 1296L, (double) 7776L, (double) 46656L, (double) 279936L, (double) 1679616L, (double) 10077696L, (double) 60466176L, (double) 362797056L, (double) 2176782336L, (double) 13060694016L, (double) 78364164096L, (double) 470184984576L, (double) 2821109907456L, (double) 16926659444736L, (double) 101559956668416L }, { (double) 1L, (double) 7L, (double) 49L, (double) 343L, (double) 2401L, (double) 16807L, (double) 117649L, (double) 823543L, (double) 5764801L, (double) 40353607L, (double) 282475249L, (double) 1977326743L, (double) 13841287201L, (double) 96889010407L, (double) 678223072849L, (double) 4747561509943L, (double) 33232930569601L, (double) 232630513987207L }, { (double) 1L, (double) 8L, (double) 64L, (double) 512L, (double) 4096L, (double) 32768L, (double) 262144L, (double) 2097152L, (double) 16777216L, (double) 134217728L, (double) 1073741824L, (double) 8589934592L, (double) 68719476736L, (double) 549755813888L, (double) 4398046511104L, (double) 35184372088832L }, { (double) 1L, (double) 9L, (double) 81L, (double) 729L, (double) 6561L, (double) 59049L, (double) 531441L, (double) 4782969L, (double) 43046721L, (double) 387420489L, (double) 3486784401L, (double) 31381059609L, (double) 282429536481L, (double) 2541865828329L, (double) 22876792454961L }, { (double) 1L, (double) 10L, (double) 100L, (double) 1000L, (double) 10000L, (double) 100000L, (double) 1000000L, (double) 10000000L, (double) 100000000L, (double) 1000000000L, (double) 10000000000L, (double) 100000000000L, (double) 1000000000000L, (double) 10000000000000L, (double) 100000000000000L }, { (double) 1L, (double) 11L, (double) 121L, (double) 1331L, (double) 14641L, (double) 161051L, (double) 1771561L, (double) 19487171L, (double) 214358881L, (double) 2357947691L, (double) 25937424601L, (double) 285311670611L, (double) 3138428376721L, (double) 34522712143931L }, { (double) 1L, (double) 12L, (double) 144L, (double) 1728L, (double) 20736L, (double) 248832L, (double) 2985984L, (double) 35831808L, (double) 429981696L, (double) 5159780352L, (double) 61917364224L, (double) 743008370688L, (double) 8916100448256L, (double) 106993205379072L }, { (double) 1L, (double) 13L, (double) 169L, (double) 2197L, (double) 28561L, (double) 371293L, (double) 4826809L, (double) 62748517L, (double) 815730721L, (double) 10604499373L, (double) 137858491849L, (double) 1792160394037L, (double) 23298085122481L }, { (double) 1L, (double) 14L, (double) 196L, (double) 2744L, (double) 38416L, (double) 537824L, (double) 7529536L, (double) 105413504L, (double) 1475789056L, (double) 20661046784L, (double) 289254654976L, (double) 4049565169664L, (double) 56693912375296L }, { (double) 1L, (double) 15L, (double) 225L, (double) 3375L, (double) 50625L, (double) 759375L, (double) 11390625L, (double) 170859375L, (double) 2562890625L, (double) 38443359375L, (double) 576650390625L, (double) 8649755859375L }, { (double) 1L, (double) 16L, (double) 256L, (double) 4096L, (double) 65536L, (double) 1048576L, (double) 16777216L, (double) 268435456L, (double) 4294967296L, (double) 68719476736L, (double) 1099511627776L, (double) 17592186044416L }, { (double) 1L, (double) 17L, (double) 289L, (double) 4913L, (double) 83521L, (double) 1419857L, (double) 24137569L, (double) 410338673L, (double) 6975757441L, (double) 118587876497L, (double) 2015993900449L, (double) 34271896307633L }, { (double) 1L, (double) 18L, (double) 324L, (double) 5832L, (double) 104976L, (double) 1889568L, (double) 34012224L, (double) 612220032L, (double) 11019960576L, (double) 198359290368L, (double) 3570467226624L, (double) 64268410079232L }, { (double) 1L, (double) 19L, (double) 361L, (double) 6859L, (double) 130321L, (double) 2476099L, (double) 47045881L, (double) 893871739L, (double) 16983563041L, (double) 322687697779L, (double) 6131066257801L }, { (double) 1L, (double) 20L, (double) 400L, (double) 8000L, (double) 160000L, (double) 3200000L, (double) 64000000L, (double) 1280000000L, (double) 25600000000L, (double) 512000000000L, (double) 10240000000000L }, { (double) 1L, (double) 21L, (double) 441L, (double) 9261L, (double) 194481L, (double) 4084101L, (double) 85766121L, (double) 1801088541L, (double) 37822859361L, (double) 794280046581L, (double) 16679880978201L }, { (double) 1L, (double) 22L, (double) 484L, (double) 10648L, (double) 234256L, (double) 5153632L, (double) 113379904L, (double) 2494357888L, (double) 54875873536L, (double) 1207269217792L, (double) 26559922791424L }, { (double) 1L, (double) 23L, (double) 529L, (double) 12167L, (double) 279841L, (double) 6436343L, (double) 148035889L, (double) 3404825447L, (double) 78310985281L, (double) 1801152661463L, (double) 41426511213649L }, { (double) 1L, (double) 24L, (double) 576L, (double) 13824L, (double) 331776L, (double) 7962624L, (double) 191102976L, (double) 4586471424L, (double) 110075314176L, (double) 2641807540224L, (double) 63403380965376L }, { (double) 1L, (double) 25L, (double) 625L, (double) 15625L, (double) 390625L, (double) 9765625L, (double) 244140625L, (double) 6103515625L, (double) 152587890625L, (double) 3814697265625L }, { (double) 1L, (double) 26L, (double) 676L, (double) 17576L, (double) 456976L, (double) 11881376L, (double) 308915776L, (double) 8031810176L, (double) 208827064576L, (double) 5429503678976L }, { (double) 1L, (double) 27L, (double) 729L, (double) 19683L, (double) 531441L, (double) 14348907L, (double) 387420489L, (double) 10460353203L, (double) 282429536481L, (double) 7625597484987L }, { (double) 1L, (double) 28L, (double) 784L, (double) 21952L, (double) 614656L, (double) 17210368L, (double) 481890304L, (double) 13492928512L, (double) 377801998336L, (double) 10578455953408L }, { (double) 1L, (double) 29L, (double) 841L, (double) 24389L, (double) 707281L, (double) 20511149L, (double) 594823321L, (double) 17249876309L, (double) 500246412961L, (double) 14507145975869L }, { (double) 1L, (double) 30L, (double) 900L, (double) 27000L, (double) 810000L, (double) 24300000L, (double) 729000000L, (double) 21870000000L, (double) 656100000000L, (double) 19683000000000L }, { (double) 1L, (double) 31L, (double) 961L, (double) 29791L, (double) 923521L, (double) 28629151L, (double) 887503681L, (double) 27512614111L, (double) 852891037441L, (double) 26439622160671L }, { (double) 1L, (double) 32L, (double) 1024L, (double) 32768L, (double) 1048576L, (double) 33554432L, (double) 1073741824L, (double) 34359738368L, (double) 1099511627776L, (double) 35184372088832L }, { (double) 1L, (double) 33L, (double) 1089L, (double) 35937L, (double) 1185921L, (double) 39135393L, (double) 1291467969L, (double) 42618442977L, (double) 1406408618241L, (double) 46411484401953L }, { (double) 1L, (double) 34L, (double) 1156L, (double) 39304L, (double) 1336336L, (double) 45435424L, (double) 1544804416L, (double) 52523350144L, (double) 1785793904896L }, { (double) 1L, (double) 35L, (double) 1225L, (double) 42875L, (double) 1500625L, (double) 52521875L, (double) 1838265625L, (double) 64339296875L, (double) 2251875390625L }, { (double) 1L, (double) 36L, (double) 1296L, (double) 46656L, (double) 1679616L, (double) 60466176L, (double) 2176782336L, (double) 78364164096L, (double) 2821109907456L } };

    /**
     * Maximum allowed exponent for each radix.
     */

    public static final long MAX_EXPONENT[] = { -1L, -1L, 184467440737095510L, 297528130221121794L, 368934881474191026L, 439208192231179794L, 485440633518672404L, 512409557603043094L, 576460752303423481L, 614891469123651714L, 614891469123651714L, 658812288346769694L, 658812288346769694L, 709490156681136594L, 709490156681136594L, 768614336404564644L, 768614336404564644L, 768614336404564644L, 768614336404564644L, 838488366986797794L, 838488366986797794L, 838488366986797794L, 838488366986797794L, 838488366986797794L, 838488366986797794L, 922337203685477574L, 922337203685477574L, 922337203685477574L, 922337203685477574L, 922337203685477574L, 922337203685477574L, 922337203685477574L, 922337203685477574L, 922337203685477574L, 1024819115206086194L, 1024819115206086194L, 1024819115206086194L };
}
