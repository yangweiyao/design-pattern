package com.yangweiyao.pattern.proxy.swing;

import javax.swing.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author yangweiyao
 * @CreateTime 2023-04-24 08:33
 * @Description 面板显示不同CD封面（通过ImageProxy虚拟代理）
 **/
public class ImageProxyTestDrive {

    private ImageComponent imageComponent;

    private static final Map<String, String> IMAGE_MAP = new HashMap<>(4);

    static {
        IMAGE_MAP.put("雪花", "https://img1.baidu.com/it/u=413643897,2296924942&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=500");
        IMAGE_MAP.put("枫叶", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F72ce0dcb-c2a3-49fd-933d-85c7e5c4533d%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1684973392&t=43e175aaa665c87651cff44ee23acb29");
        IMAGE_MAP.put("秋景", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F1e783b5f-a310-417b-9ecd-1871afab5ad6%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1684973392&t=ca3d7b707cbb4e825929ad4f93f8deda");
    }

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() {

        JFrame jFrame = new JFrame("CD Cover Viewer");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        jFrame.setJMenuBar(menuBar);

        Set<String> keys = IMAGE_MAP.keySet();
        for (String key : keys) {
            JMenuItem menuItem = new JMenuItem(key);
            menu.add(menuItem);
            menuItem.addActionListener(e -> {
                imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                jFrame.repaint();
            });
        }

        Icon icon = new ImageProxy(getCDUrl("枫叶"));
        imageComponent = new ImageComponent(icon);
        jFrame.getContentPane().add(imageComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
    }

    private URL getCDUrl(String name) {
        try {
            return new URL(IMAGE_MAP.get(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
