import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Singers singer1 = new Singers();
        DateFormat dateFormat = new SimpleDateFormat("yyyy,mm,dd");

        System.out.println("default singersId:"+ singer1.getSingersId());
        System.out.println("default singersName:"+ singer1.getSingersName());
        System.out.println("default singersAddress:"+ singer1.getSingersAddress());
        System.out.println("default singersBirthday:"+ singer1.getSingersBirthday());
        System.out.println("default singersAlbum:"+ singer1.getSingersAlbums());

        singer1.setSingersId(1996);
        singer1.setSingersName("Jodie");
        singer1.setSingersAddress("Toronto");
        singer1.setSingersBirthday(dateFormat.parse("1996,04,24"));
        singer1.setSingersAlbums(7);

        System.out.println("singersId:"+ singer1.getSingersId());
        System.out.println("singersName:"+ singer1.getSingersName());
        System.out.println("singersAddress:"+ singer1.getSingersAddress());
        System.out.println("singersBirthday:"+ dateFormat.format(singer1.getSingersBirthday()));
        System.out.println("singersAlbum:"+ singer1.getSingersAlbums());
    }
}
