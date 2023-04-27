package com.yangweiyao.pattern.proxy.swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-24 08:19
 * @Description 虚拟代理，用于隐藏创建开销大的对象（比如通过网络取得图像数据）
 **/
public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private final URL imageURL;
    private boolean retrieving = false;

    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // 与装饰者模式不同的是，代理模式是控制imageIcon（对象）访问
        if(imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 900);
            if(!retrieving) {
                retrieving = true;
                new Thread(() -> {
                    imageIcon = new ImageIcon(imageURL, "CD Cover");
                    c.repaint(); // 重新绘画
                }).start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }

}
