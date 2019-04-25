import java.io.*;
class SerializableObject implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String str0;
    private transient String str1;
    private static String str2 = "abc";

    public SerializableObject(String str0, String str1)
    {
        this.str0 = str0;
        this.str1 = str1;
    }

    public String getStr0()
    {
        return str0;
    }

    public String getStr1()
    {
        return str1;
    }

    public static void main(String[] args) throws Exception
    {
        File file = new File("D:" + File.separator + "s.txt");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(new SerializableObject("str0", "str1"));
        oos.close();

        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        SerializableObject so = (SerializableObject)ois.readObject();
        System.out.println("str0 = " + so.getStr0());
        System.out.println("str1 = " + so.getStr1());
        ois.close();
    }
}
