package Demo01;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.sent();
        phone.show();
        System.out.println("=========");
        NewPhone newPhone=new NewPhone();
        newPhone.call();
        newPhone.sent();
        newPhone.show();
    }
}
