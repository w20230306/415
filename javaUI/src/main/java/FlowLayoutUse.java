import javax.swing.*;
import java.awt.*;

class FlowLayoutUse {
    public FlowLayoutUse() {
        JFrame jFrame = new JFrame("流式布局窗口");

        // 创建面板并指定为流式布局
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        // 创建两个按钮
        JButton jButton1 = new JButton("按钮1");
        JButton jButton2 = new JButton("按钮2");
        // 将按钮添加到面板中
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        // 将面板添加到窗口中
        jFrame.setContentPane(jPanel);

        // 省略公共代码
    }
}
