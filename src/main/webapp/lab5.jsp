<%-- 
    Document   : lab5
    Created on : 20.05.2021, 17:39:52
    Author     : Alex
--%>

<%@page import="IR11.Lab5.Part1"%>
<%@page import="IR11.Lab5.Part2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
        
    </head>
 
    <body>
        <div class="container">
            <a class="btn btn-secondary" href="index.jsp">Back to landing page</a>
            <h1 class="text-center">Lab 5</h1>
            <div class="mt-5" id="laba">
                <%! Part1 part1 = new Part1("In 1980, the Austrian"
            + " Armed Forces announced that it would seek tenders for a new, modern duty"
            + " pistol to replace their World War II–era Walther P38 handguns. The Federal"
            + " Ministry of Defence of Austria formulated a list of 17 criteria for the new"
            + " generation service pistol, including requirements that it would be self loading;"
            + " fire the NATO-standard 9×19 mm Parabellum round; the magazines were not to require"
            + " any means of assistance for loading; be secure against accidental discharge"
            + " from shock, strike, and drop from a height of 2 m onto a steel plate."
            + " After firing 15,000 rounds of standard ammunition, the pistol was to be"
            + " inspected for wear. The pistol was to then be used to fire an"
            + " overpressure test cartridge generating 5,000 bar (500 MPa; 73,000 psi)."
            + " The normal maximum operating pressure (Pmax) for the 9mm NATO is 2,520 bar"
            + " (252 MPa; 36,500 psi).Glock became aware of the Austrian Army's planned"
            + " procurement, and in 1982 assembled a team of Europe's leading handgun"
            + " experts from military, police, and civilian sport-shooting circles to"
            + " define the most desirable characteristics in a combat pistol."
            + " Within three months, Glock developed a working prototype that"
            + " combined proven mechanisms and traits from previous pistol designs."
            + " In addition, the plan was to make extensive use of synthetic materials"
            + " and modern manufacturing technologies, which led to the  "
            + "Glock 17 becoming a cost-effective candidate. Several samples of the 9×19mm"
            + " Glock 17 (so named because it was the 17th patent procured by the company)"
            + " were submitted for assessment trials in early 1982, and after passing all"
            + " of the exhaustive endurance and abuse tests, the Glock emerged as the winner."
            + "The handgun was adopted into service with the Austrian military and police forces"
            + " in 1982 as the P80 (Pistole 80),[19] with an initial order for 25,000 guns. The Glock"
            + " 17 outperformed eight different pistols from five other established manufacturers"
            + " (Heckler & Koch of Germany offered their P7M8, P7M13, and P9S, SIG Sauer of Switzerland"
            + " bid with their P220 and P226 models, Beretta of Italy submitted their model 92SB-F,"
            + " FN Herstal of Belgium proposed an updated variant of the Browning Hi-Power, and the"
            + " Austrian Steyr Mannlicher entered the competition with the GB).");%>
                <p><b>Text:</b> <%= part1.GetText()%></p>
                <form action="./lab5" method="post" class="form-inline">
                    <label for="x"><b>Enter word to search for: </b></label>
                    <div class="input-group">
                        <input  class="form-control" id="find" type="text" name="find"/>
                        <input class="btn btn-success" type="submit" value="Submit"/>
                    </div>
                    <p class="mt-3 mb-0"><b>Word number: </b><%=request.getAttribute("result")%></p>
                </form>
                <p><b>Most popular words:</b> <%= part1.GetMostPopularWords()%></p>
                <p><b>Most popular sequences (4):</b>
                    <%= part1.MostPopularSequences(4)%></p>
                <%! Part2 part2 = new Part2(20); %>
                <% part2.InitList(); %>
                <p><b>List: </b><br/> <%= part2.DisplayList()%></p>
                <%! String find = "model #8"; %>
                <p><b>Index of element with value</b> <%= find %>: <%= part2.IndexOf(find)%></p>
                <% part2.SortByStringField();%>
                <p><b>Sorted by string field: </b><br/> <%= part2.DisplayList()%></p>
                <p><b>Index of element with value </b><%= find %>: <%= part2.IndexOf(find)%></p>
                <% part2.SortByShortField();%>
                <p><b>Sorted by int field: </b><br/> <%= part2.DisplayList()%></p>
                <p><b>Index of element with value </b><%= find %>: <%= part2.IndexOf(find)%></p>
            </div>
        </div>
    </body>
</html>