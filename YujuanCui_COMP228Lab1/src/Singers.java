import java.util.Date;

public class Singers {
    private int singersId;
    private String singersName;
    private String singersAddress;
    private Date singersBirthday;
    private int singersAlbums;

    public Singers() {

    }
    public Singers(int singersId){
        this.singersId = singersId;
    }

    public Singers(int singersId, String singersName){
        this.singersId = singersId;
        this.singersName = singersName;
    }

    public Singers(int singersId, String singersName, String singersAddress){
        this.singersId = singersId;
        this.singersName = singersName;
        this.singersAddress = singersAddress;
    }

    public Singers(int singersId, String singersName, String singersAddress, Date singersBirthday){
        this.singersId = singersId;
        this.singersName = singersName;
        this.singersAddress = singersAddress;
        this.singersBirthday = singersBirthday;
    }
    public Singers(int singersId, String singersName, String singersAddress, Date singersBirthday, int singersAlbums) {
        this.singersId = singersId;
        this.singersName = singersName;
        this.singersAddress = singersAddress;
        this.singersBirthday = singersBirthday;
        this.singersAlbums = singersAlbums;
    }

    public void setSingersId(int singersId){
        this.singersId = singersId;
    }

    public void setSingersName(String singersName){
        this.singersName = singersName;
    }

    public void setSingersAddress(String singersAddress){
        this.singersAddress = singersAddress;
    }

    public void setSingersBirthday(Date singersBirthday) {
        this.singersBirthday = singersBirthday;
    }

    public void setSingersAlbums(int singersAlbums) {
        this.singersAlbums = singersAlbums;
    }

    public void setAll(int singersId, String singersName,String singersAddress, Date singersBirthday,int singersAlbums){
        this.singersId = singersId;
        this.singersName = singersName;
        this.singersAddress = singersAddress;
        this.singersBirthday= singersBirthday;
        this.singersAlbums = singersAlbums;
    }

    public int getSingersId(){
        return singersId;
    }

    public String getSingersName() {
        return singersName;
    }

    public String getSingersAddress() {
        return singersAddress;
    }

    public Date getSingersBirthday() {
        return singersBirthday;
    }

    public int getSingersAlbums() {
        return singersAlbums;
    }
}
