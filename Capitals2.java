import java.util.Scanner;

public class Capitals2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String country = "";
        
        try {
            while (!country.equals("quit")) {
                System.out.println("Type a country name or quit to exit");
                country = input.nextLine();

                switch(country) {

                    //countries starting with A.
                    case "Afghanistan":
                        System.out.println("The Capital of " + country + " is Kabul.");
                        break;
                    case "Albania":
                        System.out.println("The Capital of " + country + " is Albania.");
                        break;
                    case "Algeria":
                        System.out.println("The Capital of " + country + " is Algiers.");
                        break;
                    case "Andorra":
                        System.out.println("The Capital of " + country + " is Andorra La Vella" );
                        break;
                    case "Angola":
                        System.out.println("The Capital of " + country + " is Luanda.");
                        break;
                    case "Antigua & Barbuda":
                        System.out.println("The Capital of " + country + " is Saint John's");
                        break;
                    case "Argentina":
                        System.out.println("The Capital of " + country + " is Buenos Aires");
                        break;
                    case "Armenia":
                        System.out.println("The Capital of " + country + " is Yerevan");
                        break;
                    case "Australia":
                        System.out.println("The Capital of " + country + " is Canberra");
                        break;
                    case "Austria":
                        System.out.println("The Capital of " + country + " is Vienna");
                        break;
                    case "Azerbaijan":
                        System.out.println("The Capital of " + country + " is Baku");
                        break;
        
                    //countries starting with B.
                    case "Bahamas":
                    case "Bahamas, The":
                        System.out.println("The Capital of " + country + " is Nassau.");
                        break;
                    case "Bahrain":
                        System.out.println("The Capital of " + country + " is Manama.");
                        break;
                    case "Bangladesh":
                        System.out.println("The Capital of " + country + " is Dhaka.");
                        break;
                    case "Barbados":
                        System.out.println("The Capital of " + country + " is Bridgetown.");
                        break;
                    case "Belarus":
                        System.out.println("The Capital of " + country + " is Minsk.");
                        break;
                    case "Belgium":
                        System.out.println("The Capital of " + country + " is Brussels.");
                        break;
                    case "Belize":
                        System.out.println("The Capital of " + country + " is Belmopan.");
                        break;
                    case "Benin":
                        System.out.println("The Capital of " + country + " is Porto-Novo.");
                        break;
                    case "Bhutan":
                        System.out.println("The Capital of " + country + " is Thimphu.");
                        break;
                    case "Bolivia":
                        System.out.println("The Capitals of " + country + " are Sucre and La Paz.");
                        break;
                    case "Bosnia & Herzegovina":
                        System.out.println("The Capital of " + country + " is Sarajevo.");
                        break;
                    case "Botswana":
                        System.out.println("The Capital of " + country + " is Gaborone.");
                        break;
                    case "Brazil":
                        System.out.println("The Capital of " + country + " is Brasilia.");
                        break;
                    case "Brunei":
                        System.out.println("The Capital of " + country + " is Bandar Seri Begawan.");
                        break;
                    case "Bulgaria":
                        System.out.println("The Capital of " + country + " is Sofia.");
                        break;
                    case "Burkina Faso":
                        System.out.println("The Capital of " + country + " is Ouagadougou.");
                        break;
                    case "Burundi":
                        System.out.println("The Capitals of " + country + " are Gitega and Bujumbura.");
                        break;
        
                    ////countries starting with C.
                    case "Cabo Verde":
                        System.out.println("The Capital of " + country + " is Praia.");
                        break;
                    case "Cambodia":
                        System.out.println("The Capital of " + country + " is Phnom Penh.");
                        break;
                    case "Cameroon":
                        System.out.println("The Capital of " + country + " is Yaoundé.");
                        break;
                    case "Canada":
                        System.out.println("The Capital of " + country + " is Ottawa.");
                        break;
                    case "Central African Republic":
                        System.out.println("The Capital of " + country + " is Bangui.");
                        break;
                    case "Chad":
                        System.out.println("The Capital of " + country + " is N'Djamena.");
                        break;
                    case "Chile":
                        System.out.println("The Capital of " + country + " is Santiago.");
                        break;
                    case "China":
                        System.out.println("The Capital of " + country + " is Beijing.");
                        break;
                    case "Colombia":
                        System.out.println("The Capital of " + country + " is Bogotá.");
                        break;
                    case "Comoros":
                        System.out.println("The Capital of " + country + " is Moroni.");
                        break;
                    case "Congo, Democratic Republic of the":
                        System.out.println("The Capital of " + country + " is Kinshasa.");
                        break;
                    case "Congo, Republic of the":
                        System.out.println("The Capital of " + country + " is Brazzaville.");
                        break;
                    case "Costa Rica":
                        System.out.println("The Capital of " + country + " is San José.");
                        break;
                    case "Côte d'Ivoire":
                    case "Ivory Coast":
                        System.out.println("The Capital of " + country + " is Yamoussoukro.");
                        break;
                    case "Croatia":
                        System.out.println("The Capital of " + country + " is Zagreb.");
                        break;
                    case "Cuba":
                        System.out.println("The Capital of " + country + " is Havana.");
                        break;
                    case "Cyprus":
                        System.out.println("The Capital of " + country + " is Nicosia.");
                        break;
                    case "Czechia":
                    case "Czech Republic":
                        System.out.println("The Capital of " + country + " is Prague.");
                        break;
        
                    //countries starting with D. 
                    case "Denmark":
                        System.out.println("The Capital of " + country + " is Copenhagen.");
                        break;
                    case "Djibouti":
                        System.out.println("The Capital of " + country + " is Djibouti (City).");
                        break;
                    case "Dominica":
                        System.out.println("The Capital of " + country + " is Roseau.");
                        break;
                    case "Dominican Republic":
                        System.out.println("The Capital of " + country + " is Santo Domingo.");
                        break;
        
                    //countries starting with E.
                    case "Ecuador":
                        System.out.println("The Capital of " + country + " is Quito.");
                        break;
                    case "Egypt":
                        System.out.println("The Capital of " + country + " is Cairo.");
                        break;
                    case "El Salvador":
                        System.out.println("The Capital of " + country + " is San Salvador.");
                        break;
                    case "Equatorial Guinea":
                        System.out.println("The Capital of " + country + " is Malabo.");
                        break;
                    case "Eritrea":
                        System.out.println("The Capital of " + country + " is Asmara.");
                        break;
                    case "Estonia":
                        System.out.println("The Capital of " + country + " is Tallinn.");
                        break;
                    case "Eswatini":
                    case "Swaziland":
                        System.out.println("The Capital of " + country + " is Mbabane.");
                        break;
                    case "Ethiopia":
                        System.out.println("The Capital of " + country + " is Addis Ababa.");
                        break;
        
                    //countries starting with F.
                    case "Fiji":
                        System.out.println("The Capital of " + country + " is Suva.");
                        break;
                    case "Finland":
                        System.out.println("The Capital of " + country + " is Helsinki.");
                        break;
                    case "France":
                        System.out.println("The Capital of " + country + " is Paris.");
                        break;
        
                    ////countries starting with G.
                    case "Gabon":
                        System.out.println("The Capital of " + country + " is Libreville.");
                        break;
                    case "Gambia":
                    case "Gambia, The":
                        System.out.println("The Capital of " + country + " is Banjul.");
                        break;
                    case "Georgia":
                        System.out.println("The Capital of " + country + " is Tbilisi.");
                        break;
                    case "Germany":
                        System.out.println("The Capital of " + country + " is Berlin.");
                        break;
                    case "Ghana":
                        System.out.println("The Capital of " + country + " is Accra.");
                        break;
                    case "Greece":
                        System.out.println("The Capital of " + country + " is Athens.");
                        break;
                    case "Grenada":
                        System.out.println("The Capital of " + country + " is Saint George's.");
                        break;
                    case "Guatemala":
                        System.out.println("The Capital of " + country + " is Guatemala City.");
                        break;
                    case "Guinea":
                        System.out.println("The Capital of " + country + " is Conakry.");
                        break;
                    case "Guinea-Bissau":
                        System.out.println("The Capital of " + country + " is Bissau.");
                        break;
                    case "Guyana":
                        System.out.println("The Capital of " + country + " is Georgetown.");
                        break;
                    
                    //countries starting with H
                    case "Haiti":
                        System.out.println("The Capital of " + country + " is Port-au-Prince.");
                        break;
                    case "Honduras":
                        System.out.println("The Capital of " + country + " is Tegucigalpa.");
                        break;
                    case "Hungary":
                        System.out.println("The Capital of " + country + " is Budapest.");
                        break;
        
                    //countries starting with i;
                    case "Iceland":
                        System.out.println("The Capital of " + country + " is Reykjavik.");
                        break;
                    case "India":
                        System.out.println("The Capital of " + country + " is New Delhi.");
                        break;
                    case "Indonesia":
                        System.out.println("The Capital of " + country + " is Jakarta.");
                        break;
                    case "Iran":
                        System.out.println("The Capital of " + country + " is Tehran.");
                        break;
                    case "Iraq":
                        System.out.println("The Capital of " + country + " is Baghdad.");
                        break;
                    case "Ireland":
                        System.out.println("The Capital of " + country + " is Dublin.");
                        break;
                    case "Italy":
                        System.out.println("The Capital of " + country + " is Rome.");
                        break;
                    //countries starting with J
        
                    case "Jamaica":
                        System.out.println("The Capital of " + country + " is Kingston.");
                        break;
                    case "Japan":
                        System.out.println("The Capital of " + country + " is Tokyo.");
                        break;
                    case "Jordan":
                        System.out.println("The Capital of " + country + " is Amman.");
                        break;
                        // Countries starting with K
                    case "Kazakhstan":
                    System.out.println("The Capital of " + country + " is Astana.");
                    break;
                case "Kenya":
                    System.out.println("The Capital of " + country + " is Nairobi.");
                    break;
                case "Kiribati":
                    System.out.println("The Capital of " + country + " is South Tarawa.");
                    break;
                case "Kosovo":
                    System.out.println("The Capital of " + country + " is Pristina.");
                    break;
                case "Kuwait":
                    System.out.println("The Capital of " + country + " is Kuwait City.");
                    break;
                case "Kyrgyzstan":
                    System.out.println("The Capital of " + country + " is Bishkek.");
                    break;
                    
                // Countries starting with L
                case "Laos":
                    System.out.println("The Capital of " + country + " is Vientiane.");
                    break;
                case "Latvia":
                    System.out.println("The Capital of " + country + " is Riga.");
                    break;
                case "Lebanon":
                    System.out.println("The Capital of " + country + " is Beirut.");
                    break;
                case "Lesotho":
                    System.out.println("The Capital of " + country + " is Maseru.");
                    break;
                case "Liberia":
                    System.out.println("The Capital of " + country + " is Monrovia.");
                    break;
                case "Libya":
                    System.out.println("The Capital of " + country + " is Tripoli.");
                    break;
                case "Liechtenstein":
                    System.out.println("The Capital of " + country + " is Vaduz.");
                    break;
                case "Lithuania":
                    System.out.println("The Capital of " + country + " is Vilnius.");
                    break;
                case "Luxembourg":
                    System.out.println("The Capital of " + country + " is Luxembourg.");
                    break;
                    
                // Countries starting with M
                case "Madagascar":
                    System.out.println("The Capital of " + country + " is Antananarivo.");
                    break;
                case "Malawi":
                    System.out.println("The Capital of " + country + " is Lilongwe.");
                    break;
                case "Malaysia":
                    System.out.println("The Capital of " + country + " is Kuala Lumpur.");
                    break;
                case "Maldives":
                    System.out.println("The Capital of " + country + " is Male.");
                    break;
                case "Mali":
                    System.out.println("The Capital of " + country + " is Bamako.");
                    break;
                case "Malta":
                    System.out.println("The Capital of " + country + " is Valletta.");
                    break;
                case "Marshall Islands":
                    System.out.println("The Capital of " + country + " is Majuro.");
                    break;
                case "Mauritania":
                    System.out.println("The Capital of " + country + " is Nouakchott.");
                    break;
                case "Mauritius":
                    System.out.println("The Capital of " + country + " is Port Louis.");
                    break;
                case "Mexico":
                    System.out.println("The Capital of " + country + " is Mexico City.");
                    break;
                case "Micronesia, Federated States of":
                    System.out.println("The Capital of " + country + " is Palikir.");
                    break;
                case "Moldova":
                    System.out.println("The Capital of " + country + " is Chisinau.");
                    break;
                case "Monaco":
                    System.out.println("The Capital of " + country + " is Monaco.");
                    break;
                case "Mongolia":
                    System.out.println("The Capital of " + country + " is Ulaanbaatar.");
                    break;
                case "Montenegro":
                    System.out.println("The Capital of " + country + " is Podgorica.");
                    break;
                case "Morocco":
                    System.out.println("The Capital of " + country + " is Rabat.");
                    break;
                case "Mozambique":
                    System.out.println("The Capital of " + country + " is Maputo.");
                    break;
                case "Myanmar":
                case "Burma":
                    System.out.println("The Capital of " + country + " is Nay Pyi Taw.");
                    break;
                    
                // Countries starting with N
                case "Namibia":
                    System.out.println("The Capital of " + country + " is Windhoek.");
                    break;
                case "Nauru":
                    System.out.println("The Capital of " + country + " is Yaren District.");
                    break;
                case "Nepal":
                    System.out.println("The Capital of " + country + " is Kathmandu.");
                    break;
                case "Netherlands":
                    System.out.println("The Capital of " + country + " is Amsterdam.");
                    break;
                case "New Zealand":
                    System.out.println("The Capital of " + country + " is Wellington.");
                    break;
                case "Nicaragua":
                    System.out.println("The Capital of " + country + " is Managua.");
                    break;
                case "Niger":
                    System.out.println("The Capital of " + country + " is Niamey.");
                    break;
                case "Nigeria":
                    System.out.println("The Capital of " + country + " is Abuja.");
                    break;
                case "North Korea":
                    System.out.println("The Capital of " + country + " is Pyongyang.");
                    break;
                case "North Macedonia":
                case "Macedonia":
                    System.out.println("The Capital of " + country + " is Skopje.");
                    break;
                case "Norway":
                    System.out.println("The Capital of " + country + " is Oslo.");
                    break;
                    
                // Country starting with O
                case "Oman":
                    System.out.println("The Capital of " + country + " is Muscat.");
                    break;
                    case "Pakistan":
                    System.out.println("The Capital of " + country + " is Islamabad.");
                    break;
                case "Palau":
                    System.out.println("The Capital of " + country + " is Ngerulmud.");
                    break;
                case "Palestine":
                    System.out.println("The Capital of " + country + " is East Jerusalem.");
                    break;
                case "Panama":
                    System.out.println("The Capital of " + country + " is Panama City.");
                    break;
                case "Papua New Guinea":
                    System.out.println("The Capital of " + country + " is Port Moresby.");
                    break;
                case "Paraguay":
                    System.out.println("The Capital of " + country + " is Asunción.");
                    break;
                case "Peru":
                    System.out.println("The Capital of " + country + " is Lima.");
                    break;
                case "Philippines":
                    System.out.println("The Capital of " + country + " is Manila.");
                    break;
                case "Poland":
                    System.out.println("The Capital of " + country + " is Warsaw.");
                    break;
                case "Portugal":
                    System.out.println("The Capital of " + country + " is Lisbon.");
                    break;
                    
                // Country starting with Q
                case "Qatar":
                    System.out.println("The Capital of " + country + " is Doha.");
                    break;
        
                // Countries starting with R
                case "Romania":
                    System.out.println("The Capital of " + country + " is Bucharest.");
                    break;
                case "Russia":
                    System.out.println("The Capital of " + country + " is Moscow.");
                    break;
                case "Rwanda":
                    System.out.println("The Capital of " + country + " is Kigali.");
                    break;
        
                // Countries starting with S
                case "Saint Kitts & Nevis":
                    System.out.println("The Capital of " + country + " is Basseterre.");
                    break;
                case "Saint Lucia":
                    System.out.println("The Capital of " + country + " is Castries.");
                    break;
                case "Saint Vincent & the Grenadines":
                    System.out.println("The Capital of " + country + " is Kingstown.");
                    break;
                case "Samoa":
                    System.out.println("The Capital of " + country + " is Apia.");
                    break;
                case "San Marino":
                    System.out.println("The Capital of " + country + " is San Marino.");
                    break;
                case "São Tomé & Príncipe":
                    System.out.println("The Capital of " + country + " is São Tomé.");
                    break;
                case "Saudi Arabia":
                    System.out.println("The Capital of " + country + " is Riyadh.");
                    break;
                case "Senegal":
                    System.out.println("The Capital of " + country + " is Dakar.");
                    break;
                case "Serbia":
                    System.out.println("The Capital of " + country + " is Belgrade.");
                    break;
                case "Seychelles":
                    System.out.println("The Capital of " + country + " is Victoria.");
                    break;
                case "Sierra Leone":
                    System.out.println("The Capital of " + country + " is Freetown.");
                    break;
                case "Singapore":
                    System.out.println("The Capital of " + country + " is Singapore.");
                    break;
                case "Slovakia":
                    System.out.println("The Capital of " + country + " is Bratislava.");
                    break;
                case "Slovenia":
                    System.out.println("The Capital of " + country + " is Ljubljana.");
                    break;
                case "Solomon Islands":
                    System.out.println("The Capital of " + country + " is Honiara.");
                    break;
                case "Somalia":
                    System.out.println("The Capital of " + country + " is Mogadishu.");
                    break;
                case "South Africa":
                    System.out.println("The Capitals of " + country + " are Bloemfontein, Cape Town, and Pretoria.");
                    break;
                case "South Korea":
                    System.out.println("The Capital of " + country + " is Seoul.");
                    break;
                case "South Sudan":
                    System.out.println("The Capital of " + country + " is Juba.");
                    break;
                case "Spain":
                    System.out.println("The Capital of " + country + " is Madrid.");
                    break;
                case "Sri Lanka":
                    System.out.println("The Capitals of " + country + " are Colombo and Sri Jayawardenepura Kotte.");
                    break;
                case "Sudan":
                    System.out.println("The Capital of " + country + " is Khartoum.");
                    break;
                case "Suriname":
                    System.out.println("The Capital of " + country + " is Paramaribo.");
                    break;
                case "Sweden":
                    System.out.println("The Capital of " + country + " is Stockholm.");
                    break;
                case "Switzerland":
                    System.out.println("The Capital of " + country + " is Bern.");
                    break;
                case "Syria":
                    System.out.println("The Capital of " + country + " is Damascus.");
                    break;
        
                // Countries starting with T
                case "Tajikistan":
                    System.out.println("The Capital of " + country + " is Dushanbe.");
                    break;
                case "Tanzania":
                    System.out.println("The Capital of " + country + " is Dodoma.");
                    break;
                case "Thailand":
                    System.out.println("The Capital of " + country + " is Bangkok.");
                    break;
                case "Timor-Leste":
                    System.out.println("The Capital of " + country + " is Dili.");
                    break;
                case "Togo":
                    System.out.println("The Capital of " + country + " is Lomé.");
                    break;
                case "Tonga":
                    System.out.println("The Capital of " + country + " is Nukuʻalofa.");
                    break;
                case "Trinidad & Tobago":
                    System.out.println("The Capital of " + country + " is Port of Spain.");
                    break;
                case "Tunisia":
                    System.out.println("The Capital of " + country + " is Tunis.");
                    break;
                case "Türkiye":
                case "Turkey":
                    System.out.println("The Capital of " + country + " is Ankara.");
                    break;
                case "Turkmenistan":
                    System.out.println("The Capital of " + country + " is Ashgabat.");
                    break;
                case "Tuvalu":
                    System.out.println("The Capital of " + country + " is Funafuti.");
                    break;
                    case "Uganda":
                    System.out.println("The Capital of " + country + " is Kampala.");
                    break;
                case "Ukraine":
                    System.out.println("The Capital of " + country + " is Kiev.");
                    break;
                case "United Arab Emirates":
                case "UAE":
                    System.out.println("The Capital of " + country + " is Abu Dhabi.");
                    break;
                case "United Kingdom":
                case "UK":
                    System.out.println("The Capital of " + country + " is London.");
                    break;
                case "United States of America":
                case "USA":
                    System.out.println("The Capital of " + country + " is Washington, D.C.");
                    break;
                case "Uruguay":
                    System.out.println("The Capital of " + country + " is Montevideo.");
                    break;
                case "Uzbekistan":
                    System.out.println("The Capital of " + country + " is Tashkent.");
                    break;
        
                // Countries starting with V
                case "Vanuatu":
                    System.out.println("The Capital of " + country + " is Port Vila.");
                    break;
                case "Vatican City":
                case "Holy See":
                    System.out.println("The Capital of " + country + " is Vatican City.");
                    break;
                case "Venezuela":
                    System.out.println("The Capital of " + country + " is Caracas.");
                    break;
                case "Vietnam":
                    System.out.println("The Capital of " + country + " is Hanoi.");
                    break;
        
                // Country starting with Y
                case "Yemen":
                    System.out.println("The Capital of " + country + " is Sana'a.");
                    break;
        
                // Countries starting with Z
                case "Zambia":
                    System.out.println("The Capital of " + country + " is Lusaka.");
                    break;
                case "Zimbabwe":
                    System.out.println("The Capital of " + country + " is Harare.");
                    break;
                    default:
                        if (country.equals("quit")) {
                            System.out.println("You quit the program");
                        } else {
                            System.out.println("Country not found in the list");
                        }
                }

            }


        } catch (java.lang.IllegalStateException e) {
            System.out.println("Something went wrong");
        } finally {
            input.close();
        }

        
        }
        

    }
