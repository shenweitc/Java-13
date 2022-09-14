package Demo01;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();   //把父类方法拿过来重复利用
        //子类再添加内容
        System.out.println("显示名字");
        System.out.println("显示信号");

    }
}
