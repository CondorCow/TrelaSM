package com.example.danny.trelaapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jan on 7-4-2016.
 */
public class DataBase {
    public static ArrayList<Artist> artists = new ArrayList<Artist>();

    public DataBase() {
        ArrayList<Concert> tempConcerts0 = new ArrayList<Concert>();
        ArrayList<Concert> tempConcerts1 = new ArrayList<Concert>();
        ArrayList<Concert> tempConcerts2 = new ArrayList<Concert>();
        ArrayList<Concert> tempConcerts3 = new ArrayList<Concert>();
        ArrayList<Concert> tempConcerts4 = new ArrayList<Concert>();
        ArrayList<Concert> tempConcerts5 = new ArrayList<Concert>();


        artists.add(new Artist("Bavid Dowie", "Info van Bavid", tempConcerts0));

        tempConcerts1.clear();
        tempConcerts1.add(new Concert("Kanye East 2016 Tour Germany", "Kanye was born in a middle class household in Chicago and was a creative from an early age, often writing poetry and becoming part of the city’s hip hop scene at a young age. He briefly attended college but dropped out when it became detrimental to the creation of his music.", 200, "21-5-2016"));
        tempConcerts1.add(new Concert("Kanye East 2016 Tour Belgium", "Kanye was born in a middle class household in Chicago and was a creative from an early age, often writing poetry and becoming part of the city’s hip hop scene at a young age. He briefly attended college but dropped out when it became detrimental to the creation of his music.", 100, "30-5-2016"));
        tempConcerts1.add(new Concert("Kanye East 2016 Tour Poland", "Kanye was born in a middle class household in Chicago and was a creative from an early age, often writing poetry and becoming part of the city’s hip hop scene at a young age. He briefly attended college but dropped out when it became detrimental to the creation of his music.", 500, "5-6-2016"));
        artists.add(new Artist("Kanye East", "Kayne East 4 President", tempConcerts1));

        tempConcerts2.clear();
        tempConcerts2.add(new Concert("Runs 'N Goses Reunion Tour Germany", "Following months of intense rumor, speculation and feverish excitement from rock music fans around the world, Runs N' Goses confirmed today they will embark on a massive North American summer stadium tour as founder Axl Rose and former members, Slash and Duff McKagan regroup for what will be one of the century's most anticipated musical events.", 200, "21-5-2016"));
        tempConcerts2.add(new Concert("Runs 'N Goses Reunion Tour NL", "Following months of intense rumor, speculation and feverish excitement from rock music fans around the world, Runs N' Goses confirmed today they will embark on a massive North American summer stadium tour as founder Axl Rose and former members, Slash and Duff McKagan regroup for what will be one of the century's most anticipated musical events.", 20, "27-5-2016"));
        tempConcerts2.add(new Concert("Runs 'N Goses Reunion Tour LA", "Following months of intense rumor, speculation and feverish excitement from rock music fans around the world, Runs N' Goses confirmed today they will embark on a massive North American summer stadium tour as founder Axl Rose and former members, Slash and Duff McKagan regroup for what will be one of the century's most anticipated musical events.", 9999, "1-6-2016"));
        artists.add(new Artist("Runs 'N Goses", "Info van Goses", tempConcerts2));

        tempConcerts3.clear();
        tempConcerts3.add(new Concert("Zed Leppelin Last Tour Germany", "The tour consisted of four concerts held on the European mainland, but also included a single performance at the Lyceum Ballroom in London, England. This brief tour was organised to promote the imminent release of the band's second album, Led Zeppelin II.[1] The album was released in late October 1969, just following the conclusion of this tour.\n" +
                "\n" +
                "For the concert in London, the English press announced that Led Zeppelin will receive \"the highest fee ever paid to a British group for a one-nighter in this country\", although the actual fee was never publicly divulged.[2] Support for this concert was provided by The Frosty Noses and Audience.[1]\n" +
                "\n" +
                "The night in Paris on 10 October 1969 was released as Led Zeppelin (Deluxe Edition) on 3 June 2014, with \"Good Times Bad Times/Communication Breakdown\" released on 15 April 2014 on iTunes only.", 200, "21-5-2016"));
        tempConcerts3.add(new Concert("Zed Leppelin Last Tour NL", "The tour consisted of four concerts held on the European mainland, but also included a single performance at the Lyceum Ballroom in London, England. This brief tour was organised to promote the imminent release of the band's second album, Led Zeppelin II.[1] The album was released in late October 1969, just following the conclusion of this tour.\n" +
                "\n" +
                "For the concert in London, the English press announced that Led Zeppelin will receive \"the highest fee ever paid to a British group for a one-nighter in this country\", although the actual fee was never publicly divulged.[2] Support for this concert was provided by The Frosty Noses and Audience.[1]\n" +
                "\n" +
                "The night in Paris on 10 October 1969 was released as Led Zeppelin (Deluxe Edition) on 3 June 2014, with \"Good Times Bad Times/Communication Breakdown\" released on 15 April 2014 on iTunes only.", 70, "29-5-2016"));
        tempConcerts3.add(new Concert("Zed Leppelin Last Tour LA", "The tour consisted of four concerts held on the European mainland, but also included a single performance at the Lyceum Ballroom in London, England. This brief tour was organised to promote the imminent release of the band's second album, Led Zeppelin II.[1] The album was released in late October 1969, just following the conclusion of this tour.\n" +
                "\n" +
                "For the concert in London, the English press announced that Led Zeppelin will receive \"the highest fee ever paid to a British group for a one-nighter in this country\", although the actual fee was never publicly divulged.[2] Support for this concert was provided by The Frosty Noses and Audience.[1]\n" +
                "\n" +
                "The night in Paris on 10 October 1969 was released as Led Zeppelin (Deluxe Edition) on 3 June 2014, with \"Good Times Bad Times/Communication Breakdown\" released on 15 April 2014 on iTunes only.", 200, "7-7-2016"));
        artists.add(new Artist("Zed Leppelin", "Info van Zed", tempConcerts3));

        tempConcerts4.clear();
        tempConcerts4.add(new Concert("Stolling Rones Last Tour Germany", "14 On Fire was a concert tour by The Rolling Stones, which started on 21 February 2014 in Abu Dhabi. It was a follow-up to the 50 & Counting... tour which celebrated the 50th anniversary of the band.[1][2] The tour was very much similar to the 50 & Counting... just as the \"Urban Jungle\" portion of the Stones' Steel Wheels/Urban Jungle Tour in 1990 was similar to the \"Steel Wheels\" portion in 1989. \"14 On Fire\" had the same stage design, setlist structure, and clothing/merchandise as 50 & Counting… Also, Mick Taylor was a guest throughout this tour as in 50 & Counting.", 130, "21-5-2016"));
        tempConcerts4.add(new Concert("Stolling Rones Last Tour NL", "14 On Fire was a concert tour by The Rolling Stones, which started on 21 February 2014 in Abu Dhabi. It was a follow-up to the 50 & Counting... tour which celebrated the 50th anniversary of the band.[1][2] The tour was very much similar to the 50 & Counting... just as the \"Urban Jungle\" portion of the Stones' Steel Wheels/Urban Jungle Tour in 1990 was similar to the \"Steel Wheels\" portion in 1989. \"14 On Fire\" had the same stage design, setlist structure, and clothing/merchandise as 50 & Counting… Also, Mick Taylor was a guest throughout this tour as in 50 & Counting.", 144, "21-5-2016"));
        tempConcerts4.add(new Concert("Stolling Rones Last Tour LA", "14 On Fire was a concert tour by The Rolling Stones, which started on 21 February 2014 in Abu Dhabi. It was a follow-up to the 50 & Counting... tour which celebrated the 50th anniversary of the band.[1][2] The tour was very much similar to the 50 & Counting... just as the \"Urban Jungle\" portion of the Stones' Steel Wheels/Urban Jungle Tour in 1990 was similar to the \"Steel Wheels\" portion in 1989. \"14 On Fire\" had the same stage design, setlist structure, and clothing/merchandise as 50 & Counting… Also, Mick Taylor was a guest throughout this tour as in 50 & Counting.", 200, "21-5-2016"));
        artists.add(new Artist("Stolling Rones", "Info van Rones", tempConcerts4));

        tempConcerts5.clear();
        tempConcerts5.add(new Concert("White Sabbath Finland Show", "Ozzy Osbourne (Vocals), Tony Iommi (Guitar) and Geezer Butler (Bass) wrapped the first dates of BLACK SABBATH’s massive 2016 THE END world tour last week (3/7) in Vancouver, BC to an overwhelming response, from fans and critics alike.  The first leg of sold-out North American shows will be followed by a run of summer performances including return visits to Los Angeles (at the iconic Hollywood Bowl), New York, Chicago and 14 additional cities.  Tickets for the summer shows are available at www.Livenation.com.  See BLACK SABBATH’s world wide itinerary below. ", 600, "19-6-2016"));
        tempConcerts5.add(new Concert("White Sabbath Denmark Show","Ozzy Osbourne (Vocals), Tony Iommi (Guitar) and Geezer Butler (Bass) wrapped the first dates of BLACK SABBATH’s massive 2016 THE END world tour last week (3/7) in Vancouver, BC to an overwhelming response, from fans and critics alike.  The first leg of sold-out North American shows will be followed by a run of summer performances including return visits to Los Angeles (at the iconic Hollywood Bowl), New York, Chicago and 14 additional cities.  Tickets for the summer shows are available at www.Livenation.com.  See BLACK SABBATH’s world wide itinerary below. ", 400, "29-6-2016"));
        tempConcerts5.add(new Concert("White Sabbath Germany Show","Ozzy Osbourne (Vocals), Tony Iommi (Guitar) and Geezer Butler (Bass) wrapped the first dates of BLACK SABBATH’s massive 2016 THE END world tour last week (3/7) in Vancouver, BC to an overwhelming response, from fans and critics alike.  The first leg of sold-out North American shows will be followed by a run of summer performances including return visits to Los Angeles (at the iconic Hollywood Bowl), New York, Chicago and 14 additional cities.  Tickets for the summer shows are available at www.Livenation.com.  See BLACK SABBATH’s world wide itinerary below. ", 160, "10-7-2016"));
        tempConcerts5.add(new Concert("White Sabbath Italy Show","Ozzy Osbourne (Vocals), Tony Iommi (Guitar) and Geezer Butler (Bass) wrapped the first dates of BLACK SABBATH’s massive 2016 THE END world tour last week (3/7) in Vancouver, BC to an overwhelming response, from fans and critics alike.  The first leg of sold-out North American shows will be followed by a run of summer performances including return visits to Los Angeles (at the iconic Hollywood Bowl), New York, Chicago and 14 additional cities.  Tickets for the summer shows are available at www.Livenation.com.  See BLACK SABBATH’s world wide itinerary below. ", 700, "19-7-2016"));
        artists.add(new Artist("White Sabbath", "Black Sabbath but whiter", tempConcerts5));

    }

    public static ArrayList<Concert> GetNearbyConcerts()
    {
        ArrayList<Concert> nearbyConcerts = new ArrayList<Concert>();

        for (Artist a : artists) {
            ArrayList<Concert> temp_allConcertsFromArtist = new ArrayList<Concert>();
            if (Profile.followingArtists.contains(a)) {
                temp_allConcertsFromArtist = a.getConcertList();
                for (Concert c : temp_allConcertsFromArtist) {
                    if (c.getKmFromHome() <= Profile.getRangeInKm()) {
                        nearbyConcerts.add(c);
                    }
                }
            }
        }
        return nearbyConcerts;

    }


}
