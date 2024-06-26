/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2012 Unicode, Inc. All rights reserved. Distributed under
 * the Terms of Use in http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of the Unicode data files and any associated documentation (the "Data
 * Files") or Unicode software and any associated documentation (the
 * "Software") to deal in the Data Files or Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, and/or sell copies of the Data Files or Software, and
 * to permit persons to whom the Data Files or Software are furnished to do so,
 * provided that (a) the above copyright notice(s) and this permission notice
 * appear with all copies of the Data Files or Software, (b) both the above
 * copyright notice(s) and this permission notice appear in associated
 * documentation, and (c) there is clear notice in each modified Data File or
 * in the Software as well as in the documentation associated with the Data
 * File(s) or Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF
 * THIRD PARTY RIGHTS. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS
 * INCLUDED IN THIS NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR
 * CONSEQUENTIAL DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder shall not
 * be used in advertising or otherwise to promote the sale, use or other
 * dealings in these Data Files or Software without prior written authorization
 * of the copyright holder.
 */

package sun.text.resources.cldr.lv;

import java.util.ListResourceBundle;

public class FormatData_lv extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "janv\u0101ris",
                    "febru\u0101ris",
                    "marts",
                    "apr\u012blis",
                    "maijs",
                    "j\u016bnijs",
                    "j\u016blijs",
                    "augusts",
                    "septembris",
                    "oktobris",
                    "novembris",
                    "decembris",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "janv.",
                    "febr.",
                    "marts",
                    "apr.",
                    "maijs",
                    "j\u016bn.",
                    "j\u016bl.",
                    "aug.",
                    "sept.",
                    "okt.",
                    "nov.",
                    "dec.",
                    "",
                }
            },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "janv.",
                    "febr.",
                    "marts",
                    "apr.",
                    "maijs",
                    "j\u016bn.",
                    "j\u016bl.",
                    "aug.",
                    "sept.",
                    "okt.",
                    "nov.",
                    "dec.",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "J",
                    "F",
                    "M",
                    "A",
                    "M",
                    "J",
                    "J",
                    "A",
                    "S",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "sv\u0113tdiena",
                    "pirmdiena",
                    "otrdiena",
                    "tre\u0161diena",
                    "ceturtdiena",
                    "piektdiena",
                    "sestdiena",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Sv",
                    "Pr",
                    "Ot",
                    "Tr",
                    "Ce",
                    "Pk",
                    "Se",
                }
            },
            { "DayNarrows",
                new String[] {
                    "S",
                    "P",
                    "O",
                    "T",
                    "C",
                    "P",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1. ceturksnis",
                    "2. ceturksnis",
                    "3. ceturksnis",
                    "4. ceturksnis",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "C1",
                    "C2",
                    "C3",
                    "C4",
                }
            },
            { "QuarterNarrows",
                new String[] {
                    "1.",
                    "2.",
                    "3.",
                    "4.",
                }
            },
            { "standalone.QuarterNarrows",
                new String[] {
                    "1.",
                    "2.",
                    "3.",
                    "4.",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "priek\u0161pusdien\u0101",
                    "p\u0113cpusdien\u0101",
                }
            },
            { "long.Eras",
                new String[] {
                    "pirms m\u016bsu \u0113ras",
                    "m\u016bsu \u0113r\u0101",
                }
            },
            { "Eras",
                new String[] {
                    "p.m.\u0113.",
                    "m.\u0113.",
                }
            },
            { "field.era", "\u0113ra" },
            { "field.year", "Gads" },
            { "field.month", "M\u0113nesis" },
            { "field.week", "Ned\u0113\u013ca" },
            { "field.weekday", "Ned\u0113\u013cas diena" },
            { "field.dayperiod", "Dayperiod" },
            { "field.hour", "Stundas" },
            { "field.minute", "Min\u016btes" },
            { "field.second", "Sekundes" },
            { "field.zone", "Josla" },
            { "TimePatterns",
                new String[] {
                    "HH:mm:ss zzzz",
                    "HH:mm:ss z",
                    "HH:mm:ss",
                    "HH:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, y. 'gada' d. MMMM",
                    "y. 'gada' d. MMMM",
                    "y. 'gada' d. MMM",
                    "dd.MM.yy",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "muharams",
                    "safars",
                    "1. rab\u012b",
                    "2. rab\u012b",
                    "1. d\u017eum\u0101d\u0101",
                    "2. d\u017eum\u0101d\u0101",
                    "rad\u017eabs",
                    "\u0161abans",
                    "ramad\u0101ns",
                    "\u0161auvals",
                    "du al-kid\u0101",
                    "du al-hid\u017e\u0101",
                    "",
                }
            },
            { "calendarname.islamic-civil", "isl\u0101ma pilso\u0146u kalend\u0101rs" },
            { "calendarname.islamicc", "isl\u0101ma pilso\u0146u kalend\u0101rs" },
            { "calendarname.buddhist", "budistu kalend\u0101rs" },
            { "calendarname.islamic", "isl\u0101ma kalend\u0101rs" },
            { "calendarname.gregorian", "Gregora kalend\u0101rs" },
            { "calendarname.gregory", "Gregora kalend\u0101rs" },
            { "calendarname.roc", "\u0136\u012bnas Republikas kalend\u0101rs" },
            { "calendarname.japanese", "jap\u0101\u0146u kalend\u0101rs" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u2212",
                    "E",
                    "\u2030",
                    "\u221e",
                    "nav\u00a0skaitlis",
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
