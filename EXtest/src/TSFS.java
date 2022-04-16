import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class TSFS extends JFrame { //定义一个类changeDollar, 继承于JFrame

    Button b = new Button("conversion"); //创建一个按钮的对象b,转换按钮

    Label l1 = new Label("RMB:");//人民币

    Label l2 = new Label("Dollar");//美元

    Label l3 = new Label("Exchange rate");//显示汇率

    double rtod;//人民币转为美元的值

    double dtor; //美元转为人民币的值

    double x, y; //定义变量

    TextField t1 = new TextField(null, 10);//添加Text框

    TextField t2 = new TextField(null, 10);

    TextField t3 = new TextField(null,10);

    public TSFS() {//类的构造函数,完成初始化

        super("汇率转换器");//创建窗口,标题为汇率转换器

        setLayout(new FlowLayout(FlowLayout.LEFT));//设置布局

        JPanel p1 = new JPanel(new GridLayout(1,1,10,10));//定义四个面板

        JPanel p2 = new JPanel(new GridLayout(1,1,10,10));

        JPanel p3 = new JPanel(new GridLayout(1,1,10,10));

        JPanel p4 = new JPanel(new GridLayout(1,2,10,10));

        p1.add(l3);//把各个按钮、text框放进去

        p1.add(t3);

        p2.add(l1);

        p2.add(t1);

        p3.add(l2);

        p3.add(t2);

        p4.add(b);

        add(p1);//将各个面板加入到容器中

        add(p2);

        add(p3);

        add(p4);

        setSize(305,150);//设置窗口大小

        setVisible(true);//设置窗口可见

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        b.addActionListener(new ButtonListener1());//添加button监听函数

    }

    class ButtonListener1 implements ActionListener {//实现click button时功能操作

        public void actionPerformed(ActionEvent e) {

            if (t1.getText()!=null&&t3.getText()!=null) {//检查t1 test 是否为空

                try {//取异常

                    x = Double.parseDouble(t1.getText());//将人民币字符串转为double型

                    double z=Double.parseDouble(t3.getText());//将汇率字符串转化为double型

                    rtod = x*z;//

                    t2.setText("" + rtod);//显示

                } catch (NumberFormatException ex) {

                    t1.setText("");//如果输入不是数字,设为空

                }

            }

            if (t1.getText().equals("")==true&&t3.getText()!=null){//t1是否为空，t3是否为空

                double z=Double.parseDouble(t3.getText());//将汇率字符串转化为double型

                y = Double.parseDouble(t2.getText());//把t2里的文本转为double 型 的

                dtor = y /z; //

                t1.setText("" + dtor);}//

        }

    }

    public static void main(String[] args) {

        new TSFS(); //建立类changeDollar的对象,并调用他的构造函数Change()

    }

}

