public class song {
    private String title, artists, genre,topic;
    private int year,len;
    private double obscene,audience,danceabillity,loudness;
    


    public song(String title,String artists, String genre, String topic, int year,int len, double obscene, double audience,double danceabillity, double loudness)
        {
            this.title = title;
            this.artists = artists;
            this.genre = genre;
            this.topic = topic;
            this.year =year;
            this.len = len;
            this.obscene = obscene;
            this.audience = audience;
            this.danceabillity = danceabillity;
            this.loudness=loudness;
        }
    


        public String getTitle()
        {
            return title;
        }

        public String getArtists()
        {
            return artists;
        }

        public String getGenre()
        {
            return genre;
        }

        public String getTopic()
        {
            return topic;
        }

        public int getYear()
        {
            return year;
        }

        public int getLen()
        {
            return len;
        }

        public double getObscene()
        {
            return obscene;
        }

         public double getDanceabillity()
        {
            return danceabillity;
        }

         public double getAudience()
        {
            return audience;
        }

         public double getLoudness()
        {
            return loudness;
        }
}
