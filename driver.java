public class driver {
    public static void main (String [] args)
    {
GetData r = new GetData();
song [] list = r.Data();


System.out.println("Total Number of Songs: 28370"  );
System.out.println("1982: " + r.songsFromYear(list, 1982));
System.out.println("2000: " + r.songsFromYear(list, 2000));
System.out.println("2015: " + r.songsFromYear(list, 2015));
System.out.println("There are: " + r.danceAbillity(list) + " Songs With a Danceability Above 0.8");
System.out.println("The Song With the Longest Length is: " + r.getLongest(list));
System.out.println("The Song With the Lowest Shakeability Score is: " + r.lowShakability(list));
System.out.println("The Loudest Song is: " + r.getloudest(list));

}
}