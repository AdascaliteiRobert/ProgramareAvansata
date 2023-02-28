package src;
public class LAB2 {
    public static void main(String[] args) {
        Location Iasi = new StartingPoint (47.9443 , 27.3524  , "Iasi" , LocationType.CITY);
        Location Vaslui = new Destination (46.3818 , 27.4345 , "Vaslui", LocationType.CITY );
        Road R1 = new Road (220, 90 , RoadType.COUNTRY);
        Location Roman = new StartingPoint(45.2522 , 24.8744 , "Roman" , LocationType.CITY);
        Location HenriCoanda = new Destination( 34.4890 , 29.8975 , "HenriCoanda", LocationType.AIRPORT);
        Road R2 = new Road  (417, 100 , RoadType.EXPRESS);
        Location LUKOIL =new StartingPoint(47.9101,27.3378, "LUKOIL", LocationType.GAS_STATION);
        Location ROMPETROL= new Destination(47.9190, 27.3400, "ROMPETROL", LocationType.GAS_STATION);
        Road R3 = new Road (20, 60 , RoadType.COUNTRY);
        System.out.println(Iasi);
        System.out.println(Vaslui);
        System.out.println(R1);
        System.out.println(Roman);
        System.out.println(HenriCoanda);
        System.out.println(R2);
        System.out.println(LUKOIL);
        System.out.println(ROMPETROL);
        System.out.println(R3);
    }
}