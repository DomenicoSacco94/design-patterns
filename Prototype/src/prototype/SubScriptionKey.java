package prototype;

public class SubScriptionKey implements Cloneable {
    private String userName;
    private String code;

    public SubScriptionKey(String userName, String code) {
        this.userName = userName;
        this.code = code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("copying the subscription key reference");
        return super.clone();
    }
}
