import java.text.SimpleDateFormat;
import java.util.Date;

class April_16{
    public static void main(String[] args) {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date=df.format(new Date());
        System.out.println(date);
    }
    }
