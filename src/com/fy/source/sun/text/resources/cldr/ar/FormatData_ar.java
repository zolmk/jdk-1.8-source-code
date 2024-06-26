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

package sun.text.resources.cldr.ar;

import java.util.ListResourceBundle;

public class FormatData_ar extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u064a\u0646\u0627\u064a\u0631",
                    "\u0641\u0628\u0631\u0627\u064a\u0631",
                    "\u0645\u0627\u0631\u0633",
                    "\u0623\u0628\u0631\u064a\u0644",
                    "\u0645\u0627\u064a\u0648",
                    "\u064a\u0648\u0646\u064a\u0648",
                    "\u064a\u0648\u0644\u064a\u0648",
                    "\u0623\u063a\u0633\u0637\u0633",
                    "\u0633\u0628\u062a\u0645\u0628\u0631",
                    "\u0623\u0643\u062a\u0648\u0628\u0631",
                    "\u0646\u0648\u0641\u0645\u0628\u0631",
                    "\u062f\u064a\u0633\u0645\u0628\u0631",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u064a",
                    "\u0641",
                    "\u0645",
                    "\u0623",
                    "\u0648",
                    "\u0646",
                    "\u0644",
                    "\u063a",
                    "\u0633",
                    "\u0643",
                    "\u0628",
                    "\u062f",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u0627\u0644\u0623\u062d\u062f",
                    "\u0627\u0644\u0627\u062b\u0646\u064a\u0646",
                    "\u0627\u0644\u062b\u0644\u0627\u062b\u0627\u0621",
                    "\u0627\u0644\u0623\u0631\u0628\u0639\u0627\u0621",
                    "\u0627\u0644\u062e\u0645\u064a\u0633",
                    "\u0627\u0644\u062c\u0645\u0639\u0629",
                    "\u0627\u0644\u0633\u0628\u062a",
                }
            },
            { "standalone.DayNames",
                new String[] {
                    "",
                    "\u0627\u0644\u0627\u062b\u0646\u064a\u0646",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u0627\u0644\u0623\u062d\u062f",
                    "\u0627\u0644\u0627\u062b\u0646\u064a\u0646",
                    "\u0627\u0644\u062b\u0644\u0627\u062b\u0627\u0621",
                    "\u0627\u0644\u0623\u0631\u0628\u0639\u0627\u0621",
                    "\u0627\u0644\u062e\u0645\u064a\u0633",
                    "\u0627\u0644\u062c\u0645\u0639\u0629",
                    "\u0627\u0644\u0633\u0628\u062a",
                }
            },
            { "standalone.DayAbbreviations",
                new String[] {
                    "\u0627\u0644\u0623\u062d\u062f",
                    "\u0627\u0644\u0627\u062b\u0646\u064a\u0646",
                    "\u0627\u0644\u062b\u0644\u0627\u062b\u0627\u0621",
                    "\u0627\u0644\u0623\u0631\u0628\u0639\u0627\u0621",
                    "\u0627\u0644\u062e\u0645\u064a\u0633",
                    "\u0627\u0644\u062c\u0645\u0639\u0629",
                    "\u0627\u0644\u0633\u0628\u062a",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u062d",
                    "\u0646",
                    "\u062b",
                    "\u0631",
                    "\u062e",
                    "\u062c",
                    "\u0633",
                }
            },
            { "QuarterNames",
                new String[] {
                    "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u0623\u0648\u0644",
                    "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u062b\u0627\u0646\u064a",
                    "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u062b\u0627\u0644\u062b",
                    "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u0631\u0627\u0628\u0639",
                }
            },
            { "QuarterNarrows",
                new String[] {
                    "\u0661",
                    "\u0662",
                    "\u0663",
                    "\u0664",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "\u0635",
                    "\u0645",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u0642\u0628\u0644 \u0627\u0644\u0645\u064a\u0644\u0627\u062f",
                    "\u0645\u064a\u0644\u0627\u062f\u064a",
                }
            },
            { "Eras",
                new String[] {
                    "\u0642.\u0645",
                    "\u0645",
                }
            },
            { "field.era", "\u0627\u0644\u0639\u0635\u0631" },
            { "field.year", "\u0627\u0644\u0633\u0646\u0629" },
            { "field.month", "\u0627\u0644\u0634\u0647\u0631" },
            { "field.week", "\u0627\u0644\u0623\u0633\u0628\u0648\u0639" },
            { "field.weekday", "\u0627\u0644\u064a\u0648\u0645" },
            { "field.dayperiod", "\u0635/\u0645" },
            { "field.hour", "\u0627\u0644\u0633\u0627\u0639\u0627\u062a" },
            { "field.minute", "\u0627\u0644\u062f\u0642\u0627\u0626\u0642" },
            { "field.second", "\u0627\u0644\u062b\u0648\u0627\u0646\u064a" },
            { "field.zone", "\u0627\u0644\u062a\u0648\u0642\u064a\u062a" },
            { "TimePatterns",
                new String[] {
                    "zzzz h:mm:ss a",
                    "z h:mm:ss a",
                    "h:mm:ss a",
                    "h:mm a",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y",
                    "d MMMM\u060c y",
                    "dd\u200f/MM\u200f/yyyy",
                    "d\u200f/M\u200f/yyyy",
                }
            },
            { "buddhist.Eras",
                new String[] {
                    "BC",
                    "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0628\u0648\u0630\u064a",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y G",
                    "d MMMM\u060c y G",
                    "dd\u200f/MM\u200f/y G",
                    "d\u200f/M\u200f/y G",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y GGGG",
                    "d MMMM\u060c y GGGG",
                    "dd\u200f/MM\u200f/y GGGG",
                    "d\u200f/M\u200f/y GGGG",
                }
            },
            { "japanese.Eras",
                new String[] {
                    "\u0645",
                    "\u0645\u064a\u062c\u064a",
                    "\u062a\u064a\u0634\u0648",
                    "\u0634\u0648\u0648\u0627",
                    "\u0647\u064a\u0633\u064a",
                    "",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y G",
                    "d MMMM\u060c y G",
                    "dd\u200f/MM\u200f/y G",
                    "d\u200f/M\u200f/y G",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y GGGG",
                    "d MMMM\u060c y GGGG",
                    "dd\u200f/MM\u200f/y GGGG",
                    "d\u200f/M\u200f/y GGGG",
                }
            },
            { "roc.Eras",
                new String[] {
                    "Before R.O.C.",
                    "\u062c\u0645\u0647\u0648\u0631\u064a\u0629 \u0627\u0644\u0635\u064a",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y G",
                    "d MMMM\u060c y G",
                    "dd\u200f/MM\u200f/y G",
                    "d\u200f/M\u200f/y G",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y GGGG",
                    "d MMMM\u060c y GGGG",
                    "dd\u200f/MM\u200f/y GGGG",
                    "d\u200f/M\u200f/y GGGG",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "\u0645\u062d\u0631\u0645",
                    "\u0635\u0641\u0631",
                    "\u0631\u0628\u064a\u0639 \u0627\u0644\u0623\u0648\u0644",
                    "\u0631\u0628\u064a\u0639 \u0627\u0644\u0622\u062e\u0631",
                    "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0623\u0648\u0644\u0649",
                    "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0622\u062e\u0631\u0629",
                    "\u0631\u062c\u0628",
                    "\u0634\u0639\u0628\u0627\u0646",
                    "\u0631\u0645\u0636\u0627\u0646",
                    "\u0634\u0648\u0627\u0644",
                    "\u0630\u0648 \u0627\u0644\u0642\u0639\u062f\u0629",
                    "\u0630\u0648 \u0627\u0644\u062d\u062c\u0629",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u0645\u062d\u0631\u0645",
                    "\u0635\u0641\u0631",
                    "\u0631\u0628\u064a\u0639 \u0627\u0644\u0623\u0648\u0644",
                    "\u0631\u0628\u064a\u0639 \u0627\u0644\u0622\u062e\u0631",
                    "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0623\u0648\u0644\u0649",
                    "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0622\u062e\u0631\u0629",
                    "\u0631\u062c\u0628",
                    "\u0634\u0639\u0628\u0627\u0646",
                    "\u0631\u0645\u0636\u0627\u0646",
                    "\u0634\u0648\u0627\u0644",
                    "\u0630\u0648 \u0627\u0644\u0642\u0639\u062f\u0629",
                    "\u0630\u0648 \u0627\u0644\u062d\u062c\u0629",
                    "",
                }
            },
            { "islamic.MonthNarrows",
                new String[] {
                    "\u0661",
                    "\u0662",
                    "\u0663",
                    "\u0664",
                    "\u0665",
                    "\u0666",
                    "\u0667",
                    "\u0668",
                    "\u0669",
                    "\u0661\u0660",
                    "\u0661\u0661",
                    "\u0661\u0662",
                    "",
                }
            },
            { "islamic.Eras",
                new String[] {
                    "",
                    "\u0647\u0640",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y",
                    "d MMMM y",
                    "d MMM\u060c y G",
                    "d\u200f/M\u200f/yyyy",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y",
                    "d MMMM y",
                    "d MMM\u060c y GGGG",
                    "d\u200f/M\u200f/yyyy",
                }
            },
            { "calendarname.islamic-umalqura", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0625\u0633\u0644\u0627\u0645\u064a [\u0623\u0645 \u0627\u0644\u0642\u0631\u0649]" },
            { "calendarname.islamic-civil", "\u062a\u0642\u0648\u064a\u0645 \u0627\u0633\u0644\u0627\u0645\u064a \u0645\u062f\u0646\u064a" },
            { "calendarname.islamicc", "\u062a\u0642\u0648\u064a\u0645 \u0627\u0633\u0644\u0627\u0645\u064a \u0645\u062f\u0646\u064a" },
            { "calendarname.buddhist", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0628\u0648\u0630\u064a" },
            { "calendarname.islamic", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0647\u062c\u0631\u064a" },
            { "calendarname.gregorian", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0645\u064a\u0644\u0627\u062f\u064a" },
            { "calendarname.gregory", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0645\u064a\u0644\u0627\u062f\u064a" },
            { "calendarname.roc", "\u062a\u0642\u0648\u064a\u0645 \u0645\u064a\u0646\u062c\u0648" },
            { "calendarname.japanese", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u064a\u0627\u0628\u0627\u0646\u064a" },
            { "DefaultNumberingSystem", "arab" },
            { "arab.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a",
                    "\u0660",
                    "#",
                    "-",
                    "\u0627\u0633",
                    "\u0609",
                    "\u221e",
                    "\u0644\u064a\u0633 \u0631\u0642\u0645",
                }
            },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###;#,##0.###-",
                    "\u00a4\u00a0#,##0.00;\u00a4\u00a0#,##0.00-",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
