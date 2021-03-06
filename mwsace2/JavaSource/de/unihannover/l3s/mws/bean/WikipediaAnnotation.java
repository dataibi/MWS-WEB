package de.unihannover.l3s.mws.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WikipediaAnnotation {
	private List<String> annotationList=new ArrayList<String>(
			Arrays.asList(
					"Occupy movement",
					"Occupy Wall Street",
					"Zuccotti Park",
					"Adbusters",
					"Wall Street",
					"Oakland",
					"nonviolence",
					"Nigeria",
					"Seoul",
					"Occupy Oakland",
					"California",
					"participatory democracy",
					"Occupy London",
					"Wikileaks",
					"Berlin",
					"Frankfurt",
					"pepper spray",
					"15 October 2011 global protests",
					"Auckland",
					"European Central Bank",
					"plaza",
					"Brazil",
					"South Africa",
					"South Korea",
					"Edinburgh",
					"Cardiff",
					"Occupy Edinburgh",
					"Arab Spring",
					"Great Recession",
					"Spanish Indignados movement",
					"Manhattan",
					"London Stock Exchange",
					"Occupy Homes",
					"Brooklyn Bridge",
					"Switzerland",
					"Chicago",
					"Financial Times",
					"Occupy Nigeria",
					"CNN",
					"2013 protests",
					"Victoria",
					"Copenhagen",
					"Mexico City",
					"Mongolia",
					"Dublin",
					"Galway",
					"Labour Party",
					"The Washington Post",
					"Micah White",
					"Madrid",
					"Manuel Castells",
					"Kalle Lasn",
					"Charging Bull",
					"Robin Hood tax",
					"black bloc",
					"Bernie Sanders",
					"Donald Trump",
					"Hillary Clinton",
					"Anthony Bologna",
					"New York Times",
					"Hamburg",
					"Times Square",
					"Oakland, California",
					"Iraq War",
					"Remembrance Day",
					"Denver",
					"Richard",
					"Occupy Portland",
					"zombie",
					"Ghent",
					"Recife",
					"Vancouver",
					"George",
					"Occupy Buffer Zone",
					"Nuit",
					"Occupy Berlin",
					"Penang",
					"Occupy Baluwatar",
					"Oslo",
					"Bergen",
					"Occupy Dame Street",
					"Cork",
					"Limerick",
					"Garda Síochána",
					"Yeouido",
					"Sunflower Movement",
					"Turkey",
					"Taksim Gezi Park",
					"Bristol",
					"Birmingham",
					"Liverpool",
					"Bath",
					"Sheffield",
					"Northern Ireland",
					"Occupy Glasgow",
					"Eugene",
					"medical debt",
					"Conan",
					"Houston",
					"global financial system",
					"Manfred Steger",
					"global justice movement",
					"Antarctica",
					"Washington, D.C.",
					"Iranian Green Movement",
					"Iberian Peninsula",
					"democratic awakening",
					"Cornel West",
					"Los Angeles City Council",
					"Dissent Magazine",
					"The Huffington Post",
					"Interstate 80",
					"June Democracy Movement",
					"anti-consumerist",
					"hacker",
					"11 September 2001 attacks",
					"Kuala Lumpur",
					"Tumblr",
					"Congressional Budget Office (CBO)",
					"New York City Hall",
					"Pareto principle",
					"Naomi Wolf",
					"The New Yorker",
					"high-frequency trading",
					"Bloomberg Businessweek",
					"David Graeber",
					"Judith Butler",
					"utopia",
					"Indymedia",
					"Skype",
					"Tim Pool",
					"May First/People Link",
					"Iran",
					"New York Historical Society",
					"Washington Square Park",
					"Athens",
					"anti-globalization movement",
					"Gene Sharp",
					"Serbia",
					"Ruaridh Arrow",
					"Al Jazeera",
					"Maurice Isserman",
					"Tom Juravich",
					"Naomi Klein",
					"Rick Hampton",
					"USA Today",
					"Oakland",
					"agents provocateurs",
					"San Francisco Bay Area",
					"KPIX",
					"Kanye West",
					"Yoko Ono",
					"Mark Ruffalo",
					"Michael Moore",
					"2016 Presidential Election",
					"Heather Marsh",
					"Alexa O'Brien",
					"Clyde Haberman",
					"New York Police Department",
					"Financial District",
					"Congress Square",
					"Ljubljana",
					"Taipei",
					"Tokyo",
					"São Paulo",
					"Leipzig",
					"Arizona",
					"Minneapolis",
					"BBC",
					"Bank Transfer Day",
					"Halifax, Nova Scotia",
					"Oregon",
					"UC Davis pepper-spray incident",
					"Green party",
					"Caroline Lucas",
					"green economics",
					"Goodluck Jonathan",
					"outwork",
					"Christine Gregoire",
					"Goldman Sachs",
					"World Economic Forum",
					"May Day",
					"general strike",
					"Free University",
					"Charlie Hales",
					"Hurricane Sandy",
					"anarchism",
					"Mashtots Park Movement",
					"Armenia",
					"Canberra",
					"Wollongong",
					"Perth",
					"Brisbane",
					"Melbourne",
					"Occupy Melbourne",
					"force",
					"Martin Place",
					"Brussels",
					"Antwerp",
					"Leuven",
					"South Park",
					"Brasília",
					"Movimento Passe Livre",
					"Occupy Canada",
					"Vancouver Art Gallery",
					"Toronto",
					"Montreal",
					"Sudbury",
					"British Columbia",
					"Yukon",
					"Northwest Territories",
					"Nunavut",
					"Newfoundland",
					"Nicosia",
					"La Défense",
					"Nantes",
					"Lyon",
					"Grenoble",
					"Marseille",
					"Perpignan",
					"Reichstag",
					"Düsseldorf",
					"HSBC Main Building",
					"central business district",
					"HSBC",
					"2011 Rome demonstration",
					"European Commission",
					"International Monetary Fund",
					"St John Lateran",
					"Molotov",
					"Roman Catholic",
					"Sky Italia",
					"Dataran Merdeka",
					"representative democracy",
					"Kelantan",
					"Kota Bharu",
					"Mexican Stock Exchange",
					"Mexican Drug War",
					"Javier Sicilia",
					"Satyagraha",
					"Baburam Bhattarai",
					"Rotterdam",
					"Beurs-World Trade Center",
					"New Plymouth",
					"Christchurch",
					"Dunedin",
					"Invercargill",
					"Lower Hutt",
					"Aotea Square",
					"Albert Park",
					"Fuel pump",
					"Port Harcourt",
					"Occupy Oslo",
					"Eidsvolls plass",
					"Youngstorget",
					"Waterford",
					"Letterkenny",
					"Athlone",
					"Irish Times",
					"Democracy Now!",
					"Eyre Square",
					"Galway City Council",
					"free trade",
					"Seoul train",
					"Seoul City Hall",
					"protest permit",
					"Stéphane Hessel",
					"NEET",
					"Portugal",
					"Tunisia",
					"Egypt",
					"Hispania",
					"Iberia",
					"Lusitania",
					"UBS",
					"Credit Suisse",
					"Paradeplatz",
					"Legislative Yuan",
					"Executive Yuan",
					"Taiwan",
					"Cross-Strait Service Trade Agreement",
					"Kuomintang",
					"Istanbul",
					"Taksim Military Barracks",
					"football",
					"Ankara",
					"Glasgow",
					"Paternoster Square",
					"Giles Fraser",
					"Nottingham",
					"College Green",
					"Bournemouth University",
					"Tyne",
					"Plymouth",
					"Exeter",
					"Norwich",
					"Dreamland Margate",
					"Walker Art Gallery",
					"Arts Tower",
					"Parliament Square",
					"Cathedral Quarter",
					"Derry",
					"Coleraine",
					"Ulster",
					"Dundas House",
					"Kelvingrove Park",
					"Cardiff Castle",
					"Plaid Cymru",
					"Leanne Wood",
					"Tony Benn",
					"Welsh Labour",
					"2011 Oakland General Strike",
					"direct democracy",
					"International Press Institute",
					"hinder",
					"Dilma Rousseff",
					"Jim Flaherty",
					"Manmohan Singh",
					"Ayatollah Khamenei",
					"Gordon Brown",
					"Ed Miliband",
					"Scottish Green Party",
					"Scottish National Party (SNP)",
					"Scottish Liberal Democrats",
					"Scottish Conservative Party",
					"Barack Obama",
					"Jean Quan",
					"Salt Lake City",
					"New Haven, Connecticut",
					"New Haven Green",
					"Venezuela",
					"Hugo Chávez",
					"Francis Fukuyama",
					"Tea Party movement",
					"Tahrir Square",
					"Jesse Jackson",
					"Ipsos",
					"Indonesia",
					"Noam Chomsky",
					"The Daily Telegraph",
					"Global Language Monitor",
					"American Dialect Society",
					"The Middle",
					"The Economist",
					"Ted Deutch",
					"United States Supreme Court",
					"Al Gore",
					"Paul Mason",
					"Late-2000s financial crisis",
					"G20",
					"Jared Bernstein",
					"Joe Biden",
					"The Atlantic Magazine",
					"Domestic Security Alliance Council",
					"New York Stock Exchange",
					"Zions Bank",
					"Joint Terrorism Task Force",
					"force",
					"MIT",
					"federal complaint",
					"Justine Tunney",
					"Eric Schmidt",
					"horizontalism",
					"Abraham Foxman",
					"Anti-Defamation League"
					)
			);

	public List<String> getAnnotationList() {
		Collections.sort(annotationList);
		return annotationList;
	}

}
